package com.android.chen.util;

import android.content.Context;
import android.content.Intent;

/**
 * <一句话功能简述>Intent工具类<BR>
 * <功能详细描述>
 * 
 * @author chenli
 * @version [版本号, 2011-4-8]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class IntentUtils
{
    /**
     * 从左向右
     */
    public static final int HANDLER_LEFT = 0;

    /**
     * 从右向左
     */
    public static final int HANDLER_RIGHT = 1;

    /**
     * 不确定进度
     */
    public static final int HANDLER_INDETER = 2;

    /**
     * IntentUtils单例
     */
    private static IntentUtils mIntentUtils;

    /**
     * <一句话功能简述>获取IntentUtils单例<BR>
     * <功能详细描述>
     * 
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static IntentUtils getInstance()
    {
        if (mIntentUtils == null)
        {
            mIntentUtils = new IntentUtils();
        }
        return mIntentUtils;
    }

    /**
     * <一句话功能简述>Intent页面跳转<BR>
     * <功能详细描述>
     * 
     * @param context
     * @param mclass
     * @see [类、类#方法、类#成员]
     */
    public void intentForward(Context context, Class<?> mclass)
    {
        Intent intent = new Intent();
        intent.setClass(context, mclass);
        context.startActivity(intent);
    }
}
