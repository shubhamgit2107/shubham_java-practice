import java.util.Map.Entry;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<String, String> map=new java.util.HashMap<>();
		map.put("school", "bdps");
		map.put("city", "patna");
		map.put("gender", "male");
		map.put("state", "bihar");
		map.put("name", " ");
		map.put("name", "shubham");
		map.put("penname", "shubham");
		map.put(null, "shubham");
		map.put(null, "shubham");
		
		for(Entry<String,String> m: map.entrySet())
		{
			System.out.println(m.getKey()+"=" +m.getValue());
			
		}
		System.out.println(map.containsKey("city"));
		System.out.println(map.containsValue("bihar"));
		System.out.println(map.size());
		System.out.println(map.replace("penname", "nickname"));
		System.out.println(map.remove("gender"));
		System.out.println(map);

	}

}
