package leetcode.easy.lc2678;

public class Lc2678 {
    public int countSeniors(String[] details) {
        int seniors = 0;

        for (int i = 0; i < details.length; i++) {
            System.out.println(Integer.parseInt(details[i].substring(11, 13)));
            if (Integer.parseInt(details[i].substring(11, 13)) > 60) {
                seniors++;
            }
        }

        return seniors;
    }
}
