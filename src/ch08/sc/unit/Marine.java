package ch08.sc.unit;

public class Marine {

	int num;
	int hp;
	
	static int atk;
	static int def;
	static String weapon;

	static {
		atk = 6;
		def = 0;
		weapon = "가우스 소총";
	}
	
	public Marine() {
		this(1);
	}

	public Marine(int num) {
		this(num, 40);
	}

	Marine(int num, int hp) {
		this.num = num;
		this.hp = hp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getNum() {
		return num;
	}

	public int getAtk() {
		return Marine.atk;
	}

	public void setAtk(int atk) {
		Marine.atk = atk;
	}

	public int getDef() {
		return Marine.def;
	}

	public void setDef(int def) {
		Marine.def = def;
	}

	public String getWeapon() {
		return Marine.weapon;
	}

	public void setWeapon(String weapon) {
		Marine.weapon = weapon;
	}

	public void reportStatus() {
		System.out.println("마린#" + num + ":");
		System.out.println(String.format("  - 생명력: %d, 공격력: %d, 방어력: %d", 
				this.hp, Marine.atk, Marine.def));
		System.out.println("  - 무기 이름: " + Marine.weapon + "\n");
	}
	
	public void attack(Zergling z, int count) {
//		z.hp += (z.def - this.atk) * count;  // 직접 값에 접근하지 말고, 객체지향으로 data encapsulation을 적용 : 함수로 간접적으로 데이터 변경해야 함!
//		z.setHp(z.getHp() + count * (z.getDef() - this.atk));
		z.getAttacked(Marine.atk, count);
	}
}
