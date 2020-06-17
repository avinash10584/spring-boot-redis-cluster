package com.codingfullstack.springboot.redis.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDo implements Serializable {

	private static final long serialVersionUID = -706395356436142142L;
	
	private long id;
	private String task;
	private boolean completed;
	
	public ToDo(long id, String task) {
		super();
		this.id = id;
		this.task = task;
	}
}
