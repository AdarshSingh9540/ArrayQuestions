import java.util.* ;

class Main{
  public static void main(String[] args){
  int[] arr = {1,2,3,4,5,6,7,8,9,10};
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < arr.length; i++)
      {
        if(arr[i]%2==0){
          list.add(arr[i]);
        }

      }
    System.out.println(list);
  }
  
}
