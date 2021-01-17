package dilshod.iskandarov.pizza_info;

public class Item {
    private int image;
    private String txt_0, txt_1, txt_2;

    public Item(int image, String txt_0, String txt_1, String txt_2) {
        this.image = image;
        this.txt_0 = txt_0;
        this.txt_1 = txt_1;
        this.txt_2 = txt_2;
    }

    public int getImage() {
        return image;
    }

    public String getTxt_0() {
        return txt_0;
    }

    public String getTxt_1() {
        return txt_1;
    }

    public String getTxt_2() {
        return txt_2;
    }
}
