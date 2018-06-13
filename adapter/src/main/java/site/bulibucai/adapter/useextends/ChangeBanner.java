package site.bulibucai.adapter.useextends;


/**
 * @author HuanRong[https://github.com/Huan-Rong]
 */
public class ChangeBanner extends Banner implements ChangeText {
    public ChangeBanner(String remark) {
        super(remark);
    }

    public String weak() {
        return withParen();
    }

    public String strong() {
        return withAsterisk();
    }
}
