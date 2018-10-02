package za.co.reverside.training.p01;

public class ProgramTest {

	public static void main(String[] args) {
        
		int[] arr = new int[7];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 10;
        arr[3] = 8;
        arr[4] = 15;
        arr[5] = 6;
        arr[6] = 4;
        
		//Exercise 01
		System.out.println("Exercise: 1");
		System.out.println("Largest Number:" + Program.findLargestAmong3(4, 5, 2)+"\n");
		
		//Exercise 02	
		System.out.println("==============="+ "\n" +"Exercise: 2");
        System.out.println("Second Largest: " + Program.findSecondLargest(arr) + "\n");
        
        //Exercise 03
        System.out.println("==============="+ "\n" +"Exercise: 3");
        System.out.println("Largest number among 7 numbers: "+Program.findLargestAmong7(arr)+"\n");
        
        //Exercise 04
        System.out.println("==============="+ "\n" +"Exercise: 4");
        System.out.print("FizzBuzz: " );
        Program.findFizzBuzz(35);
        
        //Exercise 05
        System.out.println("\n" +"\n" +"==============="+ "\n" +"Exercise: 5");
        System.out.println(Program.checkPositiveNegativeZero(-8) + "\n");
        
        //Exercise 06
        System.out.println("==============="+ "\n" +"Exercise: 6");
        System.out.println(Program.checkOddEven(16)+"\n");
        
        //Exercise 07
        System.out.println("==============="+ "\n" +"Exercise: 7");
        System.out.println("If is a leap year results true else false: " + Program.isLeapYear(2012));
	}

}
