package masterProject;

public class Builder {
    private int size;
    private String breadRollType;
    private boolean meat;
    private boolean cheese;
    private boolean bacon;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private String condiment;
    private double price;

    public Burger$Builder(int size, String breadRollType, boolean meat) {
        this.size = size;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public Burger$Builder cheese(boolean cheese) {
        this.cheese = cheese;
        System.out.println("cheese is 70 cent");
        this.price += 0.7D;
        return this;
    }

    public Burger$Builder bacon(boolean bacon) {
        this.bacon = bacon;
        System.out.println("Bacon is 1.50");
        ++this.price;
        return this;
    }

    public Burger$Builder lettuce(boolean lettuce) {
        this.lettuce = lettuce;
        System.out.println("Lettuce is free");
        return this;
    }

    public Burger$Builder tomato(boolean tomato) {
        this.tomato = tomato;
        System.out.println("Tomato is free");
        return this;
    }

    public Burger$Builder carrot(boolean carrot) {
        this.carrot = carrot;
        System.out.println("Carrot is 40 cent");
        this.price += 0.4D;
        return this;
    }

    public Burger$Builder condiment(String condiment) {
        this.condiment = condiment;
        System.out.println("Condiment is free");
        return this;
    }

    public Burger$Builder price() {
        this.price = this.price;
        return this;
    }

    public Burger build() {
        Burger burger = new Burger(this);
        System.out.println(this.price);
        return burger;
    }

    private void validateBurgerObject(Burger burger) {
        System.out.println("validation works");
    }
}
