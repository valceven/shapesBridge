package BridgePattern;

abstract class Shape implements userShape{
    protected CharImplementor chImpl;
    public Shape(CharImplementor imp) {
        this.chImpl = imp;
    }
    public abstract void sayHello();
    public abstract void printShape();
    void secretShape() {
        System.out.println(":)");
    }
}
