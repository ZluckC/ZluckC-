package ������;
//��������
public class Cat extends Pet {
	private String pingzhong;

	public Cat( String pingzhong,String name, int jiankang, int qingmidu) {
		super(name, jiankang, qingmidu);
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
		System.out.println("ι"+getName()+"����һ�ζ��������ܶȺͽ���ֵ��10");
		setJiankang(getJiankang());
		setQingmidu(getQingmidu());
	}
	@Override
	public String toString() {
		return "Cat [Ʒ���ǣ� "+ pingzhong + "]\n"+ super.toString()+"\n";
	};
	
}
