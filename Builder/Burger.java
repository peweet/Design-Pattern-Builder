package masterProject;
import java.util.ArrayList;

public class Burger {
    //required
    private final int size;
    private final String breadRollType;
    private  final boolean meat;
    //optional
    private final boolean cheese;
    private final boolean bacon;
    private final boolean lettuce;
    private final boolean tomato;
    private final boolean carrot;
    private final String condiment;
    private final double price;



//trying to avoid nested constructors t
   public void  getPrice(){
        System.out.print(price);
   }
  // public void setSize()

    public int getSize() {
        return size;
    }
    public boolean getMeat(){
        return meat;
    }

    public String getBreadRollType() {
        return this.breadRollType;
    }
    public boolean getCheese(){
        return this.cheese;
    }

    public void setCheese(){

    }
    public boolean getBacon(){
        return bacon;
    }
    public boolean getLettuce(){
        return lettuce;
    }

    public boolean getCarrot(){
        return carrot;
    }
    public String getCondiment(){
        return condiment;
    }


    public Burger (Builder builder) {
        //
        this.size = builder.size;
        this.breadRollType = builder.breadRollType;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.bacon = builder.bacon;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.carrot = builder.carrot;
        this.condiment = builder.condiment;
        this.price = builder.price;
    }

    public static class Builder {
    private  int size;
    private  String breadRollType;
    private  boolean meat;
    //optional
    private boolean cheese;
    private boolean bacon;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private  String condiment;
    private double price;

    public Builder(int size, String breadRollType, boolean meat){
        this.size  = size;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }
    public Builder cheese(boolean cheese){
        this.cheese = cheese;
        System.out.println("cheese is 70 cent");
        price+=.70;
        return this;
    }
    public Builder bacon(boolean bacon){
        this.bacon = bacon;
        System.out.println("Bacon is 1.50");
        price+=1.50;
        return this;
    }

    public Builder lettuce(boolean lettuce){
        this.lettuce = lettuce;
        System.out.println("Lettuce is free");
        return this;
    }

    public Builder tomato(boolean tomato){
        this.tomato = tomato;
        System.out.println("Tomato is free");
        return this;
    }
    public Builder carrot(boolean carrot){
        this.carrot = carrot;
        System.out.println("Carrot is 40 cent");
        price+=.40;
        return this;
    }
    public Builder condiment(String condiment){
        this.condiment = condiment;
        System.out.println("Condiment is free");
        return this;
    }
    public Builder price(){
        this.price = price;
        return this;
    }

    public Burger build(){
        Burger burger = new Burger(this);
      //  validateBurgerObject(burger);
        System.out.println(price);
        return burger;

    }
    private void validateBurgerObject(Burger burger){
        System.out.println("validation works");


        }

    }
    //each selection adds a price
    //get track of how many items get added
    // Base price for burger
    //case mayo, ketchup, mustard, bbq sauce
}
