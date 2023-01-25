import facade.ShapeMaker;

public class FacadeMain {
    public static void main(String[] args) {
        var facade = new ShapeMaker();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
    }
}