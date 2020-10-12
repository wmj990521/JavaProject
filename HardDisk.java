package cn.syhg.hd;

public class HardDisk {
	int amount;
	private int size;
	//构造方法
	public HardDisk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HardDisk(int amount, int size) {
		super();
		this.amount = amount;
		this.size = size;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
