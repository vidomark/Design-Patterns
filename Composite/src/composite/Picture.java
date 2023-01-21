package composite;

import component.Graphic;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic {

    protected final List<Graphic> children = new ArrayList<>();

    @Override
    public void draw() {
        children.forEach(Graphic::draw);
    }

    @Override
    public void add(Graphic graphic) {
        children.add(graphic);
    }

    @Override
    public void remove(Graphic graphic) {
        children.remove(graphic);
    }

    @Override
    public Graphic getChild(int index) {
        return children.get(index);
    }
}
