package za.co.reverside.training.p01;

public class Program {
	
	//Exercise 01
	public static int findLargestAmong3(int a, int b, int c){
        int largest = 0;
        
        if(largest<a) {
        	largest = a;
        }
        if(largest<b) {
        	largest = b;
        }
        if(largest<c) {
        	largest = c;
        }
       
       return largest;       
       
    }
	
	
    //Exercise 02
    public static int findSecondLargest(int[] arr){
        int largest = arr[1];
        int secondLargest = arr[0];
        
        if(secondLargest>largest){
            largest = arr[0];
            secondLargest = arr[1];
        }
        
        for(int x = 2; x < arr.length; x++ ){
            if(largest<arr[x]){
                secondLargest = largest;
                largest =arr[x];
            }else if(secondLargest<arr[x] && secondLargest != largest){
                secondLargest = arr[x];
            }
        }
       return secondLargest;   
    }
    
    
    //Exercise 03
    public static int findLargestAmong7(int[] arr){
        int largest = 0;
        
        for(int x = 0; x<arr.length; x++){
            
            if(largest<arr[x]){
                largest = arr[x];
            }
        }    
       
       return largest;
    }
	
	//Exercise 04
    public static void findFizzBuzz(int n){
        for(int x = 1; x<=n; x++){
            if(x%3==0&&x%5==0){
                System.out.print("FIZZBUZZ" + " ");
            }else if(x%3==0){
                System.out.print("FIZZ" + " ");
            }else if(x%5==0){
                System.out.print("BUZZ" + " ");
            }else{
                System.out.print(x + " ");
            }
        }
    }
    
    //Exercise 05
    public static String checkPositiveNegativeZero(int a){
        String num="";
        if(a<0){
            num = "Negative";
        }else if(a==0){
            num="Zero";
        }else{
            num="Positive";
        }
        
        return num;
    }
    
    //Exercise 06
    public static String checkOddEven(int a){
        String num="";
        if(a%2==0){
            num= "Even";
        }else{
            num="Odd";
        }
        return num;
    } 
    
    //Exercise 07
    public static boolean isLeapYear(int year){
        if(year%4==0&&year!=100){
            return true;
        }
        return false;
    } 
}
