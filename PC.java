package cn.syhg.pc;

import cn.syhg.cpu.CPU;
import cn.syhg.hd.HardDisk;

public class PC {
	private CPU cpu;
	private HardDisk HD;
	float price;
	//���췽��
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
		System.out.println("CPU���ٶȣ�"+cpu.getSpeed());
		System.out.println("Ӳ��������"+HD.getAmount());
	}
}
