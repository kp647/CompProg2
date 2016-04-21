package Inheritance_HW;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int d,int m, int y){
		if (d>31||d<1 )
			d=0;
		if(m>12||m<1)
			m=0;
		if(y<1000)
			y=0000;
			
	this.day=d;
	this.month=m;
	this.year=y;
	
}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
