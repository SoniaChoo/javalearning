/*
class Single {
    private static Single s = new Single();
    private Single(){}
    public static Single getInstance() {
        return s;
    }
}
*/

class Single {
    private static Single s = null;
    private Single(){}
    public static Single getInstance() {
        if (s == null) {
            Sychronized(Single.class) {
                if (s == null) {
                    s = new Single();
                }
            }
        }
        return s;
    }
}
