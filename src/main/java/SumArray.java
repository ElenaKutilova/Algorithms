public class SumArray {
    //Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    //
    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10

    public int sumOfArray (int[] arr) {
        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArray += arr[i];
        }
        return sumOfArray;
    }
}
