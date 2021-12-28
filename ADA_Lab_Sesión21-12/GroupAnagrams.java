public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = groupAnagrams(strs);
        for (List<String> f : list) {
            System.out.println(f);
        }
	}
	// metodo que dado una array de anagramas los ordenara deacuerdo a
  // los caracteres que contengan
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List> anags = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!anags.containsKey(key)) {
                anags.put(key, new ArrayList());
            }
            anags.get(key).add(s);
        }
        return new ArrayList(anags.values());
    
    }
}
