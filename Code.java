//Number of substrings with only 1s

class Code{
    public int numSub(String s) {
        long count = 0, current = 0, mod = 1000000007;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                current++;
                count = (count + current) % mod;
            } else {
                current = 0;
            }
        }
        return (int) count;
    }
}
