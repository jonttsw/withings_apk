package com.withings.design.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class PieChart extends View {

    /* renamed from: a  reason: collision with root package name */
    List<Float> f36352a;

    /* renamed from: b  reason: collision with root package name */
    List<Integer> f36353b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f36354c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f36355d;

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36352a = new ArrayList();
        this.f36353b = new ArrayList();
        this.f36354c = new RectF();
        this.f36355d = new Paint();
        a();
    }

    private void a() {
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f36355d;
        paint.setStyle(style);
        paint.setAntiAlias(true);
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
        return this.f36353b;
    }

    public List<Float> getValues() {
        return this.f36352a;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f11 = 0.0f;
        for (Float f12 : this.f36352a) {
            if (f12 != null) {
                f11 += f12.floatValue();
            }
        }
        if (getWidth() != 0 && getHeight() != 0 && f11 != 0.0f) {
            if (this.f36353b.size() == this.f36352a.size()) {
                float min = Math.min(getWidth(), getHeight()) / 2;
                float width = getWidth() / 2;
                float height = getHeight() / 2;
                this.f36354c.set(width - min, height - min, width + min, height + min);
                float f13 = -90.0f;
                for (int i11 = 0; i11 < this.f36352a.size(); i11++) {
                    float floatValue = this.f36352a.get(i11).floatValue();
                    this.f36355d.setColor(androidx.core.content.a.getColor(getContext(), this.f36353b.get(i11).intValue()));
                    float f14 = (floatValue / f11) * 360.0f;
                    canvas.drawArc(this.f36354c, f13, f14, true, this.f36355d);
                    f13 += f14;
                }
                return;
            }
            throw new IllegalArgumentException("colors.size() != values.size(), noob");
        }
    }

    public void setColors(List<Integer> list) {
        this.f36353b = list;
        invalidate();
    }

    public void setValues(List<Float> list) {
        this.f36352a = list;
        invalidate();
    }

    public PieChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36352a = new ArrayList();
        this.f36353b = new ArrayList();
        this.f36354c = new RectF();
        this.f36355d = new Paint();
        a();
    }
}
