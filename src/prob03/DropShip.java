package prob03;

public class DropShip extends Unit{
	// 현재 위치
	private int x;
	private int y;
	@Override
	void move(int x, int y) {
		System.out.println("드랍쉽을 x: "+x+", y:"+y+"위치로 이동");
	}
	@Override
	void stop() {
		/* 현재 위치에 정지 */
		System.out.println("드랍쉽을 x: "+x+", y:"+y+"위치에서 정지");
	}
	
	void load() {
		/* 선택된 대상을 태운다.*/ 
		System.out.println("드랍쉽에 선택된 대상을 태움");
	}
	
	void unload() {
		/* 선택된 대상을 내린다.*/ 
		System.out.println("선택된 대상을 내림");
	}
}