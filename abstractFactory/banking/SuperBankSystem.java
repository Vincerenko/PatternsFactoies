package cretionalDesingPatterns.abstractFactory.banking;

import cretionalDesingPatterns.abstractFactory.Developer;
import cretionalDesingPatterns.abstractFactory.ProjectManager;
import cretionalDesingPatterns.abstractFactory.ProjectTeamFactory;
import cretionalDesingPatterns.abstractFactory.Tester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
