public class FlyweightMain {

    private static final char[] characterCodes = {'a', 'b', 'c', 'd', 'e'};

    private static final FlyweightFactory flyweightFactory = new FlyweightFactory();

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Glyph glyph = flyweightFactory.getCharacter(getRandomCharacter());
            glyph.draw(new GlyphContext("color"));
        }
    }

    private static char getRandomCharacter() {
        return characterCodes[(int) (Math.random() * characterCodes.length)];
    }
}