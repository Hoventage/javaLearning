public class BinaryPrinter {
    private int testVariable = 10;
    private final int SIZE = 111;

    public BinaryPrinter(int size) {
        testVariable = size;
    }

    int getTestVariable() {
        return testVariable;
    }


    void print(long value) {
        for (int i = testVariable - 1; i >= 0; i--) {
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }


    void setTestVariable(int variable) throws Exception {
        if (variable <=0){
            throw new Exception("Lol kek 4eburek, go back");
        }
        this.testVariable = variable;
    }
}