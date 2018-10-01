package daySix.Exceptons;


public class InterviewQuestion {

	// 1. find the duplicate words and print words with how many times it repeats.
	public static void main(String[] args) {
		String s = "This is another example that shows how to nested try block works."
				+ "You can see that there are try  catch block inside main try block's body.";
		String a = s.replace(".", " ");
		String b = a.replace("-", " ");
		b = b.toLowerCase();
		b = b.replace("'", " ");

		String stringArr[] = b.split(" ");
		int count = 1;
		for (int i = 0; i < stringArr.length; i++) {
			for (int j = 0; j < stringArr.length; j++) {
				if (stringArr[j] != null && stringArr[i] != null) {
					if (stringArr[i].equals(stringArr[j]) && i != j) {
						count++;
						stringArr[j] = null;
					}
				}
			}

			if (count > 1) {
				System.out.println(stringArr[i] + " - " + count);
				count = 1;
			}
		}
	}

}
