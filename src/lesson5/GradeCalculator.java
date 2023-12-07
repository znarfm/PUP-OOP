package lesson5;

import java.util.Scanner;

public class GradeCalculator {
    static double quizPrelim, quizMid, quizFinals;
    static double recitationPrelim, recitationMid, recitationFinals;
    static double projectPrelim, projectMid, projectFinals;
    static double examPrelim, examMid, examFinals;
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        char choice, repeat;
        double classStandingPrelim, classStandingMid, classStandingFinals; 
        double projectGradePrelim, projectGradeMid, projectGradeFinals;
        double lectureGradePrelim, lectureGradeMid, lectureGradeFinals;
        double classAvePrelim, classAveMid, classAveFinals;
        double overallGradeMid, overallGradeFinals;
        double equivalent;
        
        do {
            double grade = -1;       // For equivalent
            System.out.println("[P] Prelim");
            System.out.println("[M] Midterm");
            System.out.println("[F] Finals");
            System.out.println("[E] Quit");
            System.out.print("Enter choice: ");
            choice = scanner.next().charAt(0);
            
            switch (choice) {
                case 'P':
                    getPrelim();
                    classStandingPrelim = computeClassStanding(quizPrelim, recitationPrelim);
                    projectGradePrelim = computeProjectGrade(projectPrelim);
                    lectureGradePrelim = computeLectureGrade(classStandingPrelim, examPrelim);
                    classAvePrelim = computeClassAve(projectGradePrelim, lectureGradePrelim);
                    printResults("Prelim", classStandingPrelim, projectGradePrelim, lectureGradePrelim, classAvePrelim);
                    grade = classAvePrelim;
                    break;
    
                case 'M':
                    getPrelim();
                    getMidterm();
                    classStandingPrelim = computeClassStanding(quizPrelim, recitationPrelim);
                    projectGradePrelim = computeProjectGrade(projectPrelim);
                    lectureGradePrelim = computeLectureGrade(classStandingPrelim, examPrelim);
                    classAvePrelim = computeClassAve(projectGradePrelim, lectureGradePrelim);

                    classStandingMid = computeClassStanding(quizMid, recitationMid);
                    projectGradeMid = computeProjectGrade(projectMid);
                    lectureGradeMid = computeLectureGrade(classStandingMid, examMid);
                    classAveMid = computeClassAve(projectGradeMid, lectureGradeMid);
                    overallGradeMid = computeOverallGrade(classAvePrelim, classAveMid);
                    grade = overallGradeMid;
                    printResults("Midterm", classStandingMid, projectGradeMid, lectureGradeMid, overallGradeMid);
                    break;
    
                case 'F':
                    getPrelim();
                    getMidterm();
                    getFinals();

                    classStandingPrelim = computeClassStanding(quizPrelim, recitationPrelim);
                    projectGradePrelim = computeProjectGrade(projectPrelim);
                    lectureGradePrelim = computeLectureGrade(classStandingPrelim, examPrelim);
                    classAvePrelim = computeClassAve(projectGradePrelim, lectureGradePrelim);

                    classStandingMid = computeClassStanding(quizMid, recitationMid);
                    projectGradeMid = computeProjectGrade(projectMid);
                    lectureGradeMid = computeLectureGrade(classStandingMid, examMid);
                    classAveMid = computeClassAve(projectGradeMid, lectureGradeMid);
                    overallGradeMid = computeOverallGrade(classAvePrelim, classAveMid);

                    classStandingFinals = computeClassStanding(quizFinals, recitationFinals);
                    projectGradeFinals = computeProjectGrade(projectFinals);
                    lectureGradeFinals = computeLectureGrade(classStandingFinals, examFinals);
                    classAveFinals = computeClassAve(projectGradeFinals, lectureGradeFinals);
                    overallGradeFinals = computeOverallGrade(overallGradeMid, classAveFinals);
                    grade = overallGradeFinals;
                    printResults("Finals", classStandingFinals, projectGradeFinals, lectureGradeFinals, overallGradeFinals);
                    break;
    
                case 'E':
                    System.out.println("Exiting...");
                    System.exit(0);
    
                default:
                    System.out.println("Invalid choice.");
            }

            if (grade != -1) {
                grade = Math.round(grade);
                if (grade >= 97 && grade <= 100) equivalent = 1.0;
                else if (grade >= 94 && grade <= 96) equivalent = 1.25;
                else if (grade >= 91 && grade <= 93) equivalent = 1.50;
                else if (grade >= 88 && grade <= 90) equivalent = 1.75;
                else if (grade >= 85 && grade <= 87) equivalent = 2.0;
                else if (grade >= 82 && grade <= 84) equivalent = 2.25;
                else if (grade >= 79 && grade <= 81) equivalent = 2.50;
                else if (grade >= 76 && grade <= 78) equivalent = 2.75;
                else if (grade == 75) equivalent = 3.0;
                else equivalent = 5.0;
                System.out.print("The equivalent grade is " + equivalent + ". ");
                if (equivalent <= 3.0) System.out.println("You passed this subject. Congratulations!");
                else System.out.println("You have failed this subject. Better luck next time!");
            }

            scanner.nextLine();
            System.out.print("Do you want to continue? (Y/N) > ");
            repeat = scanner.next().charAt(0);
        } while (repeat == 'Y' || repeat == 'y');

        scanner.close();
    }

    public static void getPrelim() {
        System.out.print("Please enter grade for Prelim quiz: ");
        quizPrelim = scanner.nextDouble();
        System.out.print("Please enter grade for Prelim recitation: ");
        recitationPrelim = scanner.nextDouble();
        System.out.print("Please enter grade for Prelim project: ");
        projectPrelim = scanner.nextDouble();
        System.out.print("Please enter grade for Prelim exam: ");
        examPrelim = scanner.nextDouble();
    }

    public static void getMidterm() {
        System.out.print("Please enter grade for Midterm quiz: ");
        quizMid = scanner.nextDouble();
        System.out.print("Please enter grade for Midterm recitation: ");
        recitationMid = scanner.nextDouble();
        System.out.print("Please enter grade for Midterm project: ");
        projectMid = scanner.nextDouble();
        System.out.print("Please enter grade for Midterm exam: ");
        examMid = scanner.nextDouble();
    }

    public static void getFinals() {
        System.out.print("Please enter grade for Finals quiz: ");
        quizFinals = scanner.nextDouble();
        System.out.print("Please enter grade for Finals recitation: ");
        recitationFinals = scanner.nextDouble();
        System.out.print("Please enter grade for Finals project: ");
        projectFinals = scanner.nextDouble();
        System.out.print("Please enter grade for Finals exam: ");
        examFinals = scanner.nextDouble();
    }

    public static double computeClassStanding(double quiz, double recitation) {
        double classStanding = (quiz + recitation) / 2;
        return classStanding;
    }

    public static double computeProjectGrade(double project) {
        double projectGrade = project * 0.4;
        return projectGrade;
    }

    public static double computeLectureGrade(double standing, double exam) {
        double lectureGrade = ((2 * standing + exam) / 3) * 0.6;
        return lectureGrade;
    }

    public static double computeClassAve(double project, double lecture) {
        double classAve = project + lecture;
        return classAve;
    }

    public static double computeOverallGrade(double pastTerm, double classAve) {
        double overallGrade = (2 * classAve + pastTerm) / 3;
        return overallGrade;
    }

    public static void printResults(String term, double classStanding, double projectGrade, double lectureGrade, double overallGrade) {
        System.out.printf("The %s Class Standing is: %.2f\n", term, classStanding);
        System.out.printf("The %s Project Grade is: %.2f\n", term, projectGrade);
        System.out.printf("The %s Lecture Grade is: %.2f\n", term, lectureGrade);
        System.out.printf("The %s Grade is: %.2f\n", term, overallGrade);
    }

}
