import java.util.Objects;

public class PrototypeMain {
    public static void main(String[] args) {
        Prototype original = new Prototype();
        Prototype prototype = original.createPrototype();

        assert !Objects.equals(original, prototype);
    }
}