package com.withings.views.graphs;

import ah.u;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.u0;
import com.google.android.material.search.i;
import com.withings.graph.GraphView;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.graphs.GraphPopupView;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import java.util.List;
import m6.q;
import org.joda.time.DateTimeConstants;
import rs.e;
import ys.g;
/* loaded from: classes4.dex */
public class GraphPopupView extends View implements g {
    public static final int O0 = u.j(0.1f, 465491);
    private Paint A;
    private String A0;
    private int B;
    private String B0;
    private int C0;
    private d D0;
    private float E0;
    private TextPaint F;
    private ValueAnimator F0;
    private int G;
    private ValueAnimator G0;
    private int H0;
    private int I0;
    private int J0;
    private int K0;
    private int L0;
    private int M;
    private float M0;
    private b N0;
    private int P;
    private TextPaint Q;
    private int R;
    private int S;
    private Bitmap T;
    private Rect W;

    /* renamed from: a */
    private GraphView f46416a;

    /* renamed from: b */
    private e f46417b;

    /* renamed from: c */
    private PointF f46418c;

    /* renamed from: d */
    private PointF f46419d;

    /* renamed from: e */
    private Path f46420e;

    /* renamed from: f */
    private Rect f46421f;

    /* renamed from: g */
    private Paint f46422g;

    /* renamed from: h */
    private int f46423h;

    /* renamed from: i */
    private int f46424i;

    /* renamed from: j */
    private int f46425j;

    /* renamed from: k */
    private int f46426k;

    /* renamed from: l */
    private int f46427l;

    /* renamed from: l0 */
    private int f46428l0;

    /* renamed from: m */
    private int f46429m;

    /* renamed from: m0 */
    private int f46430m0;

    /* renamed from: n */
    private int f46431n;

    /* renamed from: n0 */
    private int f46432n0;

    /* renamed from: o */
    private int f46433o;

    /* renamed from: o0 */
    private TextPaint f46434o0;

    /* renamed from: p */
    private boolean f46435p;

    /* renamed from: p0 */
    private int f46436p0;

    /* renamed from: q */
    private boolean f46437q;

    /* renamed from: q0 */
    private int f46438q0;

    /* renamed from: r */
    private boolean f46439r;

    /* renamed from: r0 */
    private Bitmap f46440r0;

    /* renamed from: s */
    private boolean f46441s;

    /* renamed from: s0 */
    private Paint f46442s0;

    /* renamed from: t */
    private boolean f46443t;

    /* renamed from: t0 */
    private Rect f46444t0;

    /* renamed from: u */
    private boolean f46445u;

    /* renamed from: u0 */
    private int f46446u0;

    /* renamed from: v */
    private int f46447v;

    /* renamed from: v0 */
    private int f46448v0;

    /* renamed from: w */
    private boolean f46449w;

    /* renamed from: w0 */
    private int f46450w0;

    /* renamed from: x */
    private int f46451x;

    /* renamed from: x0 */
    private int f46452x0;

    /* renamed from: y */
    private int f46453y;

    /* renamed from: y0 */
    private c f46454y0;

    /* renamed from: z */
    private Rect f46455z;

    /* renamed from: z0 */
    private String f46456z0;

    /* loaded from: classes4.dex */
    public interface a {
        Drawable getIcon();

        int getIconHeight();

        int getIconWidth();
    }

    /* loaded from: classes4.dex */
    public interface b {
        void b(e eVar);
    }

    /* loaded from: classes4.dex */
    public interface c {
        String getPopupSubText(e eVar);

        a getPopupSubTextIcon(e eVar);

        String getPopupText(e eVar);

        String getPopupTitleText(e eVar);
    }

    /* loaded from: classes4.dex */
    public interface d {
    }

    public GraphPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46435p = true;
        this.f46437q = true;
        this.f46439r = false;
        this.f46441s = false;
        this.f46443t = false;
        this.f46445u = true;
        this.M0 = 0.0f;
        m();
    }

    public static /* synthetic */ void d(GraphPopupView graphPopupView, ValueAnimator valueAnimator) {
        graphPopupView.getClass();
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        graphPopupView.I0 = (int) (graphPopupView.H0 * animatedFraction);
        graphPopupView.K0 = (int) (graphPopupView.J0 * animatedFraction);
        u0.T(graphPopupView);
    }

    public static /* synthetic */ boolean e(GraphPopupView graphPopupView, MotionEvent motionEvent) {
        graphPopupView.getClass();
        if (motionEvent.getAction() == 0 && graphPopupView.f46421f.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            graphPopupView.N0.b(graphPopupView.f46417b);
            graphPopupView.a();
            return true;
        }
        return false;
    }

    public static /* synthetic */ void f(GraphPopupView graphPopupView, ValueAnimator valueAnimator) {
        graphPopupView.getClass();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        graphPopupView.L0 = (int) ((1.0f - animatedFraction) * 56.0f);
        graphPopupView.M0 = animatedFraction;
        u0.T(graphPopupView);
    }

    private void m() {
        setVisibility(8);
        this.f46419d = new PointF();
        this.f46418c = new PointF();
        this.f46456z0 = "0";
        this.A0 = "0";
        this.B0 = "0";
        if (isInEditMode()) {
            this.G = C1987R.layout.activity_wellness_program_details;
            this.R = C1987R.layout.activity_wellness_program_details;
            this.f46436p0 = C1987R.layout.activity_workout_list;
            this.f46423h = -1;
            this.f46424i = 8;
            this.f46425j = 24;
            this.f46426k = 16;
            this.f46431n = 8;
            this.f46433o = 8;
            this.f46427l = 4;
            this.f46429m = 2;
            this.B = C1987R.layout.activity_waiting_signal_sync;
            this.f46446u0 = C1987R.layout.activity_workout_list;
        } else {
            this.G = u.v(16842806, getContext());
            this.R = u.v(16842808, getContext());
            this.f46436p0 = u.v(16842808, getContext());
            this.f46423h = u.v(C1987R.attr.scrubberBackground, getContext());
            this.f46424i = ah.g.k(4, getContext());
            this.f46425j = ah.g.k(12, getContext());
            this.f46426k = ah.g.k(8, getContext());
            this.f46431n = ah.g.k(4, getContext());
            this.f46433o = ah.g.k(4, getContext());
            this.f46447v = ah.g.k(16, getContext());
            this.f46427l = ah.g.k(2, getContext());
            this.f46429m = ah.g.k(1, getContext());
            this.f46451x = ah.g.k(8, getContext());
            this.f46453y = ah.g.k(4, getContext());
            this.B = u.v(16842806, getContext());
            this.f46446u0 = u.v(16842806, getContext());
        }
        this.f46421f = new Rect();
        this.f46420e = new Path();
        Paint paint = new Paint();
        this.f46422g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f46422g.setColor(this.f46423h);
        this.f46422g.setAntiAlias(true);
        setLayerType(1, this.f46422g);
        this.f46422g.setShadowLayer(this.f46427l, 0.0f, this.f46429m, O0);
        this.f46444t0 = new Rect(0, 0, 0, 0);
        this.W = new Rect(0, 0, 0, 0);
        TextPaint k11 = wq.a.k(C1987R.style.data7, getContext(), 16);
        this.F = k11;
        k11.setColor(this.G);
        this.F.setAntiAlias(true);
        this.M = (int) Math.abs(this.F.getFontMetrics().top);
        this.P = 0;
        TextPaint k12 = wq.a.k(C1987R.style.detail1, getContext(), 12);
        this.Q = k12;
        k12.setColor(this.R);
        this.Q.setAntiAlias(true);
        this.S = (int) Math.abs(this.Q.getFontMetrics().top);
        TextPaint k13 = wq.a.k(C1987R.style.detail1, getContext(), 12);
        this.f46434o0 = k13;
        k13.setColor(this.f46436p0);
        this.f46434o0.setAntiAlias(true);
        this.f46438q0 = (int) Math.abs(this.f46434o0.getFontMetrics().top);
        this.f46455z = new Rect();
        Paint paint2 = new Paint();
        this.A = paint2;
        paint2.setDither(true);
        this.A.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A.setColor(this.B);
        this.A.setStrokeJoin(Paint.Join.ROUND);
        this.A.setStrokeCap(Paint.Cap.ROUND);
        this.A.setAntiAlias(true);
        this.f46442s0 = new Paint();
        this.f46442s0.setColorFilter(new PorterDuffColorFilter(this.f46446u0, PorterDuff.Mode.SRC_IN));
        ValueAnimator valueAnimator = new ValueAnimator();
        this.G0 = valueAnimator;
        valueAnimator.setFloatValues(0.0f, 1.0f);
        this.G0.setDuration(200L);
        this.G0.setInterpolator(new DecelerateInterpolator());
        this.G0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f80.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                GraphPopupView.f(GraphPopupView.this, valueAnimator2);
            }
        });
        this.G0.addListener(new com.withings.views.graphs.b(this));
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.F0 = valueAnimator2;
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        this.F0.setDuration(300L);
        this.F0.setInterpolator(new DecelerateInterpolator(3.0f));
        this.F0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f80.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                GraphPopupView.d(GraphPopupView.this, valueAnimator3);
            }
        });
        this.F0.addListener(new com.withings.views.graphs.a(this));
    }

    @Override // ys.g
    public final void a() {
        this.f46417b = null;
        this.f46418c.set(Float.NaN, Float.NaN);
        setVisibility(8);
    }

    @Override // ys.g
    public final void b(GraphView graphView, List<? extends e> list, PointF pointF) {
        String valueOf;
        String valueOf2;
        String valueOf3;
        this.f46416a = graphView;
        if (!list.isEmpty() && list.get(0) != null) {
            e eVar = this.f46417b;
            if (eVar != null) {
                e eVar2 = list.get(0);
                if (eVar.f95616a == eVar2.f95616a && eVar.f95617b == eVar2.f95617b && isVisible()) {
                    return;
                }
            }
            this.f46417b = list.get(0);
            this.f46418c.set(this.f46419d);
            if (this.D0 != null) {
                e eVar3 = new e(this.f46417b);
                float f11 = eVar3.f95616a;
                d dVar = this.D0;
                e eVar4 = this.f46417b;
                ((q) dVar).getClass();
                float durationMillis = f11 + ((((Vasistas) eVar4.f95625j).getDurationMillis() / 2) / DateTimeConstants.MILLIS_PER_MINUTE);
                eVar3.f95616a = durationMillis;
                this.f46419d.set(durationMillis, eVar3.f95617b);
            } else {
                e eVar5 = this.f46417b;
                this.f46419d.set(eVar5.f95616a, eVar5.f95617b);
            }
            PointF pointF2 = this.f46419d;
            graphView.getClass();
            pointF2.set(graphView.q(pointF2.x), graphView.r(pointF2.y));
            this.H0 = (int) (this.f46418c.x - this.f46419d.x);
            graphView.performHapticFeedback(9);
            e eVar6 = this.f46417b;
            c cVar = this.f46454y0;
            if (cVar != null) {
                valueOf = cVar.getPopupText(eVar6);
            } else {
                valueOf = String.valueOf(eVar6.f95617b);
            }
            this.f46456z0 = valueOf;
            c cVar2 = this.f46454y0;
            if (cVar2 != null) {
                valueOf2 = cVar2.getPopupTitleText(eVar6);
            } else {
                valueOf2 = String.valueOf(eVar6.f95616a);
            }
            this.B0 = valueOf2;
            this.B0 = valueOf2.toUpperCase();
            for (String str : this.f46456z0.split(System.lineSeparator())) {
                int measureText = (int) this.F.measureText(str);
                if (measureText > this.P) {
                    this.P = measureText;
                }
            }
            this.C0 = Math.max(this.P, (int) this.f46434o0.measureText(this.B0));
            if (this.f46441s) {
                c cVar3 = this.f46454y0;
                if (cVar3 != null && cVar3.getPopupSubText(eVar6) != null) {
                    valueOf3 = this.f46454y0.getPopupSubText(eVar6);
                } else {
                    valueOf3 = String.valueOf(eVar6.f95617b);
                }
                this.A0 = valueOf3;
                this.C0 = Math.max(this.C0, (int) this.Q.measureText(valueOf3));
            }
            e eVar7 = this.f46417b;
            if (this.f46454y0.getPopupSubTextIcon(eVar7) != null) {
                this.T = y70.a.e(this.f46454y0.getPopupSubTextIcon(eVar7).getIcon());
                this.f46428l0 = this.f46454y0.getPopupSubTextIcon(eVar7).getIconWidth();
                this.f46430m0 = this.f46454y0.getPopupSubTextIcon(eVar7).getIconHeight();
                this.f46432n0 = this.f46428l0 / 2;
            }
            int i11 = this.C0;
            int i12 = this.f46425j;
            int i13 = ((((((i11 + i12) + i12) + this.f46448v0) + this.f46428l0) + this.f46432n0) + this.f46452x0) / 2;
            String[] split = this.f46456z0.split(System.lineSeparator());
            int i14 = this.f46426k;
            int length = (this.M * split.length) + i14 + this.f46438q0 + i14;
            int i15 = length / 2;
            if (this.f46441s) {
                length += this.S;
            }
            float f12 = this.f46419d.x;
            int min = (int) Math.min((graphView.getContentRect().right - i13) - this.f46433o, Math.max(graphView.getContentRect().left + i13 + this.f46433o, f12));
            this.E0 = (f12 - min) + i13;
            float f13 = this.f46419d.y;
            int i16 = graphView.getContentRect().top + i15;
            int i17 = (graphView.getContentRect().bottom - i15) - this.f46431n;
            int i18 = (int) f13;
            int i19 = this.f46447v;
            boolean z5 = true;
            if (i19 > 0) {
                if ((i18 - i15) - i19 > i16) {
                    i18 -= i19 + i15;
                    this.f46445u = true;
                } else if (i18 + i15 + i19 < i17) {
                    i18 += i19 + i15;
                    this.f46445u = true;
                } else {
                    this.f46445u = false;
                }
            }
            if (i18 > f13) {
                z5 = false;
            }
            this.f46449w = z5;
            Rect rect = this.f46421f;
            int i21 = min - i13;
            this.J0 = rect.left - i21;
            if (this.f46435p) {
                rect.set(i21, graphView.getContentRect().top + this.f46431n, min + i13, graphView.getContentRect().top + this.f46431n + length);
            } else {
                rect.set(i21, i18 - i15, min + i13, i18 + i15);
            }
            if (isVisible()) {
                this.F0.start();
                return;
            }
            setVisibility(0);
            this.G0.start();
        }
    }

    @Override // ys.g
    public final boolean isVisible() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void n(Resources resources, int i11, int i12) {
        this.f46440r0 = BitmapFactory.decodeResource(resources, 2131231654);
        this.f46448v0 = i11;
        this.f46450w0 = i12;
        this.f46452x0 = i11 / 2;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        String[] split;
        Rect rect;
        Rect rect2;
        super.onDraw(canvas);
        GraphView graphView = this.f46416a;
        if (graphView != null) {
            int r7 = (int) graphView.r(0.0f);
            int r11 = (int) graphView.r(graphView.getCurrentViewport().top);
            if (this.f46439r) {
                r7 = r11;
            }
            this.f46455z.set((int) (this.f46419d.x - 3.0f), graphView.getContentRect().top + this.f46431n, (int) (this.f46419d.x + 3.0f), r7);
        }
        if (this.f46437q) {
            this.A.setColor(u.j(this.M0, this.B));
            int i11 = this.f46455z.left;
            int i12 = this.I0;
            canvas.drawRect(i11 + i12, rect2.top + this.L0, rect2.right + i12, rect2.bottom, this.A);
        }
        Rect rect3 = this.f46421f;
        this.f46420e.rewind();
        this.f46420e.moveTo(this.f46424i, 0.0f);
        this.f46420e.lineTo(rect3.width() - this.f46424i, 0.0f);
        this.f46420e.cubicTo(rect3.width() - (this.f46424i / 2.0f), 0.0f, rect3.width(), this.f46424i / 2.0f, rect3.width(), this.f46424i);
        this.f46420e.lineTo(rect3.width(), rect3.height() - this.f46424i);
        this.f46420e.cubicTo(rect3.width(), rect3.height() - (this.f46424i / 2.0f), rect3.width() - (this.f46424i / 2.0f), rect3.height(), rect3.width() - this.f46424i, rect3.height());
        this.f46420e.lineTo(this.f46424i, rect3.height());
        this.f46420e.cubicTo(this.f46424i / 2.0f, rect3.height(), 0.0f, rect3.height() - (this.f46424i / 2.0f), 0.0f, rect3.height() - this.f46424i);
        this.f46420e.lineTo(0.0f, this.f46424i);
        Path path = this.f46420e;
        float f11 = this.f46424i;
        float f12 = f11 / 2.0f;
        path.cubicTo(0.0f, f12, f12, 0.0f, f11, 0.0f);
        boolean z5 = this.f46449w;
        boolean z11 = this.f46443t;
        boolean z12 = this.f46445u;
        if (z5 & z11 & z12) {
            this.f46420e.moveTo(this.E0 - (this.f46451x / 2.0f), rect3.height());
            this.f46420e.lineTo(this.E0, rect3.height() + this.f46453y);
            this.f46420e.lineTo((this.f46451x / 2.0f) + this.E0, rect3.height());
        } else if (z11 & z12) {
            this.f46420e.moveTo(this.E0 - (this.f46451x / 2.0f), 0.0f);
            this.f46420e.lineTo(this.E0, -this.f46453y);
            this.f46420e.lineTo((this.f46451x / 2.0f) + this.E0, 0.0f);
        }
        this.f46420e.offset(rect3.left, rect3.top);
        this.f46420e.offset(this.K0, this.L0);
        canvas.drawPath(this.f46420e, this.f46422g);
        for (String str : this.f46456z0.split(System.lineSeparator())) {
            Rect rect4 = this.f46421f;
            canvas.drawText(str, rect4.left + this.f46425j + this.K0, ((Arrays.asList(split).indexOf(str) + 1) * this.M) + rect4.top + this.f46426k + this.L0, this.F);
        }
        if (this.f46441s) {
            int i13 = this.f46421f.left + this.f46425j + this.K0;
            if (this.T != null) {
                i13 += (this.f46428l0 * 2) + this.f46432n0;
            }
            canvas.drawText(this.A0, i13, rect.top + this.f46426k + this.M + this.S + this.f46438q0 + this.L0, this.Q);
        }
        String str2 = this.B0;
        Rect rect5 = this.f46421f;
        canvas.drawText(str2, rect5.left + this.f46425j + this.K0, (this.M * split.length) + rect5.top + this.f46426k + this.f46438q0 + this.L0, this.f46434o0);
        if (this.f46440r0 != null) {
            Rect rect6 = this.f46444t0;
            Rect rect7 = this.f46421f;
            int i14 = ((rect7.right - (this.f46425j / 3)) - this.f46448v0) + this.K0;
            int height = ((rect7.height() - this.f46450w0) / 2) + rect7.top + this.L0;
            Rect rect8 = this.f46421f;
            rect6.set(i14, height, (rect8.right - (this.f46425j / 3)) + this.K0, ((rect8.height() + this.f46450w0) / 2) + rect8.top + this.L0);
            canvas.drawBitmap(this.f46440r0, (Rect) null, this.f46444t0, this.f46442s0);
        }
        if (this.T != null) {
            Rect rect9 = this.f46421f;
            int i15 = rect9.left + this.f46425j + this.K0;
            int i16 = ((rect9.bottom - this.f46426k) - (this.S / 4)) + this.L0;
            this.W.set(i15, i16, this.f46428l0 + i15, this.f46430m0 + i16);
            canvas.drawBitmap(this.T, (Rect) null, this.W, (Paint) null);
        }
    }

    public void setOnPopupClickListener(b bVar) {
        this.N0 = bVar;
        setOnTouchListener(new i(this, 2));
    }

    public void setPopupContentProvider(c cVar) {
        this.f46454y0 = cVar;
    }

    public void setPopupMarginFromDatumYPx(int i11) {
        this.f46447v = i11;
    }

    public void setPopupOffsetXProvider(d dVar) {
        this.D0 = dVar;
    }

    public void setShouldAlignToTopOfGraphView(boolean z5) {
        this.f46435p = z5;
    }

    public void setShouldDrawPopupLineFromBottom(boolean z5) {
        this.f46439r = z5;
    }

    public void setShouldShowSubText(boolean z5) {
        this.f46441s = z5;
    }

    public void setShouldShowTriangle(boolean z5) {
        this.f46443t = z5;
    }

    public void setShouldShowVerticalLine(boolean z5) {
        this.f46437q = z5;
    }

    public GraphPopupView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f46435p = true;
        this.f46437q = true;
        this.f46439r = false;
        this.f46441s = false;
        this.f46443t = false;
        this.f46445u = true;
        this.M0 = 0.0f;
        m();
    }
}
