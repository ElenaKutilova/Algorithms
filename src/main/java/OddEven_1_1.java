public class OddEven_1_1 {
    //Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
    public String OddEven (long numb) {
        if (numb % 2 != 0) {
            return "Odd";
        } else if (numb % 2 == 0) {
            return "Even";
        }else {
            return "Undefined";
        }
    }
}
