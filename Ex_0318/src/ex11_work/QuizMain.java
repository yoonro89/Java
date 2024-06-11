package ex11_work;

public class QuizMain {
	public static void main(String[] args) {
		
		//---Thread, Thread.sleep()---
		//1 ~ 100사이의 난수를 두 개 더하는 문제를 출제.
		//키보드에서 정답을 입력하여 다섯문제가 정답처리되면
		//프로그램을 종료하면서 몇초의 시간이 경과했는지를 출력
		//단, 데몬스레드는 사용하지 않는다
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//23 + 48 = 71
		//정답!!
		//66 + 100 = 11
		//오답...
		// ......
		//53 + 28 = 81 (5번째 정답)
		//정답!!
		//정답까지 24초
		Quiz q = new Quiz();
		q.start();		//타이머가 먼저 시작이 되어야함
		q.startGame();	//게임 시작이 먼저일 경우 순차적용이 됨
		
		
	}//main
}
