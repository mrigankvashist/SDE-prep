class consecutivechar {
    public int maxPower(String s) {
        int max = 1;
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr == prev) {
                cnt++;
            } else {
                cnt = 1;
            }
            if (cnt > max) {
                max = cnt;
            }

        }
        return max;

    }
}
