public class MathLibrary {

    private static MathLibrary unique;

    private MathLibrary() {}

    public static MathLibrary getInstance() {

        if (unique == null) {

            unique = new MathLibrary();
        }

        return unique;
    }

    public int someMathMethod() {

        return -1;
    }

    public double anotherMathMethod() {

        return 0;
    }

    public static void main (String[] args) {

        MathLibrary testOne = MathLibrary.getInstance();

        MathLibrary testTwo = MathLibrary.getInstance();

        System.out.println(testOne.toString());

        System.out.println(testTwo.toString());

        System.out.println(testOne.hashCode());

        System.out.println(testTwo.hashCode());
    }

}
