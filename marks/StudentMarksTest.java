package marks;

public class StudentMarksTest {
    public boolean isPassed(Subject subject){
        System.out.println("from isPassed "+subject.name);
        return subject.marks>=35;
    }
    public boolean isPassedHindi(Subject subject){
        System.out.println("from isPassedHindi"+subject.name);
        return subject.marks>=21;
    }

   public Student getResult(Student inputStudent) {


       if (isPassed(inputStudent.marks.englishSubject)) {
           inputStudent.marks.englishSubject.result = "Pass";
       } else {
           inputStudent.marks.englishSubject.result = "Fail";
       }

       if (isPassed(inputStudent.marks.teluguSubject)) {
           inputStudent.marks.teluguSubject.result = "Pass";
       } else {
           inputStudent.marks.teluguSubject.result = "Fail";
       }

       if (isPassed(inputStudent.marks.sceinceSubject)) {
           inputStudent.marks.sceinceSubject.result = "Pass";
       } else {
           inputStudent.marks.sceinceSubject.result = "Fail";
       }

       if (isPassed(inputStudent.marks.hindhiSubject)) {
           inputStudent.marks.hindhiSubject.result = "Pass";
       } else {
           inputStudent.marks.hindhiSubject.result = "Fail";
       }

       if (isPassed(inputStudent.marks.mathsSubject)) {
           inputStudent.marks.mathsSubject.result = "Pass";
       } else {
           inputStudent.marks.mathsSubject.result = "Fail";
       }

       if (isPassed(inputStudent.marks.socialSubject)) {
           inputStudent.marks.socialSubject.result = "Pass";
       } else {
           inputStudent.marks.socialSubject.result = "Fail";
       }

       if(inputStudent.marks.teluguSubject.result.equals("Pass")
               && inputStudent.marks.englishSubject.result.equals("Pass")
               && inputStudent.marks.socialSubject.result.equals("Pass")
               && inputStudent.marks.hindhiSubject.result.equals("Pass")
               && inputStudent.marks.mathsSubject.result.equals("Pass")
               && inputStudent.marks.sceinceSubject.result.equals("Pass")) {
           inputStudent.result="Pass";

       }

       else{
           inputStudent.result="Fail";

           }

       return inputStudent;
   }


//       if(isPassed(inputStudent.marks.socialSubject) &&
//               (isPassed(inputStudent.marks.sceinceSubject) &&
//                       (isPassed(inputStudent.marks.hindhiSubject) &&
//                               (isPassed(inputStudent.marks.mathsSubject) &&
//                                       (isPassed(inputStudent.marks.sceinceSubject)&&
//                               (isPassedEnglish(inputStudent.marks.englishSubject))))))) {
//           inputStudent.result = "Pass";
//       }
//       else {
//           inputStudent.result="Fail";
//       }
//       return inputStudent;
//   }

    public static void main(String[] args) {

        Subject teluguSubject = new Subject();
        teluguSubject.name="Telugu";
        teluguSubject.marks=98;

        Subject hindhiSubject = new Subject();
        hindhiSubject.name="Hindi";
        hindhiSubject.marks=91;

        Subject mathsSubject = new Subject();
        mathsSubject.name="Maths";
        mathsSubject.marks=70;

        Subject socialSubject = new Subject();
        socialSubject.name="Social";
        socialSubject.marks=90;

        Subject sceinceSubject = new Subject();
        sceinceSubject.name="Sceince";
        sceinceSubject.marks=88;

        Subject englishSubject = new Subject();
        englishSubject.name="English";
        englishSubject.marks=21;

        Marks mark=new Marks();
        mark.teluguSubject=teluguSubject;
        mark.englishSubject=englishSubject;
        mark.hindhiSubject=hindhiSubject;
        mark.mathsSubject=mathsSubject;
        mark.sceinceSubject=sceinceSubject;
        mark.socialSubject=socialSubject;

        Student student=new Student();

        student.marks=mark;

        student.name="kanakadurga";
        student.fatherName="Dileep chakravarthi";
        student.dateOfBirth="24/2/2000";
        student.mobileNo="9391976191";
        student.schoolName="GDMM Collage of Engineering";


        StudentMarksTest studentMarksTest=new StudentMarksTest();
        Student latestStudent=studentMarksTest.getResult(student);
        System.out.println(latestStudent.toString());

    }

}
