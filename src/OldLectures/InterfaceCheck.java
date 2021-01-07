package OldLectures;

public interface InterfaceCheck {

    default String method() {
        return "Default interface method";
    }

    String notAMethod();
}
