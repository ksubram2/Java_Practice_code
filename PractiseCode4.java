public class PractiseCode4 {

    private int StudentId;
    private String name;
    private float qualifyingExamMark;
    private char residentialStatus;
    private int yearofEngg;

    public int getStudentId(){
        return StudentId;
    }
    public void setStudentId(int StudentId){
        this.StudentId = StudentId;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public float getqualifyingExamMark(){
        return qualifyingExamMark;
    }
    public void setqualifyingExamMark(float qualifyingExamMark){
        this.qualifyingExamMark = qualifyingExamMark;
    }
    public char getresidentialStatus(){
        return residentialStatus; 
    }
    public void setresidentialStatus(char residentialStatus){
        this.residentialStatus = residentialStatus;
    }
    public int getyearofEngg(){
        return yearofEngg;
    }
    public void setyearofEngg(int yearofEngg){
        this.yearofEngg = yearofEngg;
    }


    public static void main(String[] args){
        PractiseCode4 studentInfo = new PractiseCode4();
        studentInfo.setStudentId(3001);
        studentInfo.setname("Kamal");
        studentInfo.setqualifyingExamMark(60);
        studentInfo.setresidentialStatus('H');
        studentInfo.setyearofEngg(3);
        System.out.println("Student Name        :" + "\t" +studentInfo.getStudentId());
        System.out.println("Name                :" + "\t" + studentInfo.getname());
        System.out.println("QualifyingExamMark  :" + "\t"+  studentInfo.getqualifyingExamMark());
        System.out.println("Year of Engineering :"+ "\t" + studentInfo.getyearofEngg());
        if(studentInfo.getresidentialStatus()=='D')
         System.out.println("Residential Status  :" + "\t" +"Dayscholar");
        else
          System.out.println("Residential Status  :" + "\t" +"Hostellors"); 

    }

}
