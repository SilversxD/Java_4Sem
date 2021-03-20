package Task6.abstractFactory;

public interface AgileTeamFactory {
    ProductManager getProductManager();

    SoftwareDeveloper getSoftwareDeveloper();
}