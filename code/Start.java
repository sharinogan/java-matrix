class Start {
	public static void main(String[] data) {
		double[][] map = new double[4][5];      // value of each cell is 0.0
 
                // Given a square matrix, write code
                // to print all cells in main diagonal
                double[][] m = new double[37][37];
                map[0][1] = 9.2;
		map[1][1] = 8.7;
		map[2][2] = 8.9;

                for (int i = 0; i < map.length; i++) {
                    System.out.println(map[i][i]);
                }

	}
}
