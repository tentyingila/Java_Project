package za.co.reverside.training.p02;

public class Program {
	
	//Exercise 01
    public static int findLargestArrayNumber(int[] arr){
        int largest=0;
        for(int x = 0; x<arr.length; x++){
            if(arr[x]>largest){
                largest = arr[x];
            }
        }    
        return largest;
    }
    
    //Exercise 02
    public static int findArraySecondLargest(int[] arr){
        int largest=arr[1];
        int secondLargest=arr[0];
        if(secondLargest > largest){
            largest = arr[0];
            secondLargest = arr[1];
        }   
        for(int x = 0; x<arr.length; x++){
            if(arr[x]>largest){
                secondLargest = largest;
                largest = arr[x];
            }else if(arr[x] > secondLargest && arr[x] != largest){
                secondLargest = arr[x];
            }
        }
        return secondLargest;
    }
    
    //Exercise 03
    public static boolean findNumber(int[] arr, int num){
        for(int x = 0; x<arr.length; x++){
            if(arr[x] == num){
                return true;
            }
        }    
        return false;
    }
    
    //Exercise 04
	public static int findNumberOccurences(int[] arr, int n) {
		int count = 0;	
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		return count;
	}
	
	//Exercise 05
	public static int[] findMaxOccurences(int[] arr) {
		int max = 0;
		int value = 0;
		int results[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]){
					count++;
				}
			}
			if (count > max){
				max = count;
				value = arr[i];
			}
		}
		results[0] = value;
		results[1] = max;	
		return results;
	}

	//Exercise 06
    public static int findSpaces(String sentence){
        int count=0;
        for(int x = 0; x<sentence.length(); x++){
            if(sentence.charAt(x)==' '){
                count++;
            }
        }
        return count;
    }
    
    //Exercise 07
    static int findNumberWords(String sentence)  
    {  
      int count=0;  
  
        char[] ch= new char[sentence.length()];     
        for(int i=0;i<sentence.length();i++)  
        {  
            ch[i]= sentence.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))  || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
    
    //Exercise 08
	public static void replaceSpace(String str) {
	       char[] ch = new char[str.length()];
		for (int i = 0; i < ch.length; i++){
		    ch[i] = str.charAt(i);
			if (ch[i] == ' '){
				ch[i] = '_';
			}
		}
		for(char rch : ch){
		    System.out.print(rch);
		}
	}
	
	//Exercise 09
    public static int[] sortArray(int[] arr)  
    {  
        int temp;
        for(int i =0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       return arr; 
    } 
    
    //Exercise 10
    public static void findEvenNumbers(int[] arr){
    	int[] even;
    	 even = new int[arr.length];
    	 for(int i = 0; i < arr.length; i++)
    	   {
    	      if(arr[i] % 2 == 0)
    	      {
    	         even[i] = arr[i];
    	         System.out.print(even[i] +" ");
    	      }
    	  } 
        } 
    
    //exercise 11
    public static void findFibonacciSeries(int n)  
    {  
        int n3 = 0;
        int n2 = 1;
        int n1 = 0;
        for(int i=1; i<n; i++){
            n3 = n2 + n1;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3; 
        } 
    }  
    
    //Exercise 12
    public static String reverseString(String str)  
    {   String reverse = ""; 
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;  
    }  
  
    //Exercise 13
    public static void convertToInt(String str)  
    {  
       int convertedInt = 0;
       for(int x = 0; x < str.length(); x++){
            switch(str.charAt(x)){
            case '1':
               convertedInt = 1;
               break;
            case '2':
               convertedInt = 2;
               break;
            case '3':
               convertedInt = 3;
               break;
            case '4':
               convertedInt = 4;
               break;
            case '5':
               convertedInt = 5;
               break;
            case '6':
               convertedInt = 6;
               break;
            case '7':
               convertedInt = 7;
               break;
            case '8':
               convertedInt = 8;
               break; 
            case '9':
               convertedInt = 9;
               break;
            case '0':
               convertedInt = 0;
               break;
            }
             System.out.print(convertedInt); 
       }
    }
    
    //Exercise 14
    public static void findMaxConsecutiveDifference(int[] arr) {
		int maxDiff = 0;
		int min  = arr[0];
		int max = arr[1];;
		if(min > max) {
			max = arr[0];
			min = arr[1];
		}
		maxDiff = max - min;
		for(int i = 2; i < arr.length; i++) {
				if(arr[i]< arr[i-1]) {
					min = arr[i];
					max = arr[i-1];
					if(maxDiff<(max-min)) {
						maxDiff = max-min;
					}
				}else if(arr[i]>arr[i-1]) {
					min = arr[i-1];
					max = arr[i];
					if(maxDiff<(max-min)) {
						maxDiff = max - min;
					}
				}
		}
		System.out.println(maxDiff);
	}
    
    //Exercise 15
	public static void findNumberOFDigits(int num) {
		int count = 0;
		while(num!=0){
			num = num /10;
			++count;
		}
		System.out.println(count);
	}
	
	//Exercise 16
	public static void findSumOfDigits(int num) {
		int sum = 0; 
		int add =0;
		while(num!=0) {
			add = num%10;
			sum = sum + add;
			num = num/10;
		}
		
		System.out.println(sum);
	}

	//Exercise 17
	public static void findOddnumbers(int n) {
		for(int i = 1; i <= n; i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
	}
	
	//Exercise 18
    public static int findSwapFirstLast(int num){
        
        int arrCount = 0;
        int num1 = num;
        //count number of digits so array length can be defined
        while(num1!=0){
            num1 = num1/10;
            arrCount++;
        } 
        int[] arr = new int[arrCount];
        for(int i = 0; i < arr.length; i++){
            arr[i] = num%10;
            num = num/10;
        } 
        num = arr[0];
        // add middle numbers of array to the first array number of the array 
        for(int j = arr.length-2; j>0; j--){
            num = num *10 + arr[j];
        }
        //add last array number
        num = num * 10 +arr[arr.length -1];
        return num;
     }
    
    //Exercise 19
	public static String findVowelConsent(char ch) {
		String result = "";
		switch(ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				result = "Vowel";
				break;
			default:
				result = "Consent";
		}
		return result;
	}
	
	//Exercise 20
	public static int reverseNumber(int num) {
		int result = 0;
		int remainder = 0;
		while(num!=0) {
			remainder = num%10;
			result = result * 10 + remainder;
			num = num/10;
		}
		
		return result;
		
	}

 
}
