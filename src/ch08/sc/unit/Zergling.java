package ch08.sc.unit;

public class Zergling {

	int num;
	int hp;
	
	static int atk;
	static int def;
	static String weapon;

	static {
		atk = 5;
		def = 0;
		weapon = "발톱";
	}
	
	public Zergling() {
		this(1);
	}

	public Zergling(int num) {
		this(num, 35);
	}

	Zergling(int num, int hp) {
		this.num = num;
		this.hp = hp;
	}
	
	private int calcDamage(int atkDamage) {
		return Zergling.def - atkDamage;
	}
	
	public void getAttacked(int atkDamage, int count) {
//		this.hp += (this.def - atkDamage) * count;
		this.hp += calcDamage(atkDamage) * count;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		Zergling.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		Zergling.def = def;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		Zergling.weapon = weapon;
	}

	public int getNum() {
		return num;
	}
	
	public void reportStatus() {
		System.out.println("저글링#" + num + ":");
		System.out.println(String.format("  - 생명력: %d, 공격력: %d, 방어력: %d", 
				this.hp, Zergling.atk, Zergling.def));
		System.out.println("  - 무기 이름: " + Zergling.weapon + "\n");
	}
}
