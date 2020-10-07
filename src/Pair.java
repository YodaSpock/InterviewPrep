public class Pair {
    protected int num1;
    protected int num2;

    public Pair(int number1, int number2) {
        num1 = number1;
        num2 = number2;
    }

    public String printPairs(){
        return ("(" + num1 + "," + num2 + ")" );
    }
}
