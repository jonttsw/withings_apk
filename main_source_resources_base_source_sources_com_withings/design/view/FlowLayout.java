package com.withings.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: classes3.dex */
public class FlowLayout extends RelativeLayout {
    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (getPaddingRight() + paddingLeft + measuredWidth > i13 - i11) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += i15;
                    i15 = measuredHeight;
                } else {
                    i15 = Math.max(i15, measuredHeight);
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, measuredHeight + paddingTop);
                paddingLeft = measuredWidth + paddingLeft;
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (getPaddingRight() + paddingLeft + measuredWidth > size) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += i13;
                } else {
                    measuredHeight = Math.max(i13, measuredHeight);
                }
                i13 = measuredHeight;
                paddingLeft = measuredWidth + paddingLeft;
            }
        }
        int paddingBottom = getPaddingBottom() + i13 + paddingTop;
        if (View.MeasureSpec.getMode(i12) == 0 || (View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && paddingBottom < size2)) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
