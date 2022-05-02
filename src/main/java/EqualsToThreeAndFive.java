public class EqualsToThreeAndFive {
    //Для заданного целого числа M выполните следующие условные действия:
    //Если M кратно 3 и 5, вернуть «Хорошее число».
    //Если M кратно только 3, а не 5, верните «Неверный номер».
    //Если M кратно только 5, а не 3, вернуть «Плохое число».
    //Если M не удовлетворяет ни одному из вышеперечисленных условий, верните «-1».
    public String isTheNumbGood (int a) {
        String isTheNumbGood = "Good Number";
        if (a % 3 == 0 && a % 5 == 0 ) {
            return isTheNumbGood;
        } else if(a % 3 == 0 && a % 5 != 0) {
            return isTheNumbGood = "Bad Number";
        } else if (a % 3 != 0 && a % 5 == 0) {
            return isTheNumbGood = "Poor Number";
        } else {
            return isTheNumbGood = "-1";
        }
    }
}
