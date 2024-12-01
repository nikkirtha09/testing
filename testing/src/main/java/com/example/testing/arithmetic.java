package com.example.testing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class arithmetic {

    @PostMapping("/cal")
    public String calculate(@RequestParam("num1") double num1, 
                            @RequestParam("num2") double num2, 
                            
                            Model model) {
        double result = 0;
      result = num1 + num2 ;
        
        model.addAttribute("result",  result);
       
        return "index"; 
    }
}