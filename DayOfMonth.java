import java.util.Scanner;

public class DayOfMonth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input month: ");
		String month = scanner.nextLine();
		System.out.println("Input year: ");
		int year = scanner.nextInt();

		if (year < 0) {
			System.out.println("Invalid year!");
			return;
		}

		int numDay;
		switch (month) {
		case "January":
		case "Jan":
		case "Jan.":
		case "1":
		case "March":
		case "Mar":
		case "Mar.":
		case "3":
		case "May":
		case "5":
		case "July":
		case "Jul":
		case "7":
		case "August":
		case "Aug":
		case "Aug.":
		case "8":
		case "October":
		case "Oct.":
		case "Oct":
		case "10":
		case "December":
		case "Dec.":
		case "Dec":
		case "12":
			numDay = 31;
			break;
		case "April":
		case "Arp.":
		case "Arp":
		case "4":
		case "June":
		case "Jun":
		case "6":
		case "September":
		case "Sept":
		case "Sep":
		case "9":
		case "November":
		case "Nov":
		case "Nov.":
		case "11":
			numDay = 30;
			break;
		case "February":
		case "Feb":
		case "Feb.":
		case "2":
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				numDay = 29;
			} else {
				numDay = 28;
			}
			break;
		default:
			System.out.println("Invalid month!");
			return;
		}
		
		System.out.println("Number of day: " + numDay);
	}
}
