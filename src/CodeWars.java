import java.lang.System;
import java.util.ArrayList;
import java.util.List;

public class CodeWars
{
    public CodeWars(){}
    public static int[] digitize(long n) {
        String str = String.valueOf(n);
        System.out.println(str);
        int[] ints = new int[str.length()];
        for (int i = str.length()-1,j = 0; i>0;i--,j++){
            ints[j] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return ints;
    }
    public static boolean  isIsogram(String str) {
        List<Character> chars = new ArrayList<>();

        for(int i = 0;i < str.length();i++){
            if(chars.contains(str.toLowerCase().charAt(i)))
                return false;
            else chars.add(str.toLowerCase().charAt(i));
        }
        return true;

    }
    public static String solution(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {

            result += str.charAt(i);
        }

        return result;
    }
    public static double find_average(int[] array){
        double number = 0;
        for (int i : array) {
            number += i;
        }
        return number/array.length;

    }

    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {

        final List<List<Integer>> sets = new ArrayList<>();
        sets.add(new ArrayList<Integer>());
        sets.add(new ArrayList<Integer>());
        long number = 0;
        for(int i = 1; i<=n;i++){
            number += i;
        }
        System.out.println(number);

        if (number % 2 == 0) {
            number /= 2;
            System.out.println(number);
            for (int i = n; i > 0; i--) {
                if (number - i >= 0) {
                    sets.get(0).add(i);
                    number -= i;
                } else sets.get(1).add(i);
            }
        }
        return sets;
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
