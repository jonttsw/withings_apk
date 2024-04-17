package com.withings.graph.axis;

import ah.u;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
/* compiled from: Axis.java */
/* loaded from: classes3.dex */
public abstract class a {
    protected int A;
    protected int B;
    protected int C;
    private final et.a D;

    /* renamed from: a  reason: collision with root package name */
    protected int f39607a;

    /* renamed from: b  reason: collision with root package name */
    protected int f39608b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f39609c;

    /* renamed from: d  reason: collision with root package name */
    protected b f39610d;

    /* renamed from: e  reason: collision with root package name */
    protected final float f39611e;

    /* renamed from: f  reason: collision with root package name */
    protected float f39612f;

    /* renamed from: g  reason: collision with root package name */
    protected final int f39613g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f39614h;

    /* renamed from: i  reason: collision with root package name */
    protected Paint f39615i;

    /* renamed from: j  reason: collision with root package name */
    protected float f39616j;

    /* renamed from: k  reason: collision with root package name */
    protected int f39617k;

    /* renamed from: l  reason: collision with root package name */
    protected int f39618l;

    /* renamed from: m  reason: collision with root package name */
    protected int f39619m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f39620n;

    /* renamed from: o  reason: collision with root package name */
    protected TextPaint f39621o;

    /* renamed from: p  reason: collision with root package name */
    protected int f39622p;

    /* renamed from: q  reason: collision with root package name */
    protected int f39623q;

    /* renamed from: r  reason: collision with root package name */
    protected int f39624r;

    /* renamed from: s  reason: collision with root package name */
    protected int f39625s;

    /* renamed from: t  reason: collision with root package name */
    protected int f39626t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f39627u;

    /* renamed from: v  reason: collision with root package name */
    protected Path f39628v;

    /* renamed from: w  reason: collision with root package name */
    protected Rect f39629w;

    /* renamed from: x  reason: collision with root package name */
    protected Paint f39630x;

    /* renamed from: y  reason: collision with root package name */
    protected int f39631y;

    /* renamed from: z  reason: collision with root package name */
    protected int f39632z;

    /* compiled from: Axis.java */
    /* renamed from: com.withings.graph.axis.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0518a<S extends a, T extends AbstractC0518a<S, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final int f39633a;

        /* renamed from: b  reason: collision with root package name */
        private final int f39634b;

        /* renamed from: l  reason: collision with root package name */
        private TextPaint f39644l;

        /* renamed from: m  reason: collision with root package name */
        private b f39645m;

        /* renamed from: p  reason: collision with root package name */
        private int f39648p;

        /* renamed from: c  reason: collision with root package name */
        private boolean f39635c = true;

        /* renamed from: d  reason: collision with root package name */
        protected float f39636d = 0.01f;

        /* renamed from: e  reason: collision with root package name */
        protected int f39637e = 4;

        /* renamed from: f  reason: collision with root package name */
        private boolean f39638f = true;

        /* renamed from: g  reason: collision with root package name */
        private boolean f39639g = true;

        /* renamed from: h  reason: collision with root package name */
        private float f39640h = 2.0f;

        /* renamed from: i  reason: collision with root package name */
        private int f39641i = -3355444;

        /* renamed from: j  reason: collision with root package name */
        private int f39642j = 6;

        /* renamed from: k  reason: collision with root package name */
        private int f39643k = 10;

        /* renamed from: n  reason: collision with root package name */
        private boolean f39646n = false;

        /* renamed from: o  reason: collision with root package name */
        private int f39647o = -65536;

        /* renamed from: q  reason: collision with root package name */
        private int f39649q = -1;

        public AbstractC0518a(int i11, int i12) {
            this.f39633a = i11;
            this.f39634b = i12;
        }

        public final void A(float f11) {
            this.f39636d = f11;
        }

        public final void B(boolean z5) {
            this.f39638f = z5;
        }

        public final void C() {
            this.f39639g = false;
        }

        public final void D() {
            this.f39646n = true;
        }

        public final void p(int i11) {
            this.f39648p = i11;
        }

        public final void q(int i11) {
            this.f39649q = i11;
        }

        public final void r(int i11) {
            this.f39641i = i11;
        }

        public final void s(int i11) {
            this.f39642j = i11;
        }

        public final void t(int i11) {
            this.f39643k = i11;
        }

        public final void u(float f11) {
            this.f39640h = f11;
        }

        public final void v(boolean z5) {
            this.f39635c = z5;
        }

        public final void w(int i11) {
            this.f39647o = i11;
        }

        public final void x(TextPaint textPaint) {
            this.f39644l = textPaint;
        }

        public final void y(b bVar) {
            this.f39645m = bVar;
        }

        public final void z(int i11) {
            this.f39637e = i11;
        }
    }

    /* compiled from: Axis.java */
    /* loaded from: classes3.dex */
    public interface b {
        String c(float f11, float f12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, et.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, et.a] */
    public a(AbstractC0518a<?, ?> abstractC0518a) {
        this.f39607a = ((AbstractC0518a) abstractC0518a).f39633a;
        this.f39608b = ((AbstractC0518a) abstractC0518a).f39634b;
        boolean z5 = ((AbstractC0518a) abstractC0518a).f39635c;
        this.f39609c = z5;
        if (z5) {
            this.D = new Object();
        } else {
            this.D = new Object();
        }
        float f11 = abstractC0518a.f39636d;
        this.f39611e = f11;
        this.f39613g = abstractC0518a.f39637e;
        this.f39612f = f11;
        this.f39614h = ((AbstractC0518a) abstractC0518a).f39638f;
        this.f39620n = ((AbstractC0518a) abstractC0518a).f39639g;
        this.f39626t = ((AbstractC0518a) abstractC0518a).f39648p;
        this.f39615i = null;
        this.f39617k = ((AbstractC0518a) abstractC0518a).f39641i;
        this.f39616j = ((AbstractC0518a) abstractC0518a).f39640h;
        this.f39618l = ((AbstractC0518a) abstractC0518a).f39642j;
        this.f39619m = ((AbstractC0518a) abstractC0518a).f39643k;
        this.f39621o = ((AbstractC0518a) abstractC0518a).f39644l;
        this.f39624r = -7829368;
        this.f39622p = 30;
        this.f39610d = ((AbstractC0518a) abstractC0518a).f39645m;
        this.f39627u = ((AbstractC0518a) abstractC0518a).f39646n;
        this.f39630x = null;
        this.f39631y = ((AbstractC0518a) abstractC0518a).f39647o;
        this.f39632z = 30;
        this.A = 8;
        this.B = 16;
        this.C = ((AbstractC0518a) abstractC0518a).f39649q;
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(float f11, float f12, ls.a aVar) {
        float d11;
        double d12;
        double d13;
        float f13;
        float f14 = f12 - f11;
        if (f14 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            aVar.f80100a = new float[0];
            aVar.f80101b = 0;
            return;
        }
        this.f39612f = this.D.d(this.f39613g, f14, this.f39611e);
        if (this.f39609c) {
            d12 = Math.ceil(f11 / d11) * this.f39612f;
            d13 = Math.nextUp(Math.floor(f12 / f13) * this.f39612f);
        } else {
            d12 = f11;
            d13 = f12;
        }
        double d14 = d12;
        int i11 = 0;
        while (d14 <= d13) {
            i11++;
            d14 += this.f39612f;
        }
        aVar.f80101b = i11;
        if (aVar.f80100a.length < i11) {
            aVar.f80100a = new float[i11];
        }
        for (int i12 = 0; i12 < i11; i12++) {
            aVar.f80100a[i12] = (float) d12;
            d12 += this.f39612f;
        }
    }

    public final int b() {
        return this.f39608b;
    }

    public final int c() {
        return this.f39625s;
    }

    public final int d() {
        return this.f39607a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        if (this.f39614h && this.f39615i == null) {
            Paint paint = new Paint();
            this.f39615i = paint;
            paint.setStrokeWidth(this.f39616j);
            this.f39615i.setColor(this.f39617k);
            this.f39615i.setStyle(Paint.Style.STROKE);
        }
        if (this.f39621o == null) {
            TextPaint textPaint = new TextPaint();
            this.f39621o = textPaint;
            textPaint.setAntiAlias(true);
            this.f39621o.setTextSize(this.f39622p);
            this.f39621o.setColor(u.j(1.0f, this.f39624r));
            this.f39623q = (int) Math.abs(this.f39621o.getFontMetrics().top);
        }
        if (this.f39627u && this.f39630x == null) {
            this.f39628v = new Path();
            this.f39629w = new Rect();
            Paint paint2 = new Paint();
            this.f39630x = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.f39630x.setColor(this.f39631y);
            this.f39630x.setAntiAlias(true);
        }
        this.f39625s = (int) Math.abs(this.f39621o.getFontMetrics().top);
    }
}
