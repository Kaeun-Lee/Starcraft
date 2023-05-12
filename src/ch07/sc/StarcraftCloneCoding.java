package ch07.sc;

import ch07.sc.unit.Marine;
import ch07.sc.unit.Zergling;

public class StarcraftCloneCoding {

	public static void main(String[] args) {
//		int numOfMarines = 5;
//		Marine[] marines = new Marine[numOfMarines]; // 배열 객체만 담은 것
//		
//		for (int i = 0; i < numOfMarines; i++) {
//			marines[i] = new Marine(i + 1);
//		}
		
		Marine[] marines = new Marine[] {
			new Marine(1), new Marine(2), new Marine(3), new Marine(4), new Marine(5)	
		};
// 		int[] scores = new int[] {10, 20, 30, 40, 50};  // 이것과 동일
		
		for (Marine m : marines) {
			m.reportStatus();
		}
		
		Zergling[] zerglings = new Zergling[] {
				new Zergling(1)
		};
		
		for (Zergling z : zerglings) {
			z.reportStatus();
		}
		
		System.out.println("마린이 저글링에 대해 1회 공격 후\n");
		marines[0].attack(zerglings[0], 1);
		zerglings[0].reportStatus();
		
	}

}
