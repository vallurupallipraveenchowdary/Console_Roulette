package com.casino;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class CalculateBetting extends TimerTask {

	int[] a = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
			26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 };
	String even, odd;
	String result1 = "WIN";
	String result2 = "LOSE";
	String en = "even";
	String od = "odd";
	int k, q,l;

	public void run() {
		Random rnd = new Random();
		int no = a[rnd.nextInt(a.length)];

		File file = new File("C:\\Users\\sai\\Desktop\\Console-Roulette\\src\\names.txt");
		Scanner scn = null;
		try {
			scn = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (scn.hasNextLine())
			System.out.println(scn.nextLine());
		Scanner scn1 = new Scanner(System.in);
		System.out.print("Place your bet (even or odd) : ");
		String s = scn1.nextLine();
		String s1 = s;
		System.out.print("Place your bet : ");
		int amt1 = scn1.nextInt();
		System.out.print("Place your bet between Number (1-36) : ");
		int i1 = scn1.nextInt();
		System.out.print("Place your bet : ");
		int amt = scn1.nextInt();

		if (no % 2 == 0) {
			even = en;
		} else {
			odd = od;
		}
		if (no == 0) {
			int m = no;
			System.out.println("you lost the bet" + m);
		} else if (no == i1) {
			k = amt * 36;
		} else {
			k = 0;
		}
		if (s.equals(even)) {
			q = amt1 * 2;
			// } else if (s.equals(odd)) {
			// q = amt1 * 2;
			
		} else {
			q = 0;
		}
		if (s.equals(odd)) {
			l = amt1 * 2;
		} else {
			l = 0;
		}
		System.out.println("The value of result2 :" + q);

		ArrayList<Casino> casino = new ArrayList<Casino>();
		casino.add(new Casino("Tiki_monkey", i1, s, s1, k, q,l, result1, result2));
		System.out.println("Number :" + no);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.printf("%10s %30s %20s %5s", "Player", "Bet", "Outcomes", "Winnings");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		for (Casino casino1 : casino) {
			if (i1 == no & s.equals(even)) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult1(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getEven(), casino1.getResult1(),
						casino1.getAmmount2());
				System.out.println();
			} else if (i1 == no & s.equals(odd)) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult1(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getOdd(), casino1.getResult1(),
						casino1.getAmmount3());
				System.out.println();
			} else if (i1 != no & s.equals(odd)) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult2(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getOdd(), casino1.getResult1(),
						casino1.getAmmount3());
				System.out.println();
			} else if (i1 != no & s.equals(even)) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult2(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getEven(), casino1.getResult1(),
						casino1.getAmmount2());
				System.out.println();
			}else if (i1 != no & s.equalsIgnoreCase(even)) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult2(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getOdd(), casino1.getResult1(),
						casino1.getAmmount3());
				System.out.println();
			}else if (i1 != no & s.equalsIgnoreCase(odd)) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult2(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getEven(), casino1.getResult1(),
						casino1.getAmmount2());
				System.out.println();
			}  else if (!(i1 != no && s.equals(odd))) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult2(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getOdd(), casino1.getResult2(),
						casino1.getAmmount3());
				System.out.println();
			} else if (!(i1 != no && s.equals(even))) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult2(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getEven(), casino1.getResult2(),
						casino1.getAmmount2());
				System.out.println();
			} else if (i1 == no & s.equals(odd)) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult1(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getOdd(), casino1.getResult1(),
						casino1.getAmmount3());
				System.out.println();
			} else if (i1 == no & s.equals(even)) {
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getNumber(), casino1.getResult1(),
						casino1.getAmmount1());
				System.out.println();
				System.out.format("%10s %30s %20s %5d ", casino1.getName(), casino1.getEven(), casino1.getResult1(),
						casino1.getAmmount2());
				System.out.println();
			} else {
				System.out.println();
			}

			System.out.println("-----------------------------------------------------------------------------");
		}
	}

	public static void main(String[] args) {

		Timer timer = new Timer();
		TimerTask task = new CalculateBetting();

		timer.schedule(task, 0, 30000);

	}

}
