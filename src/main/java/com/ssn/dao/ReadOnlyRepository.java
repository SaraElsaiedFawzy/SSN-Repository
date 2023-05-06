package com.ssn.dao;
import org.springframework.data.domain.*;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface ReadOnlyRepository<T,ID> extends Repository<T, ID> {
	List<T> findAll();
	List<T> findAll(Sort sort);
	Page<T> findAll(Pageable pageable);
	Optional<T> findById(ID id);
	long count();
}
