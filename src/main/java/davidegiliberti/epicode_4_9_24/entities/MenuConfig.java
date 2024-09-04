package davidegiliberti.epicode_4_9_24.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MenuConfig {

    @Bean
    public Topping Cheese() {
        return new Topping("cheese", 92, 0.69);
    }

    @Bean
    public Topping Ham() {
        return new Topping("ham", 35, 0.99);
    }

    @Bean
    public Topping Onions() {
        return new Topping("onions", 22, 0.69);
    }

    @Bean
    public Topping Pineapple() {
        return new Topping("pineapple", 24, 0.79);
    }

    @Bean
    public Topping Salami() {
        return new Topping("salami", 86, 0.99);
    }

    @Bean
    public Bevanda Lemonade() {
        return new Bevanda("lemonade", "0,33L", 128, 1.29);
    }

    @Bean
    public Bevanda Water() {
        return new Bevanda("water", "0,5L", 0, 1.29);
    }

    @Bean
    public Bevanda Wine() {
        return new Bevanda("wine", "0,75L , 13%", 607, 7.49);
    }

    @Bean
    public Pizza Hawaiian() {
        return new Pizza("hawaiian pizza", Arrays.asList("tomato", "cheese"), Arrays.asList(Ham(), Pineapple()), 1024, 6.49);
    }

    @Bean
    public Pizza SalamiPizza() {
        return new Pizza("salami pizza", Arrays.asList("tomato", "cheese"), Arrays.asList(Salami()), 1160, 5.99);
    }

    @Bean
    public Pizza Margherita() {
        return new Pizza("margherita pizza", Arrays.asList("tomato", "cheese"), Arrays.asList(), 1104, 4.99);
    }

    @Bean
    public Menu menu() {
        return new Menu(
                Arrays.asList(Water(), Lemonade(), Wine()),
                Arrays.asList(SalamiPizza(), Hawaiian(), Margherita()),
                Arrays.asList(Cheese(), Ham(), Pineapple(), Onions()));
    }

    
}
