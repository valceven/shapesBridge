package BridgePattern;
public class printTypes {
    public static class CharHash implements CharImplementor {
        char c;
        CharHash() {
            c = '#';
            System.out.println("# will be used!");
        }
        @Override
        public void newHello() {
            System.out.println("HI! CharHash used");
        }
        public char getC() {
            return c;
        }
    }
    public static class CharAt implements CharImplementor {
        char c;
        CharAt() {
            c = '@';
            System.out.println("@ will be used!");
        }
        @Override
        public void newHello() {
            System.out.println("HELLO! CharAt used");
        }

        public char getC() {
            return c;
        }
    }
    public static class CharAst implements CharImplementor {
        char c;
        CharAst() {
            c = '*';
            System.out.println("@ will be used!");
        }
        @Override
        public void newHello() {
            System.out.println("HELLO! CharAt used");
        }
        public char getC() {
            return c;
        }
    }
    public static class CharX implements CharImplementor {
        char c;
        CharX() {
            c = 'X';
            System.out.println("@ will be used!");
        }
        @Override
        public void newHello() {
            System.out.println("HELLO! CharAt used");
        }
        public char getC() {
            return c;
        }
    }
}
