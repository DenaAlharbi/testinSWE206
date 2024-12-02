public class Course {
    String grade = null;
    public void calculateGrade(int x){
        if(x<0){
            throw new IllegalArgumentException("Can not be negative");
        } else if (x<=59) {
            grade="F";
        }else if (x<=69 ) { //x>=60 is always right when reached
            grade = "D";
        }else if (x<=79 ) { //x>=60 is always right when reached
            grade = "C";
        }else if (x<=89 ) { //x>=60 is always right when reached
            grade = "B";
        }else if (x<=100 ) { //x>=60 is always right when reached
            grade = "A";
        }else { //x>=60 is always right when reached
            System.out.println("False. Invalid input");
        }
    }
}
