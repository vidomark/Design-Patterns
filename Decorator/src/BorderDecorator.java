public class BorderDecorator extends Decorator {

    public BorderDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    void draw() {
        System.out.println("Adding border to visual component");
        visualComponent.draw();
    }
}
