package test;
import java.util.*;

class Melon
{
	final static int monkeyNum = 10;
	final static int pigNum = 10;
	final static int chaNum = 10;
	final static int totalNum = monkeyNum + pigNum + chaNum;
	final static int turn = 100;
	static List<Animal> animal = new ArrayList<Animal>();
	public static void init()
	{
		int i = 0;
		while (i < monkeyNum)
		{
			animal.add(new Monkey("Monkey_" + i));
			i++;
		}
		while (i < monkeyNum+pigNum)
		{
			animal.add(new Pig("Pig_" + (i-monkeyNum)));
			i++;
		}
		while (i < monkeyNum+pigNum+chaNum)
		{
			animal.add(new Cha("Cha_" + (i-monkeyNum-pigNum)));
			i++;
		}
	}
	
	public static void main(String args[])
	{
		MelonHeap melonHeap = new MelonHeap();
		init();
		melonHeap.addMelon(200, 80, 100);
		for (int i = 0; i < turn; i++)
		{
			Collections.shuffle(animal);
			System.out.println("Turn: "+ (i+1));
			if ((!melonHeap.is_empty() && Math.random() > 0.9) ||
				(melonHeap.is_empty() && Math.random() > 0.85))
				melonHeap.addMelon(100, 80, 100);
			for (int j = 0; j < totalNum; j++)
				animal.get(j).action(melonHeap);
		}
		System.out.println("--------------------------\nResult:\n");
		Collections.sort(animal, new Comparator<Animal>() 
		{public int compare(Animal o1, Animal o2) {return (int) (o2.score - o1.score);}}
	    );
		for (Animal i:animal)
			System.out.println(i.name + " score = " + i.score);
	}
}






