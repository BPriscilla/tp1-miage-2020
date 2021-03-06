package com.acme.todolist.adapters.rest_api;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acme.todolist.application.port.in.GetTodoItems;
import com.acme.todolist.application.port.in.EditTodoItems;
import com.acme.todolist.application.service.GetTodoItemsService;
import com.acme.todolist.domain.TodoItem;

/**
 * Le controlleur Spring MVC qui expose les endpoints REST
 * 
 * @author bflorat
 *
 */
@RestController
public class TodoListController {
	
	
	private GetTodoItems getTodoItemsQuery;
	private EditTodoItems editTodoItemsQuery;
	
	
	@Inject
	public TodoListController(EditTodoItems editTodoItemsQuery,
							  GetTodoItems getTodoItemsQuery) {
		this.getTodoItemsQuery = getTodoItemsQuery;
		this.editTodoItemsQuery = editTodoItemsQuery;
	}
	
	@GetMapping("/todos")
	public List<TodoItem> getAllTodoItems() {
		return this.getTodoItemsQuery.getAllTodoItems();
	}
	
	@PostMapping("/todos")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void storeNewTodoItem(@RequestBody TodoItem todoItem) {
		this.editTodoItemsQuery.storeNewTodoItem(todoItem);
	}
	
	
	
}
