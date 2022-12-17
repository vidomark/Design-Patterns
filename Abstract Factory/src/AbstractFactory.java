import factory.MotifWidgetFactory;
import factory.PMWidgetFactory;
import factory.WidgetFactory;
import scroll_bar.Scrollbar;
import window.Window;

public class AbstractFactory {
    public static void main(String[] args) {
        WidgetFactory motifWidgetFactory = new MotifWidgetFactory();
        Window motifWindow = motifWidgetFactory.createWindow();
        Scrollbar motifScrollbar = motifWidgetFactory.createScrollBar();

        WidgetFactory pmWidgetFactory = new PMWidgetFactory();
        Window pmWindow = pmWidgetFactory.createWindow();
        Scrollbar pmScrollBar = pmWidgetFactory.createScrollBar();
    }
}