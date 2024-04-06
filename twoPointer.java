import java.util.Scanner;

public class Main {

  public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
   
  public static void reverse(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    while(start < end){
      swap(arr, start, end);
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int[] arr = {2, 8, 6, 7, 9, 6};
    reverse(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }   
}
