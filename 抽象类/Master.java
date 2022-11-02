package 抽象类;
//测试类
public class Master {
	//使用依赖和组合关系
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
			System.out.println(dog.getName()+"健康值过低需要送医院！");
		}
		else
		{
			System.out.println(dog.getName()+"健康值良好，不用去医院！");
		}
	}
	public void feed(Dog dog)
	{
		dog.eat();
	}
	public void cure(Cat cat) {
		if (cat.getJiankang() < 60)
		{
			System.out.println(cat.getName()+"健康值过低需要送医院！");
		}
		else
		{
			System.out.println(cat.getName()+"健康值良好，不用去医院！");
		}
	}
	public void feed(Cat cat)
	{
		cat.eat();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("阿拉斯加犬", "泰迪", 45, 50);
		System.out.println(dog);
		Cat cat = new Cat("流浪猫", "小花", 70, 40);
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
