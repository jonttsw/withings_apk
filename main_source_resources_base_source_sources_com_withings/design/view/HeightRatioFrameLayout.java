package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* loaded from: classes3.dex */
public class HeightRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private float f36237a;

    public HeightRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72608j);
        this.f36237a = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, (int) (measuredWidth * this.f36237a));
    }

    public void setRatio(float f11) {
        this.f36237a = f11;
        invalidate();
    }
}
