public class ScrollDecorator extends Decorator {

    public ScrollDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    void draw() {
        System.out.println("Adding scroll bar to visual component.");
        visualComponent.draw();
    }
}
