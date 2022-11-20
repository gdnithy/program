package anand.dev;

public class Mechanical {

	private void coreSubject() {
		System.out.println("Enter the subject name");
	}

	private void firstYearSubject() {
		System.out.println("Enter the first year");
	}

	public void nonCoreSubject() {
		System.out.println("Enter the noncore subject");
	}

	public static void main(String[] args) {
		Mechanical white = new Mechanical();
		white.coreSubject();
		white.firstYearSubject();
		white.nonCoreSubject();
	}

}
