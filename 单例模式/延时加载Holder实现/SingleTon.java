public class SingleTon {
    private SingleTon(){}

    private static class SingleTonHolder{
        private static SingleTon instance = new SingleTon();
    }

    public static SingleTon getInstance() {
        return SingleTonHolder.instance;
    }
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();
        System.out.println(singleTon == singleTon2);
    }

}
