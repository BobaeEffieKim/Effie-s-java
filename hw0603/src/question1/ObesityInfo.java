package question1;

public class ObesityInfo extends StandardWeightInfo {

	ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	public double getObesity() {
		double obesity = (super.getWeight() - getStandardWeight()) / getStandardWeight() * 100;
		return obesity;
	}

	@Override
	public void getInformation() {
		System.out.println(name + "님의 신장은 " + height + "cm이고, 몸무게는 " + weight + "," + bmiCheck()+"입니다.");

	}

	String bmiCheck() {
		double bmi = getObesity();
		String result;
		if (bmi <= 18.5) {
			result = "저체중";
		} else if (18.5 < bmi && bmi < 23.0) {
			result = "정상";
		} else if (23.0 <= bmi && bmi < 25.0) {
			result = "과체중";
		} else if (25.0 <= bmi) {
			result = "비만";
		} else {
			result = "BMI 측정 오류";

		}
		return result;
	}

}
