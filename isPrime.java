import java.util.*;
public class HelloWorld{

    public static void isPrime(int num1,int num2){
        int flag=0;
        int arr[]=new int[num2-num1];
        int j=0;
        while(num1<=num2){
            if(num1==0||num1==1){
                num1++;
                continue;
            }
        for(int i=2;i<=num1/2;i++){
            if(num1%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            flag=0;
            num1++;
        }
        else{
            arr[j]=num1;
            j++;
            flag=0;
            num1++;
        }
        }
        for(int i=0;i<j;i++)
        System.out.println(arr[i]);
    }
    
     public static void main(String []args){
      isPrime(10,20);
     }
}