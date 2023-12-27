package app.task_01;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * Завдання 1.
 * 1) Створіть потік різних імен.
 * 2) Зробіть вибірку імен, що починаються
 * з певної літери (призначте самостійно).
 * 3) Виведення вибірки реалізуйте з нумерацією елементів переліку.
 */
public class Task01 {
    public static void main(String[] args) {
        String[] names = {"Aria", "Megan", "Tom", "Mark", "John", "Marta"};
        String letter = "M";
        Stream<String> stream = Arrays.stream(names);
        AtomicInteger cnt = new AtomicInteger(0);
        stream.filter(name -> name.startsWith(letter))
                .forEach(name -> System.out.println(cnt.incrementAndGet() + ") " + name));
    }


}
