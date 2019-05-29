package game.app;

import game.unit.Unit;
import game.unit.character.Healer;
import game.unit.character.Soldier;
import game.unit.character.Wizard;
import game.unit.enemy.Dragon;

public class App {
	public static void main(String[] args) {
		
		Unit h = new Healer(5, 5, "힐러");
		Unit s = new Soldier(5,5,"군인");
		Unit w = new Wizard(5,5,"마법사");
		Unit d1 = new Dragon("레드드래곤");
		Unit d2 = new Dragon("블루드래곤");
		Unit d3 = new Dragon("블랙드래곤");

		System.out.println(h);
		System.out.println(s);
		System.out.println(w);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);


		
	}
}
