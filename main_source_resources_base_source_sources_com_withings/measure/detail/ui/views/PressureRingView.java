package com.withings.measure.detail.ui.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.ui.b0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PressureRingView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002,-B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020!¢\u0006\u0004\b*\u0010+J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0006J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$¨\u0006."}, d2 = {"Lcom/withings/measure/detail/ui/views/PressureRingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "value", "Lnm0/y;", "setValue", "(F)V", "getValue", "()F", "goal", "setGoal", "", "pressureRingMode", "setPressureRingMode", "(J)V", "deflateThreshold", "setDeflateThreshold", "", "secondaryText", "setSecondaryText", "(Ljava/lang/CharSequence;)V", "mainText", "setMainText", "Lcom/withings/measure/detail/ui/views/PressureRingView$a;", "callback", "setAnimationCallback", "(Lcom/withings/measure/detail/ui/views/PressureRingView$a;)V", "animatedProgress", "setAnimatedProgress", "endAnimationProgress", "setEndAnimationProgress", "counterAnimationProgress", "setCounterAnimationProgress", "", "textsMargin", "setTextsMargin", "(I)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "measure-detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PressureRingView extends ConstraintLayout {
    private Paint A;
    private float B;
    private float F;
    private float G;
    private float M;
    private float P;
    private float Q;
    private TextView R;
    private TextView S;
    private long T;
    private int[] W;

    /* renamed from: l0  reason: collision with root package name */
    private int f41814l0;

    /* renamed from: m0  reason: collision with root package name */
    private a f41815m0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f41816n0;

    /* renamed from: t  reason: collision with root package name */
    private float f41817t;

    /* renamed from: u  reason: collision with root package name */
    private Paint f41818u;

    /* renamed from: v  reason: collision with root package name */
    private Paint f41819v;

    /* renamed from: w  reason: collision with root package name */
    private Paint f41820w;

    /* renamed from: x  reason: collision with root package name */
    private Paint f41821x;

    /* renamed from: y  reason: collision with root package name */
    private Paint f41822y;

    /* renamed from: z  reason: collision with root package name */
    private Paint f41823z;

    /* compiled from: PressureRingView.kt */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* compiled from: PressureRingView.kt */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final float f41824a;

        /* renamed from: b  reason: collision with root package name */
        private final float f41825b;

        public b(float f11, float f12) {
            this.f41824a = f11;
            this.f41825b = f12;
        }

        public final float a() {
            return this.f41825b;
        }

        public final float b() {
            return this.f41824a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Float.compare(this.f41824a, bVar.f41824a) == 0 && Float.compare(this.f41825b, bVar.f41825b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f41825b) + (Float.hashCode(this.f41824a) * 31);
        }

        public final String toString() {
            return "InnerCircleData(circleRadius=" + this.f41824a + ", alpha=" + this.f41825b + ")";
        }
    }

    /* compiled from: PressureRingView.kt */
    /* loaded from: classes4.dex */
    public static final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            u.j(animation, "animation");
            a aVar = PressureRingView.this.f41815m0;
            if (aVar != null) {
                ((b0) aVar).t1();
            }
        }
    }

    /* compiled from: PressureRingView.kt */
    /* loaded from: classes4.dex */
    public static final class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            u.j(animation, "animation");
            PressureRingView pressureRingView = PressureRingView.this;
            pressureRingView.G = 0.0f;
            pressureRingView.F = 0.0f;
            a aVar = pressureRingView.f41815m0;
            if (aVar != null) {
                ((b0) aVar).u1();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PressureRingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    private final void setTextsMargin(int i11) {
        TextView textView = this.R;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        u.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i11;
        textView.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i11;
        float f11;
        float f12;
        u.j(canvas, "canvas");
        float paddingLeft = (getPaddingLeft() + (canvas.getWidth() / 2)) - getPaddingRight();
        float paddingTop = (getPaddingTop() + (canvas.getHeight() / 2)) - getPaddingBottom();
        float min = Math.min((canvas.getWidth() - getPaddingLeft()) - getPaddingRight(), (canvas.getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        float f13 = this.f41817t;
        float f14 = 2;
        float f15 = min - (f13 / f14);
        long j5 = this.T;
        if (j5 == 0) {
            float f16 = min - (f13 / f14);
            canvas.drawCircle(paddingLeft, paddingTop, min, this.f41820w);
            canvas.drawCircle(paddingLeft, paddingTop, f16, this.f41818u);
            float f17 = min - this.f41817t;
            float f18 = this.F;
            float f19 = this.Q;
            if (f18 >= f19) {
                float f21 = this.B;
                float f22 = f21 - f18;
                float f23 = 100;
                float f24 = f21 - f19;
                f11 = ((f22 * f23) / f24) / f23;
                f12 = (f22 * f17) / f24;
            } else {
                float f25 = 100;
                f11 = ((f18 * f25) / f19) / f25;
                f12 = (f18 * f17) / f19;
            }
            b bVar = new b(f12, f11);
            Paint paint = this.f41819v;
            paint.setColor(ah.u.j(bVar.a(), androidx.core.content.a.getColor(getContext(), 17170443)));
            canvas.drawCircle(paddingLeft, paddingTop, bVar.b(), paint);
            float f26 = this.F;
            float f27 = this.B;
            float max = (Math.max(0.0f, (f26 - f27) / f27) * 360.0f) - 90.0f;
            float min2 = Math.min(1.0f, this.F / this.B) * 360.0f;
            int[] iArr = this.W;
            if (iArr != null) {
                SweepGradient sweepGradient = new SweepGradient(paddingLeft, paddingTop, iArr, (float[]) null);
                Matrix matrix = new Matrix();
                matrix.postRotate(max, paddingLeft, paddingTop);
                sweepGradient.setLocalMatrix(matrix);
                Paint paint2 = this.f41823z;
                paint2.setShader(sweepGradient);
                RectF rectF = new RectF();
                rectF.left = paddingLeft - f16;
                rectF.top = paddingTop - f16;
                rectF.right = paddingLeft + f16;
                rectF.bottom = f16 + paddingTop;
                canvas.drawArc(rectF, max, min2, false, paint2);
                if (this.f41816n0) {
                    float f28 = this.G;
                    float f29 = this.B;
                    float max2 = (Math.max(0.0f, (f28 - f29) / f29) * 360.0f) - 90.0f;
                    float min3 = Math.min(1.0f, this.G / this.B) * 360.0f;
                    RectF rectF2 = new RectF();
                    rectF2.left = paddingLeft - f15;
                    rectF2.top = paddingTop - f15;
                    rectF2.right = paddingLeft + f15;
                    rectF2.bottom = paddingTop + f15;
                    canvas.drawArc(rectF2, max2, min3, false, this.A);
                }
            } else {
                u.s("gradientColors");
                throw null;
            }
        } else if (j5 == 2) {
            canvas.drawCircle(paddingLeft, paddingTop, f15, this.f41821x);
            float f31 = this.P;
            float max3 = (Math.max(0.0f, (f31 - this.M) / f31) * 360.0f) - 90.0f;
            float min4 = Math.min(1.0f, this.M / this.P) * 360.0f;
            RectF rectF3 = new RectF();
            rectF3.left = paddingLeft - f15;
            rectF3.top = paddingTop - f15;
            rectF3.right = paddingLeft + f15;
            rectF3.bottom = paddingTop + f15;
            canvas.drawArc(rectF3, max3, min4, true, this.f41822y);
            this.R.setText(String.valueOf((int) this.M));
            Context context = this.S.getContext();
            if (((int) this.M) > 1) {
                i11 = C1987R.string._SECONDS_;
            } else {
                i11 = C1987R.string._SECOND_;
            }
            String string = context.getString(i11);
            u.i(string, "getString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            u.i(lowerCase, "toLowerCase(...)");
            setSecondaryText(lowerCase);
        }
        super.dispatchDraw(canvas);
    }

    public final float getValue() {
        return this.F;
    }

    public final void setAnimatedProgress(float f11) {
        if (f11 < this.B || this.f41816n0) {
            this.F = f11;
            invalidate();
        }
    }

    public final void setAnimationCallback(a aVar) {
        this.f41815m0 = aVar;
    }

    public final void setCounterAnimationProgress(float f11) {
        this.M = f11;
        this.R.setText(String.valueOf((int) f11));
        invalidate();
    }

    public final void setDeflateThreshold(float f11) {
        this.Q = f11;
    }

    public final void setEndAnimationProgress(float f11) {
        this.G = f11;
        invalidate();
    }

    public final void setGoal(float f11) {
        this.B = f11;
    }

    public final void setMainText(CharSequence mainText) {
        u.j(mainText, "mainText");
        this.R.setText(mainText);
    }

    public final void setPressureRingMode(long j5) {
        this.T = j5;
    }

    public final void setSecondaryText(CharSequence secondaryText) {
        u.j(secondaryText, "secondaryText");
        this.S.setText(secondaryText);
    }

    public final void setValue(float f11) {
        this.F = f11;
    }

    public final void w() {
        this.f41816n0 = false;
        this.T = 2L;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "counterAnimationProgress", this.P, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        float f11 = 1000;
        ofFloat.setDuration((this.P * f11) - f11);
        ofFloat.addListener(new c());
        ofFloat.start();
    }

    public final void x(float f11) {
        this.f41816n0 = false;
        this.T = 0L;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "animatedProgress", this.F, f11);
        ofFloat.setDuration(1200L);
        ofFloat.start();
    }

    public final void y() {
        this.f41816n0 = true;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "endAnimationProgress", 0.0f, this.F);
        ofFloat.setDuration(1500L);
        ofFloat.addListener(new d());
        ofFloat.start();
    }

    public final void z(float f11, float f12) {
        this.P = f12;
        this.M = f11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressureRingView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f41817t = ah.g.k(2, context);
        Paint paint = new Paint();
        paint.setShader(null);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setAntiAlias(true);
        paint.setColor(androidx.core.content.a.getColor(context, C1987R.color.backgroundSecondary));
        this.f41818u = paint;
        Paint paint2 = new Paint();
        paint2.setShader(null);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setStrokeCap(cap);
        paint2.setAntiAlias(true);
        this.f41819v = paint2;
        Paint paint3 = new Paint();
        paint3.setShader(null);
        paint3.setStyle(style2);
        paint3.setStrokeCap(cap);
        paint3.setAntiAlias(true);
        paint3.setColor(androidx.core.content.a.getColor(context, C1987R.color.background4));
        this.f41820w = paint3;
        Paint paint4 = new Paint();
        paint4.setShader(null);
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        paint4.setAntiAlias(true);
        paint4.setColor(androidx.core.content.a.getColor(context, 17170443));
        this.f41821x = paint4;
        Paint paint5 = new Paint();
        paint5.setShader(null);
        paint5.setStyle(style2);
        paint5.setStrokeCap(cap);
        paint5.setAntiAlias(true);
        paint5.setColor(androidx.core.content.a.getColor(context, C1987R.color.background4));
        this.f41822y = paint5;
        Paint paint6 = new Paint();
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        this.f41823z = paint6;
        Paint paint7 = new Paint();
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint7.setColor(-1);
        this.A = paint7;
        View.inflate(context, C1987R.layout.view_measure_ring, this);
        View findViewById = findViewById(C1987R.id.main_text);
        u.i(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.R = textView;
        View findViewById2 = findViewById(C1987R.id.secondary_text);
        u.i(findViewById2, "findViewById(...)");
        TextView textView2 = (TextView) findViewById2;
        this.S = textView2;
        if (isInEditMode()) {
            this.F = 4.0f;
            this.B = 10.0f;
        }
        new Paint().setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22420p);
            u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
            Context context2 = getContext();
            u.i(context2, "getContext(...)");
            this.f41817t = obtainStyledAttributes.getDimension(4, ah.g.k(2, context2));
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            if (resourceId != -1) {
                int[] intArray = getResources().getIntArray(resourceId);
                u.i(intArray, "getIntArray(...)");
                this.W = intArray;
            }
            this.f41814l0 = obtainStyledAttributes.getColor(0, -1);
            textView.setTextAppearance(obtainStyledAttributes.getResourceId(2, C1987R.style.data2));
            textView.setTextColor(-16777216);
            textView2.setTextAppearance(obtainStyledAttributes.getResourceId(3, C1987R.style.detail1));
            textView2.setTextColor(-16777216);
            if (obtainStyledAttributes.hasValue(5)) {
                Context context3 = getContext();
                u.i(context3, "getContext(...)");
                setTextsMargin(obtainStyledAttributes.getDimensionPixelSize(5, ah.g.k(3, context3)));
            }
            obtainStyledAttributes.recycle();
        }
        paint.setStrokeWidth(this.f41817t);
        paint2.setStrokeWidth(this.f41817t);
        paint6.setStrokeWidth(this.f41817t);
        paint7.setStrokeWidth(this.f41817t);
        paint7.setColor(this.f41814l0);
    }
}
