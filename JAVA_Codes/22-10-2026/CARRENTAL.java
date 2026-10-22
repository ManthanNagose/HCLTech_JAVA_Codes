public class CARRENTAL{
    int carId;
    String carType;
    float rent;

    public void GetCar(int carId, String carType){
        this.carId = carId;
        this.carType = carType;
    }

    public float GetRent(){
        if(carType == "Small Car"){
            rent = 1000;
        }else if(carType == "VAn"){
            rent = 800;
        }else if( carType == "SUV"){
            rent = 2500;
        }
        return rent;
    }

    public void ShowCar(){
        System.out.println("carId is : " + carId);
        System.out.println("carType is : " + carType);
        System.out.println("car rent is : " + rent);
    }
}

class Main{
    public static void main(String [] args){
        CARRENTAL obj1 = new CARRENTAL();
        obj1.GetCar(101, "SUV");
        obj1.GetRent();
        obj1.ShowCar();
    }
}