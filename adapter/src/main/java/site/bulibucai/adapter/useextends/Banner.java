package site.bulibucai.adapter.useextends;

/**
 * @author HuanRong[https://github.com/Huan-Rong]
 */
public class Banner {

    private String remark;

    public Banner(String remark) {
        this.remark = remark;
    }

    public String withParen() {
        return "(" + remark + ")";
    }

    public String withAsterisk() {
        return "*" + remark + "*";
    }
}
