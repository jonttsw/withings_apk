package com.withings.views.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
/* loaded from: classes4.dex */
public class VerticalScrollView extends ScrollView {

    /* renamed from: a  reason: collision with root package name */
    private float f46731a;

    /* renamed from: b  reason: collision with root package name */
    private float f46732b;

    /* renamed from: c  reason: collision with root package name */
    private float f46733c;

    /* renamed from: d  reason: collision with root package name */
    private float f46734d;

    public VerticalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                this.f46731a = Math.abs(x11 - this.f46733c) + this.f46731a;
                float abs = Math.abs(y11 - this.f46734d) + this.f46732b;
                this.f46732b = abs;
                this.f46733c = x11;
                this.f46734d = y11;
                if (this.f46731a > abs) {
                    return false;
                }
            }
        } else {
            this.f46732b = 0.0f;
            this.f46731a = 0.0f;
            this.f46733c = motionEvent.getX();
            this.f46734d = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
