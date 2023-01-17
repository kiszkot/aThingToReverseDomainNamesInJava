package zad;

public class Domain implements Comparable<Domain> {
	
	String s;
	String[] v;
	
	public Domain(String s) {
		String[] s1 = s.split("\\.");
		int len = s1.length;
		for(int i = 0; i < len/2; i++) {
			String tmp = s1[i];
			s1[i] = s1[len-i-1];
			s1[len-i-1] = tmp;
		}
		this.v = s1;
	}
	
	public int compareTo(Domain a) {
		int min = (v.length<=a.v.length) ? v.length : a.v.length;
		for(int i = 0; i < min; i++) {
			if(a.v[i]==v[i]) {
				continue;
			} else if(a.v[i].compareTo(v[i]) < 0) {
				return 1;
			} else if(a.v[i].compareTo(v[i]) > 0){
				return -1;
			}
		}
		return (a.v.length - v.length);
	}
	
	public String toString() {
		String ret = "";
		for(int i = 0; i < this.v.length; i++) {
			if(i == this.v.length-1) {
				ret = ret + this.v[i];
			}
			else {
				ret = ret + this.v[i] + ".";
			}
		}
		return ret;
	}
	
	public static boolean less(String a, String b) {
		return a.compareTo(b) < 0;
	}
	
	
	public static void main(String[] args) {
		
		Domain test = new Domain("edu.princeton.cs");
		System.out.println(test.toString());
		
	}
	

}
