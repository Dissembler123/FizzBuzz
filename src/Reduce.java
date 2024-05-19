public class Reduce {
    public static void reduce(){
        int count = 0;
        int num = 100;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num/2;
            }
            else {
                num --;
            }
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        reduce();
    }
}
