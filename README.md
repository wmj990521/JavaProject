# 计G201 武美娟 2020322065

# 实验1

## 一、实验目的
1. 学习使用Java编写类，学习定义类的成员，包括属性、方法、构造器；
2. 学习了解访问权限，访问限制修饰符有private、protected、public。
## 二、实验过程
### 用类描述计算机中CPU的速度和硬盘的容量。
1. 要求Java应用程序有四个类，名字分别为PC、CPU、HardDisk和Test，其中Test是主类。
2. CPU类要求getSpeed（）返回speed的值，要求setSpeed（int m）方法将参数m的值赋值给speed；  
   HardDisk类要求getAmount（）返回amount的值，要求setAmount（int m）方法将参数m的值赋值给amount；  
   PC类要求setCPU（CPU c）方法将参数c的值赋值给cpu,要求setHardDisk（HardDisk h）方法将参数h的值赋值给HD,要求show()方法能显示cpu的速度和硬盘的容量。
3. 主类Test的要求：
  * main方法中创建一个CPU对象cpu,cpu将自己的speed设置为2200；
  * main方法中创建一个HardDisk对象disk,disk将自己的amount设置为200；
  * main方法中创建一个PC对象pc;
  * pc调用setCPU（CPU c）方法，调用时实参是cpu;
  * pc调用show（）方法。
4. 附加要求：
  * 类中定义不少于两个构造方法；
  * 每个类定义不少于2个属性，且属性的类型应该多样化；
  * 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
  * 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
## 三、核心方法
1. 方法1
```
        public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
 ```
 2. 方法2
 ```
        public void show(){
		System.out.println("CPU的速度："+cpu.getSpeed());
		System.out.println("硬盘容量："+HD.getAmount());
	}
 ```
 3. 方法3
 ```
        CPU cpu=new CPU();
        HardDisk disk=new HardDisk();
	PC pc=new PC();
        cpu.setSpeed(2200);
	disk.setAmount(200);
        pc.setCpu(cpu);
	pc.setHD(disk);
	pc.show();
 ```
 4. 方法4
 ```
        public CPU() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CPU(int speed, float price) {
		super();
		this.speed = speed;
		this.price = price;
	}
 ```
## 四、实验结果
  运行成功，输出结果：CPU的速度：2200   硬盘容量：200
  ![img](http://note.youdao.com/yws/public/resource/253af59d7c3cc80c27cd7edcfc8a506e/xmlnote/WEBRESOURCEed65ad4dbc90574ec7d9e524bb29c401/13)
  
## 五、实验感想
  通过这次实验，我学会了类的编写，更加了解了类的成员的使用;学会了构造方法的使用，有参的构造方法和无参的构造方法;更加理解了访问权限，private、protected、public修饰符的作用。
