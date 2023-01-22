public abstract class Decorator extends VisualComponent {

    protected VisualComponent visualComponent;

    public Decorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    public VisualComponent getVisualComponent() {
        return visualComponent;
    }

    public void setVisualComponent(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }
}
