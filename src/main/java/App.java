import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingPrinterConstructor printer = context.getBean(GreetingPrinterConstructor.class);
        printer.print("Pasha");

        GreetingPrinterField printerField = context.getBean(GreetingPrinterField.class);
        printerField.print("Pasha");

        GreetingPrinterSetter printerSetterr = context.getBean(GreetingPrinterSetter.class);
        printerSetterr.print("Pasha");

    }
}
