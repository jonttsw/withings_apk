package com.withings.views.view;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Deprecated
/* loaded from: classes4.dex */
public class HorizontalScaleView extends View {

    /* renamed from: t0  reason: collision with root package name */
    private static final int f46578t0 = Color.parseColor("#E4ECF2");
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
    private e f46579a;

    /* renamed from: b  reason: collision with root package name */
    private e f46580b;

    /* renamed from: c  reason: collision with root package name */
    private d f46581c;

    /* renamed from: d  reason: collision with root package name */
    private d f46582d;

    /* renamed from: e  reason: collision with root package name */
    private int f46583e;

    /* renamed from: f  reason: collision with root package name */
    private int f46584f;

    /* renamed from: g  reason: collision with root package name */
    private g f46585g;

    /* renamed from: h  reason: collision with root package name */
    private g f46586h;

    /* renamed from: i  reason: collision with root package name */
    private g f46587i;

    /* renamed from: j  reason: collision with root package name */
    private g f46588j;

    /* renamed from: k  reason: collision with root package name */
    private int f46589k;

    /* renamed from: l  reason: collision with root package name */
    private int f46590l;

    /* renamed from: l0  reason: collision with root package name */
    private int f46591l0;

    /* renamed from: m  reason: collision with root package name */
    private int f46592m;

    /* renamed from: m0  reason: collision with root package name */
    private float f46593m0;

    /* renamed from: n  reason: collision with root package name */
    private int f46594n;

    /* renamed from: n0  reason: collision with root package name */
    private float f46595n0;

    /* renamed from: o  reason: collision with root package name */
    private int f46596o;

    /* renamed from: o0  reason: collision with root package name */
    private int f46597o0;

    /* renamed from: p  reason: collision with root package name */
    private int f46598p;

    /* renamed from: p0  reason: collision with root package name */
    private float f46599p0;

    /* renamed from: q  reason: collision with root package name */
    private int f46600q;

    /* renamed from: q0  reason: collision with root package name */
    private String f46601q0;

    /* renamed from: r  reason: collision with root package name */
    private int f46602r;

    /* renamed from: r0  reason: collision with root package name */
    private String f46603r0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f46604s;

    /* renamed from: s0  reason: collision with root package name */
    private int f46605s0;

    /* renamed from: t  reason: collision with root package name */
    private c f46606t;

    /* renamed from: u  reason: collision with root package name */
    private c f46607u;

    /* renamed from: v  reason: collision with root package name */
    private c f46608v;

    /* renamed from: w  reason: collision with root package name */
    private int f46609w;

    /* renamed from: x  reason: collision with root package name */
    private Paint f46610x;

    /* renamed from: y  reason: collision with root package name */
    private Paint f46611y;

    /* renamed from: z  reason: collision with root package name */
    private Paint f46612z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f46613a;

        a(c cVar) {
            this.f46613a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f46613a.f46621d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            HorizontalScaleView.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f46615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f46616b;

        b(c cVar, double d11) {
            this.f46615a = cVar;
            this.f46616b = d11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            c cVar = this.f46615a;
            cVar.f46621d = 0.0f;
            cVar.f46618a = this.f46616b;
            HorizontalScaleView.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private double f46618a = -2.147483648E9d;

        /* renamed from: b  reason: collision with root package name */
        private double f46619b = -2.147483648E9d;

        /* renamed from: c  reason: collision with root package name */
        private boolean f46620c = false;

        /* renamed from: d  reason: collision with root package name */
        private float f46621d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        private long f46622e = 0;

        /* renamed from: f  reason: collision with root package name */
        private ValueAnimator f46623f;

        /* renamed from: g  reason: collision with root package name */
        private String f46624g;

        c() {
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        String a(double d11);
    }

    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public double f46628a;

        /* renamed from: b  reason: collision with root package name */
        public int f46629b;

        /* renamed from: c  reason: collision with root package name */
        public String f46630c;

        /* renamed from: e  reason: collision with root package name */
        public Integer f46632e;

        /* renamed from: d  reason: collision with root package name */
        public int f46631d = 1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f46633f = true;

        public f(String str, int i11, int i12) {
            this.f46630c = str;
            this.f46628a = i11;
            this.f46629b = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        private int f46634a = 40;

        /* renamed from: b  reason: collision with root package name */
        private int f46635b = -16777216;

        /* renamed from: c  reason: collision with root package name */
        private Typeface f46636c = null;

        g() {
        }
    }

    public HorizontalScaleView(Context context) {
        super(context);
        this.f46585g = new g();
        this.f46586h = new g();
        this.f46587i = new g();
        this.f46588j = new g();
        this.f46604s = true;
        this.f46606t = new c();
        this.f46607u = new c();
        this.f46608v = new c();
        this.M = new Path();
        this.T = 0;
        this.W = Integer.MIN_VALUE;
        this.f46591l0 = 0;
        this.f46597o0 = 2;
        this.f46605s0 = 8;
        l(null);
    }

    private void b(Rect rect) {
        Path path = this.M;
        path.rewind();
        path.moveTo(rect.left, rect.top);
        path.lineTo(rect.right, rect.top);
        path.lineTo(rect.right, rect.bottom);
        path.lineTo(rect.left, rect.bottom);
        path.lineTo(rect.left, rect.top);
    }

    private void c(Canvas canvas, e eVar, c cVar, int i11, boolean z5) {
        int i12;
        float f11;
        int i13;
        if (cVar.f46618a == -2.147483648E9d) {
            return;
        }
        float i14 = i(eVar, cVar.f46618a) + cVar.f46621d;
        if (z5) {
            f11 = (this.f46589k / 2) + i11 + this.f46583e;
            canvas.drawLine(i14, i11 - (i13 / 2), i14, f11, this.G);
            canvas.drawCircle(i14, f11, this.f46591l0, this.G);
        } else {
            f11 = (i11 - this.f46583e) - (this.f46589k / 2);
            canvas.drawLine(i14, (i12 / 2) + i11, i14, f11, this.G);
            canvas.drawCircle(i14, f11, this.f46591l0, this.G);
        }
        if (cVar.f46624g != null) {
            canvas.drawText(cVar.f46624g, i14 - (this.F.measureText(cVar.f46624g) / 2.0f), (f11 - (this.f46593m0 / 2.0f)) - this.f46590l, this.f46611y);
        }
    }

    private void d(Canvas canvas, int i11, int i12, int i13, boolean z5, boolean z11) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        f fVar = this.f46579a.f46627c.get(i11);
        if (z5) {
            this.f46610x.setColor(fVar.f46629b);
        } else {
            this.f46610x.setColor(this.f46602r);
        }
        int i19 = this.f46583e / 2;
        int i21 = i12 - i19;
        int i22 = i19 + i12;
        Path path = this.M;
        if (i11 == 0) {
            Rect rect = new Rect(0, i21, i13, i22);
            int i23 = this.f46583e / 2;
            path.rewind();
            float f11 = i23;
            path.moveTo(f11, rect.top);
            path.lineTo(rect.right, rect.top);
            path.lineTo(rect.right, rect.bottom);
            path.lineTo(f11, rect.bottom);
            float f12 = i23 / 2;
            int i24 = rect.bottom;
            float f13 = rect.left;
            this.M.cubicTo(f12, i24, f13, i24 - i17, f13, i24 - i23);
            float f14 = rect.left;
            float f15 = rect.top;
            this.M.cubicTo(f14, i17 + i18, f12, f15, f11, f15);
        } else if (i11 == this.f46579a.f46627c.size() - 1) {
            if (z11) {
                Rect rect2 = new Rect(0, i21, i13, i22);
                path.rewind();
                path.moveTo(rect2.left, rect2.top);
                path.lineTo(rect2.right - i14, rect2.top);
                int i25 = rect2.right;
                int i26 = rect2.top;
                float f16 = i25;
                this.M.cubicTo(i25 - i15, i26, f16, i26 + i15, f16, i26 + i14);
                int i27 = rect2.right;
                float f17 = i27 - ((this.f46583e / 2) / 2);
                float f18 = rect2.bottom;
                this.M.cubicTo(i27, i16 - i15, f17, f18, i27 - i14, f18);
                path.lineTo(rect2.right, rect2.bottom);
                path.lineTo(rect2.left, rect2.bottom);
                path.lineTo(rect2.left, rect2.top);
            } else {
                b(new Rect(0, i21, i13, i22));
            }
        } else {
            b(new Rect(0, i21, i13, i22));
        }
        path.offset(f(i11), 0.0f);
        canvas.drawPath(path, this.f46610x);
        Integer num = fVar.f46632e;
        if (num != null) {
            canvas.drawPath(path, y70.b.a(16, 16, num.intValue()));
        }
    }

    private void e(Canvas canvas, e eVar, d dVar, int i11, float f11) {
        double d11 = eVar.f46626b;
        for (int i12 = 0; i12 <= i11; i12++) {
            d11 += eVar.f46627c.get(i12).f46628a;
        }
        String a11 = dVar.a(d11);
        canvas.drawText(a11, (f(i11 + 1) - (this.f46584f / 2)) - (this.f46611y.measureText(a11) / 2.0f), f11, this.f46611y);
    }

    private int f(int i11) {
        if (i11 == 0) {
            return this.f46605s0;
        }
        int i12 = (this.f46584f * i11) + this.f46605s0;
        int i13 = this.S;
        int i14 = 0;
        for (f fVar : this.f46579a.f46627c.subList(0, i11)) {
            i14 += fVar.f46631d;
        }
        return ((i13 * i14) / this.R) + i12;
    }

    private int g(int i11) {
        return (this.S * this.f46579a.f46627c.get(i11).f46631d) / this.R;
    }

    private int getCursorHeight() {
        if (this.f46606t.f46624g == null) {
            return 0;
        }
        return (this.f46583e * 2) + this.f46591l0 + ((int) (this.f46593m0 + this.f46590l + 0));
    }

    private float getGaugeBottomPosition() {
        return getGaugeTopPosition() + this.f46583e;
    }

    private float getGaugeTopPosition() {
        return (getMeasuredHeight() / 2.0f) - (this.f46583e / 2.0f);
    }

    private int getHighlightedCursorHeight() {
        if (this.f46608v.f46618a == -2.147483648E9d) {
            return 0;
        }
        return this.f46609w + this.f46596o;
    }

    private static int h(e eVar, double d11) {
        double d12 = eVar.f46626b;
        int i11 = 0;
        if (d11 < d12) {
            return 0;
        }
        while (true) {
            List<f> list = eVar.f46627c;
            if (i11 >= list.size()) {
                break;
            }
            d12 += list.get(i11).f46628a;
            if (d11 < d12) {
                break;
            }
            i11++;
        }
        if (d11 >= d12) {
            return i11 - 1;
        }
        return i11;
    }

    private float i(e eVar, double d11) {
        int h11 = h(eVar, d11);
        List<f> list = eVar.f46627c;
        int min = Math.min(h11, list.size() - 1);
        double d12 = eVar.f46626b;
        for (int i11 = 0; i11 < min; i11++) {
            d12 += list.get(i11).f46628a;
        }
        float g11 = (g(min) * ((float) ((d11 - d12) / list.get(min).f46628a))) + f(min);
        float f11 = (this.f46583e / 2) + this.f46605s0;
        if (g11 < f11) {
            return f11;
        }
        if (g11 > (getMeasuredWidth() - this.f46605s0) - (this.f46583e / 2)) {
            return (getMeasuredWidth() - this.f46605s0) - (this.f46583e / 2);
        }
        return g11;
    }

    private double j(e eVar, float f11) {
        List<f> list;
        double d11 = eVar.f46626b;
        int i11 = 0;
        while (true) {
            list = eVar.f46627c;
            if (i11 >= list.size() - 1) {
                break;
            }
            int i12 = i11 + 1;
            if (f(i12) > f11) {
                break;
            }
            d11 += list.get(i11).f46628a;
            i11 = i12;
        }
        return (list.get(i11).f46628a * ((f11 - f(i11)) / g(i11))) + d11;
    }

    private float k(int i11) {
        float gaugeBottomPosition;
        float f11;
        if (this.f46597o0 == 1) {
            if (this.f46599p0 != -1.0f) {
                gaugeBottomPosition = getGaugeBottomPosition() - this.f46599p0;
                f11 = this.f46595n0;
            } else {
                gaugeBottomPosition = getGaugeBottomPosition();
                f11 = this.f46595n0;
            }
            return gaugeBottomPosition - f11;
        }
        int i12 = i11 + this.f46585g.f46634a;
        int i13 = this.f46594n;
        return i12 + i13 + i13 + this.f46591l0;
    }

    private void l(AttributeSet attributeSet) {
        this.f46581c = new m6.a(7);
        this.f46582d = new t5.h(6);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22416l);
        this.f46609w = obtainStyledAttributes.getDimensionPixelSize(9, 50);
        this.f46583e = obtainStyledAttributes.getDimensionPixelSize(6, 25);
        this.f46584f = obtainStyledAttributes.getDimensionPixelSize(7, 5);
        this.f46589k = obtainStyledAttributes.getDimensionPixelSize(18, 40);
        this.f46590l = obtainStyledAttributes.getDimensionPixelSize(3, 40);
        this.f46592m = obtainStyledAttributes.getDimensionPixelSize(20, 100);
        this.f46594n = obtainStyledAttributes.getDimensionPixelSize(15, 100);
        this.f46599p0 = obtainStyledAttributes.getDimensionPixelSize(16, -1);
        this.f46604s = obtainStyledAttributes.getBoolean(17, true);
        this.f46596o = obtainStyledAttributes.getDimensionPixelSize(10, 40);
        this.f46598p = obtainStyledAttributes.getColor(2, androidx.core.content.a.getColor(getContext(), 17170444));
        this.f46600q = obtainStyledAttributes.getColor(8, androidx.core.content.a.getColor(getContext(), 17170444));
        this.f46602r = obtainStyledAttributes.getColor(5, f46578t0);
        this.T = obtainStyledAttributes.getInt(0, 0);
        this.f46591l0 = obtainStyledAttributes.getInt(1, wq.a.c(3, getContext()));
        this.f46601q0 = obtainStyledAttributes.getString(13);
        this.f46603r0 = obtainStyledAttributes.getString(12);
        int resourceId = obtainStyledAttributes.getResourceId(14, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(19, -1);
        int resourceId3 = obtainStyledAttributes.getResourceId(4, -1);
        int resourceId4 = obtainStyledAttributes.getResourceId(11, -1);
        obtainStyledAttributes.recycle();
        m(this.f46586h, resourceId2);
        m(this.f46585g, resourceId);
        m(this.f46587i, resourceId3);
        m(this.f46588j, resourceId4);
        Paint paint = new Paint();
        this.f46610x = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f46611y = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f46612z = paint3;
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
            this.f46579a = new e(100, Arrays.asList(new f("BLUE", 10, androidx.core.content.a.getColor(getContext(), C1987R.color.theme)), new f("", 20, androidx.core.content.a.getColor(getContext(), C1987R.color.veryBad)), new f("GREY", 2, Color.parseColor("#999999"))));
        }
    }

    @SuppressLint({"ResourceType"})
    private void m(g gVar, int i11) {
        int v11 = u.v(16842808, getContext());
        if (i11 == -1) {
            gVar.f46634a = 40;
            gVar.f46635b = v11;
            gVar.f46636c = null;
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i11, new int[]{16842901, 16842904, 16843692});
        gVar.f46634a = obtainStyledAttributes.getDimensionPixelSize(0, 40);
        gVar.f46635b = obtainStyledAttributes.getColor(1, v11);
        gVar.f46636c = androidx.core.content.res.g.e(obtainStyledAttributes.getResourceId(2, C1987R.style.detail), getContext());
        obtainStyledAttributes.recycle();
    }

    private void o(c cVar, e eVar) {
        if (cVar.f46618a == -2.147483648E9d) {
            cVar.f46618a = eVar.f46626b;
        }
        if (cVar.f46623f != null && cVar.f46623f.isRunning()) {
            cVar.f46623f.cancel();
        }
        double d11 = cVar.f46619b;
        float i11 = i(eVar, cVar.f46619b) - i(eVar, cVar.f46618a);
        if (cVar.f46623f == null) {
            cVar.f46623f = ValueAnimator.ofFloat(0.0f, i11);
            cVar.f46623f.addUpdateListener(new a(cVar));
        } else {
            cVar.f46623f.setFloatValues(0.0f, i11);
        }
        cVar.f46623f.setDuration(cVar.f46622e);
        cVar.f46623f.removeAllListeners();
        cVar.f46623f.addListener(new b(cVar, d11));
        cVar.f46623f.start();
    }

    public final void a(long j5, double d11) {
        c cVar = this.f46606t;
        cVar.f46619b = d11;
        cVar.f46622e = j5;
        cVar.f46620c = true;
    }

    public int getColorPartTillPartPosition() {
        return this.W;
    }

    public int getCursorColor() {
        return this.f46598p;
    }

    public double getCursorValue() {
        return this.f46606t.f46618a;
    }

    public d getDelegate() {
        return this.f46581c;
    }

    public int getGaugeDeactivatedColor() {
        return this.f46602r;
    }

    public int getGaugeHeightPx() {
        return this.f46583e;
    }

    public int getGaugeSpacingPx() {
        return this.f46584f;
    }

    public String getLegendEndLabel() {
        return this.f46603r0;
    }

    public int getLegendPosition() {
        return this.f46597o0;
    }

    public String getLegendStartLabel() {
        return this.f46601q0;
    }

    public int getLegendTextColor() {
        return this.f46585g.f46635b;
    }

    public int getLegendTextSize() {
        return this.f46585g.f46634a;
    }

    public Typeface getLegendTextTypeface() {
        return this.f46585g.f46636c;
    }

    public e getScale() {
        return this.f46579a;
    }

    public double getSecondaryCursorValue() {
        return this.f46607u.f46618a;
    }

    public d getSecondaryDelegate() {
        return this.f46582d;
    }

    public e getSecondaryScale() {
        return this.f46580b;
    }

    public int getTextMarginPx() {
        return this.f46589k;
    }

    public int getTitleTextColor() {
        return this.f46586h.f46635b;
    }

    public int getTitleTextSize() {
        return this.f46586h.f46634a;
    }

    public Typeface getTitleTextTypeface() {
        return this.f46586h.f46636c;
    }

    public final void n() {
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
        if (r12 == r6) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0151, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0153, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015a, code lost:
        if (r12 <= r20.W) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0161, code lost:
        if (r12 <= r6) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0229  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.views.view.HorizontalScaleView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        Paint paint = this.f46611y;
        g gVar = this.f46585g;
        paint.setColor(gVar.f46635b);
        this.f46611y.setTextSize(gVar.f46634a);
        this.f46611y.setTypeface(gVar.f46636c);
        this.f46612z.setColor(gVar.f46635b);
        this.f46612z.setTextSize(gVar.f46634a);
        this.f46612z.setTypeface(gVar.f46636c);
        this.A.setColor(gVar.f46635b);
        this.A.setTextSize(gVar.f46634a);
        this.A.setTypeface(gVar.f46636c);
        Paint paint2 = this.B;
        g gVar2 = this.f46586h;
        paint2.setColor(gVar2.f46635b);
        this.B.setTextSize(gVar2.f46634a);
        this.B.setTypeface(gVar2.f46636c);
        Paint paint3 = this.F;
        g gVar3 = this.f46587i;
        paint3.setColor(gVar3.f46635b);
        this.F.setTextSize(gVar3.f46634a);
        this.F.setTypeface(gVar3.f46636c);
        Paint paint4 = this.P;
        g gVar4 = this.f46588j;
        paint4.setColor(gVar4.f46635b);
        this.P.setTextSize(gVar4.f46634a);
        this.P.setTypeface(gVar4.f46636c);
        this.G.setColor(this.f46598p);
        this.Q.setColor(this.f46600q);
        Paint.FontMetrics fontMetrics = this.F.getFontMetrics();
        this.f46593m0 = (fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading;
        Paint.FontMetrics fontMetrics2 = this.f46611y.getFontMetrics();
        this.f46595n0 = (fontMetrics2.bottom - fontMetrics2.top) + fontMetrics2.leading;
        int cursorHeight = getCursorHeight();
        int highlightedCursorHeight = getHighlightedCursorHeight();
        float f11 = this.f46599p0;
        int i15 = 0;
        if (f11 != -1.0f) {
            i13 = (int) f11;
        } else {
            i13 = 0;
        }
        if (this.f46604s) {
            i14 = (int) (this.f46595n0 + this.f46594n + this.f46591l0 + i13);
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
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(i15 + this.f46583e, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
    }

    public void setColorPartTillPartPosition(int i11) {
        this.W = i11;
    }

    public void setCursorColor(int i11) {
        this.f46598p = i11;
    }

    public void setCursorTitle(String str) {
        c cVar = this.f46606t;
        cVar.f46624g = str;
        this.f46605s0 = ((int) this.F.measureText(cVar.f46624g)) + 8;
    }

    public void setCursorValue(int i11) {
        this.f46606t.f46618a = i11;
    }

    public void setDelegate(d dVar) {
        this.f46581c = dVar;
    }

    public void setGaugeDeactivatedColor(int i11) {
        this.f46602r = i11;
    }

    public void setGaugeHeightPx(int i11) {
        this.f46583e = i11;
    }

    public void setGaugeSpacingPx(int i11) {
        this.f46584f = i11;
    }

    public void setHighlightedCursorTitle(String str) {
        this.f46608v.f46624g = str;
    }

    public void setHighlightedCursorValue(int i11) {
        this.f46608v.f46618a = i11;
    }

    public void setLegendEndLabel(String str) {
        this.f46603r0 = str;
    }

    public void setLegendPosition(int i11) {
        this.f46597o0 = i11;
    }

    public void setLegendStartLabel(String str) {
        this.f46601q0 = str;
    }

    public void setLegendTextColor(int i11) {
        this.f46585g.f46635b = i11;
    }

    public void setLegendTextSize(int i11) {
        this.f46585g.f46634a = i11;
    }

    public void setLegendTextTypeface(Typeface typeface) {
        this.f46585g.f46636c = typeface;
    }

    public void setScale(e eVar) {
        this.f46579a = eVar;
    }

    public void setSecondaryCursorTitle(String str) {
        this.f46607u.f46624g = str;
    }

    public void setSecondaryCursorValue(int i11) {
        this.f46607u.f46618a = i11;
    }

    public void setSecondaryDelegate(d dVar) {
        this.f46582d = dVar;
    }

    public void setSecondaryScale(e eVar) {
        this.f46580b = eVar;
    }

    public void setTextMarginPx(int i11) {
        this.f46589k = i11;
    }

    public void setTitleTextColor(int i11) {
        this.f46586h.f46635b = i11;
    }

    public void setTitleTextSize(int i11) {
        this.f46586h.f46634a = i11;
    }

    public void setTitleTextTypeface(Typeface typeface) {
        this.f46586h.f46636c = typeface;
    }

    public void setCursorValue(double d11) {
        this.f46606t.f46618a = d11;
    }

    /* loaded from: classes4.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f46625a;

        /* renamed from: b  reason: collision with root package name */
        public double f46626b;

        /* renamed from: c  reason: collision with root package name */
        public List<f> f46627c;

        public e(String str, ArrayList arrayList) {
            this.f46625a = str;
            this.f46626b = 0;
            this.f46627c = arrayList;
        }

        public e(int i11, List<f> list) {
            this.f46625a = "";
            this.f46626b = i11;
            this.f46627c = list;
        }
    }

    public HorizontalScaleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46585g = new g();
        this.f46586h = new g();
        this.f46587i = new g();
        this.f46588j = new g();
        this.f46604s = true;
        this.f46606t = new c();
        this.f46607u = new c();
        this.f46608v = new c();
        this.M = new Path();
        this.T = 0;
        this.W = Integer.MIN_VALUE;
        this.f46591l0 = 0;
        this.f46597o0 = 2;
        this.f46605s0 = 8;
        l(attributeSet);
    }

    public HorizontalScaleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f46585g = new g();
        this.f46586h = new g();
        this.f46587i = new g();
        this.f46588j = new g();
        this.f46604s = true;
        this.f46606t = new c();
        this.f46607u = new c();
        this.f46608v = new c();
        this.M = new Path();
        this.T = 0;
        this.W = Integer.MIN_VALUE;
        this.f46591l0 = 0;
        this.f46597o0 = 2;
        this.f46605s0 = 8;
        l(attributeSet);
    }
}
