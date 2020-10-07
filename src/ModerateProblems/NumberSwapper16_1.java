package ModerateProblems;

public class NumberSwapper16_1 {

    public static void NumberSwapper(int x, int y){
        x = y + x;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        NumberSwapper(5, 7);
    }
}
