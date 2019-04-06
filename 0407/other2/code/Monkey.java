package test;

public class Monkey extends Animal
{
	static final int power = 4;
	static final int bufferVolumn = 10;
	static final getMelonMethod method = getMelonMethod.BIGGEST;
	Monkey(String name) 
	{
		super(name, power, bufferVolumn, method);
	}
	@Override
	void action(MelonHeap melonHeap) 
	{
		if (buffer.size() <= bufferVolumn - power && !melonHeap.is_empty())
			System.out.println(name + " get " + getSomeMelon(melonHeap) + " melons!");
		else
		{
			float temp = eat();
			if (temp != 0)
				System.out.println(name + " eat a melon! score+" + temp + "  score = " + score);
		}
	}
}
