package ch12.sc.unit;

public class Zergling extends Unit implements Attackable {

	static int atk;
	static int def;
	static final String WEAPON;
	static final String TYPE;
	
	static {
		atk = 5;
		def = 0;
		WEAPON = "발톱";
		TYPE = "저글링";
	}
	
	public Zergling() {
		this(1);
	}

	public Zergling(int num) {
		this(num, 35);
	}

	Zergling(int num, int hp) {
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
		return atkDamage - Zergling.def;
	}
	
//	public void getAttacked(int atkDamage, int count) {
////		this.hp += (this.def - atkDamage) * count;
//		this.hp += calcDamage(atkDamage) * count;
//	}
	
	@Override
	public void attack(Unit u, int count) {
		if (u instanceof Flyable) {
			System.out.println("하늘을 나는 놈들은 알빠노!");
			return;
		}
		
		u.getAttacked(atk, count);
	}
	
}
