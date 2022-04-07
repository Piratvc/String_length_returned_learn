import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static int returnLastStringLength(String s) {
        String[] subStr = s.split(" ");
        return subStr[subStr.length - 1].length();
    }

    public static boolean checkWarningWords(String str) {
        ArrayList<WarningWordsType> arr = getList();
        for (WarningWordsType warningWordsType : arr)
            if (-1 != str.indexOf(warningWordsType.toString()))
                return true;
        return false;
    }

    public static void cicleCheck(String stringForReturn) throws Exception {


        if (Objects.equals(stringForReturn, "END")) {
            return;
        } else {
            if (checkWarningWords(stringForReturn)) {
                throw new Exception("Здесь так нельзя");
            } else {
                System.out.println(returnLastStringLength(stringForReturn));
            }
        }
    }

    private static ArrayList<WarningWordsType> getList() {
        return new ArrayList<>(Arrays.asList(WarningWordsType.values()));
    }

    public static void main (String[]args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи строку а я выведу длину последнего слова либо END для выхода");
        String stringForReturn = sc.nextLine();
        cicleCheck(stringForReturn);



    }
}