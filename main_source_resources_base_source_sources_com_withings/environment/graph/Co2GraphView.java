package com.withings.environment.graph;

import ah.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
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
public class Co2GraphView extends View implements b {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private double f38880a;

    /* renamed from: b  reason: collision with root package name */
    private double f38881b;

    /* renamed from: c  reason: collision with root package name */
    private DateTime f38882c;

    /* renamed from: d  reason: collision with root package name */
    private DateTime f38883d;

    /* renamed from: e  reason: collision with root package name */
    private uq.a f38884e;

    /* renamed from: f  reason: collision with root package name */
    private List<Measure> f38885f;

    /* renamed from: g  reason: collision with root package name */
    private GestureDetector f38886g;

    /* renamed from: h  reason: collision with root package name */
    private View.OnTouchListener f38887h;

    /* renamed from: i  reason: collision with root package name */
    private Path f38888i;

    /* renamed from: j  reason: collision with root package name */
    private Paint f38889j;

    /* renamed from: k  reason: collision with root package name */
    private Path f38890k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f38891l;

    /* renamed from: m  reason: collision with root package name */
    private Path f38892m;

    /* renamed from: n  reason: collision with root package name */
    private Paint f38893n;

    /* renamed from: o  reason: collision with root package name */
    private Path f38894o;

    /* renamed from: p  reason: collision with root package name */
    private Paint f38895p;

    /* renamed from: q  reason: collision with root package name */
    private Path f38896q;

    /* renamed from: r  reason: collision with root package name */
    private Paint f38897r;

    /* renamed from: s  reason: collision with root package name */
    private Path f38898s;

    /* renamed from: t  reason: collision with root package name */
    private Paint f38899t;

    /* renamed from: u  reason: collision with root package name */
    private Path f38900u;

    /* renamed from: v  reason: collision with root package name */
    private Paint f38901v;

    /* renamed from: w  reason: collision with root package name */
    private Path f38902w;

    /* renamed from: x  reason: collision with root package name */
    private final Paint f38903x;

    /* renamed from: y  reason: collision with root package name */
    private float f38904y;

    /* renamed from: z  reason: collision with root package name */
    private final int[] f38905z;

    public Co2GraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38903x = new Paint();
        this.f38905z = new int[]{c(C1987R.color.statusBad), c(C1987R.color.statusBad) & Integer.MAX_VALUE, 1728053247 & c(C1987R.color.statusBad), c(C1987R.color.statusModerate) & 553648127, c(C1987R.color.statusGood) & 553648127, c(C1987R.color.statusGood) & Integer.MAX_VALUE};
        this.A = false;
        d();
    }

    private int c(int i11) {
        return getContext().getResources().getColor(i11);
    }

    private void d() {
        Paint paint = new Paint();
        this.f38895p = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f38895p.setColor(c(C1987R.color.statusBad));
        Paint paint2 = this.f38895p;
        Paint.Join join = Paint.Join.BEVEL;
        paint2.setStrokeJoin(join);
        Paint paint3 = this.f38895p;
        Paint.Cap cap = Paint.Cap.BUTT;
        paint3.setStrokeCap(cap);
        this.f38895p.setAntiAlias(true);
        this.f38895p.setStrokeWidth(3.0f);
        Paint paint4 = new Paint();
        this.f38897r = paint4;
        paint4.setStyle(style);
        this.f38897r.setColor(c(C1987R.color.statusBad));
        this.f38897r.setStrokeJoin(join);
        this.f38897r.setStrokeCap(cap);
        this.f38897r.setAntiAlias(true);
        this.f38897r.setStrokeWidth(3.0f);
        Paint paint5 = new Paint();
        this.f38899t = paint5;
        paint5.setStyle(style);
        this.f38899t.setColor(c(C1987R.color.statusModerate));
        this.f38899t.setStrokeJoin(join);
        this.f38899t.setStrokeCap(cap);
        this.f38899t.setAntiAlias(true);
        this.f38899t.setStrokeWidth(3.0f);
        Paint paint6 = new Paint();
        this.f38901v = paint6;
        paint6.setStyle(style);
        this.f38901v.setColor(c(C1987R.color.statusGood));
        Paint paint7 = this.f38901v;
        Paint.Join join2 = Paint.Join.MITER;
        paint7.setStrokeJoin(join2);
        this.f38901v.setStrokeCap(cap);
        this.f38901v.setAntiAlias(true);
        this.f38901v.setStrokeWidth(3.0f);
        Paint paint8 = new Paint();
        this.f38889j = paint8;
        paint8.setStyle(style);
        this.f38889j.setColor(c(C1987R.color.statusGood));
        this.f38889j.setStrokeJoin(join2);
        this.f38889j.setStrokeCap(cap);
        this.f38889j.setPathEffect(new DashPathEffect(new float[]{7.0f, 7.0f}, 0.0f));
        this.f38889j.setStrokeWidth(g.k(1, getContext()));
        this.f38889j.setAntiAlias(true);
        Paint paint9 = new Paint();
        this.f38891l = paint9;
        paint9.setStyle(style);
        this.f38891l.setColor(c(C1987R.color.statusModerate));
        this.f38891l.setStrokeJoin(join2);
        this.f38891l.setStrokeCap(cap);
        this.f38891l.setPathEffect(new DashPathEffect(new float[]{7.0f, 7.0f}, 10.0f));
        this.f38891l.setStrokeWidth(g.k(1, getContext()));
        this.f38891l.setAntiAlias(true);
        Paint paint10 = new Paint();
        this.f38893n = paint10;
        paint10.setStyle(style);
        this.f38893n.setColor(c(C1987R.color.statusBad));
        this.f38893n.setStrokeJoin(join2);
        this.f38893n.setStrokeCap(cap);
        this.f38893n.setPathEffect(new DashPathEffect(new float[]{7.0f, 7.0f}, 10.0f));
        this.f38893n.setStrokeWidth(g.k(1, getContext()));
        this.f38893n.setAntiAlias(true);
        setDrawingCacheEnabled(true);
    }

    @Override // uq.b
    public final rw.a a(MotionEvent motionEvent, c cVar) {
        cVar.d(getWidth());
        return this.f38884e.a(cVar.a((int) motionEvent.getX()));
    }

    @Override // uq.b
    public final float b(c cVar, rw.a aVar) {
        cVar.d(getWidth());
        return cVar.e(aVar.f95793x);
    }

    public final float e(double d11) {
        return (float) (getHeight() - ((d11 - this.f38880a) * (getHeight() / (this.f38881b - this.f38880a))));
    }

    public final float f(double d11) {
        return (float) ((d11 - this.f38882c.getMillis()) * (getWidth() / (this.f38883d.getMillis() - this.f38882c.getMillis())));
    }

    public List<Measure> getMeasures() {
        return this.f38885f;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        List<Measure> list = this.f38885f;
        if (list != null && list.size() > 0) {
            Path path = this.f38902w;
            Paint paint = this.f38903x;
            if (path == null || this.A) {
                this.A = false;
                this.f38902w = new Path();
                this.f38894o = new Path();
                this.f38896q = new Path();
                this.f38898s = new Path();
                this.f38900u = new Path();
                this.f38888i = new Path();
                this.f38890k = new Path();
                this.f38892m = new Path();
                double min = Math.min(this.f38881b, 5000.0d);
                double d11 = this.f38880a;
                double d12 = min - d11;
                double d13 = this.f38881b;
                double d14 = d13 - d11;
                float f11 = (float) (1.0d - (d12 / d14));
                double min2 = Math.min(d13, 5000.0d);
                double d15 = this.f38880a;
                double d16 = this.f38881b - d15;
                float f12 = (float) (1.0d - ((min2 - d15) / d16));
                float f13 = (float) (1.0d - ((1000.0d - d15) / d16));
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f38905z, new float[]{f11, (float) (1.0d - (d14 / d14)), f12, f13, f13, (float) (1.0d - ((d15 - d15) / d16))}, Shader.TileMode.CLAMP));
                this.f38904y = f(this.f38882c.getMillis() + 1800000.0d) - g.k(1, getContext());
                if (this.f38881b > 1000.0d && 1000.0d > this.f38880a) {
                    this.f38888i.moveTo(f(this.f38882c.getMillis()), e(1000.0d));
                    this.f38888i.lineTo(f(this.f38883d.getMillis()), e(1000.0d));
                }
                if (this.f38881b > 3000.0d && 3000.0d > this.f38880a) {
                    this.f38890k.moveTo(f(this.f38882c.getMillis()), e(3000.0d));
                    this.f38890k.lineTo(f(this.f38883d.getMillis()), e(3000.0d));
                }
                if (this.f38881b > 5000.0d && 5000.0d > this.f38880a) {
                    this.f38892m.moveTo(f(this.f38882c.getMillis()), e(5000.0d));
                    this.f38892m.lineTo(f(this.f38883d.getMillis()), e(5000.0d));
                }
                double d17 = 1000.0d;
                this.f38902w.lineTo(f(this.f38882c.getMillis()), e(1000.0d));
                for (Measure measure : this.f38885f) {
                    double d18 = measure.f95794y;
                    if (d18 < d17) {
                        this.f38900u.moveTo(f(measure.f95793x) + g.k(1, getContext()), e(measure.f95794y));
                        this.f38900u.lineTo(f(measure.f95793x) + this.f38904y, e(measure.f95794y));
                    } else if (d18 < 3000.0d) {
                        this.f38898s.moveTo(f(measure.f95793x) + g.k(1, getContext()), e(measure.f95794y));
                        this.f38898s.lineTo(f(measure.f95793x) + this.f38904y, e(measure.f95794y));
                    } else {
                        if (d18 < 5000.0d) {
                            this.f38896q.moveTo(f(measure.f95793x) + g.k(1, getContext()), e(measure.f95794y));
                            this.f38896q.lineTo(f(measure.f95793x) + this.f38904y, e(measure.f95794y));
                        } else {
                            this.f38894o.moveTo(f(measure.f95793x) + g.k(1, getContext()), e(measure.f95794y));
                            this.f38894o.lineTo(f(measure.f95793x) + this.f38904y, e(measure.f95794y));
                        }
                        this.f38902w.lineTo(f(measure.f95793x) + g.k(1, getContext()), e(1000.0d));
                        this.f38902w.lineTo(f(measure.f95793x) + g.k(1, getContext()), e(measure.f95794y));
                        this.f38902w.lineTo(f(measure.f95793x) + this.f38904y, e(measure.f95794y));
                        this.f38902w.lineTo(f(measure.f95793x) + this.f38904y, e(1000.0d));
                        d17 = 1000.0d;
                    }
                    this.f38902w.lineTo(f(measure.f95793x) + g.k(1, getContext()), e(1000.0d));
                    this.f38902w.lineTo(f(measure.f95793x) + g.k(1, getContext()), e(measure.f95794y));
                    this.f38902w.lineTo(f(measure.f95793x) + this.f38904y, e(measure.f95794y));
                    this.f38902w.lineTo(f(measure.f95793x) + this.f38904y, e(1000.0d));
                    d17 = 1000.0d;
                }
                this.f38902w.lineTo(f(this.f38882c.getMillis()), e(d17));
            }
            canvas.drawPath(this.f38902w, paint);
            canvas.drawPath(this.f38888i, this.f38889j);
            canvas.drawPath(this.f38890k, this.f38891l);
            canvas.drawPath(this.f38890k, this.f38893n);
            canvas.drawPath(this.f38894o, this.f38895p);
            canvas.drawPath(this.f38896q, this.f38897r);
            canvas.drawPath(this.f38898s, this.f38899t);
            canvas.drawPath(this.f38900u, this.f38901v);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
        super.onLayout(z5, i11, i12, i13, i14);
        this.A = true;
        invalidate();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.A = true;
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f38886g;
        if (gestureDetector == null) {
            return false;
        }
        if (gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        View.OnTouchListener onTouchListener = this.f38887h;
        if (onTouchListener == null) {
            return false;
        }
        return onTouchListener.onTouch(this, motionEvent);
    }

    public void setBaseData(List<Measure> list) {
        DateTime withTimeAtStartOfDay = new DateTime((long) list.get(0).f95793x).withTimeAtStartOfDay();
        this.f38882c = withTimeAtStartOfDay;
        this.f38883d = withTimeAtStartOfDay.plusDays(1).minusMinutes(29);
        this.f38884e = new uq.a(list);
        this.f38885f = list;
        this.A = true;
        invalidate();
    }

    public void setCustomTouchListener(View.OnTouchListener onTouchListener) {
        this.f38887h = onTouchListener;
    }

    public void setGestureDetector(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f38886g = new GestureDetector(getContext(), simpleOnGestureListener);
    }

    public void setMaxY(double d11) {
        this.f38881b = Math.max(d11, 2000.0d) + 10.0d;
        this.A = true;
        invalidate();
    }

    public void setMinY(double d11) {
        this.f38880a = Math.min(800.0d, d11) - 10.0d;
        this.A = true;
        invalidate();
    }

    public Co2GraphView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f38903x = new Paint();
        this.f38905z = new int[]{c(C1987R.color.statusBad), c(C1987R.color.statusBad) & Integer.MAX_VALUE, c(C1987R.color.statusBad) & 1728053247, c(C1987R.color.statusModerate) & 553648127, c(C1987R.color.statusGood) & 553648127, c(C1987R.color.statusGood) & Integer.MAX_VALUE};
        this.A = false;
        d();
    }
}
