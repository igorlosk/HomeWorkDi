import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterField {
    @Autowired()
    private GreetingService greetingService;

    public void print(String greeting) {
        System.out.println("Message from \"GreetingPrinterField\": " + greetingService.greet(greeting));
    }


}
