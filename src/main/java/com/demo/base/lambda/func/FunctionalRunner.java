package com.demo.base.lambda.func;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

@Component
public class FunctionalRunner implements ApplicationRunner {

    private static List<Student> studentList = Arrays.asList(
            new Student("WHYBWHY", "Seoul", 7880),
            new Student("BK", "Busan", 1561)
    );


    public static void func(Function<Student, String> function) {
        studentList.forEach(
                student -> {
                    String result = function.apply(student);
                    System.out.println(result);
                }
        );
    }

    public static void funcInt(ToIntFunction<Student> func) {
        studentList.forEach(
                student -> System.out.println(func.applyAsInt(student))
        );
    }

    public static int funIntToInt(int t, ToIntFunction<Integer> func) {
        return func.applyAsInt(t);
    }

    BiFunction<Integer, String, String> biFunction = (num, str) -> String.valueOf(num) + str;

    public BiFunction<Integer, String, String> getBiFunction() {
        return biFunction;
    }

    public Object getSupplier(Supplier<Object> supplierFunc) {
        return supplierFunc.get();
    }

    public void getConsumer(Consumer<String> consumerFunc, String t) {
        consumerFunc.accept(t);
    }

    public boolean getPredicate(Predicate<String> predicateFunc, String t) {
        return predicateFunc.test(t);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        func(t -> t.getName() + "/");

        funcInt( t-> t.getUserId() * 2);
        funIntToInt(5, a -> a + 1);
        System.out.println(getBiFunction().apply(5, "literal"));
        Consumer<String> cunsumerFunc1 = i -> System.out.println(i);
        Consumer<Integer> cunsumerFunc2 = i -> i = 1 + 1;

        getConsumer(cunsumerFunc1, "4");

        Predicate<String> predicate = str -> str.isEmpty();
        boolean isEquals = getPredicate(predicate, "");





    }
}
