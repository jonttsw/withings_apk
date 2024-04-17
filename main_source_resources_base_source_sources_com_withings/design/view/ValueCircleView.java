package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes3.dex */
public class ValueCircleView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f36423a;

    /* renamed from: b  reason: collision with root package name */
    private int f36424b;

    /* renamed from: c  reason: collision with root package name */
    private int f36425c;

    /* renamed from: d  reason: collision with root package name */
    private int f36426d;

    /* renamed from: e  reason: collision with root package name */
    private int f36427e;

    public ValueCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i11;
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0 && this.f36426d != 0) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            double pow = Math.pow(Math.min(width, height) / 2, 2.0d) * 3.141592653589793d;
            int i12 = this.f36426d;
            double min = Math.min((1.0f - ((i12 - this.f36427e) / i12)) * pow, pow);
            if (this.f36427e > 0) {
                i11 = (int) Math.max(Math.sqrt(min / 3.141592653589793d), this.f36425c);
            } else {
                i11 = 0;
            }
            Paint paint = this.f36423a;
            paint.setColor(this.f36424b);
            canvas.drawCircle((width / 2) + getPaddingLeft(), (height / 2) + getPaddingTop(), i11, paint);
        }
    }

    public void setBackgroundStyle(Paint.Style style) {
        this.f36423a.setStyle(style);
        invalidate();
    }

    public void setCircleColor(int i11) {
        this.f36424b = i11;
        invalidate();
    }

    public void setCircleValue(int i11) {
        this.f36427e = i11;
        invalidate();
    }

    public void setMaxValue(int i11) {
        this.f36426d = i11;
        invalidate();
    }

    public void setStrokeWidth(float f11) {
        this.f36423a.setStrokeWidth(f11);
        invalidate();
    }

    public ValueCircleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint();
        this.f36423a = paint;
        this.f36426d = 100;
        this.f36427e = 50;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72615q);
        this.f36424b = obtainStyledAttributes.getColor(0, -1);
        this.f36427e = obtainStyledAttributes.getInt(2, 50);
        this.f36426d = obtainStyledAttributes.getInt(1, 100);
        this.f36425c = obtainStyledAttributes.getDimensionPixelSize(3, 8);
        obtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }
}
