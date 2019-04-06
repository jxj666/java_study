package test;

public class Cha extends Animal //âª£¬from Â³Ñ¸¡¶¹ÊÏç¡·
{
	static final int power = 4;
	static final int bufferVolumn = 6;
	static final getMelonMethod method = getMelonMethod.RANDOM;
	Cha(String name) 
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
			double roll = Math.random();
			float temp = eat();
			if (roll > 0.4)
				temp += eat();
			if (roll > 0.7)
			{
				while (!buffer.isEmpty())
					temp += eat();
			}
			
			if (temp != 0)
			{
				if (roll <= 0.4)
					System.out.println(name + " eat a melon! score+" + temp + "  score = " + score);
				else if (roll <= 0.7)
					System.out.println(name + " Double Eat! score+" + temp + "  score = " + score);
				else
					System.out.println(name + " Eat Up! score+" + temp + "  score = " + score);
			}
		}
	}
}
