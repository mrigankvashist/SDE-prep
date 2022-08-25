class poweroftwo {
    // and of n and n-1 returns 0, since there is only 1 occurence of 1(in binary sequence)
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) { // less than equal to 0 (-ve numbers are not in pow)
            return false;
        }
        int nm1 = n - 1;
        if ((nm1 & n) == 0) {
            return true;
        } else
            return false;

    }
}
