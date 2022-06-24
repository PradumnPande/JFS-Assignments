package assignment6Collection;


import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;

class Date  implements Comparable<Date>
	{
		private int year;
		private int month;
		private int date;
		@Override
		public String toString() {
			return "Date [year=" + year + ", month=" + month + ", date=" + date + "]";
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getDate() {
			return date;
		}
		public void setDate(int date) {
			this.date = date;
		}
		public Date(int year, int month, int date) {
			super();
			this.year = year;
			this.month = month;
			this.date = date;
		}
		public Date()
		{
			
		}
		/*
		 * @Override
		public int compareTo(Employee o) {
			return this.getId() - o.getId();
		}
		 */
		@Override
		public int compareTo(Date o1) {
			// TODO Auto-generated method stub
			return this.getYear()/4;
		}
	}
