package ru.sergeys.testApp;

public class randomizer {

    // Рекомендуем рандомный товар в релайтах
    public static int randomID() {
        double x = Math.random() * 1000;
        int y = (int) x;
        return y;
    }

    // Рассчет скидки для клиента ( цена товара, размер скидки) и на выходе получаем цену за вычетом скидки
    public static int discount (int x, int y){
        int z = x - (x / 100 * y);
        return z;
    }
}
