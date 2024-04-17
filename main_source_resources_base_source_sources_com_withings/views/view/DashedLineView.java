package com.withings.views.view;

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
@Deprecated
/* loaded from: classes4.dex */
public class DashedLineView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Paint f46549a;

    /* renamed from: b  reason: collision with root package name */
    private Path f46550b;

    /* renamed from: c  reason: collision with root package name */
    private DashPathEffect f46551c;

    public DashedLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i11 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c80.a.f22409e);
            i11 = obtainStyledAttributes.getColor(0, -1);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.f46549a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f46549a.setStrokeWidth(TypedValue.applyDimension(1, 0.5f, displayMetrics));
        this.f46549a.setColor(i11);
        this.f46550b = new Path();
        float applyDimension = TypedValue.applyDimension(1, 1.5f, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f46551c = new DashPathEffect(new float[]{applyDimension, applyDimension2, applyDimension, applyDimension2}, 0.0f);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f46549a.setPathEffect(this.f46551c);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight <= measuredWidth) {
            float f11 = measuredHeight / 2;
            this.f46550b.moveTo(0.0f, f11);
            this.f46550b.lineTo(measuredWidth, f11);
            canvas.drawPath(this.f46550b, this.f46549a);
            return;
        }
        float f12 = measuredWidth / 2;
        this.f46550b.moveTo(f12, 0.0f);
        this.f46550b.lineTo(f12, measuredHeight);
        canvas.drawPath(this.f46550b, this.f46549a);
    }

    public DashedLineView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(context, attributeSet);
    }
}
