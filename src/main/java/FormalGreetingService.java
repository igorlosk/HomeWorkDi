public class FormalGreetingService implements  GreetingService {
    @Override
    public String greet(String name) {
        return "Здравствуйте " + name;
    }
}
