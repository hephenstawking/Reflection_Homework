package annotations.homework;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    public String par1();

    public String par2();

}