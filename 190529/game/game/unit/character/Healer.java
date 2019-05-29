package game.unit.character;

import game.unit.Unit;

public class Healer extends Unit{

	public Healer() {
		
	}
	
	public Healer(int x, int y, String name) {
		this.hp = 50;
		this.x = x;
		this.y = y;
		this.name = name;
	}
	public void heal(Unit u) {	
		u.setHp(u.getHp()+30);		
		}
		
	}