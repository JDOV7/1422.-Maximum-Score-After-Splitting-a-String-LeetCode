package leetcode;

public class MaximumScoreAfterSplittingaString1422 {

    public void MaximumScoreAfterSplittingaString1422() {
        String s = "011101";
        int iMaximun = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((contTotalValue(s.substring(0, i + 1), '0') + contTotalValue(s.substring(i + 1), '1')) > iMaximun) {
                iMaximun = (contTotalValue(s.substring(0, i + 1), '0') + contTotalValue(s.substring(i + 1), '1'));
            }
        }
        System.out.println(iMaximun);
    }

    public int contTotalValue(String sValue, char character) {
        int iCont = 0;
        for (char c : sValue.toCharArray()) {
            if (c == character) {
                iCont++;
            }
        }
        return iCont;
    }
}
