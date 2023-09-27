package students.julija_pilenkova.homework.lesson_7;


public class WordService {
    public String findMostFrequentWord (String[] string) {
        String[] m = "abc abcde abcdef words abc abc g".split(" ");
        int[] k = new int[]{-1, 0};
        for (int i = 0; i < m.length; i++) {
            if (!m[k[1]].equals(m[i]) || k[0] < 0) {
                int c = 1;
                for (int p = i + 1; p < m.length; p++) {
                    if (m[i].equals(m[p])) {
                        c++;
                    }
                }
            }
        }
        return m[k[1]];
    }
}