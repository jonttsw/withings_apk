package com.withings.design.view;

import ah.u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m6.q;
import m6.r;
import withings.android.content.ContextKt;
/* loaded from: classes3.dex */
public class HorizontalScaleView extends View {

    /* renamed from: t0  reason: collision with root package name */
    private static final int f36258t0 = Color.parseColor("#E4ECF2");
    private Paint A;
    private Paint B;
    private Paint F;
    private Paint G;
    private Path M;
    private Paint P;
    private Paint Q;
    private int R;
    private int S;
    private int T;
    private int W;

    /* renamed from: a  reason: collision with root package name */
    private e f36259a;

    /* renamed from: b  reason: collision with root package name */
    private e f36260b;

    /* renamed from: c  reason: collision with root package name */
    private d f36261c;

    /* renamed from: d  reason: collision with root package name */
    private d f36262d;

    /* renamed from: e  reason: collision with root package name */
    private int f36263e;

    /* renamed from: f  reason: collision with root package name */
    private int f36264f;

    /* renamed from: g  reason: collision with root package name */
    private g f36265g;

    /* renamed from: h  reason: collision with root package name */
    private g f36266h;

    /* renamed from: i  reason: collision with root package name */
    private g f36267i;

    /* renamed from: j  reason: collision with root package name */
    private g f36268j;

    /* renamed from: k  reason: collision with root package name */
    private int f36269k;

    /* renamed from: l  reason: collision with root package name */
    private int f36270l;

    /* renamed from: l0  reason: collision with root package name */
    private int f36271l0;

    /* renamed from: m  reason: collision with root package name */
    private int f36272m;

    /* renamed from: m0  reason: collision with root package name */
    private float f36273m0;

    /* renamed from: n  reason: collision with root package name */
    private int f36274n;

    /* renamed from: n0  reason: collision with root package name */
    private float f36275n0;

    /* renamed from: o  reason: collision with root package name */
    private int f36276o;

    /* renamed from: o0  reason: collision with root package name */
    private int f36277o0;

    /* renamed from: p  reason: collision with root package name */
    private int f36278p;

    /* renamed from: p0  reason: collision with root package name */
    private float f36279p0;

    /* renamed from: q  reason: collision with root package name */
    private int f36280q;

    /* renamed from: q0  reason: collision with root package name */
    private String f36281q0;

    /* renamed from: r  reason: collision with root package name */
    private int f36282r;

    /* renamed from: r0  reason: collision with root package name */
    private String f36283r0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f36284s;

    /* renamed from: s0  reason: collision with root package name */
    private int f36285s0;

    /* renamed from: t  reason: collision with root package name */
    private c f36286t;

    /* renamed from: u  reason: collision with root package name */
    private c f36287u;

    /* renamed from: v  reason: collision with root package name */
    private c f36288v;

    /* renamed from: w  reason: collision with root package name */
    private int f36289w;

    /* renamed from: x  reason: collision with root package name */
    private Paint f36290x;

    /* renamed from: y  reason: collision with root package name */
    private Paint f36291y;

    /* renamed from: z  reason: collision with root package name */
    private Paint f36292z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36293a;

        a(c cVar) {
            this.f36293a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f36293a.f36300c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            HorizontalScaleView.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f36295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f36296b;

        b(c cVar, double d11) {
            this.f36295a = cVar;
            this.f36296b = d11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            c cVar = this.f36295a;
            cVar.f36300c = 0.0f;
            cVar.f36298a = this.f36296b;
            HorizontalScaleView.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private double f36298a = -2.147483648E9d;

        /* renamed from: b  reason: collision with root package name */
        private boolean f36299b = false;

        /* renamed from: c  reason: collision with root package name */
        private float f36300c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        private ValueAnimator f36301d;

        /* renamed from: e  reason: collision with root package name */
        private String f36302e;

        c() {
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        String a(double d11);
    }

    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public double f36303a;

        /* renamed from: b  reason: collision with root package name */
        public List<f> f36304b;
    }

    /* loaded from: classes3.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public double f36305a;

        /* renamed from: b  reason: collision with root package name */
        public int f36306b;

        /* renamed from: c  reason: collision with root package name */
        public String f36307c;

        public f(String str, int i11, int i12) {
            this.f36307c = str;
            this.f36305a = i11;
            this.f36306b = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        private int f36308a = 40;

        /* renamed from: b  reason: collision with root package name */
        private int f36309b = -16777216;

        /* renamed from: c  reason: collision with root package name */
        private Typeface f36310c = null;

        g() {
        }
    }

    public HorizontalScaleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36265g = new g();
        this.f36266h = new g();
        this.f36267i = new g();
        this.f36268j = new g();
        this.f36284s = true;
        this.f36286t = new c();
        this.f36287u = new c();
        this.f36288v = new c();
        this.M = new Path();
        this.T = 0;
        this.W = Integer.MIN_VALUE;
        this.f36271l0 = 0;
        this.f36277o0 = 2;
        this.f36285s0 = 8;
        l(attributeSet);
    }

    private void a(Rect rect) {
        Path path = this.M;
        path.rewind();
        path.moveTo(rect.left, rect.top);
        path.lineTo(rect.right, rect.top);
        path.lineTo(rect.right, rect.bottom);
        path.lineTo(rect.left, rect.bottom);
        path.lineTo(rect.left, rect.top);
    }

    private void b(Canvas canvas, e eVar, c cVar, int i11, boolean z5) {
        int i12;
        float f11;
        int i13;
        if (cVar.f36298a == -2.147483648E9d) {
            return;
        }
        float h11 = h(eVar, cVar.f36298a) + cVar.f36300c;
        if (z5) {
            f11 = (this.f36269k / 2) + i11 + this.f36263e;
            canvas.drawLine(h11, i11 - (i13 / 2), h11, f11, this.G);
            canvas.drawCircle(h11, f11, this.f36271l0, this.G);
        } else {
            f11 = (i11 - this.f36263e) - (this.f36269k / 2);
            canvas.drawLine(h11, (i12 / 2) + i11, h11, f11, this.G);
            canvas.drawCircle(h11, f11, this.f36271l0, this.G);
        }
        if (cVar.f36302e != null) {
            canvas.drawText(cVar.f36302e, h11 - (this.F.measureText(cVar.f36302e) / 2.0f), (f11 - (this.f36273m0 / 2.0f)) - this.f36270l, this.f36291y);
        }
    }

    private void c(Canvas canvas, int i11, int i12, int i13, boolean z5, boolean z11) {
        int i14;
        int i15;
        int i16;
        int i17;
        f fVar = this.f36259a.f36304b.get(i11);
        if (z5) {
            this.f36290x.setColor(fVar.f36306b);
        } else {
            this.f36290x.setColor(this.f36282r);
        }
        int i18 = this.f36263e / 2;
        int i19 = i12 - i18;
        int i21 = i18 + i12;
        Path path = this.M;
        if (i11 == 0) {
            Rect rect = new Rect(0, i19, i13, i21);
            int i22 = this.f36263e / 2;
            path.rewind();
            float f11 = i22;
            path.moveTo(f11, rect.top);
            path.lineTo(rect.right, rect.top);
            path.lineTo(rect.right, rect.bottom);
            path.lineTo(f11, rect.bottom);
            float f12 = i22 / 2;
            int i23 = rect.bottom;
            float f13 = rect.left;
            this.M.cubicTo(f12, i23, f13, i23 - i16, f13, i23 - i22);
            float f14 = rect.left;
            float f15 = rect.top;
            this.M.cubicTo(f14, i16 + i17, f12, f15, f11, f15);
        } else if (i11 == this.f36259a.f36304b.size() - 1) {
            if (z11) {
                Rect rect2 = new Rect(0, i19, i13, i21);
                int i24 = (this.f36263e / 2) / 2;
                path.rewind();
                path.moveTo(rect2.left, rect2.top);
                path.lineTo(rect2.right - i14, rect2.top);
                int i25 = rect2.right;
                int i26 = rect2.top;
                float f16 = i25;
                this.M.cubicTo(i25 - i24, i26, f16, i26 + i24, f16, i26 + i14);
                int i27 = rect2.right;
                float f17 = rect2.bottom;
                this.M.cubicTo(i27, i15 - i24, i27 - i24, f17, i27 - i14, f17);
                path.lineTo(rect2.right, rect2.bottom);
                path.lineTo(rect2.left, rect2.bottom);
                path.lineTo(rect2.left, rect2.top);
            } else {
                a(new Rect(0, i19, i13, i21));
            }
        } else {
            a(new Rect(0, i19, i13, i21));
        }
        path.offset(e(i11), 0.0f);
        canvas.drawPath(path, this.f36290x);
        fVar.getClass();
    }

    private void d(Canvas canvas, e eVar, d dVar, int i11, float f11) {
        double d11 = eVar.f36303a;
        for (int i12 = 0; i12 <= i11; i12++) {
            d11 += eVar.f36304b.get(i12).f36305a;
        }
        String a11 = dVar.a(d11);
        canvas.drawText(a11, (e(i11 + 1) - (this.f36264f / 2)) - (this.f36291y.measureText(a11) / 2.0f), f11, this.f36291y);
    }

    private int e(int i11) {
        if (i11 == 0) {
            return this.f36285s0;
        }
        return ((this.S * j(this.f36259a.f36304b.subList(0, i11))) / this.R) + (this.f36264f * i11) + this.f36285s0;
    }

    private int f(int i11) {
        int i12 = this.S;
        this.f36259a.f36304b.get(i11).getClass();
        return i12 / this.R;
    }

    private static int g(e eVar, double d11) {
        double d12 = eVar.f36303a;
        int i11 = 0;
        if (d11 < d12) {
            return 0;
        }
        while (true) {
            List<f> list = eVar.f36304b;
            if (i11 >= list.size()) {
                break;
            }
            d12 += list.get(i11).f36305a;
            if (d11 < d12) {
                break;
            }
            i11++;
        }
        if (d11 > d12) {
            return i11 - 1;
        }
        return i11;
    }

    private int getCursorHeight() {
        if (this.f36286t.f36302e == null) {
            return 0;
        }
        return (this.f36263e * 2) + this.f36271l0 + ((int) (this.f36273m0 + this.f36270l + 0));
    }

    private float getGaugeBottomPosition() {
        return getGaugeTopPosition() + this.f36263e;
    }

    private float getGaugeTopPosition() {
        return (getMeasuredHeight() / 2.0f) - (this.f36263e / 2.0f);
    }

    private int getHighlightedCursorHeight() {
        if (this.f36288v.f36298a == -2.147483648E9d) {
            return 0;
        }
        return this.f36289w + this.f36276o;
    }

    private float h(e eVar, double d11) {
        int g11 = g(eVar, d11);
        List<f> list = eVar.f36304b;
        int min = Math.min(g11, list.size() - 1);
        double d12 = eVar.f36303a;
        for (int i11 = 0; i11 < min; i11++) {
            d12 += list.get(i11).f36305a;
        }
        float f11 = (f(min) * ((float) ((d11 - d12) / list.get(min).f36305a))) + e(min);
        float f12 = (this.f36263e / 2) + this.f36285s0;
        if (f11 < f12) {
            return f12;
        }
        if (f11 > (getMeasuredWidth() - this.f36285s0) - (this.f36263e / 2)) {
            return (getMeasuredWidth() - this.f36285s0) - (this.f36263e / 2);
        }
        return f11;
    }

    private double i(e eVar, float f11) {
        List<f> list;
        double d11 = eVar.f36303a;
        int i11 = 0;
        while (true) {
            list = eVar.f36304b;
            if (i11 >= list.size() - 1) {
                break;
            }
            int i12 = i11 + 1;
            if (e(i12) > f11) {
                break;
            }
            d11 += list.get(i11).f36305a;
            i11 = i12;
        }
        return (list.get(i11).f36305a * ((f11 - e(i11)) / f(i11))) + d11;
    }

    private static int j(List list) {
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            i11++;
        }
        return i11;
    }

    private float k(int i11) {
        float gaugeBottomPosition;
        float f11;
        if (this.f36277o0 == 1) {
            if (this.f36279p0 != -1.0f) {
                gaugeBottomPosition = getGaugeBottomPosition() - this.f36279p0;
                f11 = this.f36275n0;
            } else {
                gaugeBottomPosition = getGaugeBottomPosition();
                f11 = this.f36275n0;
            }
            return gaugeBottomPosition - f11;
        }
        int i12 = i11 + this.f36265g.f36308a;
        int i13 = this.f36274n;
        return i12 + i13 + i13 + this.f36271l0;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, com.withings.design.view.HorizontalScaleView$e] */
    private void l(AttributeSet attributeSet) {
        this.f36261c = new q(3);
        this.f36262d = new r(3);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72610l);
        this.f36289w = obtainStyledAttributes.getDimensionPixelSize(9, 50);
        this.f36263e = obtainStyledAttributes.getDimensionPixelSize(6, 25);
        this.f36264f = obtainStyledAttributes.getDimensionPixelSize(7, 5);
        this.f36269k = obtainStyledAttributes.getDimensionPixelSize(18, 40);
        this.f36270l = obtainStyledAttributes.getDimensionPixelSize(3, 40);
        this.f36272m = obtainStyledAttributes.getDimensionPixelSize(20, 100);
        this.f36274n = obtainStyledAttributes.getDimensionPixelSize(15, 100);
        this.f36279p0 = obtainStyledAttributes.getDimensionPixelSize(16, -1);
        this.f36284s = obtainStyledAttributes.getBoolean(17, true);
        this.f36276o = obtainStyledAttributes.getDimensionPixelSize(10, 40);
        this.f36278p = obtainStyledAttributes.getColor(2, androidx.core.content.a.getColor(getContext(), 17170444));
        this.f36280q = obtainStyledAttributes.getColor(8, androidx.core.content.a.getColor(getContext(), 17170444));
        this.f36282r = obtainStyledAttributes.getColor(5, f36258t0);
        this.T = obtainStyledAttributes.getInt(0, 0);
        this.f36271l0 = obtainStyledAttributes.getInt(1, ContextKt.dpToPx(getContext(), 3));
        this.f36281q0 = obtainStyledAttributes.getString(13);
        this.f36283r0 = obtainStyledAttributes.getString(12);
        int resourceId = obtainStyledAttributes.getResourceId(14, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(19, -1);
        int resourceId3 = obtainStyledAttributes.getResourceId(4, -1);
        int resourceId4 = obtainStyledAttributes.getResourceId(11, -1);
        obtainStyledAttributes.recycle();
        m(this.f36266h, resourceId2);
        m(this.f36265g, resourceId);
        m(this.f36267i, resourceId3);
        m(this.f36268j, resourceId4);
        Paint paint = new Paint();
        this.f36290x = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f36291y = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f36292z = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.A = paint4;
        paint4.setAntiAlias(true);
        Paint paint5 = new Paint();
        this.B = paint5;
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.F = paint6;
        paint6.setAntiAlias(true);
        Paint paint7 = new Paint();
        this.P = paint7;
        paint7.setAntiAlias(true);
        Paint paint8 = new Paint();
        this.G = paint8;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint8.setStyle(style);
        this.G.setStrokeWidth(5.0f);
        this.G.setAntiAlias(true);
        Paint paint9 = new Paint();
        this.Q = paint9;
        paint9.setStyle(style);
        this.Q.setStrokeWidth(5.0f);
        this.Q.setAntiAlias(true);
        if (isInEditMode()) {
            List<f> asList = Arrays.asList(new f("BLUE", 10, androidx.core.content.a.getColor(getContext(), C1987R.color.theme)), new f("", 20, androidx.core.content.a.getColor(getContext(), C1987R.color.veryBad)), new f("GREY", 2, Color.parseColor("#999999")));
            ?? obj = new Object();
            obj.f36303a = 100;
            obj.f36304b = asList;
            this.f36259a = obj;
        }
    }

    @SuppressLint({"ResourceType"})
    private void m(g gVar, int i11) {
        int x11 = u.x(getContext(), 16842808);
        if (i11 == -1) {
            gVar.f36308a = 40;
            gVar.f36309b = x11;
            gVar.f36310c = null;
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i11, new int[]{16842901, 16842904, 16843692});
        gVar.f36308a = obtainStyledAttributes.getDimensionPixelSize(0, 40);
        gVar.f36309b = obtainStyledAttributes.getColor(1, x11);
        gVar.f36310c = androidx.core.content.res.g.e(obtainStyledAttributes.getResourceId(2, C1987R.style.detail), getContext());
        obtainStyledAttributes.recycle();
    }

    private void n(c cVar, e eVar) {
        if (cVar.f36298a == -2.147483648E9d) {
            cVar.f36298a = eVar.f36303a;
        }
        if (cVar.f36301d != null && cVar.f36301d.isRunning()) {
            cVar.f36301d.cancel();
        }
        float h11 = h(eVar, -2.147483648E9d) - h(eVar, cVar.f36298a);
        if (cVar.f36301d == null) {
            cVar.f36301d = ValueAnimator.ofFloat(0.0f, h11);
            cVar.f36301d.addUpdateListener(new a(cVar));
        } else {
            cVar.f36301d.setFloatValues(0.0f, h11);
        }
        cVar.f36301d.setDuration(0L);
        cVar.f36301d.removeAllListeners();
        cVar.f36301d.addListener(new b(cVar, -2.147483648E9d));
        cVar.f36301d.start();
    }

    public int getColorPartTillPartPosition() {
        return this.W;
    }

    public int getCursorColor() {
        return this.f36278p;
    }

    public double getCursorValue() {
        return this.f36286t.f36298a;
    }

    public d getDelegate() {
        return this.f36261c;
    }

    public int getGaugeDeactivatedColor() {
        return this.f36282r;
    }

    public int getGaugeHeightPx() {
        return this.f36263e;
    }

    public int getGaugeSpacingPx() {
        return this.f36264f;
    }

    public String getLegendEndLabel() {
        return this.f36283r0;
    }

    public int getLegendPosition() {
        return this.f36277o0;
    }

    public String getLegendStartLabel() {
        return this.f36281q0;
    }

    public int getLegendTextColor() {
        return this.f36265g.f36309b;
    }

    public int getLegendTextSize() {
        return this.f36265g.f36308a;
    }

    public Typeface getLegendTextTypeface() {
        return this.f36265g.f36310c;
    }

    public e getScale() {
        return this.f36259a;
    }

    public double getSecondaryCursorValue() {
        return this.f36287u.f36298a;
    }

    public d getSecondaryDelegate() {
        return this.f36262d;
    }

    public e getSecondaryScale() {
        return this.f36260b;
    }

    public int getTextMarginPx() {
        return this.f36269k;
    }

    public int getTitleTextColor() {
        return this.f36266h.f36309b;
    }

    public int getTitleTextSize() {
        return this.f36266h.f36308a;
    }

    public Typeface getTitleTextTypeface() {
        return this.f36266h.f36310c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
        if (r11 == r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0140, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0149, code lost:
        if (r11 <= r20.W) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
        if (r11 <= r6) goto L75;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.design.view.HorizontalScaleView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        Paint paint = this.f36291y;
        g gVar = this.f36265g;
        paint.setColor(gVar.f36309b);
        this.f36291y.setTextSize(gVar.f36308a);
        this.f36291y.setTypeface(gVar.f36310c);
        this.f36292z.setColor(gVar.f36309b);
        this.f36292z.setTextSize(gVar.f36308a);
        this.f36292z.setTypeface(gVar.f36310c);
        this.A.setColor(gVar.f36309b);
        this.A.setTextSize(gVar.f36308a);
        this.A.setTypeface(gVar.f36310c);
        Paint paint2 = this.B;
        g gVar2 = this.f36266h;
        paint2.setColor(gVar2.f36309b);
        this.B.setTextSize(gVar2.f36308a);
        this.B.setTypeface(gVar2.f36310c);
        Paint paint3 = this.F;
        g gVar3 = this.f36267i;
        paint3.setColor(gVar3.f36309b);
        this.F.setTextSize(gVar3.f36308a);
        this.F.setTypeface(gVar3.f36310c);
        Paint paint4 = this.P;
        g gVar4 = this.f36268j;
        paint4.setColor(gVar4.f36309b);
        this.P.setTextSize(gVar4.f36308a);
        this.P.setTypeface(gVar4.f36310c);
        this.G.setColor(this.f36278p);
        this.Q.setColor(this.f36280q);
        Paint.FontMetrics fontMetrics = this.F.getFontMetrics();
        this.f36273m0 = (fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading;
        Paint.FontMetrics fontMetrics2 = this.f36291y.getFontMetrics();
        this.f36275n0 = (fontMetrics2.bottom - fontMetrics2.top) + fontMetrics2.leading;
        int cursorHeight = getCursorHeight();
        int highlightedCursorHeight = getHighlightedCursorHeight();
        float f11 = this.f36279p0;
        int i15 = 0;
        if (f11 != -1.0f) {
            i13 = (int) f11;
        } else {
            i13 = 0;
        }
        if (this.f36284s) {
            i14 = (int) (this.f36275n0 + this.f36274n + this.f36271l0 + i13);
        } else {
            i14 = 0;
        }
        if (cursorHeight > highlightedCursorHeight && cursorHeight > i14) {
            i15 = cursorHeight * 2;
        } else if (highlightedCursorHeight > cursorHeight && highlightedCursorHeight > i14) {
            i15 = highlightedCursorHeight * 2;
        } else if (i14 > highlightedCursorHeight && i14 > cursorHeight) {
            i15 = i14 * 2;
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(i15 + this.f36263e, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
    }

    public void setColorPartTillPartPosition(int i11) {
        this.W = i11;
    }

    public void setCursorColor(int i11) {
        this.f36278p = i11;
    }

    public void setCursorTitle(String str) {
        c cVar = this.f36286t;
        cVar.f36302e = str;
        this.f36285s0 = ((int) this.F.measureText(cVar.f36302e)) + 8;
    }

    public void setCursorValue(int i11) {
        this.f36286t.f36298a = i11;
    }

    public void setDelegate(d dVar) {
        this.f36261c = dVar;
    }

    public void setGaugeDeactivatedColor(int i11) {
        this.f36282r = i11;
    }

    public void setGaugeHeightPx(int i11) {
        this.f36263e = i11;
    }

    public void setGaugeSpacingPx(int i11) {
        this.f36264f = i11;
    }

    public void setHighlightedCursorTitle(String str) {
        this.f36288v.f36302e = str;
    }

    public void setHighlightedCursorValue(int i11) {
        this.f36288v.f36298a = i11;
    }

    public void setLegendEndLabel(String str) {
        this.f36283r0 = str;
    }

    public void setLegendPosition(int i11) {
        this.f36277o0 = i11;
    }

    public void setLegendStartLabel(String str) {
        this.f36281q0 = str;
    }

    public void setLegendTextColor(int i11) {
        this.f36265g.f36309b = i11;
    }

    public void setLegendTextSize(int i11) {
        this.f36265g.f36308a = i11;
    }

    public void setLegendTextTypeface(Typeface typeface) {
        this.f36265g.f36310c = typeface;
    }

    public void setScale(e eVar) {
        this.f36259a = eVar;
    }

    public void setSecondaryCursorTitle(String str) {
        this.f36287u.f36302e = str;
    }

    public void setSecondaryCursorValue(int i11) {
        this.f36287u.f36298a = i11;
    }

    public void setSecondaryDelegate(d dVar) {
        this.f36262d = dVar;
    }

    public void setSecondaryScale(e eVar) {
        this.f36260b = eVar;
    }

    public void setTextMarginPx(int i11) {
        this.f36269k = i11;
    }

    public void setTitleTextColor(int i11) {
        this.f36266h.f36309b = i11;
    }

    public void setTitleTextSize(int i11) {
        this.f36266h.f36308a = i11;
    }

    public void setTitleTextTypeface(Typeface typeface) {
        this.f36266h.f36310c = typeface;
    }

    public void setCursorValue(double d11) {
        this.f36286t.f36298a = d11;
    }

    public HorizontalScaleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36265g = new g();
        this.f36266h = new g();
        this.f36267i = new g();
        this.f36268j = new g();
        this.f36284s = true;
        this.f36286t = new c();
        this.f36287u = new c();
        this.f36288v = new c();
        this.M = new Path();
        this.T = 0;
        this.W = Integer.MIN_VALUE;
        this.f36271l0 = 0;
        this.f36277o0 = 2;
        this.f36285s0 = 8;
        l(attributeSet);
    }
}
