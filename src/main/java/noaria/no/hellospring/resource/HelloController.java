package noaria.no.hellospring.resource;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class HelloController {

@RequestMapping("/")

  public String index() {
      return "Greetings from Azure Spring Apps!";
  }

}

