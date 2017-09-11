public class CodingHours {
    public static void main(String[] args) {
        int DailyCoding = 6;
        int Semester = 17;
        int Days = Semester * 5;
        double WorkHours = 52;
        System.out.println(DailyCoding * Days);
        //System.out.println((Semester * WorkHours) / (DailyCoding * Days));
        System.out.println((DailyCoding * Days) / (Semester * WorkHours) *100);

    }
}





