public class Books {
    private String name;
    private int pages_num;

    public Books(String name, int pages_num) {
        this.name = name;
        this.pages_num = pages_num;
    }

    public String getName() {
        return name;
    }

    public int getPages_num() {
        return pages_num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages_num(int pages_num) {
        this.pages_num = pages_num;
    }
}
