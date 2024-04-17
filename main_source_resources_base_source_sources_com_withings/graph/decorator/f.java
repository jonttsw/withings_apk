package com.withings.graph.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.e;
import kotlin.jvm.internal.u;
/* compiled from: FilterTrendDecorator.kt */
/* loaded from: classes3.dex */
public final class f extends Decorator {

    /* renamed from: k  reason: collision with root package name */
    private final e f39772k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f39773l;

    /* renamed from: m  reason: collision with root package name */
    private final PointF f39774m;

    /* renamed from: n  reason: collision with root package name */
    private final PointF f39775n;

    /* compiled from: FilterTrendDecorator.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Decorator.a<f, a> {

        /* renamed from: j  reason: collision with root package name */
        private final Context f39776j;

        /* renamed from: k  reason: collision with root package name */
        private String f39777k;

        /* renamed from: l  reason: collision with root package name */
        private String f39778l;

        /* renamed from: m  reason: collision with root package name */
        private int f39779m;

        /* renamed from: n  reason: collision with root package name */
        private int f39780n;

        /* renamed from: o  reason: collision with root package name */
        private int f39781o;

        /* renamed from: p  reason: collision with root package name */
        private int f39782p;

        /* renamed from: q  reason: collision with root package name */
        private int f39783q;

        /* renamed from: r  reason: collision with root package name */
        private int f39784r;

        /* renamed from: s  reason: collision with root package name */
        private float f39785s;

        /* renamed from: t  reason: collision with root package name */
        private Typeface f39786t;

        /* renamed from: u  reason: collision with root package name */
        private String f39787u;

        public a(Context context) {
            u.j(context, "context");
            this.f39776j = context;
            this.f39777k = "";
            this.f39778l = "";
            this.f39779m = 12;
            this.f39780n = 14;
            this.f39781o = 5;
            this.f39782p = Integer.MIN_VALUE;
            this.f39783q = Integer.MIN_VALUE;
            this.f39784r = Integer.MIN_VALUE;
            this.f39785s = 10.0f;
            this.f39787u = "";
        }

        public final void A() {
            this.f39780n = 18;
        }

        public final f p() {
            e.a aVar = new e.a(this.f39776j);
            aVar.r(this.f39777k);
            aVar.q(this.f39778l);
            aVar.v(this.f39782p);
            aVar.x(this.f39783q);
            aVar.s(this.f39786t);
            aVar.w(this.f39779m);
            aVar.y(this.f39780n);
            aVar.t(this.f39781o);
            aVar.u();
            e p11 = aVar.p();
            Paint paint = new Paint();
            paint.setColor(this.f39784r);
            paint.setStrokeWidth(this.f39785s);
            paint.setAntiAlias(true);
            return new f(this, this.f39787u, p11, paint);
        }

        public final void q(String str) {
            this.f39778l = str;
        }

        public final void r(String str) {
            this.f39777k = str;
        }

        public final void s(Typeface typeface) {
            this.f39786t = typeface;
        }

        public final void t(int i11) {
            this.f39784r = i11;
        }

        public final void u(float f11) {
            this.f39785s = f11;
        }

        public final void v() {
            this.f39781o = 5;
        }

        public final void w() {
            this.f39787u = "filter-trend-decorator";
        }

        public final void x(int i11) {
            this.f39782p = i11;
        }

        public final void y() {
            this.f39779m = 12;
        }

        public final void z(int i11) {
            this.f39783q = i11;
        }
    }

    public f(a aVar, String str, e eVar, Paint paint) {
        super(aVar);
        this.f39772k = eVar;
        this.f39773l = paint;
        this.f39774m = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);
        this.f39775n = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);
        this.f100573g = str;
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        u.j(graphView, "graphView");
        u.j(canvas, "canvas");
        if (!this.f100571e) {
            return;
        }
        PointF pointF = this.f39774m;
        float q11 = graphView.q(pointF.x);
        float r7 = graphView.r(pointF.y);
        PointF pointF2 = this.f39775n;
        canvas.drawLine(q11, r7, graphView.q(pointF2.x), graphView.r(pointF2.y), this.f39773l);
        this.f39772k.a(graphView, canvas);
    }

    public final void o(float f11, float f12, float f13, float f14) {
        PointF pointF = this.f39774m;
        pointF.x = f11;
        pointF.y = f12;
        PointF pointF2 = this.f39775n;
        pointF2.x = f13;
        pointF2.y = f14;
        this.f39772k.o(f11, f12, f13, f14);
    }
}
