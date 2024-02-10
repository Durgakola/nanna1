package Attendence;

public class AttendenceTest {


    public static void main(String[] args) {
        Month januaryMonth=new Month();
        januaryMonth.month="January";
        januaryMonth.workingDays=25;

        Month febravaryMonth=new Month();
        febravaryMonth.month="Febravary";
        febravaryMonth.workingDays=26;

        Month marchMonth=new Month();
        marchMonth.month="March";
        marchMonth.workingDays=27;

        Month aprilMonth=new Month();
        aprilMonth.month="April";
        aprilMonth.workingDays=28;

        Month mayMonth=new Month();
        mayMonth.month="May";
        mayMonth.workingDays=29;

        Month juneMonth=new Month();
        juneMonth.month="June";
        juneMonth.workingDays=30;

        Month julayMonth=new Month();
        julayMonth.month="Julay";
        julayMonth.workingDays=28;

        Month augustMonth=new Month();
        augustMonth.month="August";
        augustMonth.workingDays=26;

        Month septemberMonth=new Month();
        septemberMonth.month="September";
        septemberMonth.workingDays=23;

        Month octobarMonth=new Month();
        octobarMonth.month="Octomber";
        octobarMonth.workingDays=24;

        Month novemberMonth=new Month();
        novemberMonth.month="November";
        novemberMonth.workingDays=30;

        Month decenberMonth=new Month();
        decenberMonth.month="Decenber";
        decenberMonth.workingDays=25;

        Days day=new Days();
        day.januaryMonth = januaryMonth;
        day.febravaryMonth=febravaryMonth;
        day.marchMonth=marchMonth;
        day.aprilMonth=aprilMonth;
        day.mayMonth=mayMonth;
        day.juneMonth=juneMonth;
        day.julayMonth=julayMonth;
        day.augustMonth=augustMonth;
        day.septemberMonth=septemberMonth;
        day.octobarMonth=octobarMonth;
        day.novemberMonth=novemberMonth;
        day.decenberMonth=decenberMonth;

        Student student=new Student();
        student.name="kanakadurga";
        student.fatherName="Dileep chakravarthi";
        student.dateOfBirth="24/2/2000";
        student.mobileNo="9391976191";
        student.schoolName="GDMM Collage of Engineering";

        AttendenceTest test=new AttendenceTest();




    }
}
