class Box {
    double width, height, depth;

    // Parameterized constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    double getVolume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        // Create Box object
        Box box = new Box(5, 4, 3);

        System.out.println("Width  : " + box.width);
        System.out.println("Height : " + box.height);
        System.out.println("Depth  : " + box.depth);
        System.out.println("Volume : " + box.getVolume());
    }
}