package OldLectures;

public class MyClass  {
    private InterfaceCheck interfaceRefField;

    public MyClass(InterfaceCheck interfaceRefField) {
        this.interfaceRefField = interfaceRefField;
    }

    public void shouldCallDefaultInterfaceMethod() {
        System.out.println("Test ref field " + interfaceRefField.method());
    }

    public void shouldCallAbstractInterfaceMethodImplementedInBaseClass() {
        System.out.println("Test ref field " + interfaceRefField.notAMethod());
    }
}
