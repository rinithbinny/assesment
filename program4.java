package assessment;

import java.util.*;

class LetterSequence{
	public LetterSequence(String sentence) {
		super();
		this.sentence = sentence;
	}
	public TreeMap<Character,Integer> computeFrequency(){
		tree_map= new TreeMap<Character,Integer>();
		String noSpaceStr = sentence.replaceAll("\\s", "");

		char[] chars = noSpaceStr.toCharArray();
	    Arrays.sort(chars);
	    String sorted = new String(chars);
		int count[] = new int[256];
		 
        int len = sorted.length();
 
        for (int i = 0; i < len; i++)
            count[sorted.charAt(i)]++;
 
        char ch[] = new char[sorted.length()];
		for (int i = 0; i < len; i++) {
            ch[i] = sorted.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                if (sorted.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1) {
            	tree_map.put(sorted.charAt(i),count[sorted.charAt(i)]);
                
            }
        }
		return tree_map;
		
	}
	public void
	displayLetterFrequency(TreeMap<Character,Integer>
	frequencyMap) {
		for (Map.Entry<Character,Integer> e : frequencyMap.entrySet()) {
            System.out.print(e.getKey());
            for(int i=0;i<e.getValue();i++) {
            	System.out.print("*");
            }
            System.out.println();
		}
	}


	private String sentence;
	TreeMap<Character,Integer> tree_map;
}

public class program4 {
	public static void main(String[] args)
    {
		LetterSequence t=new LetterSequence("Refer sample input and output for formatting specifications");
		TreeMap<Character,Integer> tree_map=t.computeFrequency();
		t.displayLetterFrequency(tree_map);
		
    }

}
