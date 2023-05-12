package ch08.sc;

import ch08.sc.unit.Marine;
import ch08.sc.unit.Zergling;

public class StarcraftCloneCodingInstanceVariableVersion {
	
	Marine[] marines;
	Zergling[] zerglings;
	
	public static void main(String[] args) {
//		int numOfMarines = 5;
//		Marine[] marines = new Marine[numOfMarines]; // 배열 객체만 담은 것
//		
//		for (int i = 0; i < numOfMarines; i++) {
//			marines[i] = new Marine(i + 1);
//		}
		StarcraftCloneCodingInstanceVariableVersion scc = new StarcraftCloneCodingInstanceVariableVersion();
		
		scc.initUnits();
		scc.reportAllUnits();
		
		System.out.println("마린이 저글링에 대해 1회 공격 후\n");
		scc.marines[0].attack(scc.zerglings[0], 2);
		scc.zerglings[0].reportStatus();
		
	}
	
	void initUnits() {
		marines = new Marine[] {
				new Marine(1), new Marine(2), new Marine(3), new Marine(4), new Marine(5)	
		};
		zerglings = new Zergling[] {
				new Zergling(1)
		};
		
	}
	
	void reportAllUnits() {
		for (Marine m : marines) {
			m.reportStatus();
		}
		
		for (Zergling z : zerglings) {
			z.reportStatus();
		}
	}

}
