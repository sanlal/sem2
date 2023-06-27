package Shopping;


public class Clothing{
    private String description;
    public double price;
    public Clothing(){
    }
    public Clothing(String description, double price){
        this.description= description;
        this.price = price;

    }

    public static void main(String args[]){
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing("Jacket",20.99);
        System.out.println(item2.description + item2.price);
        System.out.println(item1.description + item1.price);
    }
}