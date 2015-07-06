package com.android.chen.main;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;

import com.android.chen.util.IntentUtils;

/**
 * <һ�仰���ܼ���>���������˶����Զ�����ɫ�����<BR>
 * <������ϸ����>
 * 
 * @author chenli
 * @version [�汾��, 2011-4-8]
 * @see [�����/����]
 * @since [��Ʒ/ģ��汾]
 */
public class ProgressBar_Color extends Activity
{

    /**
     * �����
     */
    private ProgressBar mColor = null;

    /**
     * ��ǰ��ȵ�ֵ
     */
    private int mCount = 0;  
    
    
    
    //===============

    /**
     * Handler��Ϣ����
     */
    private Handler mHandler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            if (msg.what == IntentUtils.HANDLER_LEFT)
            {
                finish();
            }
            super.handleMessage(msg);
        }
    };

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage_color);

        showIndeterDialog();  
        
        System.out.println("sdfsdf");
    }

    /**
     * <һ�仰���ܼ���>չʾ������Ľ��<BR>
     * <������ϸ����>
     * 
     * @see [�ࡢ��#��������#��Ա]
     */
    private void showIndeterDialog()
    {
        mCount = 0;

        mColor = (ProgressBar) findViewById(R.id.progress_horizontal_color);
        mColor.setMax(100);
        mColor.setProgress(0);
        mColor.setIndeterminate(false);
        new Thread()
        {
            public void run()
            {
                try
                {
                    while (mCount <= 100)
                    {
                        mColor.setProgress(mCount++);
                        Thread.sleep(100);
                    }
                    if (mCount > 100)
                    {
                        mHandler.sendEmptyMessage(IntentUtils.HANDLER_LEFT);
                    }
                }
                catch (Exception ex)
                {
                }
            }
        }.start();
    }
}
