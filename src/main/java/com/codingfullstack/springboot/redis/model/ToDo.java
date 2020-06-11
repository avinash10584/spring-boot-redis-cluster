package com.codingfullstack.springboot.redis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ToDo {

	private long id;
	private String task;
	private boolean completed;
}
