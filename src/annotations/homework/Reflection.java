package annotations.homework;

import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) {

        final Class<?> cls = Methods.class;
        Methods mtds = new Methods();
        Method[] methods = cls.getDeclaredMethods();

        for (Method mtd : methods ) {
            if (mtd.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation ma = mtd.getAnnotation(MyAnnotation.class);

                mtds.hwMethod(ma.par1(), ma.par2());
                mtds.stringLength(ma.par1(), ma.par2());

            }
        }
    }

}

