public class CodeWordChecker implements StringChecker {
    private String str;
    private String str2;
    private int one;
    private int two;

    public CodeWordChecker(int one, int two, String str2)
    {
        this.one= one;
        this.two= two;
        this.str2= str2;
    }

    public CodeWordChecker(String str2)
    {
        this.one=6;
        this.two=20;
        this.str2=str2;
    }

}
