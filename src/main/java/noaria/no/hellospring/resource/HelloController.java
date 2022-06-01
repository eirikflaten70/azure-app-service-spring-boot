package noaria.no.hellospring.resource;

import org.springframework.web.bind.annotation.RestController;

import noaria.no.hellospring.model.Greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

  
  @Value("${environment.jms-queues.receipts-in}")
  private String receiptInQueue;
  
  public String index() {
    return "Greetings from Azure Spring Apps!";
  }

  @GetMapping("/greeting")
  public Greeting get() {
    Greeting greeting = new Greeting();
    greeting.setName("Greetings to Hello World" + receiptInQueue);
    System.out.println(receiptInQueue);
    return greeting;
  }

  @GetMapping("/greeting2")
  public String getGreetings() {
    final String result = "This is the new greeting - hello so very much Eirik!!";
    System.out.println(result);
    return result;
  }

}
