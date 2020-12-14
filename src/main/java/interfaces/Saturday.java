package interfaces;

public class Saturday implements WeekDay {
	private static final String dayName = "SATURDAY";

	@Override
	public String getWeekDayName() {

		return dayName;
	}

}
