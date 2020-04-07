
public class Lambda {

	public static void main(String[] args) {
		int width=10;

		Drawable drawable = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Drwaing "+width);
			}
		};

		Drawable d = ()->{System.out.println("Drawing with Lambda exp "+width);};
		drawable.draw();
		d.draw();
		Hello hi = (name,sername)->{return "Hi Mr."+name+" "+sername;};
		System.out.println(hi.hi("Dear","Lambda"));

		Addable add = (a,b)->(a+b);
		System.out.println("Add number without return in lambda expression [(a,b)->(a+b)] ::: "+add.add(10,20));

		Addable add1 = (n,m)->{return  n+m;};
		System.out.println("Add number with return in lambda expression [(a,b)->{return a+b;};] ::: "+add1.add(30,40));
	}
}


interface Drawable{
	public void draw();
}

interface  Hello{
	//public String hi();

	//public String hi(String name);
	public String hi(String name, String sername);
}

interface  Addable{
	int add(int a , int b);
}