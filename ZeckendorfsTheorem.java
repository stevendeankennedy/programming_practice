import java.util.Scanner;
import java.util.ArrayList;

//Problem: https://www.reddit.com/r/dailyprogrammer/comments/55zdxx/20161005_challenge_286_intermediate_zeckendorf/
//Formulas from: http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibFormula.html


public class ZeckendorfsTheorem{


	static final double PHI = ((Math.sqrt(5)+1)/2);
	
	
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		ZeckendorfsTheorem zt = new ZeckendorfsTheorem();

		int num = console.nextInt();
		int[] input = new int[num];
		
		for (int i = 0; i < num && console.hasNextInt(); i++){
			input[i] = console.nextInt();
		}
		
		for (int i = 0; i < num; i++){
			zt.getResult(input[i]);
		}
		
	}
	

	void getResult(int num){
		int orginalNum = num;
		ArrayList<Integer> intList = new ArrayList<>();

		while(num != 0){
			int fib = getFib(getFloorIndex(num));
			intList.add(fib);
			num -= fib;
		}

		//Print out orginalNum and rest of items in intList
		System.out.printf("%d = ",orginalNum);
		if (intList.size() > 0){
			System.out.printf("%d",intList.get(0));
			for(int i = 1; i < intList.size(); i++){
				System.out.printf(" + %d",intList.get(i));
			}
		}
		System.out.print("\n");
	}
	//Formulas from http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibFormula.html
	int getFloorIndex(int i){
		if (i == 3){return 4;}//There is a rounding error for small i.
		return (int)Math.floor((Math.log10(i)+Math.log10(5)/2)/Math.log10(PHI));
	}
	int getFib(int i){
		return (int)Math.round(Math.pow(PHI, i)/Math.sqrt(5));
	}

}
