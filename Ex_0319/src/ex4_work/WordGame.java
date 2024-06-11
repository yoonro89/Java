package ex4_work;

import java.util.List;
import java.util.Random;

public class WordGame extends Thread{

	private List<String> arr;
	private String[] data = {"apple", "orange", "grape", "banana"};
	private boolean playing = true;
	private Random rnd; 
	
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
	public WordGame( List<String> arr ) {
		this.arr = arr;
		rnd = new Random();
	}
	
	@Override
	public void run() {
		while(playing) {
			
			try {
				int random = rnd.nextInt(data.length);
				
				arr.add( data[random] );
				
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
