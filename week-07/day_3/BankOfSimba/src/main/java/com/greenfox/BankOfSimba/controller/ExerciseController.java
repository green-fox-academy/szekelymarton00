package com.greenfox.BankOfSimba.controller;

import com.greenfox.BankOfSimba.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExerciseController {


  BankAccount firstAccount = new BankAccount("Simba", 2000, "lion",true);


  @RequestMapping("/firstAccount")
  public String account(Model model) {
    model.addAttribute("firstAccount", firstAccount);
    return "Account";
  }

  @RequestMapping("/textReturn")
  public String textReturn(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "textReturn";
  }

  @RequestMapping("/listing")
  public String listing(Model model,@RequestParam(value="action", required=true) String action) {
    List<BankAccount> listOfAccounts = new ArrayList<>();
    BankAccount zordon = new BankAccount("Zordon", 2500, "lion",false);
    BankAccount nara = new BankAccount("Nara", 3000, "lion",true);
    BankAccount rafiki = new BankAccount("Rafiki", 100, "monkey",true);
    BankAccount king = new BankAccount("King", 5000, "lion",true);
    listOfAccounts.add(zordon);
    listOfAccounts.add(nara);
    listOfAccounts.add(rafiki);
    listOfAccounts.add(king);
    model.addAttribute("listofaccounts", listOfAccounts);


    return "listing";
  }


}
