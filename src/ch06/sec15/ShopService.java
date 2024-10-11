package ch06.sec15;

public class ShopService {
	private static ShopService shopservice = new ShopService();
	// 생성자 선언
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return shopservice;
	}
}
