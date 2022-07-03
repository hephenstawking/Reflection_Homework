package annotations.homework;

public class Methods {

    @MyAnnotation(par1 = "Hello", par2 = "World")
    public void hwMethod(String par1, String par2) {
        System.out.println(par1 + " " + par2);
    }

    public void stringLength (String par1, String par2) {
        System.out.println("Total length - " + (par1.length() + par2.length()));
    }
}
