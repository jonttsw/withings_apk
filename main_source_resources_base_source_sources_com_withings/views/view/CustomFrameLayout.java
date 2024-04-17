package com.withings.views.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes4.dex */
public class CustomFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f46530a;

    /* renamed from: b  reason: collision with root package name */
    private int f46531b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46532c;

    public CustomFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        this.f46532c = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 0) {
                i13 = childAt.getMeasuredHeight() + i13;
            }
        }
        if (i13 > this.f46530a || this.f46532c) {
            i13 += this.f46531b;
        }
        setMeasuredDimension(i11, i13);
    }

    public void setContainerHeight(int i11) {
        this.f46530a = i11;
    }

    public void setOffset(int i11) {
        this.f46531b = i11;
    }

    public CustomFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
