public enum SingleTonEnum {
    INSTANCE;

    private static int count =0;
    private SingleTonEnum(){}

    public int getCount(){
        return this.count++;
    }


}

