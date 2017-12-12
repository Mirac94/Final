package pkgCore;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	

		public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, 
				double dAnnualReturnRetired, double dRequiredIncome, double dMonthlySSI) {
			super();
			this.iYearsToWork = iYearsToWork;
			this.dAnnualReturnWorking = dAnnualReturnWorking;
			this.iYearsRetired = iYearsRetired;
			this.dAnnualReturnRetired = dAnnualReturnRetired;
			this.dRequiredIncome = dRequiredIncome;
			this.dMonthlySSI = dMonthlySSI;
		}
	
		public double AmountToSave()
		{
			
			double rAnnualReturnWorking = dAnnualReturnWorking / 12;
			double dMonthsToWork = iYearsToWork * 12;
			double returnVal = 0;
			if (rAnnualReturnWorking == 0) {
				returnVal = TotalAmountSaved()/dMonthsToWork;
		    }else {
		    	returnVal = TotalAmountSaved()* rAnnualReturnWorking
		                  /(Math.pow(1+rAnnualReturnWorking, dMonthsToWork)-1);
		    }
			return returnVal;
		
		}

	
		public double TotalAmountSaved()
		{
			double dMonthsRetired = this.iYearsRetired * 12;
			double rAnnaulReturnRetired =this.dAnnualReturnRetired / 12;
			double dRequiredIncome = this.dRequiredIncome;
			double dMonthlySSI = this.dMonthlySSI;
	        double pv = FinanceLib.pv(rAnnaulReturnRetired, dMonthsRetired, dRequiredIncome - dMonthlySSI, 0, false);
	        return pv;
		}

public int getiYearsToWork() {
	return iYearsToWork;
}

public void setiYearsToWork(int iYearsToWork) {
	this.iYearsToWork = iYearsToWork;
}

public double getdAnnualReturnWorking() {
	return dAnnualReturnWorking;
}

public void setdAnnualReturnWorking(double dAnnualReturnWorking) {
	this.dAnnualReturnWorking = dAnnualReturnWorking;
}

public int getiYearsRetired() {
	return iYearsRetired;
}

public void setiYearsRetired(int iYearsRetired) {
	this.iYearsRetired = iYearsRetired;
}

public double getdAnnualReturnRetired() {
	return dAnnualReturnRetired;
}

public void setdAnnualReturnRetired(double dAnnualReturnRetired) {
	this.dAnnualReturnRetired = dAnnualReturnRetired;
}

public double getdRequiredIncome() {
	return dRequiredIncome;
}

public void setdRequiredIncome(double dRequiredIncome) {
	this.dRequiredIncome = dRequiredIncome;
}

public double getdMonthlySSI() {
	return dMonthlySSI;
}

public void setdMonthlySSI(double dMonthlySSI) {
	this.dMonthlySSI = dMonthlySSI;
}
}