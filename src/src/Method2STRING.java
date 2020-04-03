public class Method2STRING {
    public static void main(String[] args) {
        //String text1="666";
        System.out.println(printSeveralNumbers(6,3));
    }

    static String printSeveralNumbers(int число, int количествоРаз) {
        String результат = "";
        for (int i = 0; i < количествоРаз; i++) {
            результат = результат + число;
        }
        return результат;
    }
}
