// Nếu lấy giờ local thì ko cần truyền giá trị "DateTimeZone.UTC"
	protected String getCurrentDay() {
		DateTime nowUTC = new DateTime();
		int day = nowUTC.getDayOfMonth();
		if (day < 10) {
			String dayValue = "0" + day;
			return dayValue;
		}
		return String.valueOf(day);
	}

	protected String getCurrentMonth() {
		DateTime now = new DateTime();
		int month = now.getMonthOfYear();
		if (month < 10) {
			String monthValue = "0" + month;
			return monthValue;
		}
		return String.valueOf(month);
	}

	protected String getCurrentYear() {
		DateTime now = new DateTime();
		return String.valueOf(now.getYear());
	}

// Có thể đổi tên getToday() thành tên Project VD: getAvatarToday
// return getCurrentYear() + "-" + getCurrentMonth() + "-" + getCurrentDay(); : tùy theo web sẽ dùng định dạng 11-01-2020 hay 11/01/2020 mà thay thế tương ứng
	protected String getToday() {
		return getCurrentYear() + "-" + getCurrentMonth() + "-" + getCurrentDay();
	}
