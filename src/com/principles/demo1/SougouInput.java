package com.principles.demo1;
/**
 * @Author huzc
 * @Description 搜狗输入法
 * @Date   11:54
 * @Param * @param null  
 * @return * @return {@link null }
 **/

public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    
    public void display(){
        skin.display();
    }
}
