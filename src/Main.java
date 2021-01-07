import OldLectures.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        List<String> expectedStringList = Arrays.asList("123", "321", "12312312");
        String oneElementFromMyList = expectedStringList.get(2);
        System.out.println(oneElementFromMyList);

        /*int[] array1 = new int[100];
        int[] array2 = {1,2,3,4,5};

        var array3 = array2.clone();

        for (int a: array3) {
            System.out.println(a);
        }*/

        /*char[] dataForString = {'a', 'b', 'c', 'd', 'e'};
        char[] destinationCharArray = new char[dataForString.length];
        String craftedString = new String(dataForString);
        craftedString.getChars(0, dataForString.length, destinationCharArray, 0);

        for (char ch:destinationCharArray) {
            System.out.println(ch);
        }

        String myNewStringToResearch = String.join("", craftedString);
        System.out.println(myNewStringToResearch.charAt(3));*/

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            strBuilder.append(i).append("_");
        }

        System.out.println(strBuilder);
        System.out.println(strBuilder.toString());


        InterfaceCheck instance = new ClassToCheckOutObject();
        instance.method();
        instance.notAMethod();

        MyClass myClassInstance = new MyClass(instance);
        myClassInstance.shouldCallDefaultInterfaceMethod();
        myClassInstance.shouldCallAbstractInterfaceMethodImplementedInBaseClass();

        GenericExample<Double> newGE = new GenericExample<>(2.2);

        //OldLectures.GenericInterface stringGenericInterface = System.out::println;
        GenericInterface stringGenericInterface = String -> System.out.println(String);

        stringGenericInterface.printMe("куку");

        List<String> list = Arrays.asList("str1", "str2", "str3");
        list.forEach(System.out::println);

        int[] newIntArray = {1, 2, 3, 4, 5};

    }
}
