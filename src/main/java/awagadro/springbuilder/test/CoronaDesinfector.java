package awagadro.springbuilder.test;

public class CoronaDesinfector {
	public void start(Room room) {
		Announcer announcer = new ConsoleAnnouncer();
		Policeman policeman = new PolicemanImpl();
		announcer.announce("Начинаем дезинфекцию, все вон!");
		policeman.makePeopleLeaveRoom();
		desinfect(room);
		announcer.announce("Рискните зайти обратно!");
	}

	private void desinfect(Room room) {
		System.out.println("Зачитывается молитва: 'Корона, изыди!");

	}

}
