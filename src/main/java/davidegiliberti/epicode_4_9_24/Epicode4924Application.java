package davidegiliberti.epicode_4_9_24;


import davidegiliberti.epicode_4_9_24.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Epicode4924Application {

    public static void main(String[] args) {
        SpringApplication.run(Epicode4924Application.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Epicode4924Application.class);


        Menu menu = context.getBean(Menu.class);


        menu.stampaMenu();


        context.close();
    }

}







