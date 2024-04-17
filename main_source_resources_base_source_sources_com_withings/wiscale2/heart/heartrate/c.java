package com.withings.wiscale2.heart.heartrate;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.j;
import com.withings.wiscale2.C1987R;
import ha0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ts.a;
/* compiled from: DayHeartRateGraphFactoryDelegate.java */
/* loaded from: classes5.dex */
public final class c implements i.c {

    /* renamed from: a  reason: collision with root package name */
    private static LinearGradient f57557a;

    private static void e(float f11, int i11, GraphView graphView, String str) {
        Context context = graphView.getContext();
        TextPaint k11 = wq.a.k(C1987R.style.detail1, context, 10);
        k11.setColor(androidx.core.content.a.getColor(context, i11));
        int v11 = ah.u.v(16842809, context);
        j.a aVar = new j.a(context);
        Decorator.DrawOrder drawOrder = Decorator.DrawOrder.f39677a;
        aVar.o(drawOrder);
        aVar.M(1);
        aVar.Z(str);
        aVar.d0(f11);
        aVar.o(drawOrder);
        aVar.a0(k11);
        aVar.S(ah.g.k(2, context));
        aVar.R(5);
        aVar.P(5, 1);
        aVar.K(ah.u.j(0.9f, v11));
        aVar.X(32);
        graphView.b(aVar.L());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [os.a, java.lang.Object] */
    @Override // ha0.i.c
    public final void a(GraphView graphView, List list) {
        a.C1685a c1685a = new a.C1685a();
        c1685a.l(list);
        c1685a.t(f57557a);
        c1685a.u(androidx.core.content.a.getColor(graphView.getContext(), C1987R.color.datavizMonochromaticNeutral3));
        c1685a.w(ah.g.k(2, graphView.getContext()));
        c1685a.i(new Object());
        c1685a.v(false);
        graphView.d(c1685a.s());
    }

    @Override // ha0.i.c
    public final void b(GraphView graphView, kj0.c cVar) {
        float f11 = (cVar.f() + cVar.d()) / 2;
        float e11 = (cVar.e() + cVar.f()) / 2;
        float e12 = cVar.e() - (e11 - cVar.e());
        Context context = graphView.getContext();
        e(e12, C1987R.color.datavizMonochromaticNeutral2, graphView, context.getString(C1987R.string._HR_LIGHT_ZONE_));
        e(e11, C1987R.color.datavizMonochromaticNeutral3, graphView, context.getString(C1987R.string._HR_MODERATE_ZONE_));
        e(f11, C1987R.color.datavizMonochromaticNeutral4, graphView, context.getString(C1987R.string._HR_INTENSE_ZONE_));
        e((cVar.d() - f11) + cVar.d(), C1987R.color.datavizMonochromaticNeutral5, graphView, context.getString(C1987R.string._HR_PEAK_ZONE_));
    }

    @Override // ha0.i.c
    public final void c(GraphView graphView, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rs.h hVar = (rs.h) it.next();
            hVar.n(false);
            arrayList.add(hVar);
        }
    }

    @Override // ha0.i.c
    public final void d(GraphView graphView, float f11, float f12, kj0.c cVar) {
        float f13 = f11 - f12;
        f57557a = new LinearGradient(0.0f, graphView.r(f12), 0.0f, graphView.r(f11), new int[]{androidx.core.content.a.getColor(graphView.getContext(), C1987R.color.datavizMonochromaticNeutral2), androidx.core.content.a.getColor(graphView.getContext(), C1987R.color.datavizMonochromaticNeutral2), androidx.core.content.a.getColor(graphView.getContext(), C1987R.color.datavizMonochromaticNeutral3), androidx.core.content.a.getColor(graphView.getContext(), C1987R.color.datavizMonochromaticNeutral3), androidx.core.content.a.getColor(graphView.getContext(), C1987R.color.datavizMonochromaticNeutral4), androidx.core.content.a.getColor(graphView.getContext(), C1987R.color.datavizMonochromaticNeutral4), androidx.core.content.a.getColor(graphView.getContext(), C1987R.color.datavizMonochromaticNeutral5)}, new float[]{0.0f, Math.min(1.0f, ((cVar.e() - f12) / f13) - 0.02f), Math.min(1.0f, ((cVar.e() - f12) / f13) + 0.02f), Math.min(1.0f, ((cVar.f() - f12) / f13) - 0.02f), Math.min(1.0f, ((cVar.f() - f12) / f13) + 0.02f), Math.min(1.0f, ((cVar.d() - f12) / f13) - 0.02f), 1.0f}, Shader.TileMode.CLAMP);
    }
}
