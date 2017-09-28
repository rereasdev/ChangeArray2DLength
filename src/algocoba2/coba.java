/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algocoba2;

/**
 *
 * @author asus
 */
public class coba {
//    public int[][] copyOf3Dim(int[][] array) {
//    int[][] copy;
//    copy = new int[array.length][];
//    for (int i = 0; i < array.length; i++) {
//        copy[i] = new int[array[i].length];
//        for (int j = 0; j < array[i].length; j++) {
//            copy[j] = new int[array[j].length];
//            System.arraycopy(array[i], 0, copy[i], 0, array[i].length);
//        }
//    }
//    return copy;
//}  
//    public static void main(String[] args) {
//        int[][] a = {
//        {1, 2, 3, 4},
//        {5, 6, 7, 8}};
//    }
    public static void main(String[] args) {
        
        int[][] nums =  {{5},
                 {9,4},
                 {1,7,8},
                 {8,3,2,10}};
        int[][] copy = new int[nums.length][];

        for (int i = 0; i < nums.length; i++) {
            copy[i] = new int[nums[i].length];
            System.arraycopy(nums[i], 0, copy[i], 0, nums[i].length);
        }
        for(int[] a:copy){
            for (int i = 0; i < copy[0].length; i++) {
                System.out.println(a[i]);
            }
        }
    }         
}
