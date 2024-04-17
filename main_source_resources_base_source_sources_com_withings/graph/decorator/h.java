package com.withings.graph.decorator;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
/* compiled from: IconDecorator.java */
/* loaded from: classes3.dex */
public final class h extends Decorator {

    /* renamed from: k  reason: collision with root package name */
    private RectF f39818k;

    /* renamed from: l  reason: collision with root package name */
    private Bitmap f39819l;

    /* renamed from: m  reason: collision with root package name */
    private Paint f39820m;

    /* renamed from: n  reason: collision with root package name */
    private float f39821n;

    /* renamed from: o  reason: collision with root package name */
    private float f39822o;

    /* renamed from: p  reason: collision with root package name */
    private int f39823p;

    /* renamed from: q  reason: collision with root package name */
    private int f39824q;

    /* compiled from: IconDecorator.java */
    /* loaded from: classes3.dex */
    public static class a extends Decorator.a<h, a> {

        /* renamed from: j  reason: collision with root package name */
        private Bitmap f39825j;

        /* renamed from: k  reason: collision with root package name */
        private int f39826k;

        /* renamed from: l  reason: collision with root package name */
        private float f39827l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        private float f39828m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        private int f39829n = 0;

        /* renamed from: o  reason: collision with root package name */
        private int f39830o = 0;

        public final void A(int i11) {
            this.f39826k = i11;
        }

        public final void B(float f11) {
            this.f39827l = f11;
        }

        public final void C(float f11) {
            this.f39828m = f11;
        }

        public final h v() {
            return new h(this);
        }

        public final void w(Bitmap bitmap) {
            this.f39825j = bitmap;
        }

        public final void x(Drawable drawable) {
            this.f39825j = ((BitmapDrawable) drawable).getBitmap();
        }

        public final void y() {
            this.f39829n = 10;
        }

        public final void z(int i11) {
            this.f39830o = i11;
        }
    }

    protected h(a aVar) {
        super(aVar);
        this.f39818k = new RectF();
        this.f39819l = aVar.f39825j;
        this.f39821n = aVar.f39827l;
        this.f39822o = aVar.f39828m;
        int i11 = aVar.f39826k;
        this.f39823p = aVar.f39829n;
        this.f39824q = aVar.f39830o;
        Paint paint = new Paint();
        this.f39820m = paint;
        paint.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        Context context = graphView.getContext();
        if (!this.f100571e) {
            return;
        }
        int k11 = ah.g.k(this.f39823p, context);
        int k12 = ah.g.k(this.f39824q, context);
        float f11 = this.f39822o;
        float r7 = graphView.r(f11);
        Bitmap bitmap = this.f39819l;
        float f12 = k11;
        float f13 = k12;
        float height = ((r7 - (bitmap.getHeight() / 2)) - f12) + f13;
        float r11 = ((graphView.r(f11) + (bitmap.getHeight() / 2)) - f12) + f13;
        float f14 = this.f39821n;
        float q11 = graphView.q(f14) + (bitmap.getWidth() / 2);
        RectF rectF = this.f39818k;
        rectF.set(graphView.q(f14) - (bitmap.getWidth() / 2), height, q11, r11);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.f39820m);
    }
}
