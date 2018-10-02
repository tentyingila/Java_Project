package za.co.reverside.training.p03;

public class Program {
	
	public static void printSquareStarPattern(int n) {
		for(int i = 0; i < n; i++) {
			//iterate columns
			for(int j = 0; j < n; j++) {
				System.out.print("x");
			}
			System.out.print("\n");
		}
	}
	
	public static void drawHallowSquareStarPattern(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i==1 || i == n || j == 1 || j == n) {
					System.out.print("x");
				}else {
					System.out.print(" ");
				}	
			}
			
			System.out.print("\n");
		}
	}
	
	//Exercise 03
	public static void drawHollowSquarePatternDiagonal(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i==1 || i == n || j == 1 || j == n || i==j || j==(n - i + 1)) {
					System.out.print("x");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}
	}
	
	//Exercise 04
	public static void drawRhombusPattern(int n) {
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=n-i;j++)
	        {
	        	System.out.print(" ");
	        }
		    
			for(int j =1; j<=n; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
	    }	
	}
	
	//Exercise 05
	public static void drawHallowRhombusParttern(int n) {
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=n-i;j++)
	        {
	        	System.out.print(" ");
	        }
		    
			if(i==1 || i==n)
	            for(int j=1;j<=n;j++)
	            {
	            	System.out.print("*");
	            }
	        else
		    {
	            for(int j=1;j<=n;j++)
	            {  
	                if(j==1 || j==n)
	                    System.out.print("*");
	                else
	                	System.out.print(" ");
	            }
	        }
			System.out.print("\n");
	                       
	    }
	}

	
	//Exercise 06
	public static void drawMirroredRhombus(int n) {
	    for(int i=n; i>=1;i--)
	    {
	        for(int j=1;j<=n-i;j++)
	        {
	        	System.out.print(" ");
	        }
		    
			for(int j =1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
	    }	
	}

	
	//Exercise 07
	public static void drawHallowMirroredRhombus(int n) {
	    for(int i=n;i>=1;i--)
	    {
	        for(int j=1;j<=n-i;j++)
	        {
	        	System.out.print(" ");
	        }
		    
			if(i==1 || i==n)
	            for(int j=1;j<=n;j++)
	            {
	            	System.out.print("*");
	            }
	        else
		    {
	            for(int j=1;j<=n;j++)
	            {  
	                if(j==1 || j==n)
	                    System.out.print("*");
	                else
	                	System.out.print(" ");
	            }
	        }
			System.out.print("\n");                 
	    } 
	}

	
	//Exercise 08
	public static void drawRightTriangle(int n) {
		//For Rows
		for(int i = 1; i <=n; i++) {
			//For Columns
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	//Exercise 09
	public static void drawHallowRightTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        for(int j=1; j<=i; j++)
	        { 
	            if(j==1 || j==i || i==n)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print("\n");
	    }
		
	} 
	
	//Exercise 10
	public static void drawMirroredRightTriangle(int n) {
		  for(int i=1; i<=n; i++)
		    {
		        /* Print spaces in decreasing order of row */
		        for(int j=i; j<n; j++)
		        {
		            System.out.print(" ");
		        }
		        /* Print star in increasing order or row */
		        for(int j=1; j<=i; j++)
		        {
		            System.out.print("*");
		        }
		        /* Move to next line */
		        System.out.print("\n");
		    }
	}
	
	//Exercise 11
	public static void drawHallowMirroredTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        /* Print trailing spaces */
	        for(int j=i; j<n; j++)
	        {
	            System.out.print(" ");
	        }
	        /* Print hollow right triangle */
	        for(int j=1; j<=i; j++)
	        {

	            if(i==n || j==1 || j==i)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        System.out.print("\n");
	    }
		
	}
	
	//Exercise 12
	public static void drawInvertedTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        /* Iterate through columns */
	        for(int j=i; j<=n; j++)
	        {
	            System.out.print("*");
	        }
	       
	        /* Move to the next line */
	        System.out.print("\n");
	    }
		
	}
	
	//Exercise 13
	public static void drawHallowInvertedTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        /* Iterate through columns */
	        for(int j=i; j<=n; j++)
	        {
	            /* 
	             * Print stars for first row(i==1), 
	             * first column(j==1) and 
	             * last column(j=rows).
	             */
	            if(i==1 || j==i || j==n)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        /* Move to next line */
	        System.out.println("");
	    }
	}
	
	//Exercise 14
	public static void drawInvertedMirroredRightTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        /* Print leading spaces */
	        for(int j=1; j<i; j++)
	        {
	            System.out.print(" ");
	        }
	        /* Iterate through columns to print star */
	        for(int j=i; j<=n; j++)
	        {
	            System.out.print("*");
	        }
	        /* Move to next line */
	        System.out.print("\n");
	    }
	}
	
	
	//Exercise 15
	public static void drawInvertedMirroredHallowTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        /* Iterate through columns */
	        for(int j=i; j<=n; j++)
	        {
	            /* 
	             * Print stars for first row(i==1), 
	             * first column(j==1) and 
	             * last column(j=rows).
	             */
	            if(i==1 || j==i || j==n)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }
	        /* Move to next line */
	        System.out.print("\n");
	    }

		
	}
	
	//Exercise 16
    public static void printPyramidTriangle(int n) 
    { 
        // number of spaces 
        int k = 2*n - 2; 
   
        // outer loop to handle number of rows 
        //  n in this case 
        for (int i=0; i<n; i++) 
        { 
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=0; j<k; j++) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
            // decrementing k after each loop 
            k = k - 1; 
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        }
    }
	
	//Exercise 17
    public static void drawHallowPyramid(int n) {

        // Do for each row
        for (int i = 1; i <= n; i++)
        {
            // Print space
            for (int j = i; j < n; j++) {
                System.out.print(' ');
            }
            // Print '*'
            for (int k = 1; k < 2*i; k++)
            {
                // Print '*' for boundaries
                if (i == n || (k == 1 || k == 2*i - 1)) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
     
	
	//Exercise 18
    public static void drawInvertedPyramid(int n) {

        // Do for each row
        for (int i = n; i >= 1; i--)
        {
            // Print space
            for (int j = n; j > i; j--) {
                System.out.print(' ');
            }
            // Print '*'
            for (int k = 1; k < 2*i; k++) {
                System.out.print('*');
            }
            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
	
	//Exercise 19
    public static void drawHallowInvertedPyramid(int n) {

        // Do for each row
        for (int i = n; i >= 1; i--)
        {
            // Print space
            for (int j = n; j > i; j--) {
                System.out.print(' ');
            }

            // Print '*'
            for (int k = 1; k < 2*i; k++) {
                // Print '*' for boundaries
                if (i == n || (k == 1 || k == 2*i - 1)) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
	
	//Exercise 20
	public static void drawHalfDiamondPyramid(int n) {
	    int columns=1;

	    for(int i=1;i<n*2;i++)
	    {
	        for(int j=1; j<=columns; j++)
	        {
	            System.out.print("*");
	        }

	        if(i < n)
	        {
	            /* Increment number of columns per row for upper part */
	            columns++;
	        }
	        else
	        {
	            /* Decrement number of columns per row for lower part */
	            columns--;
	        }

	        /* Move to next line */
	        System.out.print("\n");
	    }
	}
	
	//Exercise 21
	public static void drawMirroredHalfDiamondPyramid(int n) {
	    int spaces = n-1;
	    int star = 1;
	    
	    /* Iterate through rows */
	    for(int i=1; i<n*2; i++)
	    {
	        /* Print leading spaces */
	        for(int j=1; j<=spaces; j++)
	            System.out.print(" ");
	        
	        /* Print stars */
	        for(int j=1; j<=star; j++)
	            System.out.print("*");
	        
	        /* Move to next line */
	        System.out.print("\n");
	        
	        if(i < n) 
	        {
	            star++;
	            spaces--;
	        }
	        else
	        {
	            star--;
	            spaces++;
	        }
	    }
	}
}
