class Main{
    public static void main(String[] args) {
        Student oumami = new Student(7,"Chinnapat",2546,1.77);
    oumami.ShowDetails();  
    oumami.Setting(5, "haha", 3022, 2.99);   
    oumami.ShowDetails(); 
    }
}

class Student{

    private int ID;
    private String Name;
    private int AddmissionYear;
    private double GPA;

    Student(int ID , String Name , int AddmissionYear , double GPA){
        this.ID = ID;
        this.Name = Name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA;
    }

    public void ShowDetails(){
        System.out.println("ID : " + this.ID);
        System.out.println("Name : " + this.Name);
        System.out.println("Addmission Year : " + this.AddmissionYear);
        System.out.println("GPA : " + this.GPA);
    }

    public void Setting(int ID , String Name , int AddmissionYear , double GPA){
        this.ID = ID;
        this.Name = Name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA; 
    }
}