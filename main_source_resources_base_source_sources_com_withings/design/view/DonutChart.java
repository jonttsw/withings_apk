package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class DonutChart extends View {

    /* renamed from: a  reason: collision with root package name */
    List<Float> f36215a;

    /* renamed from: b  reason: collision with root package name */
    List<Integer> f36216b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f36217c;

    /* renamed from: d  reason: collision with root package name */
    private Path f36218d;

    /* renamed from: e  reason: collision with root package name */
    RectF f36219e;

    /* renamed from: f  reason: collision with root package name */
    RectF f36220f;

    /* renamed from: g  reason: collision with root package name */
    private int f36221g;

    /* renamed from: h  reason: collision with root package name */
    private int f36222h;

    public DonutChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36215a = new ArrayList();
        this.f36216b = new ArrayList();
        this.f36217c = new Paint();
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72605g);
            this.f36221g = obtainStyledAttributes.getDimensionPixelSize(1, ah.g.i(24, getContext()));
            this.f36222h = obtainStyledAttributes.getInt(0, 17170443);
            obtainStyledAttributes.recycle();
        } else {
            this.f36221g = ah.g.i(24, getContext());
        }
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f36217c;
        paint.setStyle(style);
        paint.setDither(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.f36221g);
        this.f36218d = new Path();
        this.f36219e = new RectF();
        this.f36220f = new RectF();
        if (isInEditMode()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf((int) C1987R.color.good));
            arrayList.add(Integer.valueOf((int) C1987R.color.f111260ok));
            arrayList.add(Integer.valueOf((int) C1987R.color.bad));
            arrayList.add(Integer.valueOf((int) C1987R.color.veryBad));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Float.valueOf(60.0f));
            arrayList2.add(Float.valueOf(20.0f));
            arrayList2.add(Float.valueOf(15.0f));
            arrayList2.add(Float.valueOf(5.0f));
            setColors(arrayList);
            setValues(arrayList2);
        }
    }

    public List<Integer> getColors() {
        return this.f36216b;
    }

    public List<Float> getValues() {
        return this.f36215a;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0) {
            if (this.f36216b.size() == this.f36215a.size()) {
                float f11 = 0.0f;
                this.f36219e.set(0.0f, 0.0f, getWidth(), getHeight());
                RectF rectF = this.f36220f;
                int i11 = this.f36221g;
                rectF.set(i11, i11, getWidth() - this.f36221g, getHeight() - this.f36221g);
                int i12 = this.f36222h;
                int i13 = 0;
                for (int i14 = 0; i14 < this.f36215a.size(); i14++) {
                    if (this.f36215a.get(i14).floatValue() > 0.0f) {
                        i13++;
                        i12 = this.f36216b.get(i14).intValue();
                    }
                }
                if (i13 <= 1) {
                    this.f36215a.clear();
                    this.f36215a.add(Float.valueOf(1.0f));
                    this.f36215a.add(Float.valueOf(1.0f));
                    this.f36216b.clear();
                    this.f36216b.add(Integer.valueOf(i12));
                    this.f36216b.add(Integer.valueOf(i12));
                }
                for (Float f12 : this.f36215a) {
                    f11 += f12.floatValue();
                }
                float f13 = -90.0f;
                for (int i15 = 0; i15 < this.f36215a.size(); i15++) {
                    Paint paint = this.f36217c;
                    paint.setColor(androidx.core.content.a.getColor(getContext(), this.f36216b.get(i15).intValue()));
                    float floatValue = (this.f36215a.get(i15).floatValue() / f11) * 360.0f;
                    this.f36218d.reset();
                    this.f36218d.arcTo(this.f36219e, f13, floatValue, false);
                    f13 += floatValue;
                    this.f36218d.arcTo(this.f36220f, f13, -floatValue, false);
                    this.f36218d.close();
                    canvas.drawPath(this.f36218d, paint);
                }
                return;
            }
            throw new IllegalArgumentException("colors.size() != values.size(), noob");
        }
    }

    public void setColors(List<Integer> list) {
        this.f36216b = list;
        invalidate();
    }

    public void setValues(List<Float> list) {
        this.f36215a = list;
        invalidate();
    }

    public DonutChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36215a = new ArrayList();
        this.f36216b = new ArrayList();
        this.f36217c = new Paint();
        a(attributeSet);
    }
}
