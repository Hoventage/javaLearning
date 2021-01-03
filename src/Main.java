import java.text.MessageFormat;

public class Main {
    public static void main(String[] args){

        BinaryPrinter testClass = new BinaryPrinter(4);
        System.out.println(MessageFormat.format("Original testVariable is: {0}", testClass.getTestVariable()));
        doPrint(testClass, 11);
        //testClass.print(testClass.getTestVariable());
        System.out.println(MessageFormat.format("Original testVariable is: {0}", testClass.getTestVariable()));

        ForExtendingTests instance = new ForExtendingTests(10);
    }

    private static void doPrint(BinaryPrinter printer, int value){
        printer.print(value);
        try {
            printer.setTestVariable(value);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
