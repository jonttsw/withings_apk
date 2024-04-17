package com.withings.graph.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.u;
/* compiled from: FilterDotIndicatorDecorator.kt */
/* loaded from: classes3.dex */
public final class d extends Decorator {

    /* renamed from: k  reason: collision with root package name */
    private float f39734k;

    /* renamed from: l  reason: collision with root package name */
    private float f39735l;

    /* renamed from: m  reason: collision with root package name */
    private final String f39736m;

    /* renamed from: n  reason: collision with root package name */
    private String f39737n;

    /* renamed from: o  reason: collision with root package name */
    private final rs.b f39738o;

    /* renamed from: p  reason: collision with root package name */
    private final int f39739p;

    /* renamed from: q  reason: collision with root package name */
    private final TextPaint f39740q;

    /* renamed from: r  reason: collision with root package name */
    private final TextPaint f39741r;

    /* renamed from: s  reason: collision with root package name */
    private final TextPaint f39742s;

    /* renamed from: t  reason: collision with root package name */
    private final TextPaint f39743t;

    /* renamed from: u  reason: collision with root package name */
    private final float f39744u;

    /* renamed from: v  reason: collision with root package name */
    private final float f39745v;

    /* compiled from: FilterDotIndicatorDecorator.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Decorator.a<d, a> {

        /* renamed from: j  reason: collision with root package name */
        private final Context f39746j;

        /* renamed from: k  reason: collision with root package name */
        private float f39747k;

        /* renamed from: l  reason: collision with root package name */
        private float f39748l;

        /* renamed from: m  reason: collision with root package name */
        private String f39749m;

        /* renamed from: n  reason: collision with root package name */
        private String f39750n;

        /* renamed from: o  reason: collision with root package name */
        private int f39751o;

        /* renamed from: p  reason: collision with root package name */
        private int f39752p;

        /* renamed from: q  reason: collision with root package name */
        private int f39753q;

        /* renamed from: r  reason: collision with root package name */
        private int f39754r;

        /* renamed from: s  reason: collision with root package name */
        private int f39755s;

        /* renamed from: t  reason: collision with root package name */
        private Typeface f39756t;

        /* renamed from: u  reason: collision with root package name */
        private rs.b f39757u;

        /* renamed from: v  reason: collision with root package name */
        private String f39758v;

        /* renamed from: w  reason: collision with root package name */
        private final int f39759w;

        public a(Context context) {
            u.j(context, "context");
            this.f39746j = context;
            this.f39747k = Float.MIN_VALUE;
            this.f39748l = Float.MIN_VALUE;
            this.f39749m = "";
            this.f39750n = "";
            this.f39751o = ah.g.y(12, context);
            this.f39752p = ah.g.y(12, context);
            this.f39753q = Integer.MIN_VALUE;
            this.f39754r = Integer.MIN_VALUE;
            this.f39755s = ah.g.k(5, context);
            this.f39758v = "";
            this.f39759w = ah.g.k(8, context);
        }

        public final d p() {
            TextPaint textPaint = new TextPaint();
            textPaint.setColor(this.f39753q);
            textPaint.setAntiAlias(true);
            textPaint.setStyle(Paint.Style.FILL);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setTextSize(this.f39751o);
            textPaint.setTypeface(this.f39756t);
            TextPaint textPaint2 = new TextPaint(textPaint);
            textPaint2.setColor(this.f39754r);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setStrokeWidth(this.f39755s);
            textPaint2.setStrokeJoin(Paint.Join.ROUND);
            textPaint2.setStrokeCap(Paint.Cap.ROUND);
            textPaint2.setPathEffect(new CornerPathEffect(3.0f));
            TextPaint textPaint3 = new TextPaint(textPaint);
            textPaint3.setTextSize(this.f39752p);
            TextPaint textPaint4 = new TextPaint(textPaint2);
            textPaint4.setTextSize(this.f39752p);
            return new d(this, this.f39758v, this.f39747k, this.f39748l, this.f39749m, this.f39750n, this.f39757u, this.f39759w, textPaint, textPaint2, textPaint3, textPaint4);
        }

        public final void q(rs.b bVar) {
            this.f39757u = bVar;
            this.f39747k = bVar.f95616a;
            this.f39748l = bVar.f95617b;
        }

        public final void r(String title) {
            u.j(title, "title");
            this.f39749m = title;
        }

        public final void s(Typeface typeface) {
            this.f39756t = typeface;
        }

        public final void t(int i11) {
            this.f39755s = ah.g.k(i11, this.f39746j);
        }

        public final void u(String str) {
            this.f39758v = str;
        }

        public final void v(int i11) {
            this.f39753q = i11;
        }

        public final void w(int i11) {
            this.f39751o = ah.g.y(i11, this.f39746j);
        }

        public final void x(int i11) {
            this.f39754r = i11;
        }

        public final void y(int i11) {
            this.f39752p = ah.g.y(i11, this.f39746j);
        }
    }

    public d(a aVar, String str, float f11, float f12, String str2, String str3, rs.b bVar, int i11, TextPaint textPaint, TextPaint textPaint2, TextPaint textPaint3, TextPaint textPaint4) {
        super(aVar);
        this.f39734k = f11;
        this.f39735l = f12;
        this.f39736m = str2;
        this.f39737n = str3;
        this.f39738o = bVar;
        this.f39739p = i11;
        this.f39740q = textPaint;
        this.f39741r = textPaint2;
        this.f39742s = textPaint3;
        this.f39743t = textPaint4;
        float abs = Math.abs(textPaint2.getFontMetrics().top);
        this.f39744u = abs;
        this.f39745v = Math.abs(textPaint4.getFontMetrics().top) + abs + 15;
        this.f100573g = str;
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        int i11;
        u.j(graphView, "graphView");
        u.j(canvas, "canvas");
        if (!this.f100571e) {
            return;
        }
        Rect rect = new Rect();
        TextPaint textPaint = this.f39741r;
        String str = this.f39736m;
        float measureText = textPaint.measureText(str);
        String str2 = this.f39737n;
        TextPaint textPaint2 = this.f39743t;
        float f11 = 2;
        int max = (int) (Math.max(textPaint.getTextSize() / f11, textPaint2.getTextSize() / f11) + Math.max(measureText, textPaint2.measureText(str2)));
        Rect contentRect = graphView.getContentRect();
        float q11 = graphView.q(this.f39734k);
        float f12 = max / 2;
        int i12 = (int) (q11 - f12);
        rect.left = i12;
        rect.right = (int) (q11 + f12);
        int i13 = 0;
        if (i12 < contentRect.left) {
            rect.left = 0;
            rect.right = max;
        }
        int i14 = rect.right;
        int i15 = contentRect.right;
        if (i14 > i15) {
            rect.right = i15;
            rect.left = i15 - max;
        }
        float r7 = graphView.r(this.f39735l);
        rs.b bVar = this.f39738o;
        float f13 = this.f39745v;
        if (bVar != null) {
            RectF currentViewport = graphView.getCurrentViewport();
            int f14 = (int) ((f13 / f11) + (bVar.f() / 2) + this.f39739p);
            if (Math.abs(graphView.r(bVar.f95617b) - graphView.r(currentViewport.top)) <= (i11 * 2) + f13) {
                f14 = -f14;
            }
            i13 = f14;
        }
        float f15 = r7 + i13;
        float f16 = f13 / f11;
        int i16 = (int) (f15 - f16);
        rect.top = i16;
        rect.bottom = (int) (f16 + f15);
        float f17 = i16;
        float f18 = this.f39744u;
        PointF pointF = new PointF(rect.left + f12, (f17 + f18) - textPaint.descent());
        if (this.f100571e) {
            canvas.drawText(str, pointF.x, pointF.y, textPaint);
            canvas.drawText(str, pointF.x, pointF.y, this.f39740q);
            float f19 = f18 + 15 + pointF.y;
            pointF.y = f19;
            canvas.drawText(this.f39737n, pointF.x, f19, textPaint2);
            canvas.drawText(this.f39737n, pointF.x, pointF.y, this.f39742s);
            if (bVar != null) {
                bVar.c(graphView, canvas);
            }
        }
    }

    public final void o(float f11, float f12) {
        this.f39734k = f11;
        this.f39735l = f12;
        rs.b bVar = this.f39738o;
        if (bVar != null) {
            bVar.f95616a = f11;
            bVar.f95617b = f12;
        }
        this.f39737n = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f12)}, 1));
    }
}
