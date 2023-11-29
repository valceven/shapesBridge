package NotBridgePattern;

import BridgePattern.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharImplementor implementor = null;
        int x = 0;

        System.out.print("Input 1- squareSolid, 2- squareCheckered, 3- triangle, 4- triangleInverse: ");
        x += switch (sc.next().charAt(0)) {
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            default -> 1;
        };

        System.out.print("Choose filler 1 > #, 2 > @, 3 > *, 4 > X: ");
        x += 10 * switch (sc.next().charAt(0)) {
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            default -> 1;
        };


        switch (x) {
            case 11:
                ShapeSquareSolid ssh = new ShapeSquareSolid();
                ssh.printHash();
                break;
            case 12:
                ShapeSquareSolid ssa = new ShapeSquareSolid();
                ssa.printAt();
                break;
            case 13:
                ShapeSquareSolid ssk = new ShapeSquareSolid();
                ssk.printAst();
                break;
            case 14:
                ShapeSquareSolid ssx = new ShapeSquareSolid();
                ssx.printX();
                break;
            case 21:
                ShapeSquareCheckered sch = new ShapeSquareCheckered();
                sch.printHash();
                break;
            case 22:
                ShapeSquareCheckered sca = new ShapeSquareCheckered();
                sca.printAt();
                break;
            case 23:
                ShapeSquareCheckered sck = new ShapeSquareCheckered();
                sck.printAst();
                break;
            case 24:
                ShapeSquareCheckered scx = new ShapeSquareCheckered();
                scx.printX();
                break;
            case 31:
                ShapeTriangle th = new ShapeTriangle();
                th.printHash();
                break;
            case 32:
                ShapeTriangle ta = new ShapeTriangle();
                ta.printAt();
                break;
            case 33:
                ShapeTriangle tk = new ShapeTriangle();
                tk.printAst();
                break;
            case 34:
                ShapeTriangle tx = new ShapeTriangle();
                tx.printX();
                break;
            case 41:
                ShapeTriangleInverse tih = new ShapeTriangleInverse();
                tih.printHash();
                break;
            case 42:
                ShapeTriangleInverse tia = new ShapeTriangleInverse();
                tia.printAt();
                break;
            case 43:
                ShapeTriangleInverse tik = new ShapeTriangleInverse();
                tik.printAst();
                break;
            case 44:
                ShapeTriangleInverse tix = new ShapeTriangleInverse();
                tix.printX();
                break;
        }
    }
}
