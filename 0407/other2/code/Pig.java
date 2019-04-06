package test;

public class Pig extends Animal
{
	static final int power = 10;
	static final int bufferVolumn = 20;
	static final getMelonMethod method = getMelonMethod.FOOL;
	Pig(String name) 
	{
		super(name, power, bufferVolumn, method);
	}
	@Override
	void action(MelonHeap melonHeap) 
	{
		if (Math.random()>(double)(buffer.size()/bufferVolumn) && !melonHeap.is_empty())
			System.out.println(name + " get " + getSomeMelon(melonHeap) + " melons!");
		else
		{
			float temp = eat();
			if (temp != 0)
				System.out.println(name + " eat a melon! score+" + temp + "  score = " + score);
		}
	}
}
