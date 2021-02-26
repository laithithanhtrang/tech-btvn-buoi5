public class App {
    public static void main(String[] args) throws Exception {
        Student sv1 = new Student();
        sv1.code = 213294;
        sv1.name ="Lại Trang";
        sv1.theoryScore = 5;
        sv1.praticeScore = 8;
        sv1.averageScore();

        Student sv2 = new Student();
        sv2.code = 65583;
        sv2.name ="Mèo lớn";
        sv2.theoryScore = 9;
        sv2.praticeScore = 8;
        sv2.averageScore();

        Student sv3 = new Student();
        sv3.code = 213294;
        sv3.name ="Mèo nhỏ";
        sv3.theoryScore = 7;
        sv3.praticeScore = 8;
        sv3.averageScore();


        Student sv4 = new Student(49843, "Tororo", 5, 9);
        sv4.averageScore();
        
    }
}
