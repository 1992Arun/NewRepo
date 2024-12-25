package encap.org;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HealthAnalyser {
	
	public static void main(String[] args) {
		
	
	
	Human ha =  new Human();
	
	ha.setHeight(178);
	
	ha.setWeight(75);

	ha.setBmi(43);
	
	
	System.out.println(ha.getBmi());
	
	
	
Human ha1 =  new Human();
	
	ha1.setHeight(182);
	
	ha1.setWeight(79);

	ha1.setBmi(4);
	
	Map<Integer, Human> mp = new TreeMap();
	
	mp.put(1, ha);
	
	mp.put(1, ha1);
	
	 Set<Entry<Integer, Human>> es = mp.entrySet();
	
	for(Entry<Integer, Human> x:es) {
		
		
		System.out.println(x.getValue().getBmi());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
}