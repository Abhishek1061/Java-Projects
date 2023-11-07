import java.util.Scanner;

public class Geometric_Calculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter which geometric parameter to calculate (area, perimeter, volume): ");
        String parameter = input.nextLine();

        switch (parameter) {

            case "area":
                System.out.println("Enter the which geometric area to calculate(Circle, Triangle, Ractangle, Rhombus): ");
                String shape = input.nextLine().toLowerCase();
                switch (shape) {
                    case "circle":
                        System.out.println("Enter the radius: ");
                        double radius = input.nextDouble();
                        double areaC = radius*radius*Math.PI;
                        System.out.println("Area of the circle is: " + areaC );
                        break;
                    case "triangle":
                        System.out.println("Enter the base: ");
                        double base = input.nextDouble();
                        System.out.println("Enter the height: ");
                        double height = input.nextDouble();
                        double areaT = (base * height) / 2;
                        System.out.println("Area of the Triangle is: " + areaT );
                        break;
                    case "rectangle":
                        System.out.println("Enter the width: ");
                        double width = input.nextDouble();
                        System.out.println("Enter the length: ");
                        double length = input.nextDouble();
                        double areaR = (width * length);
                        System.out.println("Area of the Rectangle is: " + areaR );
                        break;
                    case "rhombus":
                        System.out.println("Enter the diagonal_1: ");
                        double diagonal1 = input.nextDouble();
                        System.out.println("Enter the diagonal_2: ");
                        double diagonal2 = input.nextDouble();
                        double areaRO = (diagonal1 * diagonal2) / 2;
                        System.out.println("Area of the Rhombus is: " + areaRO );
                        break;
                
                    default:
                        System.out.println("Invalid geometeic shape");
                }
                break;
            case "perimeter":
                System.out.println("Enter the which geometric perimeter to calculate(Circle, Triangle, Ractangle, Rhombus): ");
                String shapeP = input.nextLine().toLowerCase();
                switch (shapeP) {
                    case "circle":
                        System.out.println("Enter the radius: ");
                        double radiusC = input.nextDouble();
                        double perimeterC = 2 * Math.PI * radiusC;
                        System.out.println("Perimeter of the circle is: " + perimeterC);
                        break;
                    case "triangle":
                        System.out.println("Enter side a: ");
                        double side_a = input.nextDouble();
                        System.out.println("Enter base b: ");
                        double base_b = input.nextDouble();
                        System.out.println("Enter side c: ");
                        double side_c = input.nextDouble();
                        double perimeterT = side_a + base_b + side_c;
                        System.out.println("Perimeter of the Triangle is: " + perimeterT);
                        break;
                    case "rectangle":
                        System.out.println("Enter the length: ");
                        double lengthR = input.nextDouble();
                        System.out.println("Enter the width: ");
                        double widthR = input.nextDouble();
                        double perimeterR = 2 * (lengthR + widthR);
                        System.out.println("Perimeter of the Rectangle is: " + perimeterR);
                        break;
                    case "rhombus":
                        System.out.println("Enter the value of side: ");
                        double side = input.nextDouble();
                        double perimeterRO = 4 * side;
                        System.out.println("Perimeter of the Rhombus is: " + perimeterRO);
                        break;
                    default:
                        System.out.println("Invalid geometric shape");
                }
                break;
            case "volume":
                System.out.println("Enter the geometric shape (Cylinder, Cone, Prism, Sphere): ");
                String shapeV = input.nextLine().toLowerCase();
                switch (shapeV) {
                    case "cylinder":
                        System.out.println("Enter the radius: ");
                        double radiusCylinder = input.nextDouble();
                        System.out.println("Enter the height: ");
                        double heightCylinder = input.nextDouble();
                        double volumeCylinder = Math.PI * radiusCylinder * radiusCylinder * heightCylinder;
                        System.out.println("Volume of the cylinder is: " + volumeCylinder);
                        break;
                    case "cone":
                        System.out.println("Enter the radius: ");
                        double radiusCone = input.nextDouble();
                        System.out.println("Enter the height: ");
                        double heightCone = input.nextDouble();
                        double volumeCone = (Math.PI * radiusCone * radiusCone * heightCone) / 3;
                        System.out.println("Volume of the Cone is: " + volumeCone);
                        break;
                    case "prism":
                        System.out.println("Enter the base area: ");
                        double baseArea = input.nextDouble();
                        System.out.println("Enter the height: ");
                        double heightPrism = input.nextDouble();
                        double volumePrism = baseArea * heightPrism;
                        System.out.println("Volume of the Prism is: " + volumePrism);
                        break;
                    case "sphere":
                        System.out.println("Enter the radius: ");
                        double radiusSphere = input.nextDouble();
                        double volumeSphere = (4.0 / 3.0) * Math.PI * radiusSphere * radiusSphere * radiusSphere;
                        System.out.println("Volume of the Sphere is: " + volumeSphere);
                        break;
                    default:
                        System.out.println("Invalid geometric shape");
                }
                break;
            default:
                System.out.println("Invalid parameter");
        }
        
    }
    
}
