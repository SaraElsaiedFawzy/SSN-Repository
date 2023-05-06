package com.ssn.search;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;
import java.util.*;
import com.ssn.common.UserCourse;


public class UserCourseSpecfications implements Specification<UserCourse> {
	private static final long serialVersionUID = 1L;
	private List<SearchCriteria> list;
	
	public UserCourseSpecfications() {
		 this.list = new ArrayList<>();
	}
	 public void add(SearchCriteria criteria) {
	        list.add(criteria);
	    }


	@Override
	public Predicate toPredicate(Root<UserCourse> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		// TODO Auto-generated method stub
		List<Predicate> predicates = new ArrayList<>();
		for (SearchCriteria criteria : list) {
			if (criteria.getOperation().equals(SearchOperation.LIKE)) {
				predicates.add(criteriaBuilder.like(
						criteriaBuilder.lower(root.get(criteria.getKey())),
                        "%" + criteria.getValue().toString().toLowerCase() + "%"));
			
		}else if (criteria.getOperation().equals(SearchOperation.IN)) {
            predicates.add(criteriaBuilder.in(root.get(criteria.getKey())).value(criteria.getValue()));
			}
		else if (criteria.getOperation().equals(SearchOperation.EQUAL)) {
			predicates.add(criteriaBuilder.equal(criteriaBuilder.lower(root.get(criteria.getKey())), criteria.getValue()));
			
		}
		else if (criteria.getOperation().equals(SearchOperation.BEFORE)) {
			predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get(criteria.getKey()), (Comparable) criteria.getValue()));
			
		}
		else if (criteria.getOperation().equals(SearchOperation.AFTER)) {
			predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get(criteria.getKey()), (Comparable) criteria.getValue()));
			
		}
			}
		return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
	}

}
