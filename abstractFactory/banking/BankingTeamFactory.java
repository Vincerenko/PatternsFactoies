package cretionalDesingPatterns.abstractFactory.banking;

import cretionalDesingPatterns.abstractFactory.Developer;
import cretionalDesingPatterns.abstractFactory.ProjectManager;
import cretionalDesingPatterns.abstractFactory.ProjectTeamFactory;
import cretionalDesingPatterns.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
