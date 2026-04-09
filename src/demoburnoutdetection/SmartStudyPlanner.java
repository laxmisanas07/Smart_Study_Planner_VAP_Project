package demoburnoutdetection;

import java.util.Scanner;

public class SmartStudyPlanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudyTracker tracker = new StudyTracker();

        int choice;

        do {
            System.out.println("\n===== SMART STUDY PLANNER =====");
            System.out.println("1. Add Study Task");
            System.out.println("2. Log Study Hours");
            System.out.println("3. View Tasks");
            System.out.println("4. View Study Log");
            System.out.println("5. Check Burnout Status");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter Required Hours: ");
                    int hours = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Deadline: ");
                    String deadline = sc.nextLine();

                    tracker.addTask(new StudyTask(subject, hours, deadline));
                    System.out.println("✅ Task added successfully!");
                    break;

                case 2:
                    System.out.print("Enter hours studied today: ");
                    int studyHours = sc.nextInt();
                    tracker.logStudyHours(studyHours);
                    System.out.println("✅ Study hours logged!");
                    break;

                case 3:
                    tracker.showTasks();
                    break;

                case 4:
                    tracker.showStudyLog();
                    break;

                case 5:
                    BurnoutDetector.printDetailedAnalysis(tracker.getDailyHours());
                    break;

                case 0:
                    System.out.println("👋 Exiting... Stay healthy!");
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}