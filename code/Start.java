class Start {
	public static void main(String[] data) {
		double[][] map = new double[4][5];      // value of each cell is 0.0
		map[0][1] = 7.6;
		map[1][1] = 7.9;
		map[2][1] = 8.5;
		map[3][1] = 8.3;

		System.out.println(map[2][1]);    // 8.5
		System.out.println(map[1][3]);    // 0.0

		// Given a 4x5 matrix, write code to find the sum
		// of each cell in column 1
                double result = 0.0;
                for (int i = 0; i < map.length; i++) {
                    for (int j = 1; j < map.length; j++) {
                        result += map[i][j];
                    }
                }
                
                System.out.println("Result is " + result);

	}
}
