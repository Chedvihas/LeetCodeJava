class FurthestPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int cL = 0, cR = 0;
        int n = moves.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (moves.charAt(i) == 'L') {
                cL++;
            } else if (moves.charAt(i) == 'R') {
                cR++;
            }
        }

        if (cL > cR) {
            ans = cL - cR;
        } else {
            ans = cR - cL;
        }
        // the lenght of string is n- it consists of Ls, Rs and _s
        //x + cL+ cR = n
        //x = n-CR-CL
        //ans = ans+x
        // ans  = ans + (n- cR-cL)
        //ans+=(n-cR-cL)
        ans += (n - cR - cL);

        return ans;
    }

    public static void main(String[] args) {
        FurthestPointFromOrigin solution = new FurthestPointFromOrigin();

        // Example test cases
        System.out.println(solution.furthestDistanceFromOrigin("L_RL__R")); // Output: 3 // LRRLRRR
        System.out.println(solution.furthestDistanceFromOrigin("_R__LL_")); // Output: 5 //LRLLLLL
    }
}
