public class Date {
    private int day;
    private int month;
    private int year;

    // constructor - modifies with validation
    public Date(int day, int month, int year) {
        if ( day < 1 || day > 31 ) {
            throw new IllegalArgumentException("Invalid day: " + day);
        } else if ( month < 1 || month > 12 ) {
            throw new IllegalArgumentException("Invalid month: " + month);
        } else if ( year < 1980 || year > 2079 ) {
            throw new IllegalArgumentException("Invalid year: " + year);
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }



    // getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate(){
        String day = String.valueOf(this.day);
        if (day.length() == 1) {
            day = "0" + day;
        }

        String month = String.valueOf(this.month);
        if (month.length() == 1) {
            month = "0" + month;
        }

        String year = String.valueOf(this.year);

        return day + "/" + month + "/" + year;
    }

    // Setters
    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid day: " + day);
        }

        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month: " + month);
        }

        this.month = month;
    }

    public void setYear(int year) {
        if (year < 1980 || year > 2079) {
            throw new IllegalArgumentException("Invalid year: " + year);
        }

        this.year = year;
    }

    @Override
    public String toString() {
        return "Date[ Day = " + day + ", Month = " + month + ", Year = " + year + " ]";
    }
}