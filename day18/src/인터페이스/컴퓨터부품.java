package 인터페이스;

public class 컴퓨터부품 implements 컴퓨터{

	@Override
	public void CPU() {
		System.out.println("CPU를 메인보드에 연결한다.");
		
	}

	@Override
	public void RAM() {
		System.out.println("RAM을 메인보드에 연결한다.");
		
	}

	@Override
	public void MainBoard() {
		System.out.println("포장지를 뜯는다.");
		
	}



}
