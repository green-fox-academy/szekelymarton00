package com.greenfox.connectionwithmysql;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {

  @Autowired
  AssigneeRep newAssignee;

  @RequestMapping("/add")
  public String addTodo(Model model) {
    model.addAttribute("newassignee", new Assignee());
    return "addassignee";
  }

  @RequestMapping("")
  public String listOfAssignees(Model model) {
    model.addAttribute("assigneeList",newAssignee.findAll());
    return "assigneelist";
  }
  @GetMapping("/editassignee/{id}")
  public String editAssignee(@PathVariable long id, Model model) {
    model.addAttribute("assigneeEdit", newAssignee.findOne(id));
    return "editassignee";
  }

  @PostMapping("/updateassignee")
  public String updateEntryAssignee(@ModelAttribute Assignee assignee) {
    newAssignee.save(assignee);
    return "redirect:/assignees";
  }
  @GetMapping({"/{id}/delete"})
  public String list(@PathVariable long id, Model model) {
    model.addAttribute("editedAssignee", newAssignee.findOne(id));
    newAssignee.delete(id);
    return "redirect:/assignees";
  }

}
