package com.acme.todolist.application.service;

import javax.inject.Inject;

import com.acme.todolist.application.port.in.EditTodoItems;
import com.acme.todolist.application.port.out.UpdateTodoItem;
import com.acme.todolist.domain.TodoItem;

import org.springframework.stereotype.Component;

@Component
public class EditTodoItemsService implements EditTodoItems {

	private UpdateTodoItem updateTodoItem;
	
	@Inject
	public EditTodoItemsService(UpdateTodoItem updateTodoItem) {
		this.updateTodoItem = updateTodoItem;
	}

	@Override
	public void storeNewTodoItem(TodoItem todoItem) {
		// TODO Auto-generated method stub
	}
	
}
