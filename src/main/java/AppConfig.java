
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("java")
public class AppConfig {

    @Bean
    @Primary
    public FriendlyGreetingService friendlyGreetingService() {
        return new FriendlyGreetingService();
    }

    @Bean
    public FormalGreetingService formalGreetingService() {
        return new FormalGreetingService();
    }

    @Bean
    public GreetingPrinterConstructor greetingPrinterConstructor(GreetingService greetingService) {
        return new GreetingPrinterConstructor(greetingService);
    }

    @Bean
    public GreetingPrinterField greetingPrinterField() {
        return new GreetingPrinterField();
    }

    @Bean
    public GreetingPrinterSetter greetingPrinterSetter() {
        return new GreetingPrinterSetter();
    }

}
