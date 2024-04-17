package com.withings.graph.decorator;

import ah.u;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import com.withings.graph.axis.HorizontalAxis;
import com.withings.graph.decorator.Decorator;
/* compiled from: VerticalLineDecorator.java */
/* loaded from: classes3.dex */
public final class k extends Decorator {
    private float A;
    private float B;
    private int C;

    /* renamed from: k  reason: collision with root package name */
    private Path f39882k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f39883l;

    /* renamed from: m  reason: collision with root package name */
    private TextPaint f39884m;

    /* renamed from: n  reason: collision with root package name */
    protected int f39885n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f39886o;

    /* renamed from: p  reason: collision with root package name */
    protected Path f39887p;

    /* renamed from: q  reason: collision with root package name */
    protected Rect f39888q;

    /* renamed from: r  reason: collision with root package name */
    protected Paint f39889r;

    /* renamed from: s  reason: collision with root package name */
    protected int f39890s;

    /* renamed from: t  reason: collision with root package name */
    protected int f39891t;

    /* renamed from: u  reason: collision with root package name */
    protected int f39892u;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f39893v;

    /* renamed from: w  reason: collision with root package name */
    protected String f39894w;

    /* renamed from: x  reason: collision with root package name */
    protected HorizontalAxis.HorizontalAxisPosition f39895x;

    /* renamed from: y  reason: collision with root package name */
    private int f39896y;

    /* renamed from: z  reason: collision with root package name */
    private float f39897z;

    /* compiled from: VerticalLineDecorator.java */
    /* loaded from: classes3.dex */
    public static class a extends Decorator.a<k, a> {
        private String B;

        /* renamed from: j  reason: collision with root package name */
        private float f39898j;

        /* renamed from: k  reason: collision with root package name */
        private float f39899k;

        /* renamed from: l  reason: collision with root package name */
        private float f39900l;

        /* renamed from: m  reason: collision with root package name */
        private int f39901m = 10;

        /* renamed from: n  reason: collision with root package name */
        private int f39902n = 6;

        /* renamed from: o  reason: collision with root package name */
        private int f39903o = -3355444;

        /* renamed from: p  reason: collision with root package name */
        private int f39904p = 2;

        /* renamed from: q  reason: collision with root package name */
        private boolean f39905q = true;

        /* renamed from: r  reason: collision with root package name */
        private int f39906r = 0;

        /* renamed from: s  reason: collision with root package name */
        private int f39907s = 30;

        /* renamed from: t  reason: collision with root package name */
        private int f39908t = -7829368;

        /* renamed from: u  reason: collision with root package name */
        private int f39909u = 40;

        /* renamed from: v  reason: collision with root package name */
        private boolean f39910v = false;

        /* renamed from: w  reason: collision with root package name */
        private int f39911w = -65536;

        /* renamed from: x  reason: collision with root package name */
        private int f39912x = 30;

        /* renamed from: y  reason: collision with root package name */
        private int f39913y = 8;

        /* renamed from: z  reason: collision with root package name */
        private int f39914z = 16;
        private boolean A = false;
        protected HorizontalAxis.HorizontalAxisPosition C = HorizontalAxis.HorizontalAxisPosition.f39589a;

        public final k I() {
            return new k(this);
        }

        public final void J(float f11) {
            this.f39899k = f11;
        }

        public final void K() {
            this.f39902n = 15;
        }

        public final void L(boolean z5) {
            this.f39905q = z5;
        }

        public final void M(int i11) {
            this.f39911w = i11;
        }

        public final void N(String str) {
            this.B = str;
        }

        public final void O(int i11) {
            this.f39903o = i11;
        }

        public final void P() {
            this.f39910v = false;
        }

        public final void Q(int i11) {
            this.f39904p = i11;
        }

        public final void R(float f11) {
            this.f39900l = f11;
        }

        public final void S() {
            this.f39906r = 20;
        }

        public final void T(float f11) {
            this.f39898j = f11;
        }

        public final void U() {
            this.A = false;
        }
    }

    protected k(a aVar) {
        super(aVar);
        this.f39897z = aVar.f39898j;
        this.A = aVar.f39899k;
        this.B = aVar.f39900l;
        int i11 = aVar.f39901m;
        int i12 = aVar.f39902n;
        this.f39883l = null;
        int i13 = aVar.f39903o;
        this.f39896y = i13;
        int i14 = aVar.f39904p;
        boolean z5 = aVar.f39905q;
        this.C = aVar.f39906r;
        this.f39884m = null;
        int i15 = aVar.f39908t;
        int i16 = aVar.f39907s;
        boolean z11 = aVar.f39910v;
        this.f39886o = z11;
        this.f39889r = null;
        int i17 = aVar.f39911w;
        this.f39890s = aVar.f39912x;
        this.f39891t = aVar.f39913y;
        this.f39892u = aVar.f39914z;
        this.f39895x = aVar.C;
        aVar.f39909u;
        this.f39893v = aVar.A;
        this.f39894w = aVar.B;
        this.f39882k = new Path();
        if (this.f39883l == null) {
            Paint paint = new Paint(1);
            this.f39883l = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f39883l.setStrokeJoin(Paint.Join.ROUND);
            this.f39883l.setStrokeWidth(i14);
            this.f39883l.setColor(i13);
        }
        if (this.f39884m == null) {
            TextPaint textPaint = new TextPaint();
            this.f39884m = textPaint;
            textPaint.setAntiAlias(true);
            this.f39884m.setTextSize(i16);
            this.f39884m.setColor(u.j(1.0f, i15));
            Math.abs(this.f39884m.getFontMetrics().top);
        }
        this.f39885n = (int) Math.abs(this.f39884m.getFontMetrics().top);
        if (z11 && this.f39889r == null) {
            this.f39887p = new Path();
            this.f39888q = new Rect();
            Paint paint2 = new Paint();
            this.f39889r = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.f39889r.setColor(i17);
            this.f39889r.setAntiAlias(true);
        }
        if (z5) {
            float f11 = i12;
            float f12 = i11;
            this.f39883l.setPathEffect(new DashPathEffect(new float[]{f11, f12, f11, f12}, f11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    @Override // com.withings.graph.decorator.Decorator, ts.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.withings.graph.GraphView r21, android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.graph.decorator.k.a(com.withings.graph.GraphView, android.graphics.Canvas):void");
    }
}
