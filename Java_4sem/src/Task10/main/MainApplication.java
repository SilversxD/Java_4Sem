package Task10.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Task10.main.components.KingOfKnights;
import Task10.main.components.StrongKnight;
import Task10.main.components.WeakKnight;
import Task10.main.interfaces.Knight;
import Task10.main.config.AppConfig;
import Task10.main.config.BeanConfig;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        /*
        Для конфигурации с помощью java-кода необходимо убрать
        аннотации Component, добавить аннотацию Configuration
        для BeanConfig и раскомментировать данную строчку
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        */
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Knight k1 = context.getBean(KingOfKnights.class);
        Knight k2 = context.getBean(StrongKnight.class);
        Knight k3 = context.getBean(WeakKnight.class);
        k1.fight();
        k2.fight();
        k3.fight();
    }
}
