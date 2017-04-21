package backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/great", method = RequestMethod.GET)
    public String getRegionForNumber(@RequestParam String name) {
        return "Hello, " + name;
    }

}
