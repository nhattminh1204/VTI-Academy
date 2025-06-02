package AbstractFactory;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering light-themed button ...");
    }
}
