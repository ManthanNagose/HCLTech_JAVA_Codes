public class Supply {
    int code;
    String foodName;
    String Sticker;
    String foodType;

    public void GetType(String Sticker){
        if(Sticker == "Green"){
            foodType = "Vegetarian";
        }else if(Sticker == "Yellow"){
            foodType = "Contains Egg";
        }else if(Sticker == "Red"){
            foodType = "Non Vegetarian";
        }
        System.out.println("Your FoodType is : " + foodType);
    }

    public void foodIn(int code, String Sticker, String foodName){
        this.code = code;
        this.Sticker = Sticker;
        this.foodName = foodName;
    }

    public void FoodOut(){
        System.out.println("Code : " + code);
        System.out.println("FoodName : " + foodName);
        System.out.println("sticker: " + Sticker);
        System.out.println("FoodType : " + foodType);
    }
}

class Main{
    public static void main(String[] args){
        Supply obj = new Supply();
        obj.GetType("Red");
        obj.foodIn(101,"Red","Biryani");
        obj.FoodOut();

    }
}
