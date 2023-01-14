package abstraction;

import implementor.Window;

public class IconWindow extends AbstractWindow {

    protected IconWindow(Window windowImpl) {
        super(windowImpl);
    }

    @Override
    void drawText() {
        System.out.println("Drawing Icon");
        window.drawText();
    }
}
