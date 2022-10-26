package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /***
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param ???
     * @return ???
     ***/
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
		int x;
    	for (int i= 1; i <= 3; i++) {
			x = amount / 10 ;
			amount = amount - x ;
		}
		return(amount);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
