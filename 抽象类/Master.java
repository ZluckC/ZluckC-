package ������;
//������
public class Master {
	//ʹ����������Ϲ�ϵ
	Dog dog;
	Cat cat;
	public Master(Dog dog) {
		super();
		this.dog = dog;
	}
	
	public Master(Cat cat) {
		super();
		this.cat = cat;
	}

	public Master(Dog dog, Cat cat) {
		super();
		this.dog = dog;
		this.cat = cat;
	}

	public void cure(Dog dog) {
		if (dog.getJiankang() < 60)
		{
			System.out.println(dog.getName()+"����ֵ������Ҫ��ҽԺ��");
		}
		else
		{
			System.out.println(dog.getName()+"����ֵ���ã�����ȥҽԺ��");
		}
	}
	public void feed(Dog dog)
	{
		dog.eat();
	}
	public void cure(Cat cat) {
		if (cat.getJiankang() < 60)
		{
			System.out.println(cat.getName()+"����ֵ������Ҫ��ҽԺ��");
		}
		else
		{
			System.out.println(cat.getName()+"����ֵ���ã�����ȥҽԺ��");
		}
	}
	public void feed(Cat cat)
	{
		cat.eat();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("����˹��Ȯ", "̩��", 45, 50);
		System.out.println(dog);
		Cat cat = new Cat("����è", "С��", 70, 40);
		System.out.println(cat);
		Master dog1 = new Master(dog,cat);
		dog1.cure(dog);
		dog1.feed(dog);
		System.out.println(dog);
		dog1.cure(cat);
		dog1.feed(cat);
		System.out.println(cat);
		System.out.print(dog instanceof Pet);
		
	}

}
