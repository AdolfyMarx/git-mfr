public class RtoLReader {

    private String string;
    private String revString;

    public RtoLReader(String string) {
        this.string = string;
    }

    public String LtoR () {
        return this.string;
    }

    public String RtoL () {
        char[] charArr = string.toCharArray();
        char[] revCharArr = new char[string.length()];
        int top = charArr.length - 1;
        for (int i = 0; i < charArr.length; i++) {
            revCharArr[i] = charArr[top--];
        }
        revString = String.valueOf(revCharArr);
        return revString;
    }
}
