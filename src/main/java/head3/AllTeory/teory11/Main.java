package head3.AllTeory.teory11;

// Ссылка на статический метод, вычисляющий объем шара
// 1. Функциональный интерфейс, определяющий метод, который получает параметром
//   число типа double и возвращает результат типа double
interface ICalcFigure {
    double volume(double radius);
}

// 2. Класс, в котором определен статический метод вычисления объема шара
class CalcVolume {
    static double sphereVolume(double radius) {
        return 4.0/3.0*Math.PI*radius*radius*radius;
    }
}

// 3. Класс, в котором определен метод, получающий ссылку на функциональный интерфейс
class FigureOperation {
    //метод
    double volume(ICalcFigure ref, double radius) {
        return ref.volume(radius);
    }
}

// 4. Класс, демонстрирущий использование ссылки на статический метод
public class Main {

    public static void main(String[] args) {
        // Вычислить объем шара
        // 1. Объявить экземпляр класса FigureOperation
        FigureOperation fo = new FigureOperation();

        // 2. Вызвать метод Volume и передать ему ссылку на статический метод
        //    Вычислить объем шара радиуса 5.0
        double volume = fo.volume(CalcVolume::sphereVolume, 5.0);

        // 3. Вывести результат
        System.out.println("volume = " + volume);
    }
}