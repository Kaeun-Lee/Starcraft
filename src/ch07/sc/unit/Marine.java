package ch07.sc.unit;

public class Marine {

	int num;
	int hp;
	int atk;
	int def;
	String weapon;

	Marine() {
		this(1);
	}

	public Marine(int num) {
		this(num, 40, 6, 0, "가우스 소총");
	}

	Marine(int num, int hp, int atk, int def, String weapon) {
		this.num = num;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.weapon = weapon;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getNum() {
		return num;
	}

	public void reportStatus() {
		System.out.println("마린#" + num + ":");
		System.out.println(String.format("  - 생명력: %d, 공격력: %d, 방어력: %d", 
				this.hp, this.atk, this.def));
		System.out.println("  - 무기 이름: " + weapon + "\n");
	}
	
	public void attack(Zergling z, int count) {
//		z.hp += (z.def - this.atk) * count;  // 직접 값에 접근하지 말고, 객체지향으로 data encapsulation을 적용 : 함수로 간접적으로 데이터 변경해야 함!
//		z.setHp(z.getHp() + count * (z.getDef() - this.atk));
		z.getAttacked(this.atk, count);
	}
}
