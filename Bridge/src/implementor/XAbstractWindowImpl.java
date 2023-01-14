package implementor;

public class XAbstractWindowImpl implements Window {

    @Override
    public void drawText() {
        System.out.println("X Window - draw text");
    }
}
