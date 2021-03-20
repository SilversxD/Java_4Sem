package Task6.abstractFactory.enterprise;

import Task6.abstractFactory.AgileTeamFactory;
import Task6.abstractFactory.SoftwareDeveloper;
import Task6.abstractFactory.ProductManager;

public class EnterpriseTeam implements AgileTeamFactory {
    @Override
    public ProductManager getProductManager() {
        return new EnterpriseProductManager();
    }

    @Override
    public SoftwareDeveloper getSoftwareDeveloper() {
        return new EnterpriseSoftwareDeveloper();
    }
}
