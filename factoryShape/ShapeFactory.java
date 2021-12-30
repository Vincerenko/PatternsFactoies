package cretionalDesingPatterns.factoryShape;

public class ShapeFactory {
    public IShape getShape(String typeOfShape){
        if (typeOfShape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if (typeOfShape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        else if (typeOfShape.equalsIgnoreCase("Square") ) {
            return new Square();
        }
        else{
            throw new RuntimeException("Factory doesn't have this type of shape: " + typeOfShape);
        }
    }
}
