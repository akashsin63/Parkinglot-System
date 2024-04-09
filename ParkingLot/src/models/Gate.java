package models;

public class Gate {
	private int gateNumber;
	private GateType gateType;
	private Operator operator;
	private GateStatus status;
	
	
	public GateStatus getStatus() {
		return status;
	}
	public void setStatus(GateStatus status) {
		this.status = status;
	}
	//getter and setters
	public int getGateNumber() {
		return gateNumber;
	}
	public void setGateNumber(int gateNumber) {
		this.gateNumber = gateNumber;
	}
	public GateType getGateType() {
		return gateType;
	}
	public void setGateType(GateType gateType) {
		this.gateType = gateType;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Long getId() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getId'");
	}
	

}
