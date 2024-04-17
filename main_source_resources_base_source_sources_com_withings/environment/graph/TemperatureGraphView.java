package com.withings.environment.graph;

import ah.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.withings.library.measure.Measure;
import com.withings.wiscale2.C1987R;
import java.util.List;
import org.joda.time.DateTime;
import uq.b;
import uq.c;
/* loaded from: classes3.dex */
public class TemperatureGraphView extends View implements b {

    /* renamed from: a  reason: collision with root package name */
    private double f38906a;

    /* renamed from: b  reason: collision with root package name */
    private double f38907b;

    /* renamed from: c  reason: collision with root package name */
    private DateTime f38908c;

    /* renamed from: d  reason: collision with root package name */
    private DateTime f38909d;

    /* renamed from: e  reason: collision with root package name */
    private uq.a f38910e;

    /* renamed from: f  reason: collision with root package name */
    private List<Measure> f38911f;

    /* renamed from: g  reason: collision with root package name */
    private GestureDetector f38912g;

    /* renamed from: h  reason: collision with root package name */
    private View.OnTouchListener f38913h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f38914i;

    /* renamed from: j  reason: collision with root package name */
    private Path f38915j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f38916k;

    /* renamed from: l  reason: collision with root package name */
    private Path f38917l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f38918m;

    /* renamed from: n  reason: collision with root package name */
    private Path f38919n;

    /* renamed from: o  reason: collision with root package name */
    private Paint f38920o;

    /* renamed from: p  reason: collision with root package name */
    private Path f38921p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f38922q;

    public TemperatureGraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38922q = false;
        c();
    }

    private void c() {
        Paint paint = new Paint();
        this.f38914i = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f38914i.setColor(getContext().getResources().getColor(C1987R.color.statusGood));
        this.f38914i.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f38916k = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f38916k.setColor(getContext().getResources().getColor(C1987R.color.statusGood));
        this.f38916k.setStrokeJoin(Paint.Join.ROUND);
        this.f38916k.setStrokeCap(Paint.Cap.ROUND);
        this.f38916k.setAntiAlias(true);
        this.f38916k.setStrokeWidth(1.0f);
        Paint paint3 = new Paint();
        this.f38918m = paint3;
        paint3.setStyle(style);
        this.f38918m.setColor(getContext().getResources().getColor(C1987R.color.TempMin));
        this.f38918m.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f38920o = paint4;
        paint4.setStyle(style);
        this.f38920o.setColor(getContext().getResources().getColor(C1987R.color.TempMax));
        this.f38920o.setAntiAlias(true);
        setDrawingCacheEnabled(true);
    }

    @Override // uq.b
    public final rw.a a(MotionEvent motionEvent, c cVar) {
        return this.f38910e.a(cVar.a((int) motionEvent.getX()));
    }

    @Override // uq.b
    public final float b(c cVar, rw.a aVar) {
        cVar.d(getWidth());
        return e(aVar.f95793x);
    }

    public final float d(double d11) {
        return (float) (getHeight() - ((d11 - this.f38906a) * (getHeight() / (this.f38907b - this.f38906a))));
    }

    public final float e(double d11) {
        return (float) ((d11 - this.f38908c.getMillis()) * (getWidth() / (this.f38909d.getMillis() - this.f38908c.getMillis())));
    }

    public List<Measure> getMeasures() {
        return this.f38911f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        List<Measure> list = this.f38911f;
        if (list != null && list.size() > 0) {
            if (this.f38917l == null || this.f38922q) {
                this.f38922q = false;
                this.f38915j = new Path();
                this.f38917l = new Path();
                this.f38921p = new Path();
                this.f38919n = new Path();
                Measure measure = new Measure();
                measure.f95794y = Double.MAX_VALUE;
                Measure measure2 = new Measure();
                measure2.f95794y = Double.MIN_VALUE;
                this.f38917l.moveTo(e(this.f38908c.getMillis()), d(this.f38911f.get(0).f95794y));
                for (Measure measure3 : this.f38911f) {
                    double d11 = measure3.f95794y;
                    if (d11 < measure.f95794y) {
                        measure = measure3;
                    }
                    if (d11 > measure2.f95794y) {
                        measure2 = measure3;
                    }
                    this.f38917l.lineTo(e(measure3.f95793x), d(measure3.f95794y));
                    this.f38915j.moveTo(e(measure3.f95793x), d(measure3.f95794y));
                    this.f38915j.addCircle(e(measure3.f95793x), d(measure3.f95794y), g.k(2, getContext()), Path.Direction.CCW);
                }
                this.f38919n.moveTo(e(measure.f95793x), d(measure.f95794y));
                Path.Direction direction = Path.Direction.CCW;
                this.f38919n.addCircle(e(measure.f95793x), d(measure.f95794y), g.k(2, getContext()), direction);
                this.f38921p.moveTo(e(measure2.f95793x), d(measure2.f95794y));
                this.f38921p.addCircle(e(measure2.f95793x), d(measure2.f95794y), g.k(2, getContext()), direction);
            }
            canvas.drawPath(this.f38917l, this.f38916k);
            canvas.drawPath(this.f38915j, this.f38914i);
            canvas.drawPath(this.f38919n, this.f38918m);
            canvas.drawPath(this.f38921p, this.f38920o);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
        super.onLayout(z5, i11, i12, i13, i14);
        this.f38922q = true;
        invalidate();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f38922q = true;
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f38912g;
        if (gestureDetector == null) {
            return false;
        }
        if (gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        View.OnTouchListener onTouchListener = this.f38913h;
        if (onTouchListener == null) {
            return false;
        }
        return onTouchListener.onTouch(this, motionEvent);
    }

    public void setBaseData(List<Measure> list) {
        DateTime withTimeAtStartOfDay = new DateTime((long) list.get(0).f95793x).withTimeAtStartOfDay();
        this.f38908c = withTimeAtStartOfDay;
        this.f38909d = withTimeAtStartOfDay.plusDays(1).minusMinutes(29);
        this.f38910e = new uq.a(list);
        this.f38911f = list;
        this.f38922q = true;
        invalidate();
    }

    public void setCustomTouchListener(View.OnTouchListener onTouchListener) {
        this.f38913h = onTouchListener;
    }

    public void setGestureDetector(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f38912g = new GestureDetector(getContext(), simpleOnGestureListener);
    }

    public void setMaxY(double d11) {
        this.f38907b = d11 + 1.0d;
        this.f38922q = true;
        invalidate();
    }

    public void setMinY(double d11) {
        this.f38906a = d11 - 1.0d;
        this.f38922q = true;
        invalidate();
    }

    public TemperatureGraphView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f38922q = false;
        c();
    }
}
