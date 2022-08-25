class Start {
    public static void main(String[] data) {
        int value = 12;
	int[] stamp = { 1, 4, 5 };      // must be sorted in descending order
	
        int[][] best = new int[value + 1][stamp.length];
        // fill the first column (column 0)
        for(int i = 0; i < best.length; i++) {
            best[i][0] = i;
            //      '------------> first column            
        }
        
        // fill column-by-column
        for(int c = 1; c < stamp.length; c++) {
            for (int i = 0; i < best.length; i++) {
                // choose the best between left cell, top call
                int left = best[i][c-1];
                int last_layer = i - stamp[c];
                if (last_layer < 0) {
                    // there is only one choice: the left cell
                    best[i][c] = left;
                }
                if (last_layer >= 0) {
                    // there are two choices: left and above
                    int above = best[last_layer][c] + 1;
                                // Use 1 stamp -------'
                    best[i][c] = left < above ? left : above;
                }
            }           
        }
        System.out.println(best[8][2]);   // 2 --> 4 + 4
        System.out.println(best[10][2]);  // 2 --> 5 + 5
    }
}
