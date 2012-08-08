package com.mustadio98.clockin.database;




public class Clock {

public Clock() {
		super();
	}
public Clock(long clockId, String clockIn, String clockOut) {
		super();
		this.clockId = clockId;
		this.clockIn = clockIn;
		this.clockOut = clockOut;
	}
private long clockId;
private String clockIn;
private String clockOut;
public long getClockId() {
	return clockId;
}
public void setClockId(long clockId) {
	this.clockId = clockId;
}
public String getClockIn() {
	return clockIn;
}
public void setClockIn(String clockIn) {
	this.clockIn = clockIn;
}
public String getClockOut() {
	return clockOut;
}
public void setClockOut(String clockOut) {
	this.clockOut = clockOut;
}
//public long getTotalTime(){
//	long diff=this.clockOut.getTime() - this.clockIn.getTime();
//	return diff;
//	
//}
}
