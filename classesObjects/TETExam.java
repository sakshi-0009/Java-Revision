package ClassesObjects;

public class TETExam {

	String exam_name = "TET";
	int candidates = 25000;
	
	TETExam(){
		System.out.println("Exam details: ");
	}
	void Exam(){
		System.out.println("Exam name: "+exam_name);
		System.out.println("Appeared candidates: "+candidates);
	}
	
	public static void main(String[] args) {
	
		TETExam exam = new TETExam();
		exam.Exam();
	}
}
