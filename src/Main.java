public class Main{
    public static void main(String[] args){
        System.out.println(repeatStr(5,"o"));
    }
    public static int squareSum(int[] n)
    {
        int number = 0;
        for (int numb:n) {
            number += numb*numb;
        }
        return number;
    }
    public static int century(int number) {
        if(number % 100 == 0){
            return number /100;
        }
        else return (number / 100) +1;
    }

    public static String repeatStr(final int repeat, final String string) {
        String result = "";
        for(int i = 0;i<repeat;i++){
            result += string;
        }
        return result;
    }
    public static int Past(int h, int m, int s)
    {
        return (((m + (h * 60)) * 60) + s) * 1000;
    }
    public static int makeNegative(final int x) {
        int y = Math.abs(x);
        return y * -1; // Your code here.
    }
}
