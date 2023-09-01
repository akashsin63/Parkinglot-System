package models;

import java.util.Date;
import java.util.List;

public class Bill {
	private Ticket ticket;
	private Date exitTime;
	private int amount;
	private Operator operator;
	private Gate gate;
	private List<Payment> payement;
	private BillStatus billStatus;
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Date getExitTime() {
		return exitTime;
	}
	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Gate getGate() {
		return gate;
	}
	public void setGate(Gate gate) {
		this.gate = gate;
	}
	public List<Payment> getPayement() {
		return payement;
	}
	public void setPayement(List<Payment> payement) {
		this.payement = payement;
	}
	public BillStatus getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(BillStatus billStatus) {
		this.billStatus = billStatus;
	}
}