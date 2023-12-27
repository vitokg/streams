package app.task_02;

import task_02.Product;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Завдання 2.
 * 1) Є перелік із 6-ти різних товарів.
 * Ім'я товару – ключ, ціна – значення.
 * 2) Діапазон цін від 1.05 до 3.15.
 * 3) Виконайте вибірку товарів, ціни яких менше та дорівнюють 2.00.
 * 4) Виведення вибірки реалізуйте з нумерацією елементів переліку.
 */

public class Task02 {
    public static void main(String[] args) {
        AtomicInteger cnt = new AtomicInteger(0);
        getProducts().stream()
                .filter(product -> product.getPrice() <= 2.00)
                .forEach(product -> System.out.println(cnt.incrementAndGet() + ") " + product));

    }

    public static List<Product> getProducts() {
        return Arrays.asList(
                new Product("Milk", 1.05),
                new Product("Bread", 1.15),
                new Product("Butter", 2.05),
                new Product("Cheese", 2.15),
                new Product("Eggs", 3.05),
                new Product("Sausage", 3.15)
        );
    }

}
