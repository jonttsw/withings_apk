package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.u0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* loaded from: classes3.dex */
public class FixedSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: p0  reason: collision with root package name */
    private int f36223p0;

    /* renamed from: q0  reason: collision with root package name */
    private float f36224q0;

    /* renamed from: r0  reason: collision with root package name */
    private int f36225r0;

    /* renamed from: s0  reason: collision with root package name */
    private View f36226s0;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f36227t0;

    public FixedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36223p0 = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, in.a.f72607i);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f36225r0 = resourceId;
        this.f36226s0 = findViewById(resourceId);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public final boolean a() {
        if (this.f36226s0 == null) {
            this.f36226s0 = findViewById(this.f36225r0);
        }
        View view = this.f36226s0;
        int i11 = u0.f12689g;
        return view.canScrollVertically(-1);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.f36224q0);
                if (this.f36227t0 || abs > this.f36223p0) {
                    this.f36227t0 = true;
                    return false;
                }
            }
        } else {
            this.f36224q0 = MotionEvent.obtain(motionEvent).getX();
            this.f36227t0 = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
