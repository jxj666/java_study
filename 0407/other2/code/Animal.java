package test;
import java.util.*;

interface AnimalInterface
{
	abstract int getSomeMelon(MelonHeap melonHeap);
	abstract float eat();
}

abstract class Animal implements AnimalInterface
{
	String name;
	int power;
	int bufferVolumn;
	float score;
	getMelonMethod method;
	Deque<Float> buffer = new ArrayDeque<Float>();
	Animal(String _name, int _power, int _bufferVolumn, getMelonMethod _method)
	{
		buffer.clear();
		name = _name;
		power = _power;
		bufferVolumn = _bufferVolumn;
		method = _method;
		score = 0;
	}
	private boolean getMelon(MelonHeap melonHeap)
	{
		if (buffer.size() == bufferVolumn || melonHeap.is_empty())
			return false;
		buffer.addLast(melonHeap.getMelon(method));
		return true;
	}
	public int getSomeMelon(MelonHeap melonHeap)
	{
		int count = 0;
		for (int i=0;i<power;i++)
		{
			if (getMelon(melonHeap))
				count++;
			else 
			{
				if (this.method != getMelonMethod.FOOL)
					break;
			}
		}
		return count;
	}
	public float eat()
	{
		if (buffer.isEmpty())
			return 0;
		float temp = buffer.getFirst();
		score += buffer.removeFirst();
		return temp;
	}
	abstract void action(MelonHeap melonHeap);
}