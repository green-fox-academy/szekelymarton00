package com.greenfox.reddit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reddit")
public class RedditController {

  @Autowired
  PostsRepo submittedPost;

  @Autowired
  PostService postService;


  @RequestMapping("/")
  public String mainPost(Model model) {
    model.addAttribute("list", submittedPost.findAll());
    return "reddit";
  }

  @RequestMapping("/addpost")
  public String addPost(Model model) {
    model.addAttribute("newpost",new Post());
    return "addpost";
  }


}
