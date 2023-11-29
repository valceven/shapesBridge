package BridgePattern;

public class SquareCheckered extends Shape{
    public SquareCheckered(CharImplementor imp) {
        super(imp);
    }
    @Override
    public void sayHello() {
        chImpl.newHello();
    }
    @Override
    public void printShape() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                if ((i+j)%2==0) {
                    System.out.print(chImpl.getC() + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
