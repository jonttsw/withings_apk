package com.withings.graph.decorator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
/* compiled from: EnvelopDecorator.java */
/* loaded from: classes3.dex */
public final class b extends Decorator {

    /* renamed from: k  reason: collision with root package name */
    private Path f39687k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f39688l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f39689m;

    /* renamed from: n  reason: collision with root package name */
    private float f39690n;

    /* renamed from: o  reason: collision with root package name */
    private int f39691o;

    /* renamed from: p  reason: collision with root package name */
    private int f39692p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f39693q;

    /* renamed from: r  reason: collision with root package name */
    private float f39694r;

    /* renamed from: s  reason: collision with root package name */
    private int f39695s;

    /* renamed from: t  reason: collision with root package name */
    private int f39696t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f39697u;

    /* renamed from: v  reason: collision with root package name */
    private int f39698v;

    /* renamed from: w  reason: collision with root package name */
    private Paint f39699w;

    /* compiled from: EnvelopDecorator.java */
    /* loaded from: classes3.dex */
    public static class a extends Decorator.a<b, a> {

        /* renamed from: j  reason: collision with root package name */
        private float f39700j;

        /* renamed from: k  reason: collision with root package name */
        private float f39701k;

        /* renamed from: l  reason: collision with root package name */
        private int f39702l;

        /* renamed from: m  reason: collision with root package name */
        private int f39703m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f39704n;

        /* renamed from: o  reason: collision with root package name */
        private int f39705o;

        /* renamed from: p  reason: collision with root package name */
        private int f39706p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f39707q;

        /* renamed from: r  reason: collision with root package name */
        private Paint f39708r;

        /* renamed from: s  reason: collision with root package name */
        private int f39709s;

        public a() {
            int i11 = ts.d.f100566i;
            this.f39702l = i11;
            this.f39703m = 6;
            this.f39704n = true;
            this.f39705o = i11;
            this.f39706p = 6;
            this.f39707q = true;
            this.f39709s = -65536;
        }

        public final void A(int i11) {
            this.f39709s = i11;
        }

        public final void B(Paint paint) {
            this.f39708r = paint;
        }

        public final void C(int i11) {
            this.f39705o = i11;
        }

        public final void D(int i11) {
            this.f39706p = i11;
        }

        public final void E(float f11) {
            this.f39701k = f11;
        }

        public final void F(int i11) {
            this.f39702l = i11;
        }

        public final void G(int i11) {
            this.f39703m = i11;
        }

        public final void H(float f11) {
            this.f39700j = f11;
        }

        public final void I(boolean z5) {
            this.f39707q = z5;
        }

        public final void J() {
            this.f39704n = false;
        }

        public final b z() {
            return new b(this);
        }
    }

    protected b(a aVar) {
        super(aVar);
        this.f39690n = aVar.f39700j;
        this.f39692p = aVar.f39703m;
        this.f39691o = aVar.f39702l;
        this.f39693q = aVar.f39704n;
        this.f39694r = aVar.f39701k;
        this.f39696t = aVar.f39706p;
        this.f39695s = aVar.f39705o;
        this.f39697u = aVar.f39707q;
        this.f39698v = aVar.f39709s;
        this.f39699w = aVar.f39708r;
        this.f39687k = new Path();
        if (this.f39688l == null) {
            Paint paint = new Paint(1);
            this.f39688l = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f39688l.setStrokeJoin(Paint.Join.ROUND);
            this.f39688l.setStrokeWidth(this.f39692p);
            this.f39688l.setColor(this.f39691o);
        }
        if (this.f39689m == null) {
            Paint paint2 = new Paint(1);
            this.f39689m = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f39689m.setStrokeJoin(Paint.Join.ROUND);
            this.f39689m.setStrokeWidth(this.f39696t);
            this.f39689m.setColor(this.f39695s);
        }
        if (this.f39699w == null) {
            Paint paint3 = new Paint(1);
            this.f39699w = paint3;
            paint3.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f39699w.setStrokeJoin(Paint.Join.ROUND);
            this.f39699w.setColor(this.f39698v);
            this.f39699w.setAntiAlias(true);
        }
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        if (this.f100571e) {
            float f11 = this.f39690n;
            Path path = this.f39687k;
            path.rewind();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(graphView.getContentRect().left, graphView.r(f11));
            path.lineTo(graphView.getContentRect().right, graphView.r(f11));
            float f12 = f11 - (f11 - this.f39694r);
            path.lineTo(graphView.getContentRect().right, graphView.r(f12));
            path.lineTo(graphView.getContentRect().left, graphView.r(f12));
            path.lineTo(graphView.getContentRect().left, graphView.r(f11));
            canvas.drawPath(path, this.f39699w);
            path.close();
            int i11 = this.f39691o;
            float f13 = this.f39690n;
            if (this.f39693q) {
                path.rewind();
                this.f39688l.setColor(i11);
                path.moveTo(graphView.getContentRect().left, graphView.r(f13));
                path.lineTo(graphView.getContentRect().right, graphView.r(f13));
                canvas.drawPath(path, this.f39688l);
            }
            int i12 = this.f39695s;
            float f14 = this.f39694r;
            if (this.f39697u) {
                path.rewind();
                this.f39689m.setColor(i12);
                path.moveTo(graphView.getContentRect().left, graphView.r(f14));
                path.lineTo(graphView.getContentRect().right, graphView.r(f14));
                canvas.drawPath(path, this.f39689m);
            }
        }
    }
}
