package site.bulibucai.adapter.useextends;

import org.junit.Assert;
import org.junit.Test;

/** 
 * ChangeBannerDoubleTime Tester. 
 * 
 * @author  Huan-Rong[https://github.com/Huan-Rong]
 * @since Jun 13, 2018
 */ 
public class ChangeBannerDoubleTimeTest { 

    /**
     * 
     * Method: weak() 
     * 
     */ 
    @Test
    public void testWeak() throws Exception {
        ChangeText changeText = new ChangeBannerDoubleTime("remark");
        String dtRemark = changeText.weak();
        Assert.assertEquals("((remark))", dtRemark);
    }

    /** 
     * 
     * Method: strong() 
     * 
     */ 
    @Test
    public void testStrong() throws Exception {
        ChangeText changeText = new ChangeBannerDoubleTime("remark");
        String dtRemark = changeText.strong();
        Assert.assertEquals("**remark**", dtRemark);
    }
}
