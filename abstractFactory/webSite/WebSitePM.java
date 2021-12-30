package cretionalDesingPatterns.abstractFactory.webSite;

import cretionalDesingPatterns.abstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website Pm manages website projects");
    }
}
