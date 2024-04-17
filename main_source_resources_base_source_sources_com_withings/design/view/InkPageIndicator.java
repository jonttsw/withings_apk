package com.withings.design.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.compose.material.n3;
import androidx.viewpager.widget.ViewPager;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class InkPageIndicator extends View implements ViewPager.h, View.OnAttachStateChangeListener {
    private static Interpolator W;
    private final Path A;
    private final Path B;
    private final Path F;
    private final Path G;
    private final RectF M;
    private c P;
    private d[] Q;
    private final Interpolator R;
    float S;
    float T;

    /* renamed from: a  reason: collision with root package name */
    private int f36311a;

    /* renamed from: b  reason: collision with root package name */
    private int f36312b;

    /* renamed from: c  reason: collision with root package name */
    private long f36313c;

    /* renamed from: d  reason: collision with root package name */
    private int f36314d;

    /* renamed from: e  reason: collision with root package name */
    private int f36315e;

    /* renamed from: f  reason: collision with root package name */
    private float f36316f;

    /* renamed from: g  reason: collision with root package name */
    private float f36317g;

    /* renamed from: h  reason: collision with root package name */
    private long f36318h;

    /* renamed from: i  reason: collision with root package name */
    private float f36319i;

    /* renamed from: j  reason: collision with root package name */
    private float f36320j;

    /* renamed from: k  reason: collision with root package name */
    private float f36321k;

    /* renamed from: l  reason: collision with root package name */
    private ViewPager f36322l;

    /* renamed from: m  reason: collision with root package name */
    private int f36323m;

    /* renamed from: n  reason: collision with root package name */
    private int f36324n;

    /* renamed from: o  reason: collision with root package name */
    private int f36325o;

    /* renamed from: p  reason: collision with root package name */
    private float f36326p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f36327q;

    /* renamed from: r  reason: collision with root package name */
    private float[] f36328r;

    /* renamed from: s  reason: collision with root package name */
    private float[] f36329s;

    /* renamed from: t  reason: collision with root package name */
    private float f36330t;

    /* renamed from: u  reason: collision with root package name */
    private float f36331u;

    /* renamed from: v  reason: collision with root package name */
    private float[] f36332v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f36333w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f36334x;

    /* renamed from: y  reason: collision with root package name */
    private final Paint f36335y;

    /* renamed from: z  reason: collision with root package name */
    private final Paint f36336z;

    /* loaded from: classes3.dex */
    final class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            InkPageIndicator inkPageIndicator = InkPageIndicator.this;
            inkPageIndicator.setPageCount(inkPageIndicator.f36322l.getAdapter().getCount());
        }
    }

    /* loaded from: classes3.dex */
    public class b extends g {
        @Override // com.withings.design.view.InkPageIndicator.g
        final boolean a(float f11) {
            if (f11 < this.f36351a) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class c extends e {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InkPageIndicator f36338c;

        /* loaded from: classes3.dex */
        final class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c cVar = c.this;
                cVar.f36338c.f36330t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                InkPageIndicator inkPageIndicator = cVar.f36338c;
                inkPageIndicator.postInvalidateOnAnimation();
                for (d dVar : inkPageIndicator.Q) {
                    dVar.a(inkPageIndicator.f36330t);
                }
            }
        }

        /* loaded from: classes3.dex */
        final class b implements ValueAnimator.AnimatorUpdateListener {
            b() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c cVar = c.this;
                cVar.f36338c.f36331u = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                InkPageIndicator inkPageIndicator = cVar.f36338c;
                inkPageIndicator.postInvalidateOnAnimation();
                for (d dVar : inkPageIndicator.Q) {
                    dVar.a(inkPageIndicator.f36331u);
                }
            }
        }

        /* renamed from: com.withings.design.view.InkPageIndicator$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0478c extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int[] f36341a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ float f36342b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f36343c;

            C0478c(int[] iArr, float f11, float f12) {
                this.f36341a = iArr;
                this.f36342b = f11;
                this.f36343c = f12;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                c cVar = c.this;
                cVar.f36338c.f36330t = -1.0f;
                InkPageIndicator inkPageIndicator = cVar.f36338c;
                inkPageIndicator.f36331u = -1.0f;
                inkPageIndicator.postInvalidateOnAnimation();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                c cVar = c.this;
                InkPageIndicator.j(cVar.f36338c);
                int[] iArr = this.f36341a;
                int length = iArr.length;
                int i11 = 0;
                while (true) {
                    InkPageIndicator inkPageIndicator = cVar.f36338c;
                    if (i11 >= length) {
                        inkPageIndicator.f36330t = this.f36342b;
                        inkPageIndicator.f36331u = this.f36343c;
                        inkPageIndicator.postInvalidateOnAnimation();
                        return;
                    }
                    InkPageIndicator.k(inkPageIndicator, iArr[i11], 1.0E-5f);
                    i11++;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InkPageIndicator inkPageIndicator, int i11, int i12, int i13, g gVar) {
            super(gVar);
            float f11;
            float f12;
            float f13;
            float f14;
            float max;
            float f15;
            float f16;
            float f17;
            int i14 = 0;
            this.f36338c = inkPageIndicator;
            setDuration(inkPageIndicator.f36318h);
            setInterpolator(inkPageIndicator.R);
            if (i12 > i11) {
                f11 = Math.min(inkPageIndicator.f36328r[i11], inkPageIndicator.f36326p);
                f12 = inkPageIndicator.f36316f;
            } else {
                f11 = inkPageIndicator.f36328r[i12];
                f12 = inkPageIndicator.f36316f;
            }
            float f18 = f11 - f12;
            if (i12 > i11) {
                f13 = inkPageIndicator.f36328r[i12];
                f14 = inkPageIndicator.f36316f;
            } else {
                f13 = inkPageIndicator.f36328r[i12];
                f14 = inkPageIndicator.f36316f;
            }
            float f19 = f13 - f14;
            if (i12 > i11) {
                max = inkPageIndicator.f36328r[i12];
                f15 = inkPageIndicator.f36316f;
            } else {
                max = Math.max(inkPageIndicator.f36328r[i11], inkPageIndicator.f36326p);
                f15 = inkPageIndicator.f36316f;
            }
            float f21 = max + f15;
            if (i12 > i11) {
                f16 = inkPageIndicator.f36328r[i12];
                f17 = inkPageIndicator.f36316f;
            } else {
                f16 = inkPageIndicator.f36328r[i12];
                f17 = inkPageIndicator.f36316f;
            }
            float f22 = f16 + f17;
            inkPageIndicator.Q = new d[i13];
            int[] iArr = new int[i13];
            if (f18 != f19) {
                setFloatValues(f18, f19);
                while (i14 < i13) {
                    int i15 = i11 + i14;
                    inkPageIndicator.Q[i14] = new d(i15, new g(inkPageIndicator.f36328r[i15]));
                    iArr[i14] = i15;
                    i14++;
                }
                addUpdateListener(new a());
            } else {
                setFloatValues(f21, f22);
                while (i14 < i13) {
                    int i16 = i11 - i14;
                    inkPageIndicator.Q[i14] = new d(i16, new g(inkPageIndicator.f36328r[i16]));
                    iArr[i14] = i16;
                    i14++;
                }
                addUpdateListener(new b());
            }
            addListener(new C0478c(iArr, f18, f21));
        }
    }

    /* loaded from: classes3.dex */
    public class d extends e {

        /* renamed from: c  reason: collision with root package name */
        private int f36345c;

        /* loaded from: classes3.dex */
        final class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d dVar = d.this;
                InkPageIndicator.k(InkPageIndicator.this, dVar.f36345c, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        /* loaded from: classes3.dex */
        final class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                d dVar = d.this;
                InkPageIndicator.k(InkPageIndicator.this, dVar.f36345c, 0.0f);
                InkPageIndicator.this.postInvalidateOnAnimation();
            }
        }

        public d(int i11, g gVar) {
            super(gVar);
            setFloatValues(1.0E-5f, 1.0f);
            this.f36345c = i11;
            setDuration(InkPageIndicator.this.f36318h);
            setInterpolator(InkPageIndicator.this.R);
            addUpdateListener(new a());
            addListener(new b());
        }
    }

    /* loaded from: classes3.dex */
    public abstract class e extends ValueAnimator {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f36349a = false;

        /* renamed from: b  reason: collision with root package name */
        protected g f36350b;

        public e(g gVar) {
            this.f36350b = gVar;
        }

        public final void a(float f11) {
            if (!this.f36349a && this.f36350b.a(f11)) {
                start();
                this.f36349a = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f extends g {
        @Override // com.withings.design.view.InkPageIndicator.g
        final boolean a(float f11) {
            if (f11 > this.f36351a) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class g {

        /* renamed from: a  reason: collision with root package name */
        protected float f36351a;

        public g(float f11) {
            this.f36351a = f11;
        }

        abstract boolean a(float f11);
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + this.f36311a;
    }

    private int getDesiredWidth() {
        return getPaddingRight() + getPaddingLeft() + getRequiredWidth();
    }

    private int getRequiredWidth() {
        int i11 = this.f36323m;
        return ((i11 - 1) * this.f36312b) + (this.f36311a * i11);
    }

    private Path getRetreatingJoinPath() {
        Path path = this.B;
        path.rewind();
        RectF rectF = this.M;
        rectF.set(this.f36330t, this.f36319i, this.f36331u, this.f36321k);
        float f11 = this.f36316f;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        return path;
    }

    static void j(InkPageIndicator inkPageIndicator) {
        Arrays.fill(inkPageIndicator.f36329s, 0.0f);
        inkPageIndicator.postInvalidateOnAnimation();
    }

    static void k(InkPageIndicator inkPageIndicator, int i11, float f11) {
        inkPageIndicator.f36332v[i11] = f11;
        inkPageIndicator.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageCount(int i11) {
        this.f36323m = i11;
        u();
        requestLayout();
    }

    private void setSelectedPage(int i11) {
        g gVar;
        long j5;
        int i12 = this.f36324n;
        if (i11 != i12 && this.f36328r != null) {
            this.f36334x = true;
            this.f36325o = i12;
            this.f36324n = i11;
            int abs = Math.abs(i11 - i12);
            if (abs > 1) {
                if (i11 > this.f36325o) {
                    for (int i13 = 0; i13 < abs; i13++) {
                        w(1.0f, this.f36325o + i13);
                    }
                } else {
                    for (int i14 = -1; i14 > (-abs); i14--) {
                        w(1.0f, this.f36325o + i14);
                    }
                }
            }
            float f11 = this.f36328r[i11];
            int i15 = this.f36325o;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36326p, f11);
            if (i11 > i15) {
                gVar = new g(f11 - ((f11 - this.f36326p) * 0.25f));
            } else {
                gVar = new g(n3.a(this.f36326p, f11, 0.25f, f11));
            }
            c cVar = new c(this, i15, i11, abs, gVar);
            this.P = cVar;
            cVar.addListener(new com.withings.design.view.c(this));
            ofFloat.addUpdateListener(new com.withings.design.view.d(this));
            ofFloat.addListener(new com.withings.design.view.e(this));
            boolean z5 = this.f36327q;
            long j11 = this.f36313c;
            if (z5) {
                j5 = j11 / 4;
            } else {
                j5 = 0;
            }
            ofFloat.setStartDelay(j5);
            ofFloat.setDuration((j11 * 3) / 4);
            ofFloat.setInterpolator(this.R);
            ofFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        float[] fArr = new float[Math.max(this.f36323m, 1) - 1];
        this.f36329s = fArr;
        Arrays.fill(fArr, 0.0f);
        float[] fArr2 = new float[this.f36323m];
        this.f36332v = fArr2;
        Arrays.fill(fArr2, 0.0f);
        this.f36330t = -1.0f;
        this.f36331u = -1.0f;
        this.f36327q = true;
    }

    private void v() {
        ViewPager viewPager = this.f36322l;
        if (viewPager != null) {
            this.f36324n = viewPager.getCurrentItem();
        } else {
            this.f36324n = 0;
        }
        float[] fArr = this.f36328r;
        if (fArr != null && fArr.length > 0) {
            this.f36326p = fArr[this.f36324n];
        }
    }

    private void w(float f11, int i11) {
        if (i11 < this.f36329s.length) {
            if (i11 == 1) {
                Log.d("PageIndicator", "dot 1 fraction:\t" + f11);
            }
            this.f36329s[i11] = f11;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f11;
        int i11;
        float f12;
        Path path;
        int i12;
        float f13;
        int i13;
        RectF rectF;
        Path path2;
        float f14;
        float f15;
        if (this.f36322l != null && this.f36323m != 0) {
            Path path3 = this.A;
            path3.rewind();
            int i14 = 0;
            while (true) {
                int i15 = this.f36323m;
                f11 = this.f36316f;
                if (i14 >= i15) {
                    break;
                }
                int i16 = i15 - 1;
                if (i14 == i16) {
                    i11 = i14;
                } else {
                    i11 = i14 + 1;
                }
                float[] fArr = this.f36328r;
                float f16 = fArr[i14];
                float f17 = fArr[i11];
                if (i14 == i16) {
                    f12 = -1.0f;
                } else {
                    f12 = this.f36329s[i14];
                }
                float f18 = this.f36332v[i14];
                Path path4 = this.B;
                path4.rewind();
                int i17 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                if ((i17 == 0 || f12 == -1.0f) && f18 == 0.0f && (i14 != this.f36324n || !this.f36327q)) {
                    path4.addCircle(this.f36328r[i14], this.f36320j, f11, Path.Direction.CW);
                }
                RectF rectF2 = this.M;
                int i18 = this.f36312b;
                if (i17 > 0 && f12 <= 0.5f && this.f36330t == -1.0f) {
                    Path path5 = this.F;
                    path5.rewind();
                    path5.moveTo(f16, this.f36321k);
                    float f19 = f16 + f11;
                    rectF2.set(f16 - f11, this.f36319i, f19, this.f36321k);
                    path5.arcTo(rectF2, 90.0f, 180.0f, true);
                    float f21 = i18 * f12;
                    float f22 = f19 + f21;
                    this.S = f22;
                    float f23 = this.f36320j;
                    this.T = f23;
                    float f24 = this.f36317g;
                    float f25 = f16 + f24;
                    path5.cubicTo(f25, this.f36319i, f22, f23 - f24, f22, f23);
                    float f26 = this.f36321k;
                    i12 = i14;
                    path = path3;
                    i13 = i18;
                    rectF = rectF2;
                    f13 = f18;
                    path2 = path4;
                    f14 = f16;
                    path5.cubicTo(this.S, this.T + f24, f25, f26, f16, f26);
                    Path.Op op2 = Path.Op.UNION;
                    path2.op(path5, op2);
                    Path path6 = this.G;
                    path6.rewind();
                    path6.moveTo(f17, this.f36321k);
                    float f27 = f17 - f11;
                    rectF.set(f27, this.f36319i, f17 + f11, this.f36321k);
                    path6.arcTo(rectF, 90.0f, -180.0f, true);
                    float f28 = f27 - f21;
                    this.S = f28;
                    float f29 = this.f36320j;
                    this.T = f29;
                    float f31 = f17 - f24;
                    path6.cubicTo(f31, this.f36319i, f28, f29 - f24, f28, f29);
                    float f32 = this.f36321k;
                    path6.cubicTo(this.S, this.T + f24, f31, f32, f17, f32);
                    path2.op(path6, op2);
                } else {
                    path = path3;
                    i12 = i14;
                    f13 = f18;
                    i13 = i18;
                    rectF = rectF2;
                    path2 = path4;
                    f14 = f16;
                }
                if (f12 > 0.5f && f12 < 1.0f && this.f36330t == -1.0f) {
                    float f33 = (f12 - 0.2f) * 1.25f;
                    float f34 = f14;
                    path2.moveTo(f34, this.f36321k);
                    float f35 = f34 + f11;
                    rectF.set(f34 - f11, this.f36319i, f35, this.f36321k);
                    path2.arcTo(rectF, 90.0f, 180.0f, true);
                    float f36 = (i13 / 2) + f35;
                    this.S = f36;
                    float f37 = f33 * f11;
                    float f38 = this.f36320j - f37;
                    this.T = f38;
                    float f39 = (1.0f - f33) * f11;
                    Path path7 = path2;
                    path7.cubicTo(f36 - f37, this.f36319i, f36 - f39, f38, f36, f38);
                    float f41 = this.f36319i;
                    float f42 = this.S;
                    path7.cubicTo(f39 + f42, this.T, f37 + f42, f41, f17, f41);
                    rectF.set(f17 - f11, this.f36319i, f17 + f11, this.f36321k);
                    path2.arcTo(rectF, 270.0f, 180.0f, true);
                    float f43 = this.f36320j + f37;
                    this.T = f43;
                    float f44 = this.S;
                    path7.cubicTo(f37 + f44, this.f36321k, f39 + f44, f43, f44, f43);
                    float f45 = this.f36321k;
                    float f46 = this.S;
                    f15 = f34;
                    path2.cubicTo(f46 - f39, this.T, f46 - f37, f45, f34, f45);
                } else {
                    f15 = f14;
                }
                if (f12 == 1.0f && this.f36330t == -1.0f) {
                    rectF.set(f15 - f11, this.f36319i, f17 + f11, this.f36321k);
                    path2.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                }
                if (f13 > 1.0E-5f) {
                    path2.addCircle(f15, this.f36320j, f13 * f11, Path.Direction.CW);
                }
                path3 = path;
                path3.op(path2, Path.Op.UNION);
                i14 = i12 + 1;
            }
            if (this.f36330t != -1.0f) {
                path3.op(getRetreatingJoinPath(), Path.Op.UNION);
            }
            canvas.drawPath(path3, this.f36335y);
            canvas.drawCircle(this.f36326p, this.f36320j, f11, this.f36336z);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                desiredHeight = View.MeasureSpec.getSize(i12);
            }
        } else {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i12));
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                desiredWidth = View.MeasureSpec.getSize(i11);
            }
        } else {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i11));
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = desiredWidth - getPaddingRight();
        getPaddingBottom();
        float requiredWidth = (((paddingRight - paddingLeft) - getRequiredWidth()) / 2) + paddingLeft;
        float f11 = this.f36316f;
        float f12 = requiredWidth + f11;
        this.f36328r = new float[this.f36323m];
        int i13 = 0;
        while (true) {
            int i14 = this.f36323m;
            int i15 = this.f36311a;
            if (i13 < i14) {
                this.f36328r[i13] = ((i15 + this.f36312b) * i13) + f12;
                i13++;
            } else {
                float f13 = paddingTop;
                this.f36319i = f13;
                this.f36320j = f13 + f11;
                this.f36321k = paddingTop + i15;
                v();
                return;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrolled(int i11, float f11, int i12) {
        int i13;
        if (this.f36333w) {
            if (this.f36334x) {
                i13 = this.f36325o;
            } else {
                i13 = this.f36324n;
            }
            if (i13 != i11) {
                f11 = 1.0f - f11;
                if (f11 == 1.0f) {
                    i11 = Math.min(i13, i11);
                }
            }
            w(f11, i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        if (this.f36333w) {
            setSelectedPage(i11);
        } else {
            v();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f36333w = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f36333w = false;
    }

    public void setSelectedColour(int i11) {
        this.f36315e = i11;
        this.f36336z.setColor(i11);
        invalidate();
    }

    public void setUnselectedColour(int i11) {
        this.f36314d = i11;
        this.f36335y.setColor(i11);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f36322l = viewPager;
        viewPager.c(this);
        setPageCount(viewPager.getAdapter().getCount());
        viewPager.getAdapter().registerDataSetObserver(new a());
        v();
    }

    public InkPageIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int i12 = (int) context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72611m, i11, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, i12 * 8);
        this.f36311a = dimensionPixelSize;
        float f11 = dimensionPixelSize / 2;
        this.f36316f = f11;
        this.f36317g = f11 / 2.0f;
        this.f36312b = obtainStyledAttributes.getDimensionPixelSize(3, i12 * 12);
        long integer = obtainStyledAttributes.getInteger(0, 400);
        this.f36313c = integer;
        this.f36318h = integer / 2;
        this.f36314d = obtainStyledAttributes.getColor(4, -2130706433);
        this.f36315e = obtainStyledAttributes.getColor(1, -1);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f36335y = paint;
        paint.setColor(this.f36314d);
        Paint paint2 = new Paint(1);
        this.f36336z = paint2;
        paint2.setColor(this.f36315e);
        if (W == null) {
            W = AnimationUtils.loadInterpolator(context, 17563661);
        }
        this.R = W;
        this.A = new Path();
        this.B = new Path();
        this.F = new Path();
        this.G = new Path();
        this.M = new RectF();
        addOnAttachStateChangeListener(this);
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrollStateChanged(int i11) {
    }
}
