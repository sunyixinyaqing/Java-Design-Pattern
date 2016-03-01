import org.junit.Test;

public class SingleTonEnumTest {

    @Test
    public void testGetCount() {
        SingleTonEnum singleTon = SingleTonEnum.INSTANCE;
        SingleTonEnum singleTon2 = SingleTonEnum.INSTANCE;
        System.out.println(singleTon.getCount());
        System.out.println(singleTon2.getCount());
    }

}

