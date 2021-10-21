public class Student {
    String name, studentNo;
    int math, phy, che, examMat, examPhy, examChe;
    double mathAvrg, phyAvrg, cheAvrg, avarage;

    Student(String name, String studentNo, int math, int phy, int che, int examMat, int examPhy, int examChe){
        this.name = name;
        this.studentNo = studentNo;
        this.math = math;
        this.phy = phy;
        this.che = che;
        this.examMat = examMat;
        this.examPhy = examPhy;
        this.examChe = examChe;
        calcAvarage();
    }
    
    public void calcAvarage(){
        this.mathAvrg = (math + examMat) / 2;
        this.phyAvrg = (phy + examPhy) / 2;
        this.cheAvrg = (che + examChe) / 2;

        System.out.println("Student number " + studentNo + "\n" +
                 "Math avarage\t:" + this.mathAvrg + "\n" +
                "Physical avarage\t:" + this.phyAvrg + "\n" +
                "Chemistry avarage\t:" + this.cheAvrg + "\n");
    }

    public void classAch(){
        avarage = (this.mathAvrg + this.phyAvrg + this.cheAvrg) / 3;
      
        if(avarage >= 50){
            System.out.println("Student number " + studentNo + "\n" +
                    "You have successfully passed the class!!!\n");
        }
        else{
            System.out.println("Student number " + studentNo + "\n" +
                    "You didn't pass the class...\n");
        }
    }
}
