package interfaces;

public class Sunday implements WeekDay {
	private static final String dayName = "SUNDAY";

	@Override
	public String getWeekDayName() {

		return dayName;
	}

}
