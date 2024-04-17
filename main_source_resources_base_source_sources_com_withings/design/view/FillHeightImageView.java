package com.withings.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
/* loaded from: classes3.dex */
public class FillHeightImageView extends ImageView {
    public FillHeightImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        if (getDrawable() != null) {
            int size = View.MeasureSpec.getSize(i12);
            setMeasuredDimension((getDrawable().getIntrinsicWidth() * size) / getDrawable().getIntrinsicHeight(), size);
            return;
        }
        setMeasuredDimension(i11, i12);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public FillHeightImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }
}
