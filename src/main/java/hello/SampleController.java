package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @Autowired
    UserRepository repository;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";

        for(User usr : repository.findAll()){
            result += "<div>" + usr.toString() + "</div>";
        }

        return result + "</html>";
    }

}
