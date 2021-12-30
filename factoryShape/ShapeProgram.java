package cretionalDesingPatterns.factoryShape;

public class ShapeProgram {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape iShape = shapeFactory.getShape("circle");
        iShape.draw();

        IShape iShape1 = shapeFactory.getShape("rectangle");
        iShape1.draw();

        IShape iShape2 = shapeFactory.getShape("Java");
        iShape2.draw();
    }
}
