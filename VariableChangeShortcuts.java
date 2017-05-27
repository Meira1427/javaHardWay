public class VariableChangeShortcuts {
	public static void main(String[] args) {
		int i, j, k;
		
		i = 5;
		j = 5;
		k = 5;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		i = i + 3;
		j = j - 3;
		k = k * 3;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		
		i = 5;
		j = 5;
		k = 5;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		i += 3;
		j -= 3;
		k *= 3;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		
		i = j = k = 5;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		i += 1;
		j -= 2;
		k *= 3;
		System.out.println("i: " + i + "\tj: " + j + "\tk: " + k);
		
		i = j = 5;
		System.out.println("i: " + i + "\tj: " + j);
		i =+ 1; //Oops!
		j =- 2;
		System.out.println("i: " + i + "\tj: " + j + "\n");
		
		i = j = 5;
		System.out.println("i: " + i + "\tj: " + j);
		i++;
		j--;
		System.out.println("i: " + i + "\tj: " + j);
		
		// study drill #1
		i = 5;
		i -= 5;
		System.out.println("Study Drill #1 - i is now " + i);
		
		// study drill #2
		i = 5;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println("Study Drill #2 Take One - i is now " + i);
		
		/* study drill #2 take 2 - This doesn't work
		i = 5;
		(i++)*5;
		System.out.println("Study Drill #2 Take Two - i is now " + i);
		*/
	}
}