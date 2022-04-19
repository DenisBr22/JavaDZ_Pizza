
import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<Product, Integer> order = new HashMap<>();

    public Basket(Map<Product, Integer> order) {
        this.order = order;
    }

    public Map<Product, Integer> getOrder() {

        return order;
    }

    public void setOrder(Map<Product, Integer> order) {
        this.order = order;
    }

    public void addOrder(Product product, Integer value){
        order.put(product,value);

    }
}