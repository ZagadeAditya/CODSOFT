import java.util.Scanner;

class studentGradeCalculator{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String subjects[]= {"English","Maths","Hindi","Marathi","Sanskrit"};
        int sum=0;
        double percentage=0;
        for(int i=0;i<subjects.length;i++){
            System.out.println("Enter the marks for "+subjects[i]+" subject");
            int marks=sc.nextInt();
            sum=sum+marks;
        }
        percentage=sum/subjects.length;
        char grade;

        if(percentage>90){
            grade='A';
        }
        else if(percentage<90 && percentage>80){
            grade='B';
        }
        else if(percentage<80 && percentage>70){
            grade='C';
        }
        else if(percentage<70 && percentage>60){
            grade='D';
        }
        else if(percentage<60 && percentage>50){
            grade='E';
        }
        else{
            grade='F';
        }

        System.out.println("Total Marks= "+sum);
        System.out.println("Total Percentage= "+percentage);
        System.out.println("Your Grade is "+grade);
    }
}