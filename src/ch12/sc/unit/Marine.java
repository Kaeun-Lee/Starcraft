package ch12.sc.unit;

public class Marine extends Unit implements Attackable {

	static int atk;
	static int def;
	static final String WEAPON;
	static final String TYPE;
	
	static {
		atk = 6;
		def = 0;
		WEAPON = "가우스 소총";
		TYPE = "마린";
	}
	
	public Marine() {
		this(1);
	}

	public Marine(int num) {
		this(num, 40);
	}

	Marine(int num, int hp) {
		super(num, hp);
	}
	
	@Override
	public String toString() {
		String result = TYPE + "#" + num + ":\n";
		result += String.format("  [생명력: %d, 공격력: %d, 방어력: %d, 무기 이름: %s]", 
				this.hp, atk, def, WEAPON);
		
		return result;
	}
	
	@Override
	int calcDamage(int atkDamage) {
		return atkDamage - Marine.def;
	}
	
	@Override
	public void attack(Unit u, int count) {
		u.getAttacked(atk, count);
	}
	
}
