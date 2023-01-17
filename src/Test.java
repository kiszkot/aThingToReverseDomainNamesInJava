import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import zad.Domain;

public class Test {

	public static void main(String[] args) {
		String[] test = StdIn.readAllStrings();
		Domain[] dom = new Domain[test.length];
		for(int i = 0; i<test.length; i++) {
			dom[i] = new Domain(test[i]);
		}
		Insertion.sort(dom);
		for(int i = 0; i<test.length; i++) {
			StdOut.println(dom[i].toString());
		}
	}

}