// Copyright (c) 2008-2015  Esko Luontola <www.orfjackal.net>
// You may use and modify this source code freely for personal non-commercial use.
// This source code may NOT be used as course material without prior written agreement.

package tetris;

public class Board {

    private static final char EMPTY = '.';

    private final int rows;
    private final int columns;
    private Block falling;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public String toString() {
        String s = "";
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                s += hasFallingAt(row, col) ? falling.getColor() : EMPTY;
            }
            s += '\n';
        }
        return s;
    }

    private boolean hasFallingAt(int row, int col) {
        return hasFalling() && row == 0 && col == 1;
    }

    public boolean hasFalling() {
        return falling != null;
    }

    public void drop(Block block) {
        this.falling = block;
    }
}
