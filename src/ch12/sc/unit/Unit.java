package ch12.sc.unit;

public abstract class Unit {

	int num;
	int hp;

	Unit(int num, int hp) {
		this.num = num;
		this.hp = hp;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void reportStatus() {
		System.out.println(this);  // System.out.println(this.toString()); 과 동일 (하위 클래스에서 toString을 오버라이드 했으므로)
	}
	
	// 데미지를 양수로 반환
	int calcDamage(int atkDamage) {
//		return def - atkDamage;
		return 0;  // dummy를 넣어주기
	}
	
	public void getAttacked(int atkDamage, int count) {
		this.hp -= calcDamage(atkDamage) * count;
	}

}
