public class FriendlyGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Привет дружище" + name;
    }
}
