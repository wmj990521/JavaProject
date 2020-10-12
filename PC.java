package cn.syhg.pc;

import cn.syhg.cpu.CPU;
import cn.syhg.hd.HardDisk;

public class PC {
	private CPU cpu;
	private HardDisk HD;
	float price;
	//构造方法
	public PC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PC(CPU cpu, HardDisk hD, float price) {
		super();
		this.cpu = cpu;
		HD = hD;
		this.price = price;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setHD(HardDisk hD) {
		HD = hD;
	}
	public void show(){
		System.out.println("CPU的速度："+cpu.getSpeed());
		System.out.println("硬盘容量："+HD.getAmount());
	}
}
