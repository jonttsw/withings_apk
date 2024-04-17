package com.withings.graph.axis;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.withings.graph.GraphView;
import com.withings.graph.axis.a;
/* loaded from: classes3.dex */
public final class VerticalAxis extends com.withings.graph.axis.a {
    private final ls.a E;
    private VerticalAxisPosition F;
    private float[] G;
    private float[] H;
    protected Path I;
    protected boolean J;
    protected TextPaint K;
    protected String L;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class VerticalAxisPosition {

        /* renamed from: a  reason: collision with root package name */
        public static final VerticalAxisPosition f39599a;

        /* renamed from: b  reason: collision with root package name */
        public static final VerticalAxisPosition f39600b;

        /* renamed from: c  reason: collision with root package name */
        public static final VerticalAxisPosition f39601c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ VerticalAxisPosition[] f39602d;
        /* JADX INFO: Fake field, exist only in values array */
        VerticalAxisPosition EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.graph.axis.VerticalAxis$VerticalAxisPosition, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.graph.axis.VerticalAxis$VerticalAxisPosition, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.graph.axis.VerticalAxis$VerticalAxisPosition, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.graph.axis.VerticalAxis$VerticalAxisPosition, java.lang.Enum] */
        static {
            ?? r02 = new Enum("LEFT", 0);
            ?? r12 = new Enum("RIGHT", 1);
            f39599a = r12;
            ?? r22 = new Enum("LEFT_OUTSIDE", 2);
            f39600b = r22;
            ?? r32 = new Enum("RIGHT_OUTSIDE", 3);
            f39601c = r32;
            f39602d = new VerticalAxisPosition[]{r02, r12, r22, r32};
        }

        private VerticalAxisPosition() {
            throw null;
        }

        public static VerticalAxisPosition valueOf(String str) {
            return (VerticalAxisPosition) Enum.valueOf(VerticalAxisPosition.class, str);
        }

        public static VerticalAxisPosition[] values() {
            return (VerticalAxisPosition[]) f39602d.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class a<S extends VerticalAxis, T extends a<S, T>> extends a.AbstractC0518a<S, T> {

        /* renamed from: r  reason: collision with root package name */
        protected VerticalAxisPosition f39603r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f39604s;

        /* renamed from: t  reason: collision with root package name */
        private TextPaint f39605t;

        /* renamed from: u  reason: collision with root package name */
        private String f39606u;

        public a(int i11) {
            super(i11, 0);
            this.f39604s = true;
            this.f39605t = new TextPaint();
            this.f39606u = null;
        }

        public final void H(String str) {
            this.f39606u = str;
        }

        public final void I(TextPaint textPaint) {
            this.f39605t = textPaint;
        }

        public final void J(boolean z5) {
            this.f39604s = z5;
        }

        public final void K(VerticalAxisPosition verticalAxisPosition) {
            this.f39603r = verticalAxisPosition;
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends a<VerticalAxis, b> {
    }

    public VerticalAxis(b bVar) {
        super(bVar);
        this.E = new ls.a();
        this.G = new float[0];
        this.H = new float[0];
        this.F = bVar.f39603r;
        boolean z5 = ((a) bVar).f39604s;
        this.J = z5;
        this.f39621o.setTextAlign(l());
        this.K = ((a) bVar).f39605t;
        this.L = ((a) bVar).f39606u;
        this.K.setTextAlign(l());
        if (z5 && this.f39614h) {
            this.I = new Path();
            float f11 = this.f39618l;
            float f12 = this.f39619m;
            this.f39615i.setPathEffect(new DashPathEffect(new float[]{f11, f12, f11, f12}, f11));
        }
    }

    private float j(GraphView graphView) {
        int ordinal = this.F.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return graphView.getContentRect().right + this.f39607a;
                    }
                    throw new IncompatibleClassChangeError();
                }
                return (this.f39607a / 4.0f) + 0.0f;
            }
            return graphView.getContentRect().right - (this.f39607a / 4.0f);
        }
        return graphView.getContentRect().left + (this.f39607a / 4.0f);
    }

    private Paint.Align l() {
        int ordinal = this.F.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                }
            }
            return Paint.Align.RIGHT;
        }
        return Paint.Align.LEFT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.graph.axis.a
    public final void e() {
        super.e();
        if (this.K == null) {
            TextPaint textPaint = new TextPaint(this.f39621o);
            this.K = textPaint;
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        }
    }

    public final void f(GraphView graphView) {
        float f11 = graphView.getCurrentViewport().top;
        float f12 = graphView.getCurrentViewport().bottom;
        ls.a aVar = this.E;
        a(f11, f12, aVar);
        int length = this.G.length;
        int i11 = aVar.f80101b;
        if (length < i11) {
            this.G = new float[i11];
        }
        int i12 = i11 * 4;
        if (this.H.length < i12) {
            this.H = new float[i12];
        }
        for (int i13 = 0; i13 < aVar.f80101b; i13++) {
            this.G[i13] = graphView.r(aVar.f80100a[i13]);
        }
    }

    public final void g(GraphView graphView, Canvas canvas) {
        String str = this.L;
        if (str == null) {
            return;
        }
        canvas.drawText(str, j(graphView), this.K.descent() + this.f39626t, this.K);
    }

    public final void h(GraphView graphView, Canvas canvas) {
        float f11;
        String valueOf;
        ls.a aVar;
        float f12;
        float f13;
        if (!this.f39620n) {
            return;
        }
        ls.a aVar2 = this.E;
        int i11 = 1;
        int i12 = 0;
        float f14 = 0.0f;
        if (aVar2.f80101b > 1) {
            float[] fArr = aVar2.f80100a;
            f11 = Math.abs(fArr[1] - fArr[0]);
        } else {
            f11 = 0.0f;
        }
        while (i12 < aVar2.f80101b) {
            a.b bVar = this.f39610d;
            if (bVar != null) {
                valueOf = bVar.c(aVar2.f80100a[i12], f11);
            } else {
                valueOf = String.valueOf(aVar2.f80100a[i12]);
            }
            float j5 = j(graphView);
            float f15 = this.G[i12];
            if (this.f39627u) {
                int measureText = (int) this.f39621o.measureText(valueOf);
                int ordinal = this.F.ordinal();
                if (ordinal != 0) {
                    if (ordinal != i11) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                f13 = f14;
                                f12 = f13;
                                float f16 = this.B;
                                float f17 = this.f39625s / 2;
                                float f18 = this.A;
                                this.f39629w.set((int) (f13 - f16), (int) ((f15 - f17) - f18), (int) (f12 + f16), (int) (f17 + f15 + f18));
                                this.f39628v.rewind();
                                int height = this.f39629w.height();
                                int min = Math.min(this.f39632z, height / 2);
                                this.f39632z = min;
                                int i13 = min / 2;
                                this.f39628v.moveTo(min, f14);
                                this.f39628v.lineTo(this.f39629w.width() - this.f39632z, f14);
                                float f19 = i13;
                                this.f39628v.cubicTo(this.f39629w.width() - i13, 0.0f, this.f39629w.width(), f19, this.f39629w.width(), this.f39632z);
                                this.f39628v.lineTo(this.f39629w.width(), height - this.f39632z);
                                float f21 = height - i13;
                                float f22 = height;
                                aVar = aVar2;
                                this.f39628v.cubicTo(this.f39629w.width(), f21, this.f39629w.width() - i13, f22, this.f39629w.width() - this.f39632z, f22);
                                this.f39628v.lineTo(this.f39632z, f22);
                                this.f39628v.cubicTo(f19, f22, 0.0f, f21, 0.0f, height - this.f39632z);
                                f14 = 0.0f;
                                this.f39628v.lineTo(0.0f, this.f39632z);
                                this.f39628v.cubicTo(0.0f, f19, f19, 0.0f, this.f39632z, 0.0f);
                                Path path = this.f39628v;
                                Rect rect = this.f39629w;
                                path.offset(rect.left, rect.top);
                                canvas.drawPath(this.f39628v, this.f39630x);
                            }
                        }
                    }
                    f13 = j5 - measureText;
                    f12 = j5;
                    float f162 = this.B;
                    float f172 = this.f39625s / 2;
                    float f182 = this.A;
                    this.f39629w.set((int) (f13 - f162), (int) ((f15 - f172) - f182), (int) (f12 + f162), (int) (f172 + f15 + f182));
                    this.f39628v.rewind();
                    int height2 = this.f39629w.height();
                    int min2 = Math.min(this.f39632z, height2 / 2);
                    this.f39632z = min2;
                    int i132 = min2 / 2;
                    this.f39628v.moveTo(min2, f14);
                    this.f39628v.lineTo(this.f39629w.width() - this.f39632z, f14);
                    float f192 = i132;
                    this.f39628v.cubicTo(this.f39629w.width() - i132, 0.0f, this.f39629w.width(), f192, this.f39629w.width(), this.f39632z);
                    this.f39628v.lineTo(this.f39629w.width(), height2 - this.f39632z);
                    float f212 = height2 - i132;
                    float f222 = height2;
                    aVar = aVar2;
                    this.f39628v.cubicTo(this.f39629w.width(), f212, this.f39629w.width() - i132, f222, this.f39629w.width() - this.f39632z, f222);
                    this.f39628v.lineTo(this.f39632z, f222);
                    this.f39628v.cubicTo(f192, f222, 0.0f, f212, 0.0f, height2 - this.f39632z);
                    f14 = 0.0f;
                    this.f39628v.lineTo(0.0f, this.f39632z);
                    this.f39628v.cubicTo(0.0f, f192, f192, 0.0f, this.f39632z, 0.0f);
                    Path path2 = this.f39628v;
                    Rect rect2 = this.f39629w;
                    path2.offset(rect2.left, rect2.top);
                    canvas.drawPath(this.f39628v, this.f39630x);
                }
                f12 = measureText + j5;
                f13 = j5;
                float f1622 = this.B;
                float f1722 = this.f39625s / 2;
                float f1822 = this.A;
                this.f39629w.set((int) (f13 - f1622), (int) ((f15 - f1722) - f1822), (int) (f12 + f1622), (int) (f1722 + f15 + f1822));
                this.f39628v.rewind();
                int height22 = this.f39629w.height();
                int min22 = Math.min(this.f39632z, height22 / 2);
                this.f39632z = min22;
                int i1322 = min22 / 2;
                this.f39628v.moveTo(min22, f14);
                this.f39628v.lineTo(this.f39629w.width() - this.f39632z, f14);
                float f1922 = i1322;
                this.f39628v.cubicTo(this.f39629w.width() - i1322, 0.0f, this.f39629w.width(), f1922, this.f39629w.width(), this.f39632z);
                this.f39628v.lineTo(this.f39629w.width(), height22 - this.f39632z);
                float f2122 = height22 - i1322;
                float f2222 = height22;
                aVar = aVar2;
                this.f39628v.cubicTo(this.f39629w.width(), f2122, this.f39629w.width() - i1322, f2222, this.f39629w.width() - this.f39632z, f2222);
                this.f39628v.lineTo(this.f39632z, f2222);
                this.f39628v.cubicTo(f1922, f2222, 0.0f, f2122, 0.0f, height22 - this.f39632z);
                f14 = 0.0f;
                this.f39628v.lineTo(0.0f, this.f39632z);
                this.f39628v.cubicTo(0.0f, f1922, f1922, 0.0f, this.f39632z, 0.0f);
                Path path22 = this.f39628v;
                Rect rect22 = this.f39629w;
                path22.offset(rect22.left, rect22.top);
                canvas.drawPath(this.f39628v, this.f39630x);
            } else {
                aVar = aVar2;
            }
            canvas.drawText(valueOf, j5, ((this.f39621o.descent() - this.f39621o.ascent()) / 2.0f) + (f15 - this.f39621o.descent()), this.f39621o);
            i12++;
            aVar2 = aVar;
            i11 = 1;
        }
    }

    public final void i(GraphView graphView, Canvas canvas) {
        if (!this.f39614h) {
            return;
        }
        boolean z5 = this.J;
        ls.a aVar = this.E;
        if (z5) {
            for (int i11 = 0; i11 < aVar.f80101b; i11++) {
                this.f39615i.setColor(this.f39617k);
                float floor = (float) Math.floor(this.G[i11]);
                Path path = this.I;
                path.moveTo(graphView.getContentRect().left, floor);
                path.lineTo(graphView.getContentRect().right, floor);
                canvas.drawPath(path, this.f39615i);
                path.rewind();
            }
            return;
        }
        int i12 = 0;
        while (true) {
            int i13 = aVar.f80101b;
            if (i12 < i13) {
                float floor2 = (float) Math.floor(this.G[i12]);
                int i14 = i12 * 4;
                this.H[i14] = graphView.getContentRect().left;
                float[] fArr = this.H;
                fArr[i14 + 1] = floor2;
                fArr[i14 + 2] = graphView.getContentRect().right;
                this.H[i14 + 3] = floor2;
                i12++;
            } else {
                canvas.drawLines(this.H, 0, i13 * 4, this.f39615i);
                return;
            }
        }
    }

    public final VerticalAxisPosition k() {
        return this.F;
    }

    public final void m(float f11) {
        this.f39607a = (int) this.f39621o.measureText(this.f39610d.c(f11, this.f39611e));
    }
}
