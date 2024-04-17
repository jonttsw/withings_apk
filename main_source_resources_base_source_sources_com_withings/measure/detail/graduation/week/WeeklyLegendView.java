package com.withings.measure.detail.graduation.week;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.withings.wiscale2.C1987R;
import kotlin.collections.l;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import wq.a;
/* loaded from: classes4.dex */
public class WeeklyLegendView extends View {

    /* renamed from: a  reason: collision with root package name */
    private TextPaint f41691a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f41692b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f41693c;

    /* renamed from: d  reason: collision with root package name */
    private DateTime f41694d;

    public WeeklyLegendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        super.draw(canvas);
        if (this.f41692b) {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, this.f41691a);
        }
        DateTime dateTime = this.f41694d;
        if (dateTime == null) {
            dateTime = DateTime.now().withDayOfWeek(1);
        }
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 14.0f;
        for (int i11 = 0; i11 < 7; i11++) {
            String substring = dateTime.toString("E").toUpperCase().substring(0, 1);
            this.f41691a.getTextBounds(substring, 0, 1, this.f41693c);
            canvas.drawText(substring, (((i11 * 2) * width) + (getPaddingLeft() + width)) - (rect.width() / 2), this.f41691a.getTextSize() + getPaddingTop(), this.f41691a);
            dateTime = dateTime.plusDays(1);
        }
    }

    public void setFirstDay(DateTime dateTime) {
        this.f41694d = dateTime;
        invalidate();
    }

    public void setShouldDrawSeparator(boolean z5) {
        this.f41692b = z5;
    }

    public WeeklyLegendView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f41692b = false;
        this.f41693c = new Rect();
        this.f41694d = null;
        TextPaint k11 = a.k(C1987R.style.detail1, getContext(), 12);
        this.f41691a = k11;
        k11.setStyle(Paint.Style.FILL);
        this.f41691a.setAntiAlias(true);
        this.f41691a.setStrokeJoin(Paint.Join.MITER);
        this.f41691a.setStrokeCap(Paint.Cap.BUTT);
        this.f41691a.setStrokeWidth(3.0f);
        if (isInEditMode()) {
            return;
        }
        Typeface e11 = a.e(getContext());
        TextPaint textPaint = this.f41691a;
        Context context2 = getContext();
        u.j(context2, "<this>");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(C1987R.style.detail1, l.W(new Integer[]{16842901}));
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = obtainStyledAttributes.getDimension(0, (int) (12 * context2.getResources().getDisplayMetrics().scaledDensity));
        obtainStyledAttributes.recycle();
        textPaint.setTextSize(dimension);
        this.f41691a.setTypeface(e11);
    }
}
