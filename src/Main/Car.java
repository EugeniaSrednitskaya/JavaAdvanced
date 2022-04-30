package Main;

public class Car {
    static int speed;

    public static void main(String... args) {
        Car ta4ka = new Car();

        System.out.println("speed в хипе при создании объекта = " + ta4ka.speed); // 0

        ta4ka.setSpeed(12); // Вызываем конкретную функцию(метод) из новосозданного объекта
        // Значение хранится в фрейме в переменной newSpeed
    }

    public void showSpeed() {    // выводит значение из хипа по ссылке this
        System.out.println("speed в хипе на момент вызова \'showSpeed()\' = " + this.speed);
    }

    public void setSpeed(int newSpeed) { // принимаем значение 12. newSpeed это переменная объявленная внутри метода --> хранится в стеке фрейма метода

        this.speed = newSpeed; // записываем по this-ссылке в хип значение из стека метода setSpeed
        showSpeed();// выводим на экран значение из хипа // 12

        newSpeed = 8;// записали новое значение в стеке в фрейме метода setSpeed

        System.out.println("переменная newSpeed в фрейме метода setSpeed в стеке = " + newSpeed); // 8

        // присваиваем переменной speed новое значение = 3
        speed = 3; // В стеке нет такой переменной, потому значение будет записано в хип!
        System.out.println("Java сама добавила this перед именем \'speed\' и записала новое значение speed в хип = " + this.speed); // 3

        setSetSpeed(newSpeed); // передаем значение newSpeed = 8

    }

    public void setSetSpeed(int speed) { // теперь и только теперь и в фрейме метода setSetSpeed в стеке есть своя переменная c именем speed!

        System.out.println("Значение speed в хипе = " + this.speed); // 3

        speed = speed;//в стеке speed сама себя переприсваивает.
        System.out.println("переменная speed в фрейме стека = " + speed); // 8

        this.speed = speed; // присваиваем значение speed из фрейма значению speed в хипе!
        System.out.println("Значение speed в хипе заданное уже методом setSetSpeed = " + this.speed); // показываем speed из хипа. // 8
    }
}