public class Main {
    public static void main(String[] args) {

        VipCustomer tim = new VipCustomer();
        System.out.println(tim.getName());

        VipCustomer bob = new VipCustomer("Bob",250.0, "email" );
        System.out.println(bob.getCreditLimit());

        VipCustomer jack = new VipCustomer("Jack", 240.0);
        System.out.println(jack.getName());
    }
}
