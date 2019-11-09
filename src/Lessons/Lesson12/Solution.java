package Lessons.Lesson12;

public class Solution {

    public int Salution(String s) {
        int pairs = 0;
        int employee = 0;
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.toUpperCase().charAt(i);
        }
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 'L':
                    pairs++;
                    break;
                case 'R':
                    pairs--;
                    break;
            }
            if (pairs == 0) {
                employee++;
            }
        }
        return employee;
    }

}
