import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class Map
{
	public static void main(String[] args)
	{
		LinkedHashMap<String,Integer> m =new LinkedHashMap<String, Integer>();
		m.put("1 - storeroom" , 50);
		m.put("2 - storeroom" , 60);
		m.put("3 - storeroom" , 70);
		Set<Map.Entry<String,Integer>> s = m.entrySet();
		for (Map.Entry<String, Integer> it: s)
		{
			System.out.println("Before change of value = " +it.getKey() + " " + it.getValue());
			double getRandom = Math.random() * 100000;
			int getRoundoff = (int) Math.round(getRandom);
			it.setValue(getRoundoff);
			System.out.println("After change of value = " +it.getKey() + " " + it.getValue());
		}
	}
}
