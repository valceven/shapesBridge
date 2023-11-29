package BridgePattern;

public class TriangleInverse extends Shape{
    public TriangleInverse(CharImplementor imp) {
        super(imp);
    }
    @Override
    public void sayHello() {
        chImpl.newHello();
    }
    @Override
    public void printShape() {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j <= i; j++) {
                System.out.print(chImpl.getC()+" ");
            }
            System.out.println();
        }
    }
}
