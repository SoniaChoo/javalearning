class AException extends Exception {

}
class BException extends AException {

}
class CException extends Exception {

}

class Fu {
    void show() throws AException {

    }
}
class Test {
    void function(Fu f) {
        try {
            f.show();
        }
        catch(AException e) {

        }
    }
}

class Zi extends Fu {
    void show() throws BException {
        try {
            throw new CException();
        }
        catch (CException e) {
            System.out.println(e.toString());
        }
    }
}

class ExceptionDemo7 {
    public static void main(String[] args) {
        Test t = new Test();
        t.function(new Zi());
    }
}