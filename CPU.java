package cn.syhg.cpu;

public class CPU {
	int speed;
	private float price;
	//���췽��
	//�޲εĹ��췽��
	public CPU() {
		super();
		// TODO Auto-generated constructor stub
	}
	//�вεĹ��췽��
	public CPU(int speed, float price) {
		super();
		this.speed = speed;
		this.price = price;
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
