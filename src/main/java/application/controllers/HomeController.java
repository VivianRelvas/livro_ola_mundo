package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
public class HomeController{
@RequestMapping(method=RequestMethod.Get)

  public String index(){
      return "home/index.jsp";
  }
}