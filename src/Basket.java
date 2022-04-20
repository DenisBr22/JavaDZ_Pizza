import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<Product, Integer> order = new HashMap<>();

    public void addOrder(Product product, Integer value) {
        order.put(product, value);
    }

    public void printOrder() {
        System.out.println("Ваш заказ:");
        int sum = 0;
        order.forEach((k, v) -> System.out.println(k.getNameProduct() + " | количество " + v + "| стоимость " + v * k.getPrice()));
        for(Map.Entry<Product, Integer> entry : order.entrySet()) {
            int a = entry.getKey().getPrice();
            int b = entry.getValue();
            sum = sum + (a*b);
        }
        System.out.println("Общаяя стоимость: " + sum);
        System.out.println("для завершения программы введите " + Main.msgStop);
    }
}