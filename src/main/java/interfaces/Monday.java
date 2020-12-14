package interfaces;

public class Monday implements WeekDay {
	private static final String dayName = "MONDAY";

	@Override
	public String getWeekDayName() {

		return dayName;
	}

}
