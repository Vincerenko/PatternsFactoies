package cretionalDesingPatterns.abstractFactoryShape;

public class FactoryProducer {
    public static ShapeColorFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("shape")){
            return new ShapeColorFactory();
        }
        if (choice.equalsIgnoreCase("color")){
            return new ShapeColorFactory();
        }
        return null;
    }
}
