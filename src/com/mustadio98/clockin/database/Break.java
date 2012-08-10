package com.mustadio98.clockin.database;

public class Break {

	public Break() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Break(long breakId, int breakOut, int breakIn, String clockInDate) {
		super();
		this.breakId = breakId;
		this.breakOut = breakOut;
		this.breakIn = breakIn;
		this.clockInDate = clockInDate;
	}
	private long breakId;
	private int breakOut;
	private int breakIn;
	private String clockInDate;
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
	public String getClockInDate() {
		return clockInDate;
	}
	public void setClockInDate(String clockInDate) {
		this.clockInDate = clockInDate;
	}

}
