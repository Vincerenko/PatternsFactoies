package cretionalDesingPatterns.factoryDev;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
