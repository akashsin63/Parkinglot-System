package models;

public class Payment extends Base{
	private PaymentMode paymentMode;
	public PaymentMode getPaymenMode() {
		return paymentMode;
	}
	public void setPaymenMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	private int amount;
	private PaymentStatus paymentStatus;
	private String referenceId;
	
}
