package factory;

import scroll_bar.Scrollbar;
import window.Window;

public interface WidgetFactory {

    Window createWindow();

    Scrollbar createScrollBar();
}
