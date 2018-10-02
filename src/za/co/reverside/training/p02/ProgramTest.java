package za.co.reverside.training.p02;

public class ProgramTest {

	public static void main(String[] args) {
		int arr[] = new int[12];
		arr[0] = 5;
		arr[1] = 8;
		arr[2] = 6;
		arr[3] = 4;
		arr[4] = 9;
		arr[6] = 8;
		arr[7] = 5;
		arr[8] = 84;
		arr[9] = 54;
		arr[10] = 5;
		arr[11] = 78;
        
        //Exercise 01
        System.out.println("Exercise: 1");
        System.out.println("Largest number in an array: "+Program.findLargestArrayNumber(arr) +"\n");
        
    	//Exercise 02	
		System.out.println("=================================="+ "\n" +"Exercise: 2");
        System.out.println("Second Largest: " + Program.findArraySecondLargest(arr) + "\n");
        
        //Exercise 03	
        System.out.println("=================================="+ "\n" +"Exercise: 3");
        System.out.println("If present <true> else <false>: " + Program.findNumber(arr, 19)+ "\n");
        
        //Exercise 04	
        System.out.println("=================================="+ "\n" +"Exercise: 4");
        System.out.println("Number occurs:  " + Program.findNumberOccurences(arr, 7)+ "\n");
        
        //Exercise 05
        System.out.println("=================================="+ "\n" +"Exercise: 5");
        int[] results = Program.findMaxOccurences(arr);
        System.out.println("Array value: " + results[0] + " -- Occurences: " + results[1] +"\n");
        
        //Exercise 06
        System.out.println("=================================="+ "\n" +"Exercise: 6");
        String sentence = "This is hello world";
        System.out.println("The sentence has: " +Program.findSpaces(sentence) + " spaces"+ "\n");

        //Exercise 07
        System.out.println("=================================="+ "\n" +"Exercise: 7");
        String sentence1 ="I love hello world";
        System.out.println("This sentence has: " +Program.findNumberWords(sentence1)+" words"+"\n");
        
        //Exercise 08
        System.out.println("=================================="+ "\n" +"Exercise: 8");
		String str = "I love hello world and programming";
		Program.replaceSpace(str);
		System.out.println("\n");
		
		//Exercise 09
		System.out.println("=================================="+ "\n" +"Exercise: 9");
		System.out.print("Sorted Array: ");
        int[] sortedArray = Program.sortArray(arr);
        for(int i =0; i < arr.length; i++){
            System.out.print(sortedArray[i] +" ");
        }
        System.out.println("\n");
        
        //Exercise 10
        System.out.println("=================================="+ "\n" +"Exercise: 10");
        System.out.print("Array Even Numbers: ");
        Program.findEvenNumbers(arr);
        System.out.println("\n");
        
        //Exercise 11
        System.out.println("=================================="+ "\n" +"Exercise: 11");
        System.out.print("Fibonacci Series: ");
        Program.findFibonacciSeries(10);
        System.out.println("\n");
        
        //Exercise 12
        System.out.println("=================================="+ "\n" +"Exercise: 12");
        System.out.println("Reversed String: "+Program.reverseString("Hello")+"\n");
        
        //Exercise 13
        System.out.println("=================================="+ "\n" +"Exercise: 13");
        System.out.print("Convert String to Integer: ");Program.convertToInt("1234");
        System.out.println("\n");
        
        //Exercise 14
        System.out.println("=================================="+ "\n" +"Exercise: 14");
        System.out.print("Max Consecutive Difference: ");Program.findMaxConsecutiveDifference(arr);
        System.out.print("\n");
        
        //Exercise 15
        System.out.println("=================================="+ "\n" +"Exercise: 15");
        System.out.print("Number of Digits: ");Program.findNumberOFDigits(76548);
        System.out.print("\n");
        
        //Exercise 16
        System.out.println("=================================="+ "\n" +"Exercise: 16");
        System.out.print("Sum of Digits: ");Program.findSumOfDigits(1234);
        System.out.print("\n");
        
        //Exercise 17
        System.out.println("=================================="+ "\n" +"Exercise: 17");
        System.out.print("Sum Odd Numbers: ");Program.findOddnumbers(20);
        System.out.print("\n");
        
        //Exercise 18
        System.out.println("=================================="+ "\n" +"Exercise: 18");
        int num = 1234;
        System.out.println("Swapped First na Last Number: "+Program.findSwapFirstLast(num)+"\n");
        
        //Exercise 19
        System.out.println("=================================="+ "\n" +"Exercise: 19");
        System.out.println("Vowel or Consent: "+Program.findVowelConsent('E') + "\n");
        
        //Exercise 20
        System.out.println("=================================="+ "\n" +"Exercise: 20");
        System.out.println("Reversed Number: "+Program.reverseNumber(1234));
	}

}
