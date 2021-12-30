package cretionalDesingPatterns.abstractFactory.banking;

import cretionalDesingPatterns.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
