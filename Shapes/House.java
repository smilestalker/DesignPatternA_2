package Shapes;

import java.util.ArrayList;

public class House extends BaseShape {

    public House() {
        super("House", "Multiple", "Multiple", new ArrayList<>());
        this.addShape(new Square("Room", "Bricks", "White"));
        this.addShape(new Triangle("Roof", "Tin", "Silver"));
    }

}
