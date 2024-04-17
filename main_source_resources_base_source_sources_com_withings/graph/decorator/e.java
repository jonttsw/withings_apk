package com.withings.graph.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.d;
import kotlin.jvm.internal.u;
import rs.b;
/* compiled from: FilterRangeDecorator.kt */
/* loaded from: classes3.dex */
public final class e extends Decorator {

    /* renamed from: k  reason: collision with root package name */
    private final d f39760k;

    /* renamed from: l  reason: collision with root package name */
    private final d f39761l;

    /* compiled from: FilterRangeDecorator.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Decorator.a<e, a> {

        /* renamed from: j  reason: collision with root package name */
        private final Context f39762j;

        /* renamed from: k  reason: collision with root package name */
        private String f39763k;

        /* renamed from: l  reason: collision with root package name */
        private String f39764l;

        /* renamed from: m  reason: collision with root package name */
        private int f39765m;

        /* renamed from: n  reason: collision with root package name */
        private int f39766n;

        /* renamed from: o  reason: collision with root package name */
        private int f39767o;

        /* renamed from: p  reason: collision with root package name */
        private int f39768p;

        /* renamed from: q  reason: collision with root package name */
        private int f39769q;

        /* renamed from: r  reason: collision with root package name */
        private Typeface f39770r;

        /* renamed from: s  reason: collision with root package name */
        private String f39771s;

        public a(Context context) {
            u.j(context, "context");
            this.f39762j = context;
            this.f39763k = "";
            this.f39764l = "";
            this.f39765m = 12;
            this.f39766n = 14;
            this.f39767o = 5;
            this.f39768p = Integer.MIN_VALUE;
            this.f39769q = Integer.MIN_VALUE;
            this.f39771s = "";
        }

        public final e p() {
            Context context = this.f39762j;
            d.a aVar = new d.a(context);
            aVar.r(this.f39763k);
            Decorator.DrawOrder drawOrder = Decorator.DrawOrder.f39680d;
            aVar.f39682i = drawOrder;
            aVar.v(this.f39768p);
            aVar.x(this.f39769q);
            aVar.s(this.f39770r);
            aVar.w(this.f39765m);
            aVar.y(this.f39766n);
            aVar.t(this.f39767o);
            b.a aVar2 = new b.a(0.0f, 0.0f);
            int i11 = this.f39769q;
            aVar2.c(i11, i11, i11);
            int i12 = this.f39768p;
            aVar2.g(i12, i12, i12);
            aVar2.f95629d = false;
            aVar.q(new rs.b(aVar2));
            aVar.u("filter-range-min-decorator");
            d p11 = aVar.p();
            d.a aVar3 = new d.a(context);
            aVar3.r(this.f39764l);
            aVar3.f39682i = drawOrder;
            aVar3.v(this.f39768p);
            aVar3.x(this.f39769q);
            aVar3.s(this.f39770r);
            aVar3.w(this.f39765m);
            aVar3.y(this.f39766n);
            aVar3.t(this.f39767o);
            b.a aVar4 = new b.a(0.0f, 0.0f);
            int i13 = this.f39769q;
            aVar4.c(i13, i13, i13);
            int i14 = this.f39768p;
            aVar4.g(i14, i14, i14);
            aVar4.f95629d = false;
            aVar3.q(new rs.b(aVar4));
            aVar3.u("filter-range-max-decorator");
            return new e(this, this.f39771s, p11, aVar3.p());
        }

        public final void q(String title) {
            u.j(title, "title");
            this.f39764l = title;
        }

        public final void r(String title) {
            u.j(title, "title");
            this.f39763k = title;
        }

        public final void s(Typeface typeface) {
            this.f39770r = typeface;
        }

        public final void t(int i11) {
            this.f39767o = i11;
        }

        public final void u() {
            this.f39771s = "filter-trend-range-decorator";
        }

        public final void v(int i11) {
            this.f39768p = i11;
        }

        public final void w(int i11) {
            this.f39765m = i11;
        }

        public final void x(int i11) {
            this.f39769q = i11;
        }

        public final void y(int i11) {
            this.f39766n = i11;
        }
    }

    public e(a aVar, String str, d dVar, d dVar2) {
        super(aVar);
        this.f39760k = dVar;
        this.f39761l = dVar2;
        this.f100573g = str;
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        u.j(graphView, "graphView");
        u.j(canvas, "canvas");
        if (!this.f100571e) {
            return;
        }
        this.f39760k.a(graphView, canvas);
        this.f39761l.a(graphView, canvas);
    }

    public final void o(float f11, float f12, float f13, float f14) {
        this.f39760k.o(f11, f12);
        this.f39761l.o(f13, f14);
    }
}
