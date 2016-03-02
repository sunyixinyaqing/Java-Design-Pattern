public class ProxyObject implements AbstractObject {
    private RealObject realObject = new RealObject();
    
    @override 
    public void operation() {
        System.out.println("before");
        realObject.operation();
        System.out.println("after")
        
    }
}
