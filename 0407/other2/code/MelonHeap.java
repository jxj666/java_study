package test;
import java.util.*;

public class MelonHeap
{
	private List<Float> melonList = new ArrayList<Float>();
	MelonHeap()
	{
	}
	boolean is_empty()
	{
		return melonList.isEmpty();
	}
	void addMelon(int number, float minSize, float maxSize)
	{
		for (int i=0;i<number;i++) 
			melonList.add((float)(minSize+Math.random()*(maxSize-minSize)));	
		System.out.println("Add melon! number = " + number);
	}
	float getMelon(getMelonMethod method)
	{
		if (melonList.isEmpty())
			return 0;
		switch (method)
		{
		case RANDOM:
			return melonList.remove(melonList.size()-1);
		case BIGGEST:
		{
			float biggest = melonList.get(0);
			int index = 0;
			for (int i=0;i<melonList.size();i++)
			{
				if (melonList.get(i) > biggest)
				{
					biggest = melonList.get(i);
					index = i;
				}
			}
			return melonList.remove(index);
		}
		case FOOL:
		{
			if (Math.random() > 0.7)
				return 0;
			else
				return melonList.remove(melonList.size()-1);
		}
		default:
			return 0;
		}
	}
}
