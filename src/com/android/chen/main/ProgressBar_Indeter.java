package com.android.chen.main;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.android.chen.util.IntentUtils;

/**
 * <һ�仰���ܼ���>�������ȵĽ�����<BR>
 * <������ϸ����>
 * 
 * @author chenli
 * @version [�汾��, 2011-4-8]
 * @see [�����/����]
 * @since [��Ʒ/ģ��汾]
 */
public class ProgressBar_Indeter extends Activity
{

    /**
     * Handler��Ϣ����
     */
    private Handler mHandler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            if (msg.what == IntentUtils.HANDLER_INDETER)
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
        setContentView(R.layout.mypage_indeter);

        // ��ʱ������Ϣ
        mHandler.sendEmptyMessageDelayed(IntentUtils.HANDLER_INDETER, 3000);
    }
}
