package ru.mephi.head2.Lab15;

import java.util.Random;

/**
 * Реализуйте полностью класс Invoice, представленный в разделе 2.6.1. Предоставьте метод,
 * выводящий счет-фактуру, и демонстрационную версию проф а ммы, составляющей и выводящей образец счета-фактуры.
 */

public class Lab15 {

    static final int maxUnitPrice = 50_000;
    static final int maxQuantity = 100;
    static final int maxCount = 7;

    public static Invoice createRandomInvoice() {
        Invoice invoice = new Invoice();
        Random random = new Random();
        String[] descriptions = {
                "Game_1",
                "Game_2",
                "Game_3",
                "Game_4",
                "Game_5"

        };
        int countItems = random.nextInt(maxCount);
        for (int i = 0; i < countItems; i++) {
            invoice.addItem(descriptions[random.nextInt(descriptions.length - 1)], random.nextInt(maxQuantity), random.nextInt(maxUnitPrice));
        }
        return invoice;
    }

    public static void main(String[] args) {
        Invoice invoice = createRandomInvoice();
        invoice.addItem("LOL", 1, 5000);
        System.out.println(invoice.getItems());
        System.out.println(invoice);
    }
}