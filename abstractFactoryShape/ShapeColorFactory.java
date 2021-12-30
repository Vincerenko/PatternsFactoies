package cretionalDesingPatterns.abstractFactoryShape;

public class ShapeColorFactory extends AbstractFactory{
    @Override
    IColor getColor(String color) {
        if (color.equalsIgnoreCase("red")){
            return new Red();
        }
        if (color.equalsIgnoreCase("green")){
            return new Green();
        }
        return null;
    }

    @Override
    IShape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
