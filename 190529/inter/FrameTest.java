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
		f.addWindowListener(new MyWindow());//�����ӿ� �̺�Ʈ�� �߻��̵Ǹ� MyWindow�� ó���ض�
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {//anonymous class ����Ŭ����
				b.setBackground(Color.CYAN);
				
			}
		});
	}
	
	class MyWindow extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			f.setVisible(false);//�ٸ� Ŭ������ ������ �ٷ� ����� �� �ֱ� ������ �̳�Ŭ���� ���
			System.exit(0);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new FrameTest();
	}

}
