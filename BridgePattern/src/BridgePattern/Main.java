package BridgePattern;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharImplementor implementor;
        userShape shape;
        System.out.print("Choose filler 1 > #, 2 > @, 3 > *, 4 > X: ");
        implementor = switch (sc.next().charAt(0)) {
            case '2' -> new printTypes.CharAt();
            case '3' -> new printTypes.CharAst();
            case '4' -> new printTypes.CharX();
            default -> new printTypes.CharHash();
        };
        System.out.print("Input 1- squareSolid, 2- squareCheckered, 3- triangle, 4- triangleInverse: ");
        shape = switch (sc.next().charAt(0)) {
            case '2' -> new SquareCheckered(implementor);
            case '3' -> new Triangle(implementor);
            case '4' -> new TriangleInverse(implementor);
            case '4' -> new TriangleInverse(implementor);
            case '4' -> new TriangleInverse(implementor);
            default -> new SquareSolid(implementor);
        };
        System.out.println("Input a number (1 - Greet), (2 - printShape): ");
        switch (sc.nextInt()) {
            case 1:
                shape.sayHello();
                break;
            case 2:
                shape.printShape();
                break;
            case 'X':
            case 'x':
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid Input.");
                break;
        }
    }
}