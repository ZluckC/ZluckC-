package 抽象类;

public class Dog extends Pet{
private String pingzhong;
	public Dog(String pingzhong,String name, int jiankang, int qingmidu) {
		super(name,jiankang,qingmidu);
		this.pingzhong = pingzhong;
	}
	public boolean toHosptal()
	{
		 if(getJiankang()>60)
			 return false;
		 else
			 return true;
	};
	public void eat(){
		System.out.println("喂"+getName()+"吃了一次东西，亲密度和健康值加10");
		setJiankang(getJiankang());
		setQingmidu(getQingmidu());
	}
	@Override
	public String toString() {
		return "Dog [品种是： "+ pingzhong + "]\n"+ super.toString()+"\n";
	};
	
	 
	


	

}
