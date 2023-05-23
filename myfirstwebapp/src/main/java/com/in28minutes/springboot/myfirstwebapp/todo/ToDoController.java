package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDoController {
	
	private ToDoService toDoService;
	
	
	public ToDoController(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}
	
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<ToDo> todos = toDoService.findByUser("Krzych");
		model.addAttribute("todos", todos);
		return "listTodos";
	}
}
