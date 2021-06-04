package Task10.main.components;

import org.springframework.stereotype.Component;
import Task10.main.interfaces.Knight;

@Component
public class WeakKnight implements Knight {
    @Override
    public void fight() {
        System.out.println("Weak Knight is fighting...");
    }
}
