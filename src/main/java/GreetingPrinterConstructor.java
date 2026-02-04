import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterConstructor {

    private final GreetingService greetingService;

    public GreetingPrinterConstructor(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void print(String greeting){
        System.out.println(greetingService.greet(greeting));
    }


}
