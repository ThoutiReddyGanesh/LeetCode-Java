import java.time.LocalDate;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year,month,day);
        String s= date.getDayOfWeek().toString().toLowerCase();
        return s.substring(0, 1).toUpperCase()+s.substring(1);
    }
}