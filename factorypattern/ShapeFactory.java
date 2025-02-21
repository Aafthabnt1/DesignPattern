package factorypattern;

public class ShapeFactory {
    public Shape getShape(String name){
        switch (name){
            case "CIRCLE":return new Circle();
            case "RECTANGLE":return new Rectangle();
            case "SQUARE":return new Square();
            default:return null;
        }

    }
}
