package models;

import java.util.Date;

public class Mater extends Base{
	private Date startTime;
	private Date endTime;
	private int unitConsumed;
	private int ratePerUnit;
	
	//based on Access Desgin patter 
	private Bill bill;

	
	
	//getter setter 
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getUnitConsumed() {
		return unitConsumed;
	}

	public void setUnitConsumed(int unitConsumed) {
		this.unitConsumed = unitConsumed;
	}

	public int getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(int ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}
	


}
