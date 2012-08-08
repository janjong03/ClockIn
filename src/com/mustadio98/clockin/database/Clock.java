package com.mustadio98.clockin.database;

import java.util.Date;


public class Clock {

public Clock() {
		super();
	}
public Clock(long clockId, Date clockIn, Date clockOut) {
		super();
		this.clockId = clockId;
		this.clockIn = clockIn;
		this.clockOut = clockOut;
	}
private long clockId;
private Date clockIn;
private Date clockOut;
public long getClockId() {
	return clockId;
}
public void setClockId(long clockId) {
	this.clockId = clockId;
}
public Date getClockIn() {
	return clockIn;
}
public void setClockIn(Date clockIn) {
	this.clockIn = clockIn;
}
public Date getClockOut() {
	return clockOut;
}
public void setClockOut(Date clockOut) {
	this.clockOut = clockOut;
}
public long getTotalTime(){
	long diff=this.clockOut.getTime() - this.clockIn.getTime();
	return diff;
	
}
}
