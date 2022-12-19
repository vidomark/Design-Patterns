import java.math.BigDecimal;

public class MainBuilder {
    public static void main(String[] args) {
        Product product = Product.Builder.builder()
                .withName("name")
                .withPrice(new BigDecimal(10))
                .withAttribute("attributeOne", "1")
                .withAttribute("attributeTwo", "2")
                .build();
    }
}