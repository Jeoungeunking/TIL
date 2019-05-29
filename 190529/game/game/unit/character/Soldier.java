package game.unit.character;

import game.unit.Attackable;
import game.unit.Unit;
import game.unit.enemy.Dragon;

public class Soldier extends Unit implements Attackable{
		public Soldier(){
		super();	
		}
		public Soldier(int x, int y, String name) {
			this.hp = 200;
			this.x = x;
			this.y = y;
			this.name = name;
			
		}
		@Override
		public int attack() {
			System.out.println("������ �����Ͽ����ϴ�.");
			int temp = 20;
			return temp;
		}
		public void beAttacked(int temp) {
			System.out.println("������ ���ݴ��߽��ϴ�.");
			this.hp -= temp;
		}

}

