package Experiments;

public enum EnumWithStringsOmg {

    FIRST ("Первый"),
    SECOND ("Второй"),
    THIRD ("Третий");

    private final String str;

    EnumWithStringsOmg(String str) {
        this.str = str;
    }

    public String getStr(){
        return this.str;
    }
}
