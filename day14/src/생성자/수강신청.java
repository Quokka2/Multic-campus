package 생성자;

public class 수강신청 {
	
	String 과목;
	String 시간;
	String 수강생;
	
	public 수강신청(String 과목, String 시간, String 수강생) {

		this.과목 = 과목;
		this.시간 = 시간;
		this.수강생 = 수강생;
	}

	@Override
	public String toString() {
		return "수강신청 [과목=" + 과목 + ", 시간=" + 시간 + ", 수강생=" + 수강생 + "]";
	}
}
