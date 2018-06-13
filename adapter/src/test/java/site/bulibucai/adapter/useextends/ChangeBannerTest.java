package site.bulibucai.adapter.useextends;

import org.junit.Assert;
import org.junit.Test;

/** 
 * ChangeBanner Tester. 
 * 
 * @author  Huan-Rong[https://github.com/Huan-Rong]
 * @since Jun 13, 2018
 */ 
public class ChangeBannerTest { 

    /**
     * 
     * Method: weak() 
     * 
     */ 
    @Test
    public void testWeak() throws Exception {
        ChangeText changeText = new ChangeBanner("a test remark");
        String weakRemark = changeText.weak();
        Assert.assertEquals("(a test remark)", weakRemark);
    }

    /** 
     * 
     * Method: strong() 
     * 
     */ 
    @Test
    public void testStrong() throws Exception {
        ChangeText changeText = new ChangeBanner("a test remark");
        String strongRemark = changeText.strong();
        Assert.assertEquals("*a test remark*", strongRemark);
    }


} 
