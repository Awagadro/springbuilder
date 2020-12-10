package awagadro.springbuilder.test;

public class ConsoleAnnouncer implements Announcer {

	@Override
	public void announce(String string) {
		System.out.println(string);

	}

}
