package com.withings.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
/* loaded from: classes3.dex */
public class VerticalScrollView extends ScrollView {

    /* renamed from: a  reason: collision with root package name */
    private float f36428a;

    /* renamed from: b  reason: collision with root package name */
    private float f36429b;

    /* renamed from: c  reason: collision with root package name */
    private float f36430c;

    /* renamed from: d  reason: collision with root package name */
    private float f36431d;

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
                this.f36428a = Math.abs(x11 - this.f36430c) + this.f36428a;
                float abs = Math.abs(y11 - this.f36431d) + this.f36429b;
                this.f36429b = abs;
                this.f36430c = x11;
                this.f36431d = y11;
                if (this.f36428a > abs) {
                    return false;
                }
            }
        } else {
            this.f36429b = 0.0f;
            this.f36428a = 0.0f;
            this.f36430c = motionEvent.getX();
            this.f36431d = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
