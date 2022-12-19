import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Product {

    private String name;

    private BigDecimal price;

    private Map<String, String> attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    static class Builder {

        private String name;

        private BigDecimal price;

        private final Map<String, String> attributes = new HashMap<>();

        public static Builder builder() {
            return new Builder();
        }

        public Product build() {
            Product product = new Product();
            product.setName(this.name);
            product.setPrice(this.price);
            product.setAttributes(this.attributes);
            return product;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder withAttribute(String attribute, String attributeValue) {
            this.attributes.put(attribute, attributeValue);
            return this;
        }
    }
}
