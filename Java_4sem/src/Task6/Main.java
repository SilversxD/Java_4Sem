package Task6;

import Task6.abstractFactory.AgileTeamFactory;
import Task6.abstractFactory.ProductManager;
import Task6.abstractFactory.SoftwareDeveloper;
import Task6.abstractFactory.enterprise.EnterpriseTeam;
import Task6.builder.AnalyticsTeam;
import Task6.builder.ProjectManager;
import Task6.factory.AgileFramework;
import Task6.factory.AgileFrameworkFactory;
import Task6.prototype.Branch;

public class Main {

    public static void main(String[] args) {
        System.out.println("Тест. метода 'фабрика'");
        AgileFramework scrum =
                AgileFrameworkFactory.getAgileFramework(AgileFramework.AgileType.SCRUM);
        AgileFramework kanban =
                AgileFrameworkFactory.getAgileFramework(AgileFramework.AgileType.KANBAN);
        scrum.startDevelopment();
        kanban.startDevelopment();

        System.out.println("\nТест. метода 'абстрактная фабрика'");
        AgileTeamFactory agileTeam = new EnterpriseTeam();
        ProductManager pm = agileTeam.getProductManager();
        SoftwareDeveloper sd = agileTeam.getSoftwareDeveloper();
        pm.manage();
        sd.develop();

        System.out.println("\nТест. метода 'строитель'");
        ProjectManager projectManager = new ProjectManager(new AnalyticsTeam());
        System.out.println(projectManager.setTeam());

        System.out.println("\nТест. метода 'прототип'");
        Branch branch1 = new Branch("master", 247);
        System.out.println("Source: " + branch1);
        Branch branch2 = (Branch) branch1.prototype();
        System.out.println("Copy: " + branch2);
    }
}
