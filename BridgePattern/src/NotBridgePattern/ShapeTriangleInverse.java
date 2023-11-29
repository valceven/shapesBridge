package NotBridgePattern;

public class ShapeTriangleInverse {
    void printHash() {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    void printAt() {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
    void printAst() {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void printX() {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j <= i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
