package com.withings.graph.decorator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
/* compiled from: BackgroundDecorator.java */
/* loaded from: classes3.dex */
public final class a extends Decorator {

    /* renamed from: k  reason: collision with root package name */
    private RectF f39683k;

    /* renamed from: l  reason: collision with root package name */
    private Paint f39684l;

    /* compiled from: BackgroundDecorator.java */
    /* renamed from: com.withings.graph.decorator.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0520a extends Decorator.a<a, C0520a> {

        /* renamed from: j  reason: collision with root package name */
        private int f39685j = ts.d.f100566i;

        /* renamed from: k  reason: collision with root package name */
        private final RectF f39686k = new RectF(Float.NaN, 0.0f, Float.NaN, 0.0f);

        public final void r() {
            this.f39686k.bottom = 0.0f;
        }

        public final a s() {
            return new a(this);
        }

        public final void t(float f11) {
            this.f39686k.left = f11;
        }

        public final void u(float f11) {
            this.f39686k.right = f11;
        }

        public final void v(int i11) {
            this.f39685j = i11;
        }

        public final void w() {
            this.f39686k.top = 100.0f;
        }
    }

    protected a(C0520a c0520a) {
        super(c0520a);
        this.f39684l = null;
        this.f39683k = c0520a.f39686k;
        int i11 = c0520a.f39685j;
        if (this.f39684l == null) {
            Paint paint = new Paint();
            this.f39684l = paint;
            paint.setColor(i11);
            this.f39684l.setStyle(Paint.Style.FILL);
        }
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        RectF rectF;
        if (!this.f100571e || (rectF = this.f39683k) == null) {
            return;
        }
        float f11 = graphView.getContentRect().left;
        float f12 = graphView.getContentRect().right;
        if (!Float.isNaN(rectF.left)) {
            f11 = graphView.q(rectF.left);
        }
        float f13 = f11;
        if (!Float.isNaN(rectF.right)) {
            f12 = graphView.q(rectF.right);
        }
        canvas.drawRect(f13, graphView.r(rectF.bottom), f12, graphView.r(rectF.top), this.f39684l);
    }
}
