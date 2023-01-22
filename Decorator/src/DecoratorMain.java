public class DecoratorMain {

    public static void main(String[] args) {
        VisualComponent visualComponent = new TextWindow();
        VisualComponent borderDecorator = new BorderDecorator(visualComponent);
        VisualComponent scrollDecorator = new ScrollDecorator(borderDecorator);

        scrollDecorator.draw();
    }
}