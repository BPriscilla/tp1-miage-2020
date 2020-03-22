package com.acme.todolist.application.port.in;

import com.acme.todolist.domain.TodoItem;

public interface EditTodoItems {
	
	
	public void storeNewTodoItem(TodoItem todoItem);
	
}
