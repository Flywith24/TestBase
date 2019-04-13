package com.example.testbase;

import android.content.res.Resources;
import android.util.TypedValue;

/**
 * @author yyz (杨云召)
 * @date 2019/4/13
 * time   9:17
 * description
 */
public class Utils {
    public static float dp2px(float dp) {

        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Resources.getSystem().getDisplayMetrics());
    }

    public static void getString() {

    }
}
