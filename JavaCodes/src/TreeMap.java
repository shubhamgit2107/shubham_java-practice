import java.util.Map.Entry;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.TreeMap<String, String> tree= new java.util.TreeMap<>();
		tree.put("name", "shubham");
		tree.put("degree", "BE");
		tree.put("state", "Bihar");
		tree.put("city", "patna");
		tree.put("name", null);
		tree.put("nickname", "shubham");
		tree.put("gengder", "male");
		for(Entry<String,String> m: tree.entrySet())
		System.out.println(m.getKey()+"="+m.getValue());
		System.out.println(tree);

	}

}
