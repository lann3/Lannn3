package main;

public class Ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = tongHaiSo();
		System.out.println(i);
		
		int a = 2;
		int b = 3;
		
		int h = hieuHaiSo(a , b);
		System.out.println(h);
		
		xinChao();
	}
	
	public static int tongHaiSo() {
		int x = 10;
		int y = 15;
		int tongXy = x+y;
		return tongXy;
	}
	
	//ham voi hai doi so truyen vao
	
	public static int hieuHaiSo (int x, int y) {
		int hieuHaiSo = x - y;
		return hieuHaiSo;
	}
	
	//ham khong tra ve gia tri
	
	public static void xinChao () {
		System.out.println("xin chao viet nam");
	}
}

