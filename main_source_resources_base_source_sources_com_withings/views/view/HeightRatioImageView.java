package com.withings.views.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
@Deprecated
/* loaded from: classes4.dex */
public class HeightRatioImageView extends AppCompatImageView {

    /* renamed from: d  reason: collision with root package name */
    private float f46558d;

    public HeightRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22414j);
        this.f46558d = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, (int) (size * this.f46558d));
    }

    public void setRatio(float f11) {
        this.f46558d = f11;
        invalidate();
    }
}
