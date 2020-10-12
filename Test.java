package cn.syhg.test;

import cn.syhg.cpu.CPU;
import cn.syhg.hd.HardDisk;
import cn.syhg.pc.PC;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu=new CPU();
		HardDisk disk=new HardDisk();
		PC pc=new PC();
		cpu.setSpeed(2200);
		disk.setAmount(200);
		pc.setCpu(cpu);
		pc.setHD(disk);
		pc.show();
	}

}
