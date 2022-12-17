package factory;

import scroll_bar.MotifScrollBar;
import scroll_bar.Scrollbar;
import window.MotifWindow;
import window.Window;

public class MotifWidgetFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        return new MotifWindow();
    }

    @Override
    public Scrollbar createScrollBar() {
        return new MotifScrollBar();
    }
}
