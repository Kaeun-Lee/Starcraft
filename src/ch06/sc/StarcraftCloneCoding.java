package ch06.sc;

public class StarcraftCloneCoding {

	public static void main(String[] args) {
		int numOfMarines = 5;
		int[] marineHps = new int[numOfMarines];
		int[] marineAtks = new int[numOfMarines];
		int[] marineDefs = new int[numOfMarines];
		String marineWeapon = "가우스 소총";

		initUnits(marineHps, 40, marineAtks, 6, marineDefs, 0);

		reportUnits("마린", marineHps, marineAtks, marineDefs, marineWeapon);

		// 저글링 #1 생성
		int numOfZerglings = 1;
		int[] zerglingHps = new int[numOfZerglings];
		int[] zerglingAtks = new int[numOfZerglings];
		int[] zerglingDefs = new int[numOfZerglings];
		String zerglingWeapon = "발톱";
		
		initUnits(zerglingHps, 35, zerglingAtks, 5, zerglingDefs, 0);

		reportUnits("저글링", zerglingHps, zerglingAtks, zerglingDefs, zerglingWeapon);

		
		System.out.println("공격 후");
		zerglingHps[0] = attack(marineAtks[0], zerglingHps[0], zerglingDefs[0]);

		reportUnits("마린", marineHps, marineAtks, marineDefs, marineWeapon);
		reportUnits("저글링", zerglingHps, zerglingAtks, zerglingDefs, zerglingWeapon);
		System.out.println();
		
		System.out.println("공격 후");
		attack(marineAtks, 0, zerglingHps, zerglingDefs, 0);
		
		reportUnits("마린", marineHps, marineAtks, marineDefs, marineWeapon);
		reportUnits("저글링", zerglingHps, zerglingAtks, zerglingDefs, zerglingWeapon);

	}

	static void initUnits(int[] hps, int hp, int[] atks, int atk, int[] defs, int def) {
		for (int i = 0; i < hps.length; i++) {
			hps[i] = hp;
			atks[i] = atk;
			defs[i] = def;
		}
	}
	
	static void reportUnits(String name, int[] hps, int[] atks, int[] defs, String weapon) {
		for (int i = 0; i < hps.length; i++) {
			System.out.println(name + "#" + (i+1) + ":");
			System.out.println("  " + name + " 생명력: " + hps[i]);
			System.out.println("  " + name + " 공격력: " + atks[i]);
			System.out.println("  " + name + " 방어력: " + defs[i]);
			System.out.println("  " + name + " 무기 이름: " + weapon + "\n");
		}
	}
	
	static int attack(int atk, int defHp, int def) {
		return defHp + def - atk;
	}
	
	static void attack(int[] atks, int attacker, int[] defHps, int[] defs, int defender) {
		defHps[defender] += defs[defender] - atks[attacker];
	}
}
