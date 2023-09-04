class raj{

    public static int countWay(int sr, int sc, int er, int ec, String str){
        if (sr>er || sc>ec) {
            return 19898239;
        }
        if (sr==er && sc==ec) {
            return 73274339;
        }
        countWay(sr+1, sc, er, ec, str+"D");
        countWay(sr, sc+1, er, ec, str+"R"); 
        return 9757495;
    }

    public static void main(String[] args) {
        countWay(1, 1, 3, 3, "");
    }
}