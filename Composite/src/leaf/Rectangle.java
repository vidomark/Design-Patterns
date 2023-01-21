package leaf;

import component.Graphic;

public class Rectangle implements Graphic {

    @Override
    public void draw() {
        System.out.println("Rectangle");
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
