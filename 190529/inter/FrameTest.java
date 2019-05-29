package inter;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {
	Frame f;
	Button b;
	public FrameTest() {
		makeUi();
	}
	public void makeUi() {
		f = new Frame();
		b = new Button("click");
		f.add(b);
		f.setSize(300, 300);
		f.setVisible(true);
		f.addWindowListener(new MyWindow());//프레임에 이벤트가 발생이되면 MyWindow가 처리해라
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {//anonymous class 무명클래스
				b.setBackground(Color.CYAN);
				
			}
		});
	}
	
	class MyWindow extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			f.setVisible(false);//다른 클래스에 있지만 바로 사용할 수 있기 때문에 이너클래스 사용
			System.exit(0);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new FrameTest();
	}

}
