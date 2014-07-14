package tokenizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		
		String target ="he is the one";

		StringTokenizer t = new StringTokenizer(target, " ");
		List<String> final1 = new ArrayList<String>();
		
		while(t.hasMoreTokens())
		{
			final1.add(t.nextToken());
			Collections.reverse(final1);
		}
		for(String tmp : final1)
		{
			System.out.println(tmp);
		}
	}
}
