package com.greenfox.frontend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // it wont locate a template, it will send back the return statements of the methods
public class Rest {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new ErrorResponse("Please provide an Input");
    }
    return new DoublingResponse(input, input * 2);
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(required = false) String name, String title) {
    if (name.equals("")) {
      return new ErrorResponse("Please provide a Name");
    } else if (title.equals("")) {
      return new ErrorResponse("Please provide a Title");
    } else if (name.equals("") && title.equals("")){
      return new ErrorResponse("Please provide a Name and Title");
    }
    return new GreeterResponse(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public Object appenda(@PathVariable(required = false) String appendable) {
    return new AppendaResponse(appendable);
  }

  @PostMapping(value = "/dountil/{what}")
  public Object dountil(@RequestBody DoUntilRequest until, @PathVariable(required = false) String what) {
    return new DoUntilResponse(until.getUntil(), what);
  }

  @PostMapping(value = "/arrays")
    public Object complexArrays(@RequestBody ArraysRequest arrReq) {
    if (arrReq.getWhat().equals("sum")||arrReq.getWhat().equals("multiply")){
    return new ArraysResponse(arrReq.getNumbers(), arrReq.getWhat());
    }
    return new ArraysResponse(arrReq.getNumbers(),arrReq.getWhat()).doubleNum(arrReq.getNumbers());
  }

}
