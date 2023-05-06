package com.ssn.search;
import lombok.*;
@Data
@AllArgsConstructor
public class SearchCriteria {
	private String key;  //entity name
	private SearchOperation operation;
	private Object value;
	
	 public SearchCriteria(String key, Object value, SearchOperation operation) {
	        this.key = key;
	        this.value = value;
	        this.operation = operation;
	    }

}
