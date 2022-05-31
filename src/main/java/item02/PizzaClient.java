package item02;

import static item02.NyPizza.Size.MEDIUM;
import static item02.Pizza.Topping.HAM;
import static item02.Pizza.Topping.ONION;

/**
 * Created by Hunseong on 2022/05/31
 */
public class PizzaClient {

    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(MEDIUM)
                .addTopping(HAM)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .sourceInside()
                .build();
    }
}
