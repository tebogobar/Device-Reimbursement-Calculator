package za.co.mtn.devicereimbursementcalculator.model;

import java.util.ArrayList;
import java.util.List;

public class RepaymentResponse {
	private final List<RepaymentInfo> repaymentInfoList;

    public RepaymentResponse() {
        this.repaymentInfoList = new ArrayList<>();
    }

    public List<RepaymentInfo> getRepaymentInfoList() {
        return repaymentInfoList;
    }

    public void addRepaymentInfo(RepaymentInfo repaymentInfo) {
        this.repaymentInfoList.add(repaymentInfo);
    }
}
