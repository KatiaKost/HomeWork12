public class Student {

    int studentId;
    String firstName;
    String lastName;
    int yearOfStudy;
    double mathAverage;
    double economicsAverage;
    double foreignLanguageAverage;
    double calculateArithmeticMean;

}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentId = 1;
        student1.firstName = "Олег";
        student1.lastName = "Орлов";
        student1.yearOfStudy = 3;
        student1.mathAverage = 4.6;
        student1.economicsAverage = 4.2;
        student1.foreignLanguageAverage = 3.4;
        student1.calculateArithmeticMean = (student1.mathAverage + student1.economicsAverage
                + student1.foreignLanguageAverage) / 3;

        System.out.println("Студент: " + student1.firstName + " " + student1.lastName + "\n"
                + "Средняя оценка: " + student1.calculateArithmeticMean);

        System.out.println();

        Student student2 = new Student();
        student2.studentId = 2;
        student2.firstName = "Татьяна";
        student2.lastName = "Иванова";
        student2.yearOfStudy = 4;
        student2.mathAverage = 2.3;
        student2.economicsAverage = 4.9;
        student2.foreignLanguageAverage = 3.2;
        student2.calculateArithmeticMean = (student2.mathAverage + student2.economicsAverage
                + student2.foreignLanguageAverage) / 3;

        System.out.println("Студент: " + student2.firstName + " " + student2.lastName + "\n"
                + "Средняя оценка: " + student2.calculateArithmeticMean);

        System.out.println();

        Student student3 = new Student();
        student3.studentId = 3;
        student3.firstName = "Мария";
        student3.lastName = "Крылова";
        student3.yearOfStudy = 2;
        student3.mathAverage = 4.8;
        student3.economicsAverage = 4.3;
        student3.foreignLanguageAverage = 3.4;
        student3.calculateArithmeticMean = (student3.mathAverage + student3.economicsAverage
                + student3.foreignLanguageAverage) / 3;

        System.out.println("Студент: " + student3.firstName + " " + student3.lastName + "\n"
                + "Средняя оценка: " + student3.calculateArithmeticMean);


    }
}
