package abstraction;

import implementor.Window;

public class ModalWindow extends AbstractWindow {

    protected ModalWindow(Window windowImpl) {
        super(windowImpl);
    }

    @Override
    void drawText() {
        System.out.println("Drawing Modal Window");
        window.drawText();
    }
}
