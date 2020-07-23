package com.casino;

public class Casino {

	private String name;
	private int number;
	private String even;
	private String odd;
	private int ammount1;
	private int ammount2;
	private int ammount3;
	private String result1;
	private String result2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEven() {
		return even;
	}
	public void setEven(String even) {
		this.even = even;
	}
	public String getOdd() {
		return odd;
	}
	public void setOdd(String odd) {
		this.odd = odd;
	}
	public int getAmmount1() {
		return ammount1;
	}
	public void setAmmount1(int ammount1) {
		this.ammount1 = ammount1;
	}
	public int getAmmount2() {
		return ammount2;
	}
	public void setAmmount2(int ammount2) {
		this.ammount2 = ammount2;
	}
	public int getAmmount3() {
		return ammount3;
	}
	public void setAmmount3(int ammount3) {
		this.ammount3 = ammount3;
	}
	public String getResult1() {
		return result1;
	}
	public void setResult1(String result1) {
		this.result1 = result1;
	}
	public String getResult2() {
		return result2;
	}
	public void setResult2(String result2) {
		this.result2 = result2;
	}
	public Casino(String name, int number, String even, String odd, int ammount1, int ammount2, int ammount3,
			String result1, String result2) {
		super();
		this.name = name;
		this.number = number;
		this.even = even;
		this.odd = odd;
		this.ammount1 = ammount1;
		this.ammount2 = ammount2;
		this.ammount3 = ammount3;
		this.result1 = result1;
		this.result2 = result2;
	}
	public Casino() {
		super();
	}
	
}
