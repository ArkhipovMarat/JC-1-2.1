public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2,1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

        // не знаю зачем вы давали подсказку про тернарный оператор в abs?
        // при чем тут он?
        // ошибка возникла при делении на 0, код работает - исправил аргументы для переменой b

        // и вопрос, зачем нужно было "городить" статичную переменную instance в классе Calculator?
        // чтобы все равно затем создать экземпляр Calculator, но более изощренным способом?
        // по моему, крайне неудачный пример..
        // достаточно было создать статические методы (но с лямбдами, конечно), по аналогии с Math..
    }
}
