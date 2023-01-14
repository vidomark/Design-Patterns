package implementor;

public class PMWindowImpl implements Window {

    @Override
    public void drawText() {
        System.out.println("PM Window - draw text");
    }
}
