package test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import tools.TreeNode;

public class Test {
	public static void main(String[] args) {
		double inf = 3 / 0.0;
		double nan = 0.0 / 0;
		double inf2 = 4 / 0.0;
		System.out.println(inf);
		System.out.println(nan);
		if (inf == inf) {
			System.out.println("inf==inf is true");
		}
		if (nan != nan) {
			System.out.println("nan==nan is false");
		}
		if (inf == inf2) {
			System.out.println("inf==inf2 is true");
		}

		HashMap<Double, Integer> map = new HashMap<>();
		map.put(nan, 10086);
		System.out.println(map.containsKey(nan));
		map.put(inf,10010);
		System.out.println(map.containsKey(inf));
	}
}
