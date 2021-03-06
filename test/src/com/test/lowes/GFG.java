package com.test.lowes;
// Java implementation of the approach
import java.util.*;

class GFG {

	// Function to find all unique combination of
	// given elements such that their sum is K
	static void unique_combination(int l, int sum, int K,
			ArrayList<Integer> local,
			ArrayList<Integer> A)
	{
		// If a unique combination is found
		if (sum == K) {
			System.out.print("{");
			for (int i = 0; i < local.size(); i++) {
				if (i != 0)
					System.out.print(" ");
				System.out.print(local.get(i));
				if (i != local.size() - 1)
					System.out.print(", ");
			}
			System.out.println("}");
			return;
		}

		// For all other combinations
		for (int i = l; i < A.size(); i++) {

			// Check if the sum exceeds K
			if (sum + A.get(i) > K)
				continue;

			// Check if it is repeated or not
			/*if (i > l && A.get(i) == A.get(i - 1) )
				continue;*/

			// Take the element into the combination
			local.add(A.get(i));

			// Recursive call
			unique_combination(i + 1, sum + A.get(i), K,
							local, A);

			// Remove element from the combination
			local.remove(local.size() - 1);
		}
	}

	// Function to find all combination
	// of the given elements
	static void Combination(ArrayList<Integer> A, int K)
	{
		// Sort the given elements
		Collections.sort(A);

		// To store combination
		ArrayList<Integer> local = new ArrayList<Integer>();

		unique_combination(0, 0, K, local, A);
	}

	// Driver code
	public static void main(String[] args)
	{
		Integer[] arr = { 0,2,4,6,8 };
		ArrayList<Integer> A
			= new ArrayList<>(Arrays.asList(arr));

		int K = 10;

		// Function call
		Combination(A, K);
	}
}

// This code is contributed by PrinciRaj1992
