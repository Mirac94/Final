package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField YearsToWork;
	@FXML
	private TextField AnnualReturnWork;
	@FXML
	private TextField YearsRetired;
	@FXML
	private TextField AnnualReturnRetired;
	@FXML
	private TextField RequiredIncome;
	@FXML
	private TextField MonthlySSI;
	@FXML
	private TextField SaveEachMonth;
	@FXML
	private TextField NeedToSave;
	
	

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		
		
		AnnualReturnWork.clear();
		RequiredIncome.clear();
		YearsToWork.clear();
		AnnualReturnRetired.clear();
		YearsRetired.clear();
		MonthlySSI.clear();
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
	}		
}
