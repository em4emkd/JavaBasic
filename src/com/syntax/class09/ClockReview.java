package com.syntax.class09;

public class ClockReview {

	public static void main(String[] args) {

		System.out.println("-----CLOCK-----");

		String time;

		for (int h = 0; h <= 23; h++) {

			for (int m = 0; m <= 59; m++) {

				if (h < 10 && m < 10) {
					time = "0" + h + ":" + "0" + m;
				} else if (h < 10 && m > 10) {
					time = "0" + h + ":" + m;
				} else if (h >= 10 && m < 10) {
					time = h + ":" + "0" + m;
				} else {
					time = h + ":" + m;
				}
				System.out.println(time);

			}

		}

		System.out.println("-----CLOCK 2-------");

		for (int a = 0; a <= 2; a++) {
			for (int b = 0; b <= 9; b++) {
				if (a == 2 && b == 4) {
					break;
				}
				for (int c = 0; c <= 5; c++) {
					for (int d = 0; d <= 9; d++) {
						System.out.println(" " + a + b + ":" + c + d);
					}
				}
			}
		}

	}

}
