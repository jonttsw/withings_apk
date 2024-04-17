package com.withings.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes3.dex */
public class BlockableViewPager extends ViewPager {
    private boolean C0;

    public BlockableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C0 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.C0) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                return false;
            }
        }
        return false;
    }

    public void setPagingEnabled(boolean z5) {
        this.C0 = z5;
    }
}
