package Task10.main.components;

import Task10.main.interfaces.Knight;
import org.springframework.stereotype.Component;

@Component
public class KingOfKnights implements Knight {
    @Override
    public void fight() {
        System.out.println("King of Knights is fighting...");
    }
}
