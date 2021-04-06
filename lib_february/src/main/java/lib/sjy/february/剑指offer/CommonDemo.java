package lib.sjy.february.剑指offer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

/**
 * @Author sjy
 * @Date 𝐷𝐴𝑇𝐸{TIME}
 * @Description
 */
public class CommonDemo {
    static AtomicInteger integer;
    LongAdder adder;
    LongAccumulator accumulator;
    static int i =1;

    public static void main(String[] args) {
        try {
            Class clz = Class.forName("TestClass");
            Method m = clz.getDeclaredMethod("test1");
            m.invoke(null);

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class TestClass<T>{
    public static void test1(){
    }

    void test2(T t){

    }
}
