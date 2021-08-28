package application.controllers;

import org.springframework.stereotype.Controller;   //importando 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Controller    //@ é uma anotação de uma classe
public class HomeController{ 
     @RequestMapping(method=RequestMethod.GET) //@ é uma anotação de uma classe com parâmetro 

     public String index(){   // delcarando um método
         return "home/index.jsp";  //   diretório ou pasta home - arquivo index - java serve page

      }
}