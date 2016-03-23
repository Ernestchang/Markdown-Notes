package de.x4fyr.markdownnotes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class TouchHijackingLinearLayout extends LinearLayout {
    public TouchHijackingLinearLayout(Context context) {
        super(context);
    }

    public TouchHijackingLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }
}