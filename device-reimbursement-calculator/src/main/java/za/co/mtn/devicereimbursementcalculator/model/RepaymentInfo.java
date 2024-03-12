package za.co.mtn.devicereimbursementcalculator.model;

public class RepaymentInfo {

	private final int period;
    private final double totalRepayment;
    private final double monthlyRepayment;

    public RepaymentInfo(int period, double totalRepayment, double monthlyRepayment) {
        this.period = period;
        this.totalRepayment = totalRepayment;
        this.monthlyRepayment = monthlyRepayment;
    }

    public int getPeriod() {
        return period;
    }

    public double getTotalRepayment() {
        return totalRepayment;
    }

    public double getMonthlyRepayment() {
        return monthlyRepayment;
    }
    
}
