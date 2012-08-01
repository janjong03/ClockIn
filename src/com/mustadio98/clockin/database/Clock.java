package com.mustadio98.clockin.database;

public class Clock {
public Clock(long clockId, int clockIn, int clockOut) {
		super();
		this.clockId = clockId;
		this.clockIn = clockIn;
		this.clockOut = clockOut;
	}
private long clockId;
private int clockIn;
private int clockOut;
public long getClockId() {
	return clockId;
}
public void setClockId(long clockId) {
	this.clockId = clockId;
}
public int getClockIn() {
	return clockIn;
}
public void setClockIn(int clockIn) {
	this.clockIn = clockIn;
}
public int getClockOut() {
	return clockOut;
}
public void setClockOut(int clockOut) {
	this.clockOut = clockOut;
}
}
