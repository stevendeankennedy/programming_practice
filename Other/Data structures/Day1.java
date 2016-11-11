import java.util.LinkedList;

public class Day1 {
	static boolean map[];
	public static void main(String args[]){
		
		LinkedList<Integer>[] array = new LinkedList[7];
		map = new boolean[7];
		for (int i= 0; i < 7; i++){
			array[i] = new LinkedList<Integer>();
		}
		
		array[0].add(1);
		array[0].add(2);
		array[0].add(4);
		array[1].add(3);
		array[4].add(5);
		array[5].add(6);
		
		visit(array, 0);
		
	}
	
	public static void visit(LinkedList<Integer>[] array, int lastNode){
		map[lastNode] = true;//It been there
		System.out.println(lastNode);
		for (int i = 0; i < array[lastNode].size(); i++){
			visit(array, array[lastNode].get(i));
		}
	}
}
