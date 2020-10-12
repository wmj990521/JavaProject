package cn.syhg.cpu;

public class CPU {
	int speed;
	private float price;
	//构造方法
	//无参的构造方法
	public CPU() {
		super();
		// TODO Auto-generated constructor stub
	}
	//有参的构造方法
	public CPU(int speed, float price) {
		super();
		this.speed = speed;
		this.price = price;
		if(speed<0){
			System.out.println("error");
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
