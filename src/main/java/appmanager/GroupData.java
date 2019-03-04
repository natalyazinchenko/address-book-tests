package appmanager;

public class GroupData {
    private final String header;
    private final String footer;

    public GroupData(String header, String footer) {
        this.header = header;
        this.footer = footer;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
