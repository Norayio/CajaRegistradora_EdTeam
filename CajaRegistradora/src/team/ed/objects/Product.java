package team.ed.objects;

public abstract class Product implements Cloneable{

    private String name; // nombre
    private int amount; // cantidad
    private double price; // precio


    public Product(){ // constructor
    }

    public Product(String n){ // constructor
        this.name = n;
    }


    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {

        if (amount < 0){
            System.out.println("No puedes asignar una cantidad negativa");
            return; // en ez de el else, utilizamos el return.
        }
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price < 0){
            System.out.println("No puedes colocar una precio negativa");
            return; // en ez de el else, utilizamos el return.
        }
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    public Product clone() throws CloneNotSupportedException{
        return (Product) super.clone();
    }



}
