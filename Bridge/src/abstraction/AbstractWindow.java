package abstraction;

import implementor.Window;

public abstract class AbstractWindow {

    // Delegate to implementation
    protected final Window window;

    protected AbstractWindow(Window windowImpl) {
        this.window = windowImpl;
    }

    abstract void drawText();
}
