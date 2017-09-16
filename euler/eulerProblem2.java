/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.*/

public class eulerProblem2 {
	public static void main (String[] args) {
		int x = 1;
		int y = 2;
		int z = x+y;
		int r = 2;
		while (z <= 4000000) {
			if (z%2 == 0) {
				r = r+z;
			}
			x = y;
			y = z;
			z = x+y;
		}
		System.out.println(r);
	}
}