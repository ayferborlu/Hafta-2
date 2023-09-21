public class Course {
    /*Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()*/

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int sinavNotu;
    int sozluAgirlik;
    double ortalamaNot;



    Course(String name, String code,String prefix,int sozluAgirlik){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.sozluAgirlik = sozluAgirlik;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }
    }

    void printTeacher(){
        this.teacher.print();


    }

}
