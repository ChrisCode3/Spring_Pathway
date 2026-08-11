package Serving_Web_Content_with_Spring_MVC;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {



    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name",required = false , defaultValue = "World") String name,  Model model) {


         name = " jin";
        model.addAttribute("name", name);
        return name;
    }


}
