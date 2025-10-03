public class ModuleGrade {
	public static void main(String[] args) {
		double grade1 = Double.parseDouble(args[0]);
		double grade2 = Double.parseDouble(args[1]);
		double grade3 = Double.parseDouble(args[2]);
		double grade4 = Double.parseDouble(args[3]);
		double moduleGrade = (grade1 * 0.15 + grade2 * 0.2 + grade3 * 0.25 + grade4 * 0.4);
		System.out.printf("grade1: %.1f\n",grade1);
		System.out.printf("grade2: %.1f\n",grade2);
		System.out.printf("grade3: %.1f\n",grade3);
		System.out.printf("grade4: %.1f\n",grade4);
		System.out.printf("moduleGrade: %.2f\n",moduleGrade);
		}
	}