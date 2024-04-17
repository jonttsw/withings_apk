package com.withings.environment.ui.sleep;

import ah.u;
import android.content.Context;
import android.util.AttributeSet;
import com.withings.environment.ui.sleep.SleepSecondaryGraphCard;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.j;
import com.withings.library.measure.Measure;
import com.withings.wiscale2.C1987R;
import java.text.NumberFormat;
import java.util.List;
/* loaded from: classes3.dex */
public class NoiseSleepGraph extends SleepSecondaryGraphCard {

    /* loaded from: classes3.dex */
    private class a extends SleepSecondaryGraphCard.a {
        @Override // f80.i
        protected final void b(float f11, float f12, GraphView graphView) {
            int i11;
            int i12;
            int round = Math.round(f11 / 10.0f) * 10;
            if (f12 - f11 > 20.0f) {
                i11 = 10;
            } else {
                i11 = 5;
            }
            if (round < f11) {
                i12 = i11;
            } else {
                i12 = 0;
            }
            for (float f13 = round + i12; f13 < f12; f13 += i11) {
                graphView.b(km.a.f(graphView, f13));
                Context context = graphView.getContext();
                NumberFormat numberFormat = NumberFormat.getInstance();
                numberFormat.setMaximumFractionDigits(1);
                int v11 = u.v(16842809, context);
                j.a aVar = new j.a(context);
                Decorator.DrawOrder drawOrder = Decorator.DrawOrder.f39677a;
                aVar.o(drawOrder);
                aVar.Z(numberFormat.format(f13));
                aVar.d0(f13);
                aVar.a0(wq.a.k(C1987R.style.detail1, context, 10));
                aVar.M(2);
                aVar.o(drawOrder);
                aVar.Q(12);
                aVar.K(u.j(0.6f, v11));
                aVar.X(32);
                graphView.b(aVar.L());
            }
        }
    }

    public NoiseSleepGraph(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.withings.environment.ui.sleep.SleepSecondaryGraphCard
    final SleepSecondaryGraphCard.a a(List<Measure> list) {
        return new SleepSecondaryGraphCard.a(this.f39048b, list);
    }

    @Override // com.withings.environment.ui.sleep.SleepSecondaryGraphCard
    protected int getTitleResId() {
        return C1987R.string._NOISE_;
    }

    public NoiseSleepGraph(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
