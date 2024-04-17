package com.withings.graph.axis;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.withings.graph.GraphView;
import com.withings.graph.axis.a;
/* loaded from: classes3.dex */
public class HorizontalAxis extends com.withings.graph.axis.a {
    protected ls.a E;
    protected float[] F;
    protected float[] G;
    protected HorizontalAxisPosition H;
    protected HorizontalAxisLabelTextAlignment I;
    protected Path J;
    protected boolean K;
    protected int L;
    protected int M;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class HorizontalAxisLabelTextAlignment {

        /* renamed from: a  reason: collision with root package name */
        public static final HorizontalAxisLabelTextAlignment f39586a;

        /* renamed from: b  reason: collision with root package name */
        public static final HorizontalAxisLabelTextAlignment f39587b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ HorizontalAxisLabelTextAlignment[] f39588c;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.graph.axis.HorizontalAxis$HorizontalAxisLabelTextAlignment, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.graph.axis.HorizontalAxis$HorizontalAxisLabelTextAlignment, java.lang.Enum] */
        static {
            ?? r02 = new Enum("LEFT", 0);
            f39586a = r02;
            ?? r12 = new Enum("CENTER", 1);
            f39587b = r12;
            f39588c = new HorizontalAxisLabelTextAlignment[]{r02, r12};
        }

        private HorizontalAxisLabelTextAlignment() {
            throw null;
        }

        public static HorizontalAxisLabelTextAlignment valueOf(String str) {
            return (HorizontalAxisLabelTextAlignment) Enum.valueOf(HorizontalAxisLabelTextAlignment.class, str);
        }

        public static HorizontalAxisLabelTextAlignment[] values() {
            return (HorizontalAxisLabelTextAlignment[]) f39588c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class HorizontalAxisPosition {

        /* renamed from: a  reason: collision with root package name */
        public static final HorizontalAxisPosition f39589a;

        /* renamed from: b  reason: collision with root package name */
        public static final HorizontalAxisPosition f39590b;

        /* renamed from: c  reason: collision with root package name */
        public static final HorizontalAxisPosition f39591c;

        /* renamed from: d  reason: collision with root package name */
        public static final HorizontalAxisPosition f39592d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ HorizontalAxisPosition[] f39593e;
        /* JADX INFO: Fake field, exist only in values array */
        HorizontalAxisPosition EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.graph.axis.HorizontalAxis$HorizontalAxisPosition] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.graph.axis.HorizontalAxis$HorizontalAxisPosition] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.graph.axis.HorizontalAxis$HorizontalAxisPosition] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.graph.axis.HorizontalAxis$HorizontalAxisPosition] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.graph.axis.HorizontalAxis$HorizontalAxisPosition] */
        static {
            ?? r02 = new Enum("TOP", 0);
            ?? r12 = new Enum("BOTTOM", 1);
            f39589a = r12;
            ?? r22 = new Enum("TOP_OUTSIDE", 2);
            f39590b = r22;
            ?? r32 = new Enum("BOTTOM_OUTSIDE", 3);
            f39591c = r32;
            ?? r42 = new Enum("NONE", 4);
            f39592d = r42;
            f39593e = new HorizontalAxisPosition[]{r02, r12, r22, r32, r42};
        }

        private HorizontalAxisPosition() {
            throw null;
        }

        public static HorizontalAxisPosition valueOf(String str) {
            return (HorizontalAxisPosition) Enum.valueOf(HorizontalAxisPosition.class, str);
        }

        public static HorizontalAxisPosition[] values() {
            return (HorizontalAxisPosition[]) f39593e.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class a<S extends HorizontalAxis, T extends a<S, T>> extends a.AbstractC0518a<S, T> {

        /* renamed from: r  reason: collision with root package name */
        protected HorizontalAxisPosition f39594r;

        /* renamed from: s  reason: collision with root package name */
        protected HorizontalAxisLabelTextAlignment f39595s;

        /* renamed from: t  reason: collision with root package name */
        private int f39596t;

        /* renamed from: u  reason: collision with root package name */
        private int f39597u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f39598v;

        public a(int i11) {
            super(0, i11);
            this.f39595s = HorizontalAxisLabelTextAlignment.f39586a;
            this.f39596t = 0;
            this.f39597u = 0;
            this.f39598v = false;
        }

        public final void H(boolean z5) {
            this.f39598v = z5;
        }

        public final void I() {
            this.f39595s = HorizontalAxisLabelTextAlignment.f39587b;
        }

        public final void J(HorizontalAxisPosition horizontalAxisPosition) {
            this.f39594r = horizontalAxisPosition;
        }

        public final void K(int i11) {
            this.f39597u = i11;
        }

        public final void L(int i11) {
            this.f39596t = i11;
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends a<HorizontalAxis, b> {
        public final HorizontalAxis M() {
            return new HorizontalAxis(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HorizontalAxis(a<?, ?> aVar) {
        super(aVar);
        this.E = new ls.a();
        this.F = new float[0];
        this.G = new float[0];
        this.H = aVar.f39594r;
        this.I = aVar.f39595s;
        boolean z5 = ((a) aVar).f39598v;
        this.K = z5;
        this.L = ((a) aVar).f39596t;
        this.M = ((a) aVar).f39597u;
        if (z5 && this.f39614h) {
            this.J = new Path();
            int i11 = this.f39618l;
            int i12 = this.f39619m;
            this.f39615i.setPathEffect(new DashPathEffect(new float[]{i11, i12, i11, i12}, i11));
        }
    }

    public void f(GraphView graphView) {
        float f11 = graphView.getCurrentViewport().left;
        float f12 = graphView.getCurrentViewport().right;
        ls.a aVar = this.E;
        a(f11, f12, aVar);
        int length = this.F.length;
        int i11 = aVar.f80101b;
        if (length < i11) {
            this.F = new float[i11];
        }
        int i12 = i11 * 4;
        if (this.G.length < i12) {
            this.G = new float[i12];
        }
        for (int i13 = 0; i13 < aVar.f80101b; i13++) {
            this.F[i13] = graphView.q(aVar.f80100a[i13]);
        }
    }

    public final void g(GraphView graphView, Canvas canvas) {
        String valueOf;
        float f11;
        float f12;
        HorizontalAxisPosition horizontalAxisPosition;
        float f13;
        float f14;
        int i11;
        HorizontalAxisPosition horizontalAxisPosition2 = HorizontalAxisPosition.f39592d;
        HorizontalAxisPosition horizontalAxisPosition3 = this.H;
        if (horizontalAxisPosition3 != horizontalAxisPosition2 && this.f39620n) {
            int i12 = this.f39608b;
            int i13 = this.C;
            if (i13 != -1) {
                Rect contentRect = graphView.getContentRect();
                Paint paint = new Paint();
                paint.setColor(i13);
                canvas.drawRect(contentRect.left, contentRect.bottom, contentRect.right, i11 + i12, paint);
            }
            int i14 = 0;
            while (true) {
                ls.a aVar = this.E;
                if (i14 < aVar.f80101b) {
                    a.b bVar = this.f39610d;
                    if (bVar != null) {
                        valueOf = bVar.c(aVar.f80100a[i14], this.f39612f);
                    } else {
                        valueOf = String.valueOf(aVar.f80100a[i14]);
                    }
                    HorizontalAxisLabelTextAlignment horizontalAxisLabelTextAlignment = HorizontalAxisLabelTextAlignment.f39587b;
                    HorizontalAxisLabelTextAlignment horizontalAxisLabelTextAlignment2 = this.I;
                    int i15 = this.M;
                    if (horizontalAxisLabelTextAlignment2 == horizontalAxisLabelTextAlignment) {
                        float f15 = this.F[i14];
                        float measureText = this.f39621o.measureText(valueOf);
                        int i16 = i14 + 1;
                        float[] fArr = this.F;
                        if (i16 < fArr.length) {
                            f13 = ((fArr[i16] - f15) / 2.0f) + f15;
                            measureText /= 2.0f;
                        } else {
                            f13 = graphView.getContentRect().right;
                            float f16 = (f13 - f15) / 2.0f;
                            float f17 = measureText / 2.0f;
                            if (f16 + f17 <= f13) {
                                f14 = (f15 + f16) - f17;
                                f11 = f14 + i15;
                            }
                        }
                        f14 = f13 - measureText;
                        f11 = f14 + i15;
                    } else {
                        f11 = this.F[i14] + i15;
                    }
                    int ordinal = horizontalAxisPosition3.ordinal();
                    int i17 = this.L;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                f12 = ((this.f39623q + i12) / 2.0f) + graphView.getContentRect().bottom + i17;
                            } else {
                                f12 = ((this.f39623q + i12) / 2.0f) + i17;
                            }
                        } else {
                            f12 = (graphView.getContentRect().bottom - ((this.f39623q + i12) / 2.0f)) - i17;
                        }
                    } else {
                        f12 = -i17;
                    }
                    if (this.f39627u) {
                        float measureText2 = ((int) this.f39621o.measureText(valueOf)) / 2;
                        float f18 = this.B;
                        float f19 = this.f39625s / 2;
                        float f21 = this.A;
                        this.f39629w.set((int) ((f11 - measureText2) - f18), (int) ((f12 - f19) - f21), (int) (measureText2 + f11 + f18), (int) (f19 + f12 + f21));
                        this.f39628v.rewind();
                        int height = this.f39629w.height();
                        int min = Math.min(this.f39632z, height / 2);
                        this.f39632z = min;
                        int i18 = min / 2;
                        this.f39628v.moveTo(min, 0.0f);
                        this.f39628v.lineTo(this.f39629w.width() - this.f39632z, 0.0f);
                        float f22 = i18;
                        this.f39628v.cubicTo(this.f39629w.width() - i18, 0.0f, this.f39629w.width(), f22, this.f39629w.width(), this.f39632z);
                        this.f39628v.lineTo(this.f39629w.width(), height - this.f39632z);
                        float f23 = height - i18;
                        float f24 = height;
                        horizontalAxisPosition = horizontalAxisPosition3;
                        this.f39628v.cubicTo(this.f39629w.width(), f23, this.f39629w.width() - i18, f24, this.f39629w.width() - this.f39632z, f24);
                        this.f39628v.lineTo(this.f39632z, f24);
                        this.f39628v.cubicTo(f22, f24, 0.0f, f23, 0.0f, height - this.f39632z);
                        this.f39628v.lineTo(0.0f, this.f39632z);
                        this.f39628v.cubicTo(0.0f, f22, f22, 0.0f, this.f39632z, 0.0f);
                        Path path = this.f39628v;
                        Rect rect = this.f39629w;
                        path.offset(rect.left, rect.top);
                        canvas.drawPath(this.f39628v, this.f39630x);
                    } else {
                        horizontalAxisPosition = horizontalAxisPosition3;
                    }
                    String[] split = valueOf.split(";");
                    canvas.drawText(split[0], f11, f12, this.f39621o);
                    if (split.length > 1) {
                        this.f39621o.setTypeface(Typeface.DEFAULT_BOLD);
                        canvas.drawText(split[1], f11, this.f39621o.descent() + (f12 - this.f39621o.ascent()), this.f39621o);
                        this.f39621o.setTypeface(Typeface.DEFAULT);
                    }
                    i14++;
                    horizontalAxisPosition3 = horizontalAxisPosition;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(GraphView graphView, Canvas canvas) {
        if (!this.f39614h) {
            return;
        }
        boolean z5 = this.K;
        ls.a aVar = this.E;
        if (z5) {
            for (int i11 = 0; i11 < aVar.f80101b; i11++) {
                this.f39615i.setColor(this.f39617k);
                float floor = (float) Math.floor(this.F[i11]);
                Path path = this.J;
                path.moveTo(floor, graphView.getContentRect().top);
                path.lineTo(floor, graphView.getContentRect().bottom + this.f39608b);
                canvas.drawPath(path, this.f39615i);
                path.rewind();
            }
            return;
        }
        int i12 = 0;
        while (true) {
            int i13 = aVar.f80101b;
            if (i12 < i13) {
                int i14 = i12 * 4;
                this.G[i14] = (float) Math.floor(this.F[i12]);
                this.G[i14 + 1] = graphView.getContentRect().top;
                this.G[i14 + 2] = (float) Math.floor(this.F[i12]);
                this.G[i14 + 3] = graphView.getContentRect().bottom;
                i12++;
            } else {
                canvas.drawLines(this.G, 0, i13 * 4, this.f39615i);
                return;
            }
        }
    }

    public final HorizontalAxisPosition i() {
        return this.H;
    }
}
