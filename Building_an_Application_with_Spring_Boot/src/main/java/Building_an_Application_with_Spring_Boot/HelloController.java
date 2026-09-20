package Building_an_Application_with_Spring_Boot;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    int test = 0;

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }



    @GetMapping("/test")
    public Integer print() {

        return test;

    }
     @PostMapping("test2")
        public Integer Counter() {

         return test = test +1;


    }



}
