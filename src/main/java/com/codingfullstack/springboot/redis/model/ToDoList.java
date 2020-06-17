package com.codingfullstack.springboot.redis.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ToDoList implements Serializable {
	private static final long serialVersionUID = -5921640387169150125L;
	private long id;
	private List<ToDo> tasks;
	private boolean completed;
}
