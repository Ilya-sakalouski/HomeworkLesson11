package src.task1;

public class Task1 {

    public static String part1(String s) {
        String[] newString = s.split("-");
        return newString[0] + "-" + newString[2];
    }

    public static String part2(String s) {
        String[] newString = s.split("-");
        return s.replace(newString[1], "***").replace(newString[3], "***");
    }

    public static String part3(String s) {
        StringBuffer sb = new StringBuffer(s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", ""));
        return String.valueOf(sb.insert(3, "/").insert(7, "/").insert(9, "/"));
    }

    public static String part4(String s) {
        StringBuilder sbd = new StringBuilder(s.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", ""));
        return String.valueOf(sbd.insert(3, "/").insert(7, "/").insert(9, "/").insert(0, "Letters:"));
    }

    public static String part5(String s) {
        s.toLowerCase();
        if (s.contains("abc")) {
            return String.valueOf(s.contains("abc"));
        } else try {
            throw new ABCNotFoundExeption();
        } catch (ABCNotFoundExeption e) {
            throw new RuntimeException(e);
        }
    }

    public static String part6(String s) {
        if (s.startsWith("555")) {
            return String.valueOf(s.startsWith("555"));
        } else try {
            throw new FFFNotFoundExepton();
        } catch (FFFNotFoundExepton e) {
            throw new RuntimeException(e);
        }
    }

    // TODO: part7 cпециально сделал через сигнатуру метода
    public static String part7(String s) throws NotFound1a2bExeption {
        if (!s.endsWith("1a2b")) {
            throw new NotFound1a2bExeption();
        }else return String.valueOf(s.endsWith("1a2b"));
    }
}
