public class W7_T8_JavaInheritance2 {

    static class Arithmetic {

        int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {
    }

    public static void main(String[] args) {

        Adder adder = new Adder();

        System.out.println("My superclass is: " +
                           adder.getClass().getSuperclass().getSimpleName());

        System.out.println(adder.add(42, 13));
        System.out.println(adder.add(20, 0));
    }
}