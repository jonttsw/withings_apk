package com.withings.wiscale2.measure.accountmeasure.ui.timeline;

import ah.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.withings.bloodpressure.core.BloodPressureCategory;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import ky.a;
import ky.d;
/* loaded from: classes5.dex */
public class BloodPressureGraph extends View {

    /* renamed from: a  reason: collision with root package name */
    private List<d> f58308a;

    /* renamed from: b  reason: collision with root package name */
    private final Path f58309b;

    /* renamed from: c  reason: collision with root package name */
    private final Path f58310c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f58311d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f58312e;

    /* renamed from: f  reason: collision with root package name */
    private final Path f58313f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f58314g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f58315h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f58316i;

    /* renamed from: j  reason: collision with root package name */
    private final Path f58317j;

    /* renamed from: k  reason: collision with root package name */
    private final Path f58318k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f58319l;

    /* renamed from: m  reason: collision with root package name */
    private final Paint f58320m;

    /* renamed from: n  reason: collision with root package name */
    private float f58321n;

    /* renamed from: o  reason: collision with root package name */
    private float f58322o;

    public BloodPressureGraph(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Path a(a aVar, a aVar2, boolean z5) {
        String country = Locale.getDefault().getCountry();
        double f11 = aVar.f();
        double f12 = aVar2.f();
        int i11 = BloodPressureCategory.f32883e;
        BloodPressureCategory a11 = BloodPressureCategory.a.a(country, f11, f12);
        if (a11.d() == BloodPressureCategory.Status.f32886a) {
            if (z5) {
                return this.f58310c;
            }
            return this.f58309b;
        } else if (a11.d() == BloodPressureCategory.Status.f32887b) {
            if (z5) {
                return this.f58314g;
            }
            return this.f58313f;
        } else if (z5) {
            return this.f58318k;
        } else {
            return this.f58317j;
        }
    }

    private float b(int i11) {
        return ((((getWidth() - getPaddingLeft()) - getPaddingRight()) * i11) / (this.f58308a.size() + 1)) + getPaddingLeft();
    }

    private float c(float f11) {
        float f12 = this.f58322o;
        return (((f12 - f11) * ((getHeight() - getPaddingTop()) - getPaddingBottom())) / (f12 - this.f58321n)) + getPaddingTop();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f58317j;
        path.reset();
        Path path2 = this.f58318k;
        path2.reset();
        Path path3 = this.f58313f;
        path3.reset();
        Path path4 = this.f58314g;
        path4.reset();
        Path path5 = this.f58309b;
        path5.reset();
        Path path6 = this.f58310c;
        path6.reset();
        boolean z5 = true;
        boolean z11 = false;
        int i11 = 1;
        int i12 = 0;
        while (i12 < this.f58308a.size()) {
            d dVar = this.f58308a.get(i12);
            a d11 = ly.a.d(10, dVar);
            a d12 = ly.a.d(9, dVar);
            Path a11 = a(d11, d12, z5);
            Path a12 = a(d11, d12, z11);
            a12.moveTo(b(i11), c((float) d12.f()) - g.k(4, getContext()));
            Path.Direction direction = Path.Direction.CW;
            a11.addCircle(b(i11), c((float) d12.f()), g.k(2, getContext()), direction);
            a12.lineTo(b(i11), c((float) d11.f()) + g.k(4, getContext()));
            a11.addCircle(b(i11), c((float) d11.f()), g.k(2, getContext()), direction);
            i11++;
            i12++;
            z5 = true;
            path2 = path2;
            path5 = path5;
            path4 = path4;
            path3 = path3;
            z11 = false;
        }
        canvas.drawPath(path5, this.f58311d);
        canvas.drawPath(path6, this.f58312e);
        canvas.drawPath(path, this.f58319l);
        canvas.drawPath(path2, this.f58320m);
        canvas.drawPath(path3, this.f58315h);
        canvas.drawPath(path4, this.f58316i);
    }

    public void setMeasures(List<d> list) {
        this.f58308a = list;
        for (d dVar : list) {
            this.f58322o = Math.max(this.f58322o, (float) ly.a.f(10, dVar));
            this.f58321n = Math.min(this.f58321n, (float) ly.a.f(9, dVar));
        }
        invalidate();
    }

    public BloodPressureGraph(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f58308a = Collections.emptyList();
        this.f58309b = new Path();
        this.f58310c = new Path();
        Paint paint = new Paint();
        this.f58311d = paint;
        Paint paint2 = new Paint();
        this.f58312e = paint2;
        this.f58313f = new Path();
        this.f58314g = new Path();
        this.f58317j = new Path();
        this.f58318k = new Path();
        this.f58321n = Float.MAX_VALUE;
        this.f58322o = Float.MIN_VALUE;
        int k11 = g.k(5, context);
        setPadding(0, k11, 0, k11);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(g.k(2, context));
        paint2.setStyle(style);
        paint2.setStrokeWidth(g.k(2, context));
        Paint paint3 = new Paint(paint);
        this.f58315h = paint3;
        Paint paint4 = new Paint(paint);
        this.f58319l = paint4;
        Paint paint5 = new Paint(paint2);
        this.f58316i = paint5;
        Paint paint6 = new Paint(paint2);
        this.f58320m = paint6;
        int color = androidx.core.content.a.getColor(context, fi.a.a(BloodPressureCategory.Status.f32886a));
        paint.setColor(color);
        paint2.setColor(color);
        int color2 = androidx.core.content.a.getColor(context, fi.a.a(BloodPressureCategory.Status.f32887b));
        paint3.setColor(color2);
        paint5.setColor(color2);
        int color3 = androidx.core.content.a.getColor(context, fi.a.a(BloodPressureCategory.Status.f32888c));
        paint4.setColor(color3);
        paint6.setColor(color3);
    }
}
