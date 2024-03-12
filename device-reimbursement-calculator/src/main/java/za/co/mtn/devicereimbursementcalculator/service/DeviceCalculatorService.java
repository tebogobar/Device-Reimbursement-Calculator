package za.co.mtn.devicereimbursementcalculator.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import za.co.mtn.devicereimbursementcalculator.model.RepaymentInfo;
import za.co.mtn.devicereimbursementcalculator.model.RepaymentResponse;

@Service
public class DeviceCalculatorService {
	
	private double interestRate = 6.5;
	private int[] periods = {12, 24, 36};
	
	public RepaymentResponse calculatePayment(BigDecimal deviceAmount) {
		
        RepaymentResponse response = new RepaymentResponse();

        for (int period : periods) {
            double interest = deviceAmount.doubleValue() * (interestRate / 100);
            double totalRepayment = deviceAmount.doubleValue() + interest;
            double monthlyRepayment = totalRepayment / period;

            RepaymentInfo repaymentInfo = new RepaymentInfo(period, totalRepayment, monthlyRepayment);
            response.addRepaymentInfo(repaymentInfo);
        }
        return response;
	}
}
