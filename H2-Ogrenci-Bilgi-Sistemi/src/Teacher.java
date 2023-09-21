public class Teacher {
    // nitelikler:
    String name;
    String mpno;
    String branch;

    //Metot:
    Teacher(String name, String mpno,String branch) {
        // this.name yi parametle olarak aldığımız name eşitledik.
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

        void print(){
            System.out.println("Adı : " + this.name);
            System.out.println("tel no: "+this.mpno);
            System.out.println("branşı: "+this.branch);
        }
    }


