package Task10.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Task10.main.components.KingOfKnights;
import Task10.main.components.StrongKnight;
import Task10.main.components.WeakKnight;

// @Configuration
public class BeanConfig {
    @Bean
    public KingOfKnights kingOfKnights() {
        return new KingOfKnights();
    }

    @Bean
    public StrongKnight strongKnight() {
        return new StrongKnight();
    }

    @Bean
    public WeakKnight weakKnight() {
        return new WeakKnight();
    }
}
