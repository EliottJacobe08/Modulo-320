public class SwapValue {
    public static void main(String[] args) {
		//Before
        int varA = 1;
        int varB = 2;
        System.out.println("Before the swap");
        System.out.println("varA = " + varA + " and varB = " + varB);
        //swap di variabili
		int Swap = varA;
        varA = varB;
        varB = Swap;
        System.out.println("After the swap");
        System.out.println("varA = " + varA + " and varB = " + varB);
    }
}
