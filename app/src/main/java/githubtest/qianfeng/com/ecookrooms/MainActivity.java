package githubtest.qianfeng.com.ecookrooms;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import java.util.ArrayList;
import java.util.List;

import Bean.DrawerBean;


public class MainActivity extends ActionBarActivity {

    //���ڳ��벼�ֵ�һ��listview
    private List<DrawerBean> FirstDrawerBeanList;
    //���ڳ��벼�ֵڶ���listview
    private List<DrawerBean> SecondDraerBeanList;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



    }

    private void init() {
        FirstDrawerBeanList = new ArrayList<DrawerBean>();
        SecondDraerBeanList = new ArrayList<DrawerBean>();
        //��һ��  �û� ע����Ŀ
        FirstDrawerBeanList.add(new DrawerBean(R.mipmap.mine_login,"��½",R.mipmap.more_arrow_account));
        FirstDrawerBeanList.add(new DrawerBean(R.mipmap.mine_personalinfo,"ע��",R.mipmap.more_arrow_account));
        //�ڶ���   listview��Ŀ
        SecondDraerBeanList.add(new DrawerBean(R.mipmap.mine_favorites,"�ղؼ�",R.mipmap.more_arrow_account));
        SecondDraerBeanList.add(new DrawerBean(R.mipmap.mine_tasty,"С��˵",R.mipmap.more_arrow_account));
        SecondDraerBeanList.add(new DrawerBean(R.mipmap.mine_shoppinglist,"�����嵥",R.mipmap.more_arrow_account));
        SecondDraerBeanList.add(new DrawerBean(R.mipmap.mine_findfriend,"������",R.mipmap.more_arrow_account));
        SecondDraerBeanList.add(new DrawerBean(R.mipmap.mine_aboutus,"��������",R.mipmap.more_arrow_account));
    }

}
