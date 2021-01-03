public class ForExtendingTests extends BinaryPrinter {
    private int thisSize;

    public ForExtendingTests(int size) {
        super(size);
    }

    @Override
    void setTestVariable(int variable) throws Exception {
        if (variable <= 0) {
            throw new Exception("Lol kek 4eburek, go back");
        }
        thisSize = variable;
    }
}
