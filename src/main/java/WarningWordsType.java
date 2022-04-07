public enum WarningWordsType {
    WORD1 ("Овальный"),
    WORD2 ("Война"),
    WORD3 ("Взрыв");

    private String string;

    WarningWordsType(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }

}
