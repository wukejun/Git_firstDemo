package com.android.chen.main;

import com.android.chen.util.IntentUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * <һ�仰���ܼ���>��ҳ�棬����������ť<BR>
 * <������ϸ����>
 * 
 * @author chenli
 * @version [�汾��, 2011-4-8]
 * @see [�����/����]
 * @since [��Ʒ/ģ��汾]
 */
public class Main extends Activity implements OnClickListener
{

    /**
     * ��ť��������Զ�����ɫ�Ľ�����ҳ��
     */
    private Button color;

    /**
     * ��ť����������������ҳ��
     */
    private Button left;

    /**
     * ��ť��������ҷ��������ҳ��
     */
    private Button right;

    /**
     * ��ť������벻��������ҳ��
     */
    private Button indeter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initProperty();
    }

    /**
     * <һ�仰���ܼ���>��ʼ��ҳ��������¼�<br>
     * <������ϸ����>
     * 
     * @see [�ࡢ��#��������#��Ա]
     */
    private void initProperty()
    {
        color = (Button) findViewById(R.id.color);
        left = (Button) findViewById(R.id.left);
        right = (Button) findViewById(R.id.right);
        indeter = (Button) findViewById(R.id.indeter);

        color.setOnClickListener(this);
        left.setOnClickListener(this);
        right.setOnClickListener(this);
        indeter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.color:
                showIntent(ProgressBar_Color.class);
                break;
            case R.id.left:
                showIntent(ProgressBar_Left.class);
                break;
            case R.id.right:
                showIntent(ProgressBar_Right.class);
                break;
            case R.id.indeter:
                showIntent(ProgressBar_Indeter.class);
                break;
            default:
                break;
        }
    }

    /**
     * <һ�仰���ܼ���>Intentҳ����ת<br>
     * <������ϸ����>
     * 
     * @param mclass
     * @see [�ࡢ��#��������#��Ա]
     */
    private void showIntent(Class<?> mclass)
    {
        IntentUtils.getInstance().intentForward(this, mclass);
    }
}
