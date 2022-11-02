package 抽象类;
//抽象类
public abstract class Pet {
	//定义属性
	private String name;
	private int jiankang = 60;
	private int qingmidu = 10;

	public Pet(String name, int jiankang, int qingmidu) {
		super();
		this.name = name;
		this.jiankang = jiankang;
		this.qingmidu = qingmidu;
	}
	

	public String getName() {
		return name;
	}

	public int getJiankang() {
		return jiankang;
	}

	public int getQingmidu() {
		return qingmidu;
	}
	
	public void setJiankang(int jiankang) {
		this.jiankang = jiankang+10;
	}

	public void setQingmidu(int qingmidu) {
		this.qingmidu = qingmidu+10;
	}

	public abstract boolean toHosptal();
	public abstract void eat();

	@Override
	public String toString() {
		return "Pet [名字：" + name + ", 健康值：" + jiankang + ", 亲密度：" + qingmidu + "]";
	}
}
