package com.withings.graph.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.u;
/* compiled from: FilterAverageDecorator.kt */
/* loaded from: classes3.dex */
public final class c extends Decorator {

    /* renamed from: k  reason: collision with root package name */
    private final String f39710k;

    /* renamed from: l  reason: collision with root package name */
    private final TextPaint f39711l;

    /* renamed from: m  reason: collision with root package name */
    private final TextPaint f39712m;

    /* renamed from: n  reason: collision with root package name */
    private final TextPaint f39713n;

    /* renamed from: o  reason: collision with root package name */
    private final TextPaint f39714o;

    /* renamed from: p  reason: collision with root package name */
    private final Paint f39715p;

    /* renamed from: q  reason: collision with root package name */
    private final int f39716q;

    /* renamed from: r  reason: collision with root package name */
    private final int f39717r;

    /* renamed from: s  reason: collision with root package name */
    private String f39718s;

    /* renamed from: t  reason: collision with root package name */
    private float f39719t;

    /* renamed from: u  reason: collision with root package name */
    private final float f39720u;

    /* compiled from: FilterAverageDecorator.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Decorator.a<c, a> {

        /* renamed from: j  reason: collision with root package name */
        private final Context f39721j;

        /* renamed from: k  reason: collision with root package name */
        private int f39722k;

        /* renamed from: l  reason: collision with root package name */
        private int f39723l;

        /* renamed from: m  reason: collision with root package name */
        private String f39724m;

        /* renamed from: n  reason: collision with root package name */
        private int f39725n;

        /* renamed from: o  reason: collision with root package name */
        private int f39726o;

        /* renamed from: p  reason: collision with root package name */
        private int f39727p;

        /* renamed from: q  reason: collision with root package name */
        private int f39728q;

        /* renamed from: r  reason: collision with root package name */
        private Typeface f39729r;

        /* renamed from: s  reason: collision with root package name */
        private int f39730s;

        /* renamed from: t  reason: collision with root package name */
        private int f39731t;

        /* renamed from: u  reason: collision with root package name */
        private int f39732u;

        /* renamed from: v  reason: collision with root package name */
        private String f39733v;

        public a(Context context) {
            u.j(context, "context");
            this.f39721j = context;
            this.f39723l = 2;
            this.f39724m = "";
            this.f39725n = 12;
            this.f39726o = 16;
            this.f39730s = 8;
            this.f39731t = 20;
            this.f39732u = ah.g.k(5, context);
            this.f39733v = "";
        }

        public final c p() {
            TextPaint textPaint = new TextPaint();
            int i11 = this.f39725n;
            Context context = this.f39721j;
            textPaint.setTextSize(ah.g.y(i11, context));
            textPaint.setColor(this.f39727p);
            textPaint.setAntiAlias(true);
            textPaint.setStyle(Paint.Style.FILL);
            textPaint.setTextAlign(Paint.Align.LEFT);
            textPaint.setTypeface(this.f39729r);
            TextPaint textPaint2 = new TextPaint(textPaint);
            textPaint2.setColor(this.f39728q);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setStrokeWidth(this.f39732u);
            textPaint2.setStrokeJoin(Paint.Join.ROUND);
            textPaint2.setStrokeCap(Paint.Cap.ROUND);
            textPaint2.setPathEffect(new CornerPathEffect(3.0f));
            TextPaint textPaint3 = new TextPaint(textPaint);
            textPaint3.setTextSize(ah.g.y(this.f39726o, context));
            TextPaint textPaint4 = new TextPaint(textPaint2);
            textPaint4.setTextSize(ah.g.y(this.f39726o, context));
            Paint paint = new Paint();
            paint.setColor(this.f39722k);
            paint.setStrokeWidth(ah.g.k(this.f39723l, context));
            return new c(this, this.f39733v, this.f39724m, textPaint, textPaint2, textPaint3, textPaint4, paint, ah.g.k(this.f39730s, context), ah.g.k(this.f39731t, context));
        }

        public final void q(String str) {
            this.f39724m = str;
        }

        public final void r(Typeface typeface) {
            this.f39729r = typeface;
        }

        public final void s(int i11) {
            this.f39722k = i11;
        }

        public final void t(int i11) {
            this.f39727p = i11;
        }

        public final void u(int i11) {
            this.f39728q = i11;
        }

        public final void v() {
            this.f39725n = 12;
        }

        public final void w() {
            this.f39726o = 18;
        }
    }

    public c(a aVar, String str, String str2, TextPaint textPaint, TextPaint textPaint2, TextPaint textPaint3, TextPaint textPaint4, Paint paint, int i11, int i12) {
        super(aVar);
        this.f39710k = str2;
        this.f39711l = textPaint;
        this.f39712m = textPaint2;
        this.f39713n = textPaint3;
        this.f39714o = textPaint4;
        this.f39715p = paint;
        this.f39716q = i11;
        this.f39717r = i12;
        this.f39718s = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
        this.f39719t = 0.0f;
        this.f39720u = Math.abs(textPaint4.getFontMetrics().top) + Math.abs(textPaint2.getFontMetrics().top) + (i11 * 2);
        this.f100573g = str;
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        float f11;
        if (this.f100571e && graphView != null && canvas != null) {
            float r7 = graphView.r(this.f39719t);
            canvas.drawLine(0.0f, r7, canvas.getWidth(), r7, this.f39715p);
            float f12 = this.f39717r;
            float f13 = this.f39720u;
            int i11 = ((canvas.getHeight() - r7) > f13 ? 1 : ((canvas.getHeight() - r7) == f13 ? 0 : -1));
            TextPaint textPaint = this.f39712m;
            if (i11 >= 0) {
                f11 = (r7 + this.f39716q) - textPaint.getFontMetrics().top;
            } else {
                f11 = r7 - f13;
            }
            String str = this.f39710k;
            canvas.drawText(str, f12, f11, textPaint);
            canvas.drawText(str, f12, f11, this.f39711l);
            TextPaint textPaint2 = this.f39714o;
            float f14 = f11 - textPaint2.getFontMetrics().top;
            canvas.drawText(this.f39718s, f12, f14, textPaint2);
            canvas.drawText(this.f39718s, f12, f14, this.f39713n);
        }
    }

    public final void o(float f11) {
        this.f39718s = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f11)}, 1));
        this.f39719t = f11;
    }
}
