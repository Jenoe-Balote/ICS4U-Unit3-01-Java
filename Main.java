/*
 * This program pushes and prints a stack.
 *
 * @author Jenoe Balote
 * @version 1.0
 * @since 2021-12-07
 */

/**
 * This class also thing.
 * */
final class Main {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This class also thing.
     *
     * @param args no args will be used
     *
     * */
    public static void main(final String[] args) {
        final int number1 = 11;
        final int number2 = 22;
        final MrCoxallStack aStack = new MrCoxallStack();

        aStack.push(number1);
        aStack.push(number2);
        aStack.showStack();

        System.out.println("\nDone.");
    }
}

