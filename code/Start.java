class Start {
    public static void main(String[] data) {
        int value = 8;
	int[] stamp = { 5, 4, 1 };      // must be sorted in descending order
	for(int i = 0; i < stamp.length; i++) {
            int use = value / stamp[i];
            System.out.println("Stamp " + stamp[i] + " use " + use + " item(s).");
            value = value - use * stamp[i];
	}
    }
}
