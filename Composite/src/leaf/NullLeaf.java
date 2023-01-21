package leaf;

import component.Graphic;

public class NullLeaf implements Graphic {
    @Override
    public void draw() {

    }

    @Override
    public void add(Graphic graphic) {

    }

    @Override
    public void remove(Graphic graphic) {

    }

    @Override
    public Graphic getChild(int index) {
        return null;
    }
}
