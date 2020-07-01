package masterProject;
import java.lang.Object;


public class Main {

    public static void main(String[] args){
        Burger hamBurger = new Burger.Builder(3, "sourdough", true)
                .cheese(true)
                .bacon(true)
                .carrot(true)
                .lettuce(true)
                .tomato(true)
                .build();

        Burger veggieBurgers = new Burger.Builder(2, "gluten", false)
                .bacon(false)
                .price()
                .build();







    }

}
