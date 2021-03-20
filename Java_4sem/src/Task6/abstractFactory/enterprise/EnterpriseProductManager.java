package Task6.abstractFactory.enterprise;

import Task6.abstractFactory.ProductManager;

public class EnterpriseProductManager implements ProductManager {
    @Override
    public void manage() {
        System.out.println("PM manages enterprise project");
    }
}
