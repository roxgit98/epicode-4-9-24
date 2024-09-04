package davidegiliberti.epicode_4_9_24.entities;

import java.util.List;

public class Menu {
    private List<Bevanda> bevande;
    private List<Pizza> pizze;
    private List<Topping> toppings;

    public Menu(List<Bevanda> bevande, List<Pizza> pizze, List<Topping> toppings) {
        this.bevande = bevande;
        this.pizze = pizze;
        this.toppings = toppings;
    }

    public List<Bevanda> getBevande() {
        return bevande;
    }

    public void setBevande(List<Bevanda> bevande) {
        this.bevande = bevande;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizza> pizze) {
        this.pizze = pizze;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "bevande=" + bevande +
                ", pizze=" + pizze +
                ", toppings=" + toppings +
                '}';
    }

    public void stampaMenu() {
        System.out.println("Pizzas");
        for (Pizza pizza : pizze) {
            System.out.println(pizza + " " + pizza.getCalorie() + " " + pizza.getPrezzo());
        }
        System.out.println("\nToppings");
        for (Topping topping : toppings) {
            System.out.println(topping + " " + topping.getCalorie() + " " + topping.getPrezzo());
        }
        System.out.println("\nDrinks");
        for (Bevanda bevanda : bevande) {
            System.out.println(bevanda + " " + bevanda.getCalorie() + " " + bevanda.getPrezzo());
        }
    }
}
