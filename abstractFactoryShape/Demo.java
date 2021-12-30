package cretionalDesingPatterns.abstractFactoryShape;

public class Demo {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        //get an object of Shape Circle
        IShape shape1 = shapeFactory.getShape("square");
        shape1.draw();
        //get an object of Shape Rectangle
        IShape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        //get an object of color Red
        IColor color1 = colorFactory.getColor("RED");
        color1.fill();
        //get an object of color Green
        IColor color2 = colorFactory.getColor("GREEN");
        color2.fill();
    }
}
