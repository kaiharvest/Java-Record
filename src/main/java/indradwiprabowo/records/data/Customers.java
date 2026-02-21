package indradwiprabowo.records.data;

public record Customers(String id, String name, String email, String phone) implements SayHello {

    public Customers(String id, String name, String email, String phone) {
        System.out.println("Create Customer");
        this.id = id.toLowerCase();
        this.name = name;
        this.email = email != null ? email.toLowerCase() : null;
        this.phone = phone != null ? phone.toLowerCase() : null;
    }

    public Customers(String id, String name, String email) {
        this(id, name, email, null);
    }

    public Customers(String id, String name) {
        this(id, name, null, null);
    }

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", my Name is " + this.name;
    }
}
