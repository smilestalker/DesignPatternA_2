package Shapes;

import java.util.List;

public class BaseShape {
    private String name;
    private String material;
    private String color;
    private List<BaseShape> partShapes;

    public BaseShape(String name, String material, String color, List<BaseShape> partShapes) {
        this.name = name;
        this.material = material;
        this.color = color;
        this.partShapes = partShapes;
    }

    public void addShape(BaseShape shape) {
        partShapes.add(shape);
    }

    public int getShapeIndex(BaseShape shape) {
        return partShapes.indexOf(shape);
    }

    public void removeShape(BaseShape shape) {
        if (partShapes.contains(shape)) {
            partShapes.remove(shape);
        }
    }

    public int totalParts() {
        return partShapes.size();
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void printDetails(int indent) {
        String details = "Name: " + getName() + ", Mateiral: " + getMaterial() + ", Color: " + getColor();
        System.out.printf(details.indent(indent));

        if (partShapes.size() > 0) {
            for (BaseShape shape : partShapes) {
                shape.printDetails(indent + 4);
            }
        }
    }
}
