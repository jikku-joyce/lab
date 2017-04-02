package com.jikku.study;

public class ServiceDAO {
	
	private int serviceId;
	private String serviceName;
	private double serviceCharge;
	
	public int getServiceId() {  
		return serviceId;  
	}
	
	public void setServiceId(int serviceId) {  
		this.serviceId = serviceId;  
	}
	 
	public String getSname() {
		return serviceName;  
	}
	
	public void setSname(String serviceName) {  
		this.serviceName = serviceName;  
	}
	 
	public double getServiceCharge() {  
		return serviceCharge;  
	}
	public void setServiceCharge(double serviceCharge) {  
		this.serviceCharge = serviceCharge;  
	}
}
