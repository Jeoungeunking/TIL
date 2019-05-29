package game.unit.enemy;

import java.util.Random;

import game.unit.Attackable;
import game.unit.Unit;

public class Dragon extends Unit implements Attackable{	
	public Dragon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dragon(String name) {
		Random r = new Random();
		this.hp = 300;
		this.x = r.nextInt(10)+1;
		this.y = r.nextInt(10)+1;
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int attack() {
		System.out.println("드래곤이 공격했습니다.");
		int temp = 40;
		return temp;
	}
	@Override
	public void beAttacked(int temp) {
		System.out.println("드래곤이 공격당했습니다.");
		this.hp -= temp;
	}

}