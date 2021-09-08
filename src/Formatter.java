import java.text.DecimalFormat;

public class Formatter {

    private static String getTrimmedFloatString(double number) {
        number = 51.9;
        StringBuilder sb = new StringBuilder();
        sb.append(new DecimalFormat("#.##").format(number));
        if (sb.toString().contains(".")) {
            int index = sb.indexOf(".");
            if ((sb.toString().length() - 1) - index < 2)
                for (int i = index; i <= index; i++) {
                    sb.append("0");
                }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getTrimmedFloatString(50.8));
    }
}
