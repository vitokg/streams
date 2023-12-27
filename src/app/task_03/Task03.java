package task_03;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Завдання 3.
 * 1) Протягом понеділка-неділі щодня замірялася температура повітря.
 * 2) Діапазон температур склав від +8 до +15 градусів, включно.
 * 3) Зробіть вибірку щоденних показань температури, які були в діапазоні
 * від +10 до +13 градусів, включно.
 * 4) Виведення вибірки реалізуйте з нумерацією елементів переліку.
 */

public class Task03 {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(1);
        Arrays.stream(getTemperature())
                .filter(temp -> temp >= 10 && temp <= 13)
                .forEach(temp -> System.out.println(count.getAndIncrement() + ") " + temp));
    }

    public static int[] getTemperature() {
        return new int[] {8, 10, 10, 9, 12, 13, 15};
    }
}
