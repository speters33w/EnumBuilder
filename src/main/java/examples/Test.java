package examples;

public enum Test {

    ONE("My na\u00EFve fianc\u00E9's r\u00E9sum\u00E9", "c:\\users\\boopsie lindon\\documents\\my resume.doc", -2147483648),
    VALUE_2("TimJohnson@tim-computer-1234-zxcv", "/home/TimJohnson/", Integer.MAX_VALUE),
    VALUE_3_THREE("Double \"double\"", "toil 'and' \"trouble\"", 12345);

    private final String fileContents;
    private final String filePath;
    private final int interestingNumber;

    Test(String fileContents, String filePath, int interestingNumber) {
        this.fileContents = fileContents;
        this.filePath = filePath;
        this.interestingNumber = interestingNumber;
    }

    public String getFileContents() {
        return this.fileContents;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getInterestingNumber() {
        return this.interestingNumber;
    }

}
