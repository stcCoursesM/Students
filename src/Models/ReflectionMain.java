package Models;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

/**
 * Created on 12/06/2017.
 */
public class ReflectionMain {


    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        Student st1 = new Student("John", "Conor", new Date(), 0l);



        for (Method m : st1.getClass().getDeclaredMethods()){
            System.out.println( m.getName()
                    + "\t" + m.getReturnType().toString()
                    + m.getParameterTypes().length);
        }

        for (Annotation a : Student.class.getAnnotations()){
            System.out.println(a.annotationType().toString()
            + "\t" + a.toString());
        }

            Field fname = st1.getClass().getDeclaredField("name");
            st1.getClass().getField("name").setAccessible(true);
            fname.setAccessible(true);
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            System.out.println(fname.get(st1));


        Field stuId = null;
        stuId = st1.getClass().getDeclaredField("studentId");
        stuId.setAccessible(true);
        stuId.setInt(stuId, stuId.getModifiers() & ~Modifier.FINAL);
        //stuId.set(null, 1l);
        System.out.println(stuId.get(st1));

    }


}
