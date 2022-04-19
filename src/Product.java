import java.util.Objects;

public class Product {

    private int idProduct;
    private String nameProduct;
    private int price;
    private int rating;


    public Product(int idProduct, String nameProduct, int price, int rating) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;

    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "№ Id: " + idProduct +
                ", наименование: " + nameProduct +
                ", цена: " + price +
                ", рэйтинг " + rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return idProduct == product.idProduct && price == product.price && rating == product.rating && Objects.equals(nameProduct, product.nameProduct);
    }


}
