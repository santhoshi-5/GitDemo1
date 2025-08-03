import java.util.Arrays;
class ArraysDemo1{
   public static void main(String[] args){
       int intArr[] ={10,20,15,40,35};
       System.out.println("Integer array as list:"+Arrays.asList(intArr));
       int key=20;
       System.out.println(key+" is found at index "+Arrays.binarySearch(intArr,key));
       int intArr1[]={10,15,22};
       Arrays.sort(intArr,1,3);
      System.out.println("IntArr after sorting first 3 indices"+Arrays.toString(intArr));
       System.out.println("Arrays on comparison:"+Arrays.equals(intArr,intArr1));
      // System.out.println("Elements mismatched at index: "+Arrays.mismatch(intArr,intArr1));
   }
}