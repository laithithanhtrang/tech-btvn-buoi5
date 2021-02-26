public class Student {
    public int code;
    public String name;
    public float theoryScore;
    public float praticeScore;

    public Student(){
        System.out.println("Goi toi Constructor mac dinh");
    }

    public Student(int code, String name, float theoryScore, float praticeScore) {
        this.code = code;
        this.name = name;
        this.theoryScore = theoryScore;
        this.praticeScore = praticeScore;
    }
    public void averageScore() {
        System.out.println("Điểm trung bình của sinh viên " + name + " là " + (theoryScore + praticeScore)/2);
    }
}
