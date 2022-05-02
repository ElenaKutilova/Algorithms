public class IsTheNumbGood {
    public String isTheNumbGood (int a) {
        String isTheNumbGood = "Good Number";
        if (a % 3 == 0 && a % 5 == 0) {
            return isTheNumbGood;
        } else if (a % 3 == 0 && a % 5 != 0) {
            return isTheNumbGood = "Bad Number";
        } else if (a % 3 != 0 && a % 5 == 0) {
            return isTheNumbGood = "Poor Number";
        } else {
            return isTheNumbGood = "-1";
        }
    }
}
