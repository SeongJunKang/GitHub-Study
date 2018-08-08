
/*
Q .
Given an integer size, return an array containing each integer from 1 to size in the following order:

1, size, 2, size - 1, 3, size - 2, 4, ...

Example

For size = 7, the output should be
constructArray(size) = [1, 7, 2, 6, 3, 5, 4].

Input/Output

[execution time limit] 3 seconds (java)

[input] integer size

A positive integer.

Guaranteed constraints:
1 ≤ size ≤ 15.

[output] array.integer

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

TEST 
Test 1
Input:
size: 7
Output:
Run the code to see output
Expected Output:
[1, 7, 2, 6, 3, 5, 4]
Console Output:
Empty

Test2
Input:
size: 2
Output:
Run the code to see output
Expected Output:
[1, 2]
Console Output:
Empty

Test 3
Input:
size: 1
Output:
Run the code to see output
Expected Output:
[1]
Console Output:
Empty
*/
public class constructArray {
	int[] sizes = [7,2,1];
	public String main(args[]) {
		int[] result;
		for(int i = 0 ; i <sizes.length ; i++) {
			result = constructArray(sizes[i]);
			result.stream().foreach(System.out::println);
		}
	}
	
	/* answer */
	public int[] constructArray(int size) {
		    int[] r = new int[size];
		    int s = size;
		    int c = 1;
		    for(int i=0 ; i< size; i++) {
		        (i % 2 == 0)?
		            r[i] = c++:
		            r[i] = s--;       
		    }
		    return r;
	}
}
