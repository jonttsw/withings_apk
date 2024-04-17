package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.withings.design.util.CanvasHelper;
/* loaded from: classes3.dex */
public class ColoredGauge extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f36197a;

    /* renamed from: b  reason: collision with root package name */
    private Path f36198b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f36199c;

    /* renamed from: d  reason: collision with root package name */
    private int f36200d;

    /* renamed from: e  reason: collision with root package name */
    private int f36201e;

    /* renamed from: f  reason: collision with root package name */
    private int f36202f;

    /* renamed from: g  reason: collision with root package name */
    private int f36203g;

    /* renamed from: h  reason: collision with root package name */
    private int f36204h;

    /* renamed from: i  reason: collision with root package name */
    private int f36205i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f36206j;

    /* renamed from: k  reason: collision with root package name */
    private String f36207k;

    /* renamed from: l  reason: collision with root package name */
    private int f36208l;

    /* renamed from: m  reason: collision with root package name */
    private int f36209m;

    /* renamed from: n  reason: collision with root package name */
    private int f36210n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f36211o;

    public ColoredGauge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36197a = new Paint();
        this.f36198b = new Path();
        this.f36211o = true;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72602d);
        this.f36200d = obtainStyledAttributes.getColor(1, -1);
        this.f36201e = obtainStyledAttributes.getColor(4, -3355444);
        this.f36202f = obtainStyledAttributes.getColor(11, -7829368);
        this.f36203g = obtainStyledAttributes.getColor(2, -12303292);
        this.f36205i = obtainStyledAttributes.getColor(8, -16711681);
        this.f36207k = obtainStyledAttributes.getString(10);
        this.f36204h = obtainStyledAttributes.getDimensionPixelSize(5, ah.g.j(getResources(), 15));
        this.f36211o = obtainStyledAttributes.getBoolean(0, true);
        if (obtainStyledAttributes.hasValue(7)) {
            this.f36208l = obtainStyledAttributes.getInt(7, 0);
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.f36209m = obtainStyledAttributes.getInt(3, 0);
        }
        this.f36206j = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f36197a;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f36199c = paint2;
        paint2.setTextAlign(Paint.Align.CENTER);
        this.f36199c.setAntiAlias(true);
        if (this.f36207k != null) {
            this.f36199c.setTypeface(Typeface.createFromAsset(getContext().getAssets(), this.f36207k));
        }
    }

    public int getCurrentValue() {
        return this.f36209m;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        boolean z5;
        float f11;
        String str;
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0 && this.f36208l != 0) {
            float min = Math.min(getWidth(), getHeight()) / 2;
            if (this.f36210n == 0) {
                this.f36210n = (int) Math.round(this.f36208l * 1.5d);
            }
            int i11 = this.f36201e;
            int i12 = this.f36205i;
            int i13 = this.f36209m;
            int i14 = this.f36208l;
            Paint paint = this.f36197a;
            if (i13 < i14) {
                paint.setColor(this.f36200d);
            } else if (i13 < this.f36210n) {
                paint.setColor(i11);
                if (this.f36211o) {
                    i11 = p0.d.i(this.f36202f, 60);
                } else {
                    i11 = this.f36202f;
                }
                if (!this.f36206j) {
                    i12 = this.f36202f;
                }
            } else {
                paint.setColor(i11);
                if (this.f36211o) {
                    i11 = p0.d.i(this.f36203g, 60);
                } else {
                    i11 = this.f36203g;
                }
                if (!this.f36206j) {
                    i12 = this.f36203g;
                }
            }
            int i15 = this.f36209m;
            float f12 = i15;
            int i16 = this.f36208l;
            if (i15 >= i16) {
                f12 -= i16;
                z5 = true;
            } else {
                z5 = false;
            }
            canvas.drawCircle(min, min, min, paint);
            float f13 = this.f36208l;
            int max = Math.max((int) ((1.0d - (1.0f - ((f13 - f12) / f13))) * getHeight()), 0);
            canvas.save();
            Path path = this.f36198b;
            path.reset();
            if (z5) {
                f11 = min - ah.g.j(getResources(), 0);
            } else {
                f11 = min;
            }
            path.addCircle(min, min, f11, Path.Direction.CW);
            canvas.clipRect(0, max, getWidth(), getHeight());
            canvas.clipPath(path, Region.Op.INTERSECT);
            canvas.drawColor(i11);
            canvas.restore();
            this.f36199c.setTextSize(this.f36204h);
            this.f36199c.setColor(i12);
            if (this.f36207k != null) {
                this.f36199c.setTypeface(Typeface.createFromAsset(getResources().getAssets(), this.f36207k));
            }
            int i17 = this.f36209m;
            int i18 = this.f36208l;
            if (i17 <= i18) {
                str = String.valueOf(i18 - i17);
            } else {
                str = "+" + (this.f36209m - this.f36208l);
            }
            CanvasHelper.a(canvas, min, min, str, this.f36199c);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.f36200d = i11;
        invalidate();
    }

    public void setCriticalValue(int i11) {
        this.f36210n = i11;
        invalidate();
    }

    public void setCurrentValue(int i11) {
        this.f36209m = i11;
        invalidate();
    }

    public void setFillColor(int i11) {
        this.f36201e = i11;
        invalidate();
    }

    public void setMaxValue(int i11) {
        this.f36208l = i11;
        invalidate();
    }

    public ColoredGauge(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36197a = new Paint();
        this.f36198b = new Path();
        this.f36211o = true;
        a(attributeSet);
    }
}
