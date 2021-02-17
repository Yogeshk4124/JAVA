import java.util.*;

class LuckyArray{

    public static int[] Delete(int[] arr,int index) 
    { 
        int[] b = new int[arr.length - 1]; 

        for (int i = 0, k = 0; i < arr.length; i++) {  
            if (i == index) { 
                continue; 
            }  
            b[k++] = arr[i]; 
        } 
        return b; 
    }
    public static void main(String[] args) {
        int a[]={0,1,1,2,3,5,8,3,1};

        int size=a.length;

        while(size!=1){
            size=a.length;
            for(int i=0;i<a.length;i++){
                 if(a.length==1) break;
                a=Delete(a,i);
            }
        }
        System.out.println("FUCK TESTING START DEBUGGING");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}