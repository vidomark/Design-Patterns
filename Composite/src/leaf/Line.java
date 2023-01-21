package leaf;

import component.Graphic;

public class Line implements Graphic {

    @Override
    public void draw() {
        System.out.println("Line");
    }

    @Override
    public void add(Graphic graphic) {
        // Transparency over safety so it won't be defined
    }

    @Override
    public void remove(Graphic graphic) {
        // Transparency over safety so it won't be defined
    }

    @Override
    public Graphic getChild(int index) {
        return new NullLeaf();
    }
}
