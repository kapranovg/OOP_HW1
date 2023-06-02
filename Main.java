package HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("Черный чай", 200, 15.0, 80));
        hotDrinks.add(new HotDrink("Кофе", 200, 20.5, 90));
        
        VendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.initProducts(hotDrinks);
        
        System.out.println("Доступные горячие напитки:");
        for (Product product : hotDrinks) {
            System.out.println(product);
        }
        
        System.out.println("\nПокупка - черный чай, температура - 80С:");
        Product boughtHotDrink = ((HotDrinkVendingMachine) hotDrinkVendingMachine).getProduct("Черный чай", 100, 80);
        if (boughtHotDrink != null) {
            System.out.println("Ваша покупка - " + boughtHotDrink);
        } else {
            System.out.println("Извините, напиток временно недоступен.");
        }
        
        System.out.println("\nПокупка - кофе, температура - 85С:");
        boughtHotDrink = ((HotDrinkVendingMachine) hotDrinkVendingMachine).getProduct("Кофе", 100, 90);
        if (boughtHotDrink != null) {
            System.out.println("Ваша покупка - " + boughtHotDrink);
        } else {
            System.out.println("Извините, напиток временно недоступен.");
        }
    }
}
