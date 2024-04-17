package com.withings.graph.decorator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: LegendDecorator.kt */
/* loaded from: classes3.dex */
public final class i extends Decorator {

    /* renamed from: k  reason: collision with root package name */
    private final float f39831k;

    /* renamed from: l  reason: collision with root package name */
    private final float f39832l;

    /* renamed from: m  reason: collision with root package name */
    private final List<b> f39833m;

    /* renamed from: n  reason: collision with root package name */
    private final List<Drawable> f39834n;

    /* renamed from: o  reason: collision with root package name */
    private final TextPaint f39835o;

    /* renamed from: p  reason: collision with root package name */
    private final float f39836p;

    /* renamed from: q  reason: collision with root package name */
    private final float f39837q;

    /* renamed from: r  reason: collision with root package name */
    private final float f39838r;

    /* compiled from: LegendDecorator.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Decorator.a<i, a> {

        /* renamed from: j  reason: collision with root package name */
        private final Context f39839j;

        /* renamed from: l  reason: collision with root package name */
        private float f39841l;

        /* renamed from: m  reason: collision with root package name */
        private float f39842m;

        /* renamed from: k  reason: collision with root package name */
        private final ArrayList f39840k = new ArrayList();

        /* renamed from: n  reason: collision with root package name */
        private int f39843n = 10;

        /* renamed from: o  reason: collision with root package name */
        private TextPaint f39844o = new TextPaint();

        /* renamed from: p  reason: collision with root package name */
        private int f39845p = 16;

        /* renamed from: q  reason: collision with root package name */
        private int f39846q = 10;

        public a(Context context) {
            this.f39839j = context;
        }

        public final i p() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f39840k;
            Iterator it = arrayList2.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                Context context = this.f39839j;
                if (hasNext) {
                    arrayList.add(androidx.core.content.res.g.d(context.getResources(), ((b) it.next()).a(), null));
                } else {
                    return new i(this, this.f39841l, this.f39842m, arrayList2, arrayList, this.f39844o, ah.g.k(this.f39843n, context), ah.g.k(this.f39845p, context), ah.g.k(this.f39846q, context));
                }
            }
        }

        public final void q(int i11) {
            this.f39843n = i11;
        }

        public final void r(int i11) {
            this.f39846q = i11;
        }

        public final void s(List legendEntries) {
            u.j(legendEntries, "legendEntries");
            ArrayList arrayList = this.f39840k;
            arrayList.clear();
            arrayList.addAll(legendEntries);
        }

        public final void t(int i11) {
            this.f39845p = i11;
        }

        public final void u(TextPaint textPaint) {
            this.f39844o = textPaint;
        }

        public final void v(float f11) {
            this.f39841l = f11;
        }

        public final void w(float f11) {
            this.f39842m = f11;
        }
    }

    /* compiled from: LegendDecorator.kt */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f39847a;

        /* renamed from: b  reason: collision with root package name */
        private final int f39848b;

        public b(String str, int i11) {
            this.f39847a = str;
            this.f39848b = i11;
        }

        public final int a() {
            return this.f39848b;
        }

        public final String b() {
            return this.f39847a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (u.e(this.f39847a, bVar.f39847a) && this.f39848b == bVar.f39848b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f39848b) + (this.f39847a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LegendEntry(name=");
            sb2.append(this.f39847a);
            sb2.append(", drawableRes=");
            return androidx.camera.camera2.internal.e.c(sb2, this.f39848b, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a builder, float f11, float f12, ArrayList legendEntries, ArrayList arrayList, TextPaint textPaint, float f13, float f14, float f15) {
        super(builder);
        u.j(builder, "builder");
        u.j(legendEntries, "legendEntries");
        u.j(textPaint, "textPaint");
        this.f39831k = f11;
        this.f39832l = f12;
        this.f39833m = legendEntries;
        this.f39834n = arrayList;
        this.f39835o = textPaint;
        this.f39836p = f13;
        this.f39837q = f14;
        this.f39838r = f15;
    }

    @Override // com.withings.graph.decorator.Decorator, ts.d
    public final void a(GraphView graphView, Canvas canvas) {
        u.j(graphView, "graphView");
        u.j(canvas, "canvas");
        List<b> list = this.f39833m;
        int size = list.size();
        float f11 = this.f39831k;
        for (int i11 = 0; i11 < size; i11++) {
            Drawable drawable = this.f39834n.get(i11);
            float f12 = this.f39832l;
            float f13 = this.f39836p;
            if (drawable != null) {
                float f14 = f13 / 2;
                drawable.setBounds((int) f11, (int) (f12 - f14), (int) (f11 + f13), (int) (f14 + f12));
                drawable.draw(canvas);
            }
            float f15 = f11 + f13 + this.f39838r;
            TextPaint textPaint = this.f39835o;
            canvas.drawText(list.get(i11).b(), f15, f12 - ((textPaint.ascent() + textPaint.descent()) / 2), textPaint);
            f11 = this.f39837q + textPaint.measureText(list.get(i11).b()) + f15;
        }
    }
}
