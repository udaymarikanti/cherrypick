package forloopDemo;

import java.util.Arrays;

public class ForDemo {
    public static void main(String[] args) {
        int arry[] = {5,1,12,-5,16,2,12,14};
        //  Arrays.sort(arry);
//        for (int i = 0; i < arry.length; i++) {
//
//            for (int j = i + 1; j < arry.length; j++) {
//
//                if (arry[i] > arry[j]) {
//                    int temp = arry[i];
//                    arry[i] = arry[j];
//
//
//                    arry[j] = temp;
//
//
//                }
//
//
//            }
//            System.out.println(arry[i]);
//        }


        for (int i = 0; i < arry.length-1 ; i++) {
            int index = i;
            // Find the minimum element in unsorted array starting from i
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[j] < arry[index]) {
                    // Swap arr[i] with arr[j]
                    int temp = arry[j];
                    arry[j] = arry[index];
                    arry[index] = temp;
                }
            }
            System.out.println(arry[i] + "  selection");
        }



//        for (int count =0;count <=100;count ++){
//            System.out.println("count is " + count);
//
//        }
        }
    }


