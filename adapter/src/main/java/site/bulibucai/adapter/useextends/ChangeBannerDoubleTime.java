package site.bulibucai.adapter.useextends;

/**
 * @author HuanRong[https://github.com/Huan-Rong]
 */
public class ChangeBannerDoubleTime extends Banner implements ChangeText {
    public ChangeBannerDoubleTime(String remark) {
        super(remark);
    }

    public String weak() {
        return "(" + withParen() + ")";
    }

    public String strong() {
        return "*" + withAsterisk() + "*";
    }
}
