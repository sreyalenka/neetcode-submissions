class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            val rowSet = mutableSetOf<Char>()
            for (j in 0 until 9) {
                if (board[i][j] in rowSet) {
                    return false
                } else if (board[i][j] == '.') {
                    continue
                } else {
                    rowSet.add(board[i][j])
                }
            }
        }

        for (i in 0 until 9) {
            val colSet = mutableSetOf<Char>()
            for (j in 0 until 9) {
                if (board[j][i] in colSet) {
                    return false
                } else if (board[j][i] == '.') {
                    continue
                } else {
                    colSet.add(board[j][i])
                }
            }
        }

        for (square in 0 until 9) {
            val squareSet = mutableSetOf<Char>()
            for (i in 0 until 3) {
                for (j in 0 until 3) {
                    val row = (square / 3) * 3 + i
                    val col = (square % 3) * 3 + j
                    if (board[row][col] in squareSet) {
                        return false
                    } else if (board[row][col] == '.') {
                        continue
                    } else {
                        squareSet.add(board[row][col])
                    }
                }
            }
        }
        return true
    }
}
