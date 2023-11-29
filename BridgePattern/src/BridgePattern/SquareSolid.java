package BridgePattern;

public class SquareSolid extends Shape {
    public SquareSolid(CharImplementor imp) {
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
                System.out.print(chImpl.getC()+" ");
            }
            System.out.println();
        }
    }
}
