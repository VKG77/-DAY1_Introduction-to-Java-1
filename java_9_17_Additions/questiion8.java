package java_9_17_Additions;

public class questiion8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource = new Resource();
        try(resource){
            resource.display();
        }catch(Exception ex){

        }
	}

}
class Resource implements AutoCloseable{
    public Resource() {
        System.out.println("Resource created");
    }

    public void display() {
        System.out.println("Resource displayed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource close method invoked");
    }
}
