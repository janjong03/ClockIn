package com.mustadio98.clockin.database;


public class Clock {

public Clock(String clockInDate, long clockIn, long clockOut) {
		super();
		this.clockInDate = clockInDate;
		this.clockIn = clockIn;
		this.clockOut = clockOut;
	}
public Clock() {
		super();
	}

private String clockInDate;
private long clockIn;
private long clockOut;

public long getClockIn() {
	return clockIn;
}
public void setClockIn(long clockIn) {
	this.clockIn = clockIn;
}
public long getClockOut() {
	return clockOut;
}
public void setClockOut(long clockOut) {
	this.clockOut = clockOut;
}
public double getTotalTime(){
//	Calendar calOff= Calendar.getInstance();
//	Calendar calOn = Calendar.getInstance();
//	calOff.setTime(off);
//	calOn.setTime(on);
	long ms1=this.clockOut;
	long ms2=this.clockIn;
	long diff=ms1-ms2;
	return diff;

	
}
public String getClockInDate() {
	return clockInDate;
}
public void setClockInDate(String clockInDate) {
	this.clockInDate = clockInDate;
}
}
