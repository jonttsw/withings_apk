package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import org.joda.time.DateTime;
/* loaded from: classes3.dex */
public class AnalogClockView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f36155a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f36156b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36157c;

    /* renamed from: d  reason: collision with root package name */
    private final int f36158d;

    /* renamed from: e  reason: collision with root package name */
    public final float f36159e;

    /* renamed from: f  reason: collision with root package name */
    private final float f36160f;

    /* renamed from: g  reason: collision with root package name */
    public DateTime f36161g;

    public AnalogClockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f36155a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            paint.setStrokeWidth(3.0f);
        } else {
            paint.setStrokeWidth(ah.g.i(1, getContext()));
        }
        Paint paint2 = new Paint();
        this.f36156b = paint2;
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setAntiAlias(true);
        if (isInEditMode()) {
            paint2.setStrokeWidth(3.0f);
        } else {
            paint2.setStrokeWidth(ah.g.i(1, getContext()));
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, in.a.f72599a, 0, 0);
        paint.setColor(obtainStyledAttributes.getColor(0, -16777216));
        this.f36157c = obtainStyledAttributes.getColor(1, -1);
        this.f36158d = obtainStyledAttributes.getColor(1, Color.argb(180, 255, 255, 255));
        if (isInEditMode()) {
            this.f36159e = obtainStyledAttributes.getDimension(2, 18.0f);
            this.f36160f = obtainStyledAttributes.getDimension(4, 24.0f);
        } else {
            this.f36159e = obtainStyledAttributes.getDimension(2, ah.g.i(6, getContext()));
            this.f36160f = obtainStyledAttributes.getDimension(4, ah.g.i(8, getContext()));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        DateTime dateTime;
        DateTime dateTime2;
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Paint paint = this.f36156b;
        paint.setColor(this.f36157c);
        if (isInEditMode()) {
            paint.setStrokeWidth(3.0f);
        } else {
            paint.setStrokeWidth(ah.g.i(1, getContext()));
        }
        boolean isInEditMode = isInEditMode();
        Paint paint2 = this.f36155a;
        if (isInEditMode) {
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - 3, paint2);
        } else {
            canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - ah.g.i(1, getContext()), paint2);
        }
        canvas.save();
        if (this.f36161g != null) {
            canvas.rotate((this.f36161g.getMinuteOfHour() / 2) + ((dateTime.getHourOfDay() * 60) / 2), measuredWidth, measuredHeight);
        }
        float f11 = measuredWidth;
        float f12 = measuredHeight;
        canvas.drawLine(f11, f12, f11, f11 - this.f36159e, paint);
        canvas.restore();
        paint.setColor(this.f36158d);
        canvas.save();
        if (this.f36161g != null) {
            canvas.rotate(dateTime2.getMinuteOfHour() * 8, f11, f12);
        }
        canvas.drawLine(f11, f12, f11, f11 - this.f36160f, paint);
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i11);
    }

    public void setTime(DateTime dateTime) {
        this.f36161g = dateTime;
        invalidate();
    }
}
