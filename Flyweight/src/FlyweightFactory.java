import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlyweightFactory {

    private static final Map<java.lang.Character, Glyph> characterMap = new HashMap<>();

    public Glyph getCharacter(char characterCode) {
        Glyph glyph = characterMap.get(characterCode);

        if (Objects.isNull(glyph)) {
            glyph = new Character(characterCode);
            characterMap.put(characterCode, glyph);
        }

        return glyph;
    }
}
