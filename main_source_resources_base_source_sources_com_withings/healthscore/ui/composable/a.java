package com.withings.healthscore.ui.composable;

import ah.o;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.w0;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.u0;
import c2.d;
import c2.g;
import com.withings.healthscore.ui.composable.Circle;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.wiscale2.C1987R;
import d2.h0;
import f2.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k1.o1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import ym0.p;
/* compiled from: HISBlurredCircles.kt */
/* loaded from: classes3.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HISBlurredCircles.kt */
    /* renamed from: com.withings.healthscore.ui.composable.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0541a extends w implements l<f, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Resources f40510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1<List<Circle>> f40511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0541a(Resources resources, o1<? extends List<Circle>> o1Var) {
            super(1);
            this.f40510a = resources;
            this.f40511b = o1Var;
        }

        @Override // ym0.l
        public final y invoke(f fVar) {
            f Canvas = fVar;
            u.j(Canvas, "$this$Canvas");
            Resources resources = this.f40510a;
            u.i(resources, "$resources");
            List<Circle> value = this.f40511b.getValue();
            float b12 = Canvas.b1(46);
            int size = value.size();
            float f11 = 2;
            long a11 = d.a(g.h(Canvas.b()) / f11, g.f(Canvas.b()) / f11);
            float f12 = (float) (6.283185307179586d / size);
            long a12 = d.a(f12, f12);
            float d11 = cn0.c.f23164a.d() * 3.14f;
            int i11 = 0;
            while (i11 < size) {
                long l5 = c2.c.l(a12, i11);
                long a13 = d.a(c2.c.h(a11) + (((float) Math.cos(c2.c.h(l5) + d11)) * b12), c2.c.i(a11) + (((float) Math.sin(c2.c.i(l5) + d11)) * b12));
                Circle circle = value.get(i11);
                f.e1(Canvas, h0.b(androidx.core.content.res.g.b(resources, circle.a())), Canvas.b1(circle.b().a()), a13, null, 120);
                i11++;
                a12 = a12;
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HISBlurredCircles.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map<MeasurementsVertical, Integer> f40512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40513b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, Map map) {
            super(2);
            this.f40512a = map;
            this.f40513b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f40513b | 1);
            a.a(this.f40512a, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HISBlurredCircles.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.a<List<? extends Circle>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map<MeasurementsVertical, Integer> f40514a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Map<MeasurementsVertical, Integer> map) {
            super(0);
            this.f40514a = map;
        }

        @Override // ym0.a
        public final List<? extends Circle> invoke() {
            Circle.Size size;
            int i11;
            Map<MeasurementsVertical, Integer> map = this.f40514a;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<MeasurementsVertical, Integer> entry : map.entrySet()) {
                int intValue = entry.getValue().intValue();
                if (intValue < 50) {
                    size = Circle.Size.f40505b;
                } else if (intValue < 80) {
                    size = Circle.Size.f40506c;
                } else {
                    size = Circle.Size.f40507d;
                }
                switch (entry.getKey().ordinal()) {
                    case 0:
                        i11 = C1987R.color.categoryActivityScoreparticle;
                        break;
                    case 1:
                        i11 = C1987R.color.categoryBodyScoreparticle;
                        break;
                    case 2:
                        i11 = C1987R.color.categoryHeartScoreparticle;
                        break;
                    case 3:
                        i11 = C1987R.color.categoryNutritionScoreparticle;
                        break;
                    case 4:
                        i11 = C1987R.color.categoryRespiratoryScoreparticle;
                        break;
                    case 5:
                        i11 = C1987R.color.categorySleepScoreparticle;
                        break;
                    case 6:
                        i11 = C1987R.color.categorySexualhealthScoreparticle;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new Circle(size, i11));
            }
            return arrayList;
        }
    }

    public static final void a(Map<MeasurementsVertical, Integer> verticalsScores, androidx.compose.runtime.a aVar, int i11) {
        u.j(verticalsScores, "verticalsScores");
        androidx.compose.runtime.b g11 = aVar.g(1954384948);
        Resources resources = ((Context) g11.D(u0.d())).getResources();
        g11.s(1727311978);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = l0.e(new c(verticalsScores));
            g11.n(t11);
        }
        g11.J();
        n0.p.a(a2.b.a(w0.a(e1.e(e.f8927a, 1.0f), 1.0f), 50), new C0541a(resources, (o1) t11), g11, 6);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(i11, verticalsScores));
        }
    }
}
