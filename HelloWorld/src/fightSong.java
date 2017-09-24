public class fightSong {
	public static void empty() {
		System.out.println("");
	}
	public static void stanza1() {
		System.out.println("Go, team, go!");
		System.out.println("You can do it.");
	}
	public static void stanza2() {
		stanza1();
		System.out.println("You're the best,");
		System.out.println("In the West.");
		stanza1();
		empty();
	}
	public static void stanza34() {
		stanza2();
		stanza1();
	}
	public static void main(String[] args) {
		stanza1();
		empty();
		stanza2();
		stanza34();
	}

}
