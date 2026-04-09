package demoburnoutdetection;

public class StudyTask {
    private String subject;
    private int hoursRequired;
    private String deadline;

    public StudyTask(String subject, int hoursRequired, String deadline) {
        this.subject = subject;
        this.hoursRequired = hoursRequired;
        this.deadline = deadline;
    }

    public String getSubject() {
        return subject;
    }

    public int getHoursRequired() {
        return hoursRequired;
    }

    public String getDeadline() {
        return deadline;
    }

    public void displayTask() {
        System.out.println(subject + " | Hours: " + hoursRequired + " | Deadline: " + deadline);
    }
}
