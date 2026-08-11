package Handling_Form_Submission;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;






// so the way that this works  is that that the data flows from the object Greeting to the model/container and than to the view for the GET REQUEST

@Controller
public class GreetingController {



    @GetMapping("/greeting")
    public String greeting(Model modelContainer) {

// model attribute binds requests parameters to the the object
        modelContainer.addAttribute("greeting", new Greeting());
        return "greeting";

    }

// for the post request the information goes from the view and directly goes to the object greeting , actually skipping the model/container part
    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model modelContainer) {

        modelContainer.addAttribute("greeting", greeting);

        return "result";

    }



}
