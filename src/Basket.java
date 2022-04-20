import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<Product, Integer> order = new HashMap<>();

    public void addOrder(Product product, Integer value){
        order.put(product,value);
    }

    public void printOrder(){
        System.out.println("Ваш заказ:");
        order.forEach((k,v)->System.out.println(k.getNameProduct() + " | количество " + v + "| стоимость " + v * k.getPrice()));
    }
}