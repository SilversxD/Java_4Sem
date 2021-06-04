package Task10.main.components;

import org.springframework.stereotype.Component;
import Task10.main.interfaces.Knight;

@Component
public class StrongKnight implements Knight {
    @Override
    public void fight() {
        System.out.println("Strong Knight is fighting...");
    }
}
