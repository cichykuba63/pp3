package afterClass;

public class MyArrays {
    public static int odd(int[] arr) {
        int sum = 0;
        for (int num: arr) {
            if (num > 0 && num % 2 != 0)
                sum++;
        }
        return sum;
    }

    public static int above(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;

        for (int num: arr) {
            sum1 += num;
        }

        for (int num: arr) {
            if (num > (double)sum1 / arr.length)
                sum2 += num;
        }

        return sum2;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,2,-5,4,1,-7};
        int[] arr2 = {5,2,7,4,2};

        System.out.println(MyArrays.odd(arr1));
        System.out.println(MyArrays.above(arr2));
    }
}
