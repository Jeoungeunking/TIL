package game.unit;

import java.util.Scanner;

public class Unit {
	protected int hp;
	protected int x;
	protected int y;
	protected String name;
	Scanner sc = new Scanner(System.in);
	
	public Unit(){
		
	}
	public Unit(int hp, int x, int y, String name) {
		this.hp = hp;
		this.x = x;
		this.y = y;
		this.name = name;
	}

	public void move() {
		System.out.println("움직일 방향을 입력해주세요.w/a/s/d");
		String way = sc.next();
		switch(way) {
		case "w":
			this.y++;
			break;
		case "a":
			this.x--;
			break;
		case "s":
			this.y--;
			break;
		case "d":
			this.x++;
			break;
		}	
		
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Unit [hp=" + hp + ", x=" + x + ", y=" + y + ", name=" + name +"]";
	}
	

}
