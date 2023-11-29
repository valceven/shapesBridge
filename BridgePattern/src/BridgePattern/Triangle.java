package BridgePattern;

public class Triangle extends Shape{
    public Triangle(CharImplementor imp) {
        super(imp);
    }
    @Override
    public void sayHello() {
        chImpl.newHello();
    }
    @Override
    public void printShape() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(chImpl.getC()+" ");
            }
            System.out.println();
        }
    }
}
