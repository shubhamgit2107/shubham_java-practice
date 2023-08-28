import java.util.Map.Entry;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.LinkedHashMap<String, String> map=new  java.util.LinkedHashMap<>();
map.put("school", "bdps");
map.put("city", "patna");
map.put("gender", "male");
map.put("state", "bihar");
map.put("name", " ");
map.put("name", "shubham");
map.put("penname", "shubham");
map.put(null, "shubham");
map.put(null, "kumar");

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
