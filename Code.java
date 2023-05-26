package misc;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class main_misc2 {
	
	
		
		
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
	System.out.println(get_permutations("horn"));	
		
	}	
	
	private static ArrayList<String> get_permutations(String s){
		return f("",s);
	}
	
	private static ArrayList<String> f(String x,String s){
		
		ArrayList<String> all = new ArrayList<>();
		
		if(s.length() == 0) {
			return all;
		}
		if(s.length() == 1) {
			all.add(x+s);
			return all;
		}
		
		for(int i = 0;i < s.length();i++) {
			
			String novo = s;
			novo = novo.replace(s.substring(i, i+1),"");
			ArrayList<String> sub_perms = f("",novo);
			for(int j = 0;j < sub_perms.size();j++){
				StringBuilder temp_add = new StringBuilder();
				temp_add.append(s.substring(i, i+1));
				temp_add.append(sub_perms.get(j));
				sub_perms.remove(j);
				sub_perms.add(j, temp_add.toString());
			}
			all.addAll(sub_perms);
			
		}
		return all;
	}
	
	} 
	
