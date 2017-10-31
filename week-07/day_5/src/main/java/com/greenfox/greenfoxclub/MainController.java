package com.greenfox.greenfoxclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  Fox firstFox;

  @RequestMapping("/")
  public String homePage(Model model){
    firstFox.setDrink("beer");
    firstFox.setFood("burger");
    model.addAttribute("drink",firstFox.getDrink());
    model.addAttribute("food",firstFox.getFood());

    return "index";
  }

  public String information(Model model){

    return "information";
  }

}
