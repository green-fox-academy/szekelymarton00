package com.greenfox.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepo newRepo;

  @RequestMapping({"/","/list"})
  public String list(Model model){
    model.addAttribute("list",newRepo.findAll());
    return "todo";
  }
}
