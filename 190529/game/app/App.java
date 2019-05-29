package game.app;

import game.unit.Unit;
import game.unit.character.Healer;
import game.unit.character.Soldier;
import game.unit.character.Wizard;
import game.unit.enemy.Dragon;

public class App {
	public static void main(String[] args) {
		
		Unit h = new Healer(5, 5, "����");
		Unit s = new Soldier(5,5,"����");
		Unit w = new Wizard(5,5,"������");
		Unit d1 = new Dragon("����巡��");
		Unit d2 = new Dragon("���巡��");
		Unit d3 = new Dragon("���巡��");

		System.out.println(h);
		System.out.println(s);
		System.out.println(w);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);


		
	}
}
