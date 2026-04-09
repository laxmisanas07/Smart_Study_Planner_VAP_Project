package demoburnoutdetection;

import java.util.ArrayList;
import java.util.List;

public class StudyTracker {
    private List<StudyTask> tasks;
    private List<Integer> dailyHours;

    public StudyTracker() {
        tasks = new ArrayList<>();
        dailyHours = new ArrayList<>();
    }

    public void addTask(StudyTask task) {
        tasks.add(task);
    }

    public void logStudyHours(int hours) {
        dailyHours.add(hours);
    }

    public List<Integer> getDailyHours() {
        return dailyHours;
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n📚 Study Tasks:");
        for (StudyTask t : tasks) {
            t.displayTask();
        }
    }

    public void showStudyLog() {
        System.out.println("\n📊 Study Hours Log:");
        for (int i = 0; i < dailyHours.size(); i++) {
            System.out.println("Day " + (i + 1) + ": " + dailyHours.get(i) + " hours");
        }
    }
}