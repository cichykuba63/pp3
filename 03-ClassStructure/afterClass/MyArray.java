package afterClass;

import java.util.Arrays;

public class MyArray {
    static int even(int[] arr) {
        int count = 0;

        for (int num: arr) {
            if (num % 2 == 0)
                count++;
        }

        return count;
    }

    static int positiveOdd(int[] arr) {
        int count = 0;

        for (int num: arr) {
            if (num % 2 != 0 && num > 0)
                count++;
        }

        return count;
    }

    static int[] reverse(int[] arr) {
        int[] arrTemp = new int[arr.length];
        int start = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            arrTemp[start++] = arr[i];
        }

        return arrTemp;
    }

    static boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        } else
            return false;
    }

    static int[] different(int[] arr1, int[] arr2) {
        int[] diffTemp = new int[arr1.length];
        int[] diff;
        int index = 0;
        int sum = 0;
        int sum1 = 0;
        int prevValue;
        boolean exception = false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int num1: arr1) {
            for (int num2: arr2) {
                if (num1 == num2)
                    break;
                else if (num1 != num2 && num1 > num2 && num2 != arr2[arr2.length - 1])
                    continue;
                else if (num1 != num2 && num1 < num2) {
                    if (num1 == 0)
                        exception = true;
                    diffTemp[index++] = num1;
                }
                else if (num1 != num2 && num1 > num2 && num2 == arr2[arr2.length - 1])
                    diffTemp[index++] = num1;
            }
        }

        Arrays.sort(diffTemp);
        index = 0;

        for (int num1: diffTemp) {
            if (num1 == 0)
                continue;
            else 
                sum++;
        }

        if (exception)
            diff = new int[sum++];
        else
            diff = new int[sum];
    
        for (int num: diffTemp) {
            if (num == 0) {
                if (exception)
                    diff[index++] = num;
                else
                    continue;
            } else {
                diff[index++] = num;
            }
        }

        return diff;
    }

    static boolean exist(int number, int[] arr) {
        for (int num: arr)
            if (number == num)
                return true;
            else
                continue;
        
        return false;
    }


    static int secondMax(int[] arr) {
        int[] arrTemp = new int[arr.length];
        int prevValue;
        int index = 0;

        if (arrTemp.length == 0)
            return -1;

        Arrays.sort(arr);

        prevValue = arr[0];
        arrTemp[index++] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (prevValue != arr[i]) {
                prevValue = arr[i];
                arrTemp[index++] = arr[i];
            } else {
                continue;
            }
        }

        Arrays.sort(arrTemp);

        return arrTemp[arrTemp.length - 2];
    }

    static double lastColumn(int[][] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr[i].length - 1];
        }

        return sum;
    }

    static int[][] swap(int[][] arr) {
        int index = 0;
        int[][] arrTemp = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            arrTemp[i] = new int[arr[i].length];
        }

        for (int i = 0; i < arr.length; i++) {
            index = 0;
            arrTemp[i][index++] = arr[i][arr[i].length - 1];
            for (int j = 1; j <= arr[i].length - 2; j++) {
                arrTemp[i][index++] = arr[i][j];
            }
            arrTemp[i][index] = arr[i][0]; 
        }

        return arrTemp;
    }

    static int[] two2one(int[][] arr) {
        int sum = 0;
        int index = 0;
        int[] arrTemp;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].length;
        }

        arrTemp = new int[sum];

        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrTemp[index++] = arr[i][j];
            }
        }

        return arrTemp;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 10, 11, 13};
        System.out.println(MyArray.even(numbers));

        System.out.println();

        int[] numbers1 = {-5, -3, -1, 2, 4, 5, -5, 7, -1, -2};
        System.out.println(MyArray.positiveOdd(numbers1));

        System.out.println();

        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int[] numbers2Reversed = MyArray.reverse(numbers2);

        System.out.println(Arrays.toString(numbers2Reversed));

        System.out.println("\n");

        int[] comp1 = {1, 2, 3, 5, 10, 12, 11};
        int[] comp2 = {1, 2, 3, 5, 10, 11, 12};

        System.out.println(MyArray.compare(comp1, comp2));
        System.out.println();

        int[] diff1 = {1, 1, 2, 4, 7, 11, 13, 14, 3, 5, 1};
        int[] diff2 = {1, 1, 2, 4, 7, 12};

        int[] diff = MyArray.different(diff1, diff2);
        
        System.out.println(Arrays.toString(diff));

        int[] arr1 = {2, 4, 6, 1, 4, 6, 7};
        System.out.println(MyArray.exist(6, arr1));

        System.out.println();

        System.out.println(MyArray.secondMax(arr1));

        int[][] arr3 = {{1, 2, 3, 4}, {3, 4, 5, 6}, {1, 4, 2, 2}}; 

        System.out.println((int)MyArray.lastColumn(arr3));

        int[][] swap = MyArray.swap(arr3);

        for (int[] i: swap) {
            System.out.println(Arrays.toString(i));
        }

        int[] xd = MyArray.two2one(arr3);

        Arrays.sort(xd);

        System.out.println(Arrays.toString(xd));
    }
}