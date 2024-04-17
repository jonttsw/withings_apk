package com.withings.views.view;

import ah.u;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.withings.wiscale2.C1987R;
/* loaded from: classes4.dex */
public class WithingsSwipeToRefresh extends SwipeRefreshLayout {

    /* renamed from: p0  reason: collision with root package name */
    private int f46742p0;

    /* renamed from: q0  reason: collision with root package name */
    private float f46743q0;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f46744r0;

    public WithingsSwipeToRefresh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(ah.g.k(56, context));
        this.f46742p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setColorSchemeColors(u.v(C1987R.attr.colorSecondary, context));
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.f46743q0);
                if (this.f46744r0 || abs > this.f46742p0) {
                    this.f46744r0 = true;
                    return false;
                }
            }
        } else {
            this.f46743q0 = MotionEvent.obtain(motionEvent).getX();
            this.f46744r0 = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
