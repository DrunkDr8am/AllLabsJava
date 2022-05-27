package ru.mephi.head2.Lab14;

/**
 *  Скомпилируйте класс N e tw o rk , представленный в этой главе. Обратите внимание на то, что файл внутреннего класса называется
 *  N e tw o rk $ M e m b e r.c la s s . Воспользуйтесь утилитой ja v a p , чтобы исследовать сгенерированный код. Так, по
 * следующей команде:
 * javap - p r i v a t e имяКласса
 * выводятся методы и переменные экземпляра. Выявите среди выводимых результатов ссылку на объемлющий класс. (В Linux и Mac OS X перед знаком $
 * в имени класса следует указать знак \ при выполнении утилиты ja v a p .)
 */

public class Lab14 {
    public static void main(String[] args) {
        Network myFace = new Network();
        Network.Member fred = myFace.enroll("Fred");
        Network.Member alice = myFace.enroll("Alice");
        alice.leave();
        fred.leave();
    }
}