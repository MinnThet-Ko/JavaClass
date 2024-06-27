package com.assignment5;

public class MyTime {

	private int hour;
	private int minute;
	private int second;

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 23) {
			this.hour = hour;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (hour < 23) {
			this.minute = minute;
		} else {
			throw new IllegalArgumentException("");
		}

	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (hour < 23) {
			this.second = second;
		} else {
			throw new IllegalArgumentException("");
		}

	}

	public String toString() {
		return String.format("%d:%d:%d", this.hour, this.minute, this.second);
	}

	public MyTime nextHour() {
		if (this.hour == 23) {
			setHour(0);
		} else {
			setHour(this.hour + 1);
		}
		return this;
	}

	public MyTime nextMinute() {
		if (this.minute == 59) {
			setMinute(0);
			nextHour();
		} else {
			setMinute(this.minute + 1);
		}
		return this;
	}

	public MyTime nextSecond() {
		if(this.second == 59) {
			this.setSecond(0);
			nextMinute();
		}else {
			setSecond(this.second+1);
		}
		return this;
	}
	
	public MyTime previousHour() {
		if (this.hour == 00) {
			setHour(23);
		} else {
			setHour(this.hour - 1);
		}
		return this;
	}

	public MyTime previousMinute() {
		if (this.minute == 0) {
			setMinute(59);
			previousHour();
		} else {
			setMinute(this.minute - 1);
		}
		return this;
	}

	public MyTime previousSecond() {
		if(this.second == 0) {
			this.setSecond(59);
			previousMinute();
		}else {
			setSecond(this.second-1);
		}
		return this;
	}

}
