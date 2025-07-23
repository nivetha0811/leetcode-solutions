class Solution {
    public int maximumGain(String S, int X, int Y) {
        char a = 'a', b = 'b';
        int ans = 0, aStore = 0, bStore = 0;
        if (Y > X) {
            char ctemp = a;
            a = b;
            b = ctemp;
            int itemp = X;
            X = Y;
            Y = itemp;
        }
        for (char c: S.toCharArray())
            if (c == a) aStore++;
            else if (c == b)
                if (aStore > 0) {
                    ans += X;
                    aStore--;
                } else bStore++;
            else {
                ans += Y * Math.min(aStore, bStore);
                aStore = bStore = 0;
            }
        return ans + Y * Math.min(aStore, bStore);
    }
}