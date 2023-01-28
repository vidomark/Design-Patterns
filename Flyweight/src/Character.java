public class Character implements Glyph {

    // Intrinsic state
    private final char characterCode;

    public Character(char characterCode) {
        this.characterCode = characterCode;
    }

    @Override
    public void draw(GlyphContext context) {
        String output = String.format("Drawing character with code - %s and color - %s.", characterCode, context.getColor());
        System.out.println(output);
    }

    public double getCharacterCode() {
        return characterCode;
    }
}
