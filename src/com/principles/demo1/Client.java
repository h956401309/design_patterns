package com.principles.demo1;
/**
 * @Author huzc
 * @Description 开闭原则
 * @Date   11:58
 * @Param * @param null  
 * @return * @return {@link null }
 **/

public class Client {
    public static void main(String[] args) {
        // 创建搜狗输入法对象
        SougouInput input = new SougouInput();
        // 创建默认皮肤
        DefaultSkin skin =new DefaultSkin();
        
        TestSkin testSkin = new TestSkin();
        
        input.setSkin(skin);
        input.display();
    }
}
