package game.unit.character;

import game.unit.Attackable;
import game.unit.Unit;
public class Wizard extends Unit implements Attackable {

	public Wizard() {
		super();
	}

	public Wizard(int x, int y, String name) {
		this.hp = 80;
		this.x = x;
		this.y = y;
		this.name = name;

	}

	@Override
	public int attack() {
		System.out.println("�����簡 �����Ͽ����ϴ�.");
		int temp = 40;
		return temp;
	}

	public void beAttacked(int temp) {
		System.out.println("�����簡 ���ݴ��߽��ϴ�.");
		this.hp -= temp;
	}
}