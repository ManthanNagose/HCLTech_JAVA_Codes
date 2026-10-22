public class Candidate {
    int rollNo;
    String name;
    float score;
    String reMark;

    public void AssignRem(float score){
        if(score >= 50){
            reMark = "Selected";
        }else{
            reMark = "Not Selected";
        }
    }

    //setter
    public void Enter(int rollNo, float score, String name){
        this.name = name;
        this.rollNo = rollNo;
        this.score = score;
        AssignRem(score);
    }

    public void Display(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Score : " + score);
        System.out.println("ReMark : " + reMark);
    }
}

class Main{
    public static void main(String [] args){
        Candidate obj = new Candidate();
        obj.Enter(21, 51, "Mohan");
        obj.Display();
    }
}