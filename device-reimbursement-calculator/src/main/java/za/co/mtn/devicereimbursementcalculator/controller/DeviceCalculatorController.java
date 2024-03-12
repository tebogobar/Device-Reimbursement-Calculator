package za.co.mtn.devicereimbursementcalculator.controller;

import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import za.co.mtn.devicereimbursementcalculator.service.DeviceCalculatorService;

@Controller
@RequestMapping("/api/device")
public class DeviceCalculatorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DeviceCalculatorController.class);
	
	@Autowired private DeviceCalculatorService deviceCalculatorService;
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/{value}", method = RequestMethod.GET, produces = "application/json")
	@Operation(summary = "calculate contract repayments for devices taken over the following periods 12, 24 and 36 months")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully calculated repayment"),
			@ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
			@ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(responseCode = "400", description = "Not Found"),
			@ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found") })
	private @ResponseBody ResponseEntity<Object> paymentGet(@PathVariable(name = "value", required = false) BigDecimal value) {
		LOGGER.debug("Requesting payments information {} ", value);
		try {
			return new ResponseEntity<>(deviceCalculatorService.calculatePayment(value), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
