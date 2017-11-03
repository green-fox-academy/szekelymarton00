package com.greenfox.connectionwithmysql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepo newRepo;

  @RequestMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("list", newRepo.findAll());
    return "todo";
  }

  @RequestMapping("/add")
  public String addTodo(Model model) {
    model.addAttribute("newtodo", new Todo());
    return "addtodo";
  }

  @GetMapping({"/{id}/delete"})
  public String list(@PathVariable long id, Model model) {
    model.addAttribute("editedTodo", newRepo.findOne(id));
    newRepo.delete(id);
    return "redirect:/todo/";
  }

  @RequestMapping("/edit/{id}")
  public String edit(@PathVariable long id, Model model) {
    model.addAttribute("todoEdit", newRepo.findOne(id));
    return "edit";
  }

  @PostMapping("/update")
  public String updateEntry(@ModelAttribute Todo todo) {
    newRepo.save(todo);
    return "redirect:/todo/";
  }
  @PostMapping("/search/{search}")
  public String search(@PathVariable(required = false) String search, Model model) {
    model.addAttribute("todoRepository", newRepo.findAllByTitleContains(search));
    model.addAttribute("count", newRepo.count());
    model.addAttribute("todo", new Todo());
    model.addAttribute("editTodo", new Todo());
    return "todo";
  }
}
