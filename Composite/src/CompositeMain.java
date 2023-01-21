import component.Graphic;
import composite.Picture;
import leaf.Line;
import leaf.Rectangle;
import leaf.Text;

public class CompositeMain {
    public static void main(String[] args) {
        /*
         Client operates on component (either leaf or composite).
         */
        Graphic picture = new Picture();
        Graphic line = new Line();
        Graphic rectangle = new Rectangle();
        Graphic text = new Text();

        picture.add(line);
        picture.add(rectangle);
        picture.add(text);
        picture.add(new Picture());

        picture.draw();
    }
}