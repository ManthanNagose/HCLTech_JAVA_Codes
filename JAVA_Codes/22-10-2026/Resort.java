public class Resort{
    int roomNo;
    String name;
    float charges;
    int days;

    public void Getinfo(int roomNo, String name, float charges, int days){
        this.roomNo = roomNo;
        this.charges = charges;
        this.days = days;
        this.name = name;
    }

    public void Compute(){
        float amount = days * charges;

        if(amount > 11000){
            amount *= 1.02;
        }
        System.out.println("Total Amount is : " + amount);
    }

    public void Dispinfo(){
        System.out.println("Name : " + name);
        System.out.println("Room Number : " + roomNo);
        System.out.println("Charges : " + charges);
        System.out.println("Days : " + days);
        Compute();
    }

}
class Main {
    public static void main(String[] args) {
        Resort obj = new Resort();
        obj.Getinfo(101, "John", 1500, 8);
        obj.Dispinfo();
    }
}