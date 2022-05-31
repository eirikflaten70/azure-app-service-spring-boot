package noaria.no.hellospring.resource;

import org.springframework.web.bind.annotation.RestController;

import noaria.no.hellospring.model.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class HelloController {

@RequestMapping("/")

  public String index() {
      return "Greetings from Azure Spring Apps!";
  }

  @GetMapping("/greeting")
	public Greeting get() {
    Greeting greeting = new Greeting();
    greeting.setName("Greetings to Hello World");
		return greeting;
	}

}

