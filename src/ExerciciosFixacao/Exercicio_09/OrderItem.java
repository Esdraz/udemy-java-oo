package ExerciciosFixacao.Exercicio_09;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.price = this.product.getPrice() * quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal() {
        return price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName() + ", " + product.getPrice() + ", " + this.quantity + ", Subtotal: " +  this.price);
        return sb.toString();

    }
}
