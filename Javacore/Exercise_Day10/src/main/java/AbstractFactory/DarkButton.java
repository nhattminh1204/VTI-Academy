package AbstractFactory;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering dark-themed button ...");
    }
}
