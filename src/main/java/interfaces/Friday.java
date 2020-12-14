package interfaces;

public class Friday implements WeekDay {
	private static final String dayName = "FRIDAY";

	@Override
	public String getWeekDayName() {

		return dayName;
	}

}
