package demoburnoutdetection;
import java.util.List;

public class BurnoutDetector {

    public static boolean isBurnoutRisk(List<Integer> hours) {
        if (hours == null || hours.isEmpty()) {
            return false;
        }

        int highDays = 0;
        int consecutiveDays = 0;
        int maxConsecutive = 0;
        int total = 0;

        for (int h : hours) {
            total += h;

            // High workload condition
            if (h > 8) {
                highDays++;
            }

            // Consecutive study days
            if (h > 0) {
                consecutiveDays++;
                if (consecutiveDays > maxConsecutive) {
                    maxConsecutive = consecutiveDays;
                }
            } else {
                consecutiveDays = 0;
            }
        }

        double average = (double) total / hours.size();

        int riskFactors = 0;

        if (highDays > 2) riskFactors++;
        if (maxConsecutive > 5) riskFactors++;
        if (average > 6) riskFactors++;

        return riskFactors >= 2;
    }

    public static void printDetailedAnalysis(List<Integer> hours) {
        int total = 0;

        for (int h : hours) {
            total += h;
        }

        double average = hours.size() > 0 ? (double) total / hours.size() : 0;

        System.out.println("\n📈 Analysis:");
        System.out.println("Total Study Hours: " + total);
        System.out.println("Average Daily Hours: " + String.format("%.2f", average));

        if (isBurnoutRisk(hours)) {
            System.out.println("⚠️ Burnout Risk Detected!");
            System.out.println("👉 Recommendation: Take breaks and reduce workload.");
        } else {
            System.out.println("✅ Healthy Study Pattern.");
        }
    }
}