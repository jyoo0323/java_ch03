package test_git;

public class Swap {
	private static void callbyref() {
		Point p1; //Point 타입의 변수 p1을 선언했다.
		p1 = new Point(); //선언한 p1 변수에 Point 객체를 생성했다!
		p1.x = 100;
		p1.y = 200;
		
		System.out.println("p1.x = "+p1.x + " p1.y = "+p1.y);
		
		swap(p1);
		
		System.out.println("after swap\np1.x = "+p1.x + " p1.y = "+p1.y);
	}
	
	private static void swap(Point p1) {
		int temp = p1.x;
		p1.x = p1.y;
		p1.y = temp;
	}

	public static void main(String[] args) {
		//THR 01/21: 함수 
		//callbyval();
		callbyref();

	}

	

	private static void callbyval() {
		//difference between call by value and call by reffernce:
		
		
		System.out.println("call by val ex");
		
		int a = 100;
		int b = 200;
		
		swap(a, b);
		
		System.out.println("a = "+a + " b = "+b);
		//안바뀐다!! 값이 바뀌긴 했으나 그 값이 들어가는 변수에 까지는 영향을 끼치지 못했기 때문

	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
class Point{
	int x;
	int y;
	
}