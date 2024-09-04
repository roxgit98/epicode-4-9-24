package davidegiliberti.epicode_4_9_24;

import davidegiliberti.epicode_4_9_24.entities.Menu;
import davidegiliberti.epicode_4_9_24.entities.Pizza;
import davidegiliberti.epicode_4_9_24.entities.Topping;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Epicode4924ApplicationTests {
    @Autowired
    private Menu menu;
    

    @Test
    public void testNumeoPizzeNelMenu() {
        List<Pizza> pizze = menu.getPizze();
        Assertions.assertEquals(3, pizze.size(), "il menu dovrebbe contenere 3 pizze");
    }

    @Test
    public void testNumeroToppings() {
        List<Topping> toppings = menu.getToppings();
        Assertions.assertEquals(4, toppings.size(), "dovrebbero esserci 4 toppings nel menu");
    }


}
