import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int index= Arrays.binarySearch(numbers, 5);
        System.out.println("The index of element 5 is: "+index);
        Arrays.fill(numbers,12);
        for(int i: numbers){
            System.out.print(i+" ");
        }
        System.out.println();

        int[] a={10,32,31,38,95,23,49,19};
        Arrays.sort(a);
        for(int x: a){
            System.out.print(x+" ");
        }
    }
}
