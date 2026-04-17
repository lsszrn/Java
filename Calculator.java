/**
 * Класс Calculator предоставляет базовые арифметические операции.
 * Поддерживает сложение, вычитание, умножение и деление целых чисел.
 *
 * @author Isszrn
 * @version 1.0
 * @since 1.0
 * @see java.lang.Math
 */
public class Calculator {
    
    /** Текущий результат вычислений */
    private int result;
    
    /** Название калькулятора */
    private String name;
    
    /**
     * Конструктор по умолчанию.
     * Создает калькулятор с именем "Default" и нулевым результатом.
     */
    public Calculator() {
        this.name = "Default";
        this.result = 0;
    }
    
    /**
     * Конструктор с заданным именем.
     *
     * @param name имя калькулятора
     */
    public Calculator(String name) {
        this.name = name;
        this.result = 0;
    }
    
    /**
     * Складывает два целых числа.
     * <p>
     * Пример использования:
     * <pre>
     * Calculator calc = new Calculator();
     * int sum = calc.add(5, 3); // вернет 8
     * </pre>
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     */
    public int add(int a, int b) {
        result = a + b;
        return result;
    }
    
    /**
     * Вычитает второе число из первого.
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public int subtract(int a, int b) {
        result = a - b;
        return result;
    }
    
    /**
     * Умножает два целых числа.
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b
     */
    public int multiply(int a, int b) {
        result = a * b;
        return result;
    }
    
    /**
     * Делит первое число на второе.
     *
     * @param a делимое
     * @param b делитель (не должен быть равен 0)
     * @return частное от деления a на b
     * @throws ArithmeticException если делитель равен 0
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено!");
        }
        result = a / b;
        return result;
    }
    
    /**
     * Возвращает текущий результат последней операции.
     *
     * @return текущий результат
     */
    public int getResult() {
        return result;
    }
    
    /**
     * Сбрасывает результат в 0.
     * 
     * @deprecated Используйте {@link #clear()} вместо этого метода.
     *             Этот метод будет удален в версии 2.0.
     */
    @Deprecated
    public void reset() {
        result = 0;
    }
    
    /**
     * Очищает текущий результат (устанавливает в 0).
     * 
     * @since 1.1
     */
    public void clear() {
        result = 0;
    }
    
    /**
     * Возвращает информацию о калькуляторе.
     *
     * @return строка с именем и текущим результатом
     */
    @Override
    public String toString() {
        return "Calculator [" + name + "] результат = " + result;
    }
}
