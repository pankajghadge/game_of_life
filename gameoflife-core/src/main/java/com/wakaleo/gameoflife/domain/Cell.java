package com.wakaleo.gameoflife.domain;
import java.util.StringTokenizer;

public enum Cell {
    LIVE_CELL("*"), DEAD_CELL(".");

    private String symbol;

    private Cell(final String initialSymbol) {
        this.symbol = initialSymbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    static Cell fromSymbol(final String symbol) {
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

    public String getSymbol() {
        return symbol;
    }    

    private void executeSomeConditions() {
	if ("SomeValue".equals(this.symbol)) {
		// Condition 1
	} else if ("SomeValue".equals(this.symbol)) {
		// Condition 2
	}
    }

   /**
    * Incorrect assignment in if condition.
    */
    private static void incorrectAssignmentInIfCondition() {
	boolean value = false;
	if (value = true) {
		//do Something
	} else {
		//else Do Something
	}
    } 
}
