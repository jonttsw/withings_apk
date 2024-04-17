package com.withings.graph.decorator;

import ah.u;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import com.withings.graph.GraphView;
import com.withings.graph.axis.VerticalAxis;
import com.withings.graph.decorator.Decorator;
/* compiled from: HorizontalLineDecorator.java */
/* loaded from: classes3.dex */
public final class g extends Decorator {

    /* renamed from: k  reason: collision with root package name */
    private Path f39788k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f39789l;

    /* renamed from: m  reason: collision with root package name */
    private TextPaint f39790m;

    /* renamed from: n  reason: collision with root package name */
    protected int f39791n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f39792o;

    /* renamed from: p  reason: collision with root package name */
    protected String f39793p;

    /* renamed from: q  reason: collision with root package name */
    protected VerticalAxis.VerticalAxisPosition f39794q;

    /* renamed from: r  reason: collision with root package name */
    protected Paint.Align f39795r;

    /* renamed from: s  reason: collision with root package name */
    private b f39796s;

    /* renamed from: t  reason: collision with root package name */
    private int f39797t;

    /* renamed from: u  reason: collision with root package name */
    private float f39798u;

    /* renamed from: v  reason: collision with root package name */
    private Float f39799v;

    /* renamed from: w  reason: collision with root package name */
    private Float f39800w;

    /* compiled from: HorizontalLineDecorator.java */
    /* loaded from: classes3.dex */
    public static class a extends Decorator.a<g, a> {

        /* renamed from: j  reason: collision with root package name */
        private float f39801j;

        /* renamed from: k  reason: collision with root package name */
        private Float f39802k;

        /* renamed from: l  reason: collision with root package name */
        private Float f39803l;

        /* renamed from: y  reason: collision with root package name */
        private b f39816y;

        /* renamed from: m  reason: collision with root package name */
        private int f39804m = -3355444;

        /* renamed from: n  reason: collision with root package name */
        private int f39805n = 2;

        /* renamed from: o  reason: collision with root package name */
        private boolean f39806o = true;

        /* renamed from: p  reason: collision with root package name */
        private int f39807p = 30;

        /* renamed from: q  reason: collision with root package name */
        private int f39808q = -7829368;

        /* renamed from: r  reason: collision with root package name */
        private int f39809r = 40;

        /* renamed from: s  reason: collision with root package name */
        private int f39810s = -65536;

        /* renamed from: t  reason: collision with root package name */
        private int f39811t = 30;

        /* renamed from: u  reason: collision with root package name */
        private int f39812u = 8;

        /* renamed from: v  reason: collision with root package name */
        private int f39813v = 16;

        /* renamed from: w  reason: collision with root package name */
        private boolean f39814w = false;

        /* renamed from: x  reason: collision with root package name */
        private Paint.Align f39815x = Paint.Align.CENTER;

        /* renamed from: z  reason: collision with root package name */
        protected VerticalAxis.VerticalAxisPosition f39817z = VerticalAxis.VerticalAxisPosition.f39599a;

        public final g F() {
            return new g(this);
        }

        public final void G(boolean z5) {
            this.f39806o = z5;
        }

        public final void H(int i11) {
            this.f39804m = i11;
        }

        public final void I(b bVar) {
            this.f39816y = bVar;
        }

        public final void J(int i11) {
            this.f39805n = i11;
        }

        public final void K(Float f11) {
            this.f39802k = f11;
        }

        public final void L(Float f11) {
            this.f39803l = f11;
        }

        public final void M(float f11) {
            this.f39801j = f11;
        }

        public final void N(boolean z5) {
            this.f39814w = z5;
        }
    }

    /* compiled from: HorizontalLineDecorator.java */
    /* loaded from: classes3.dex */
    public interface b {
    }

    protected g(a aVar) {
        super(aVar);
        this.f39798u = aVar.f39801j;
        this.f39799v = aVar.f39802k;
        this.f39800w = aVar.f39803l;
        this.f39789l = null;
        int i11 = aVar.f39804m;
        this.f39797t = i11;
        int i12 = aVar.f39805n;
        boolean z5 = aVar.f39806o;
        this.f39790m = null;
        int i13 = aVar.f39808q;
        int i14 = aVar.f39807p;
        int unused = aVar.f39810s;
        int unused2 = aVar.f39811t;
        int unused3 = aVar.f39812u;
        int unused4 = aVar.f39813v;
        this.f39794q = aVar.f39817z;
        this.f39791n = aVar.f39809r;
        this.f39792o = aVar.f39814w;
        this.f39793p = null;
        this.f39795r = aVar.f39815x;
        this.f39796s = aVar.f39816y;
        this.f39788k = new Path();
        if (this.f39789l == null) {
            Paint paint = new Paint(1);
            this.f39789l = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f39789l.setStrokeJoin(Paint.Join.ROUND);
            this.f39789l.setStrokeWidth(i12);
            this.f39789l.setColor(i11);
        }
        if (this.f39790m == null) {
            TextPaint textPaint = new TextPaint();
            this.f39790m = textPaint;
            textPaint.setAntiAlias(true);
            this.f39790m.setTextSize(i14);
            this.f39790m.setColor(u.j(1.0f, i13));
            Math.abs(this.f39790m.getFontMetrics().top);
        }
        Math.abs(this.f39790m.getFontMetrics().top);
        if (z5) {
            this.f39789l.setPathEffect(new DashPathEffect(new float[]{6.0f, 10.0f, 6.0f, 10.0f}, 6.0f));
        }
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        float f11;
        float f12;
        int i11;
        float f13;
        if (!this.f100571e) {
            return;
        }
        this.f39788k.rewind();
        this.f39789l.setColor(this.f39797t);
        Path path = this.f39788k;
        Float f14 = this.f39799v;
        if (f14 != null) {
            f11 = graphView.q(f14.floatValue());
        } else {
            f11 = graphView.getContentRect().left;
        }
        float f15 = this.f39798u;
        path.moveTo(f11, graphView.r(f15));
        Path path2 = this.f39788k;
        Float f16 = this.f39800w;
        if (f16 != null) {
            f12 = graphView.q(f16.floatValue());
        } else {
            f12 = graphView.getContentRect().right;
        }
        path2.lineTo(f12, graphView.r(f15));
        canvas.drawPath(this.f39788k, this.f39789l);
        if (this.f39792o) {
            this.f39790m.setTextAlign(this.f39795r);
            if (this.f39793p == null) {
                if (this.f39796s != null) {
                    this.f39793p = String.valueOf((int) f15);
                } else {
                    this.f39793p = String.valueOf(f15);
                }
            }
            if (this.f39791n == 40) {
                this.f39791n = (int) this.f39790m.measureText(this.f39793p);
            }
            int ordinal = this.f39794q.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        f13 = (this.f39791n / 2) + graphView.getContentRect().right;
                        canvas.drawText(this.f39793p, f13 + 0, ((this.f39790m.descent() - this.f39790m.ascent()) / 2.0f) + (graphView.r(f15) - this.f39790m.descent()), this.f39790m);
                    }
                    i11 = this.f39791n / 2;
                } else {
                    i11 = graphView.getContentRect().right - (this.f39791n / 2);
                }
            } else {
                i11 = graphView.getContentRect().left;
            }
            f13 = i11;
            canvas.drawText(this.f39793p, f13 + 0, ((this.f39790m.descent() - this.f39790m.ascent()) / 2.0f) + (graphView.r(f15) - this.f39790m.descent()), this.f39790m);
        }
    }
}
