package com.mustadio98.clockin.database;

public class Break {
	public Break(long breakId, int breakOut, int breakIn, int clockId) {
		super();
		this.breakId = breakId;
		this.breakOut = breakOut;
		this.breakIn = breakIn;
		this.clockId = clockId;
	}
	private long breakId;
	private int breakOut;
	private int breakIn;
	private int clockId;
	public long getBreakId() {
		return breakId;
	}
	public void setBreakId(long breakId) {
		this.breakId = breakId;
	}
	public int getBreakOut() {
		return breakOut;
	}
	public void setBreakOut(int breakOut) {
		this.breakOut = breakOut;
	}
	public int getBreakIn() {
		return breakIn;
	}
	public void setBreakIn(int breakIn) {
		this.breakIn = breakIn;
	}
	public int getClockId() {
		return clockId;
	}
	public void setClockId(int clockId) {
		this.clockId = clockId;
	}

}
