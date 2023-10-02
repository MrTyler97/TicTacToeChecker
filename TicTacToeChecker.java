//package stuff;

public class LabProject1 {

	public static void main(String[] args) {
		char[][] tictac = { 
				{ ' ', 'o', 'o' }, 
				{ 'x', 'x', 'x' }, 
				{ 'o', 'x', 'o' } };
		System.out.println(checkBoard(tictac));
	}

	public static String checkBoard(char[][] a) {
		String ingame = "In game";
		String xWon = "X win's";
		String oWon = "O win's";
		String tie = "Game is a tie";
		String x = "";
		String o = "";
		for (int i = 0; i < 3; i++) { // horizontal check
			if (x.length() == 3) {
				return xWon;
			}
			if (o.length() == 3) {
				return oWon;
			}
			x = ""; //reset
			o = "";
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 'x') {
					x += a[i][j];
				} else if (a[i][j] == 'o') {
					o += a[i][j];
				}
			}
			if (x.length() == 3) { // Implemented to catch the last check in third row
				return xWon;
			}
			if (o.length() == 3) {
				return oWon;
			}
		}
		x = ""; //reset
		o = "";
		for (int i = 0; i < 3; i++) { // vertical check
			if (x.length() == 3) {
				return xWon;
			}
			if (o.length() == 3) {
				return oWon;
			}
			x = ""; //reset
			o = "";
			for (int j = 0; j < 3; j++) {
				if (a[j][i] == 'x') {
					x += a[j][i];
				} else if (a[j][i] == 'o') {
					o += a[j][i];
				}
			}
		}
		if (x.length() == 3) { // Implemented to catch the last check in third column
			return xWon;
		}
		if (o.length() == 3) {
			return oWon;
		}
		x = ""; //reset
		o = "";

		if (a[0][0] == 'x' & a[1][1] == 'x' & a[2][2] == 'x' || // Diagonal check
				a[0][2] == 'x' & a[1][1] == 'x' & a[2][0] == 'x') {
			return xWon;
		} else if (a[0][0] == 'o' & a[1][1] == 'o' & a[2][2] == 'o'
				|| a[0][2] == 'o' & a[1][1] == 'o' & a[2][0] == 'o') {
			return oWon;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == ' ') {
					return ingame;
				}
			}
		}
		return tie;
	}
					//I added print statements after every check to find all errors and see exactly where the issue is
}
