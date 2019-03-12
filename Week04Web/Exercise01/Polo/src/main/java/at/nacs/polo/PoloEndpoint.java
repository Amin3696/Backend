package at.nacs.polo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polo")
public class PoloEndpoint {

    @PostMapping
    String post(@RequestBody String message) {
        if (message.equals("Marco")) {
            return "Polo";
        }
        return "What?";
    }
}
