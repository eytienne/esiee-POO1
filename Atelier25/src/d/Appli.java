package d;

import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Appli {

	public static void main(String[] args) {
		ActionListener m=new Metronome("tic");
		Timer t=new Timer(1000,m); // ERREUR !
		t.start();
		System.out.println("timer demarre...");
		while(true);
	}

}
