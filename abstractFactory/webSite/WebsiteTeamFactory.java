package cretionalDesingPatterns.abstractFactory.webSite;

import cretionalDesingPatterns.abstractFactory.Developer;
import cretionalDesingPatterns.abstractFactory.ProjectManager;
import cretionalDesingPatterns.abstractFactory.ProjectTeamFactory;
import cretionalDesingPatterns.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
