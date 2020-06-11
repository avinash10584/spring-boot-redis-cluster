package com.codingfullstack.springboot.redis.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ToDoList {

	private long id;
	private List<ToDo> tasks;
	private boolean completed;
}
