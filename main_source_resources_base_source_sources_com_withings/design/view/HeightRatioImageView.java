package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
/* loaded from: classes3.dex */
public class HeightRatioImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private float f36238a;

    public HeightRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72608j);
        this.f36238a = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, (int) (size * this.f36238a));
    }

    public void setRatio(float f11) {
        this.f36238a = f11;
        invalidate();
    }
}
