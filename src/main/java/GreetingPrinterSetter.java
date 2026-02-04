import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterSetter {

    private GreetingService greetingService;

    public GreetingPrinterSetter() {
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void print(String greeting){
        System.out.println(greetingService.greet(greeting));
    }
}
