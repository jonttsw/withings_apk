package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes3.dex */
public class DashedLineView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f36212a;

    /* renamed from: b  reason: collision with root package name */
    private Path f36213b;

    /* renamed from: c  reason: collision with root package name */
    private DashPathEffect f36214c;

    public DashedLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i11 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, in.a.f72603e);
            i11 = obtainStyledAttributes.getColor(0, -1);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.f36212a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f36212a.setStrokeWidth(TypedValue.applyDimension(1, 0.5f, displayMetrics));
        this.f36212a.setColor(i11);
        this.f36213b = new Path();
        float applyDimension = TypedValue.applyDimension(1, 1.5f, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f36214c = new DashPathEffect(new float[]{applyDimension, applyDimension2, applyDimension, applyDimension2}, 0.0f);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f36212a.setPathEffect(this.f36214c);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight <= measuredWidth) {
            float f11 = measuredHeight / 2;
            this.f36213b.moveTo(0.0f, f11);
            this.f36213b.lineTo(measuredWidth, f11);
            canvas.drawPath(this.f36213b, this.f36212a);
            return;
        }
        float f12 = measuredWidth / 2;
        this.f36213b.moveTo(f12, 0.0f);
        this.f36213b.lineTo(f12, measuredHeight);
        canvas.drawPath(this.f36213b, this.f36212a);
    }

    public DashedLineView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(context, attributeSet);
    }
}
