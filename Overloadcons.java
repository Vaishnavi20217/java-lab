class Box {
    double width;
    double height;
    double depth;

    // Constructor with three parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Default constructor
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor for cube
    Box(double len) {
        width = height = depth = len;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

// OverloadCons.java
public class OverloadCons {
    public static void main(String[] args) {
        // Create objects using different constructors
        Box mybox1 = new Box(10, 20, 15);   // three-argument constructor
        Box mybox2 = new Box();             // default constructor
        Box mycube = new Box(7);            // single-argument constructor (cube)

        // Calculate volumes
        double vol1 = mybox1.volume();
        double vol2 = mybox2.volume();
        double vol3 = mycube.volume();

        // Print volumes
        System.out.println("Volume of mybox1 is: " + vol1);
        System.out.println("Volume of mybox2 is: " + vol2);
        System.out.println("Volume of mycube is: " + vol3);
    }
}
