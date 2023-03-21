package org.example;

public class ImageProxy implements Graphics {

    private Graphics image;

    @Override
    public void draw() {
        if (image == null) {
            loadImage();
        }

        image.draw();
    }

    private void loadImage() {
        System.out.println("Loading image.");
        image = new Image();
    }
}
