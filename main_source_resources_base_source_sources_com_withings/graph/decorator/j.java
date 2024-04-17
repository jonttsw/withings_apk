package com.withings.graph.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
/* compiled from: TextDecorator.java */
/* loaded from: classes3.dex */
public final class j extends Decorator {
    private int A;
    private int B;
    private TextPaint C;
    private int D;
    private int E;

    /* renamed from: k  reason: collision with root package name */
    private float f39849k;

    /* renamed from: l  reason: collision with root package name */
    private float f39850l;

    /* renamed from: m  reason: collision with root package name */
    private String f39851m;

    /* renamed from: n  reason: collision with root package name */
    private int f39852n;

    /* renamed from: o  reason: collision with root package name */
    private Path f39853o;

    /* renamed from: p  reason: collision with root package name */
    private Rect f39854p;

    /* renamed from: q  reason: collision with root package name */
    private Paint f39855q;

    /* renamed from: r  reason: collision with root package name */
    private int f39856r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f39857s;

    /* renamed from: t  reason: collision with root package name */
    private int f39858t;

    /* renamed from: u  reason: collision with root package name */
    private int f39859u;

    /* renamed from: v  reason: collision with root package name */
    private int f39860v;

    /* renamed from: w  reason: collision with root package name */
    private int f39861w;

    /* renamed from: x  reason: collision with root package name */
    private int f39862x;

    /* renamed from: y  reason: collision with root package name */
    private int f39863y;

    /* renamed from: z  reason: collision with root package name */
    private int f39864z;

    /* compiled from: TextDecorator.java */
    /* loaded from: classes3.dex */
    public static class a extends Decorator.a<j, a> {
        private TextPaint C;

        /* renamed from: j  reason: collision with root package name */
        private Context f39865j;

        /* renamed from: k  reason: collision with root package name */
        private float f39866k = Float.MIN_VALUE;

        /* renamed from: l  reason: collision with root package name */
        private float f39867l = Float.MIN_VALUE;

        /* renamed from: m  reason: collision with root package name */
        private String f39868m = "";

        /* renamed from: n  reason: collision with root package name */
        private int f39869n = 0;

        /* renamed from: o  reason: collision with root package name */
        private Rect f39870o = new Rect();

        /* renamed from: p  reason: collision with root package name */
        private int f39871p = -16777216;

        /* renamed from: q  reason: collision with root package name */
        private int f39872q = 0;

        /* renamed from: r  reason: collision with root package name */
        private boolean f39873r = false;

        /* renamed from: s  reason: collision with root package name */
        private int f39874s = -16777216;

        /* renamed from: t  reason: collision with root package name */
        private Paint.Style f39875t = Paint.Style.FILL;

        /* renamed from: u  reason: collision with root package name */
        private int f39876u = 0;

        /* renamed from: v  reason: collision with root package name */
        private int f39877v = 0;

        /* renamed from: w  reason: collision with root package name */
        private int f39878w = 0;

        /* renamed from: x  reason: collision with root package name */
        private int f39879x = 0;

        /* renamed from: y  reason: collision with root package name */
        private int f39880y = 0;

        /* renamed from: z  reason: collision with root package name */
        private int f39881z = 0;
        private int A = 0;
        private int B = 0;
        private int D = -7829368;
        private int E = 30;

        public a(Context context) {
            this.f39865j = context;
        }

        public final void K(int i11) {
            this.f39871p = i11;
        }

        public final j L() {
            return new j(this);
        }

        public final void M(int i11) {
            this.f39869n = i11;
        }

        public final void N() {
            this.f39873r = true;
        }

        public final void O(int i11) {
            this.A = -ah.g.k(i11, this.f39865j);
        }

        public final void P(int i11, int i12) {
            if (i12 == 1) {
                i11 = ah.g.k(i11, this.f39865j);
            }
            this.B = i11;
        }

        public final void Q(int i11) {
            this.B = -ah.g.k(i11, this.f39865j);
        }

        public final void R(int i11) {
            this.A = ah.g.k(i11, this.f39865j);
        }

        public final void S(int i11) {
            this.f39880y = i11;
            this.f39878w = i11;
            this.f39879x = i11;
            this.f39881z = i11;
        }

        public final void T(int i11) {
            this.f39881z = i11;
        }

        public final void U(int i11) {
            this.f39878w = i11;
        }

        public final void V(int i11) {
            this.f39880y = i11;
        }

        public final void W(int i11) {
            this.f39879x = i11;
        }

        public final void X(int i11) {
            this.f39872q = i11;
        }

        public final void Y(Paint.Style style) {
            this.f39875t = style;
        }

        public final void Z(String str) {
            this.f39868m = str;
        }

        public final void a0(TextPaint textPaint) {
            this.C = textPaint;
        }

        public final void b0(int i11, int i12, int i13) {
            this.f39876u = i11;
            this.f39877v = i12;
            this.f39874s = i13;
        }

        public final void c0(float f11) {
            this.f39866k = f11;
        }

        public final void d0(float f11) {
            this.f39867l = f11;
        }
    }

    protected j(a aVar) {
        super(aVar);
        String str = aVar.f39868m;
        this.f39851m = str;
        this.f39849k = aVar.f39866k;
        this.f39850l = aVar.f39867l;
        this.f39852n = aVar.f39869n;
        this.f39854p = aVar.f39870o;
        this.f39855q = null;
        int i11 = aVar.f39871p;
        this.f39856r = aVar.f39872q;
        this.f39861w = aVar.f39878w;
        this.f39862x = aVar.f39879x;
        this.f39863y = aVar.f39880y;
        this.f39864z = aVar.f39881z;
        this.A = aVar.A;
        this.B = aVar.B;
        this.f39857s = aVar.f39873r;
        Paint.Style style = aVar.f39875t;
        this.f39858t = aVar.f39874s;
        this.f39859u = aVar.f39876u;
        this.f39860v = aVar.f39877v;
        this.C = aVar.C;
        int i12 = aVar.D;
        int i13 = aVar.E;
        this.f39853o = new Path();
        if (this.f39855q == null) {
            this.f39855q = new Paint();
        }
        this.f39855q.setStyle(style);
        this.f39855q.setColor(i11);
        this.f39855q.setAntiAlias(true);
        if (this.C == null) {
            TextPaint textPaint = new TextPaint();
            this.C = textPaint;
            textPaint.setTextSize(i13);
            this.C.setColor(i12);
            this.C.setFakeBoldText(true);
            this.C.setFakeBoldText(true);
        }
        this.C.setAntiAlias(true);
        this.D = (int) Math.abs(this.C.getFontMetrics().top);
        this.E = (int) this.C.measureText(str);
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        int i11;
        int i12;
        int min;
        if (!this.f100571e) {
            return;
        }
        float f11 = this.f39849k;
        int i13 = (f11 > Float.MIN_VALUE ? 1 : (f11 == Float.MIN_VALUE ? 0 : -1));
        int i14 = this.f39863y;
        int i15 = this.f39861w;
        if (i13 != 0) {
            float q11 = graphView.q(f11);
            int i16 = this.E;
            i12 = (int) ((q11 - (i16 / 2)) - i15);
            i11 = (int) (q11 + (i16 / 2) + i14);
        } else {
            int i17 = this.f39852n;
            if (i17 != 2) {
                if (i17 != 3) {
                    i12 = graphView.getContentRect().left;
                    i11 = this.E + i12 + i15 + i14;
                } else {
                    throw new IllegalArgumentException("FIXED_CENTER_HORIZONTAL not implemented yet!");
                }
            } else {
                i11 = graphView.getContentRect().right;
                i12 = ((i11 - this.E) - i15) - i14;
            }
        }
        int i18 = this.B;
        int i19 = i12 + i18;
        int i21 = i11 + i18;
        float r7 = graphView.r(this.f39850l) + this.A;
        int i22 = this.D;
        int i23 = this.f39862x;
        Rect rect = this.f39854p;
        rect.set(i19, (int) ((r7 - (i22 / 2)) - i23), i21, (int) (r7 + (i22 / 2) + this.f39864z));
        Paint paint = this.f39855q;
        Path path = this.f39853o;
        path.rewind();
        int height = rect.height();
        if (this.f39857s) {
            min = height / 2;
        } else {
            min = Math.min(this.f39856r, height / 2);
        }
        this.f39856r = min;
        int i24 = min / 2;
        path.moveTo(min, 0.0f);
        path.lineTo(rect.width() - this.f39856r, 0.0f);
        float f12 = i24;
        path.cubicTo(rect.width() - i24, 0.0f, rect.width(), f12, rect.width(), this.f39856r);
        path.lineTo(rect.width(), height - this.f39856r);
        float f13 = height - i24;
        float f14 = height;
        path.cubicTo(rect.width(), f13, rect.width() - i24, f14, rect.width() - this.f39856r, f14);
        path.lineTo(this.f39856r, f14);
        path.cubicTo(f12, f14, 0.0f, f13, 0.0f, height - this.f39856r);
        path.lineTo(0.0f, this.f39856r);
        path.cubicTo(0.0f, f12, f12, 0.0f, this.f39856r, 0.0f);
        path.offset(rect.left, rect.top);
        int i25 = this.f39860v;
        if (i25 > 0) {
            paint.setShadowLayer(i25, 0.0f, this.f39859u, this.f39858t);
        }
        canvas.drawPath(path, paint);
        canvas.drawText(this.f39851m, rect.left + i15, ((this.D / 2) + (rect.top + i23)) - ((this.C.ascent() + this.C.descent()) / 2.0f), this.C);
    }
}
