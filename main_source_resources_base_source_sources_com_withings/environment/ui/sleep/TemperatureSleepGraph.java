package com.withings.environment.ui.sleep;

import android.content.Context;
import android.util.AttributeSet;
import com.withings.environment.ui.sleep.SleepSecondaryGraph;
import com.withings.graph.GraphView;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class TemperatureSleepGraph extends SleepSecondaryGraph {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a extends SleepSecondaryGraph.a {
        @Override // f80.i
        protected final void b(float f11, float f12, GraphView graphView) {
            graphView.b(km.a.f(graphView, f11));
            graphView.b(F(graphView, f11));
            graphView.b(km.a.f(graphView, f12));
            graphView.b(F(graphView, f12));
        }
    }

    public TemperatureSleepGraph(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.environment.ui.sleep.SleepSecondaryGraph$a, com.withings.environment.ui.sleep.TemperatureSleepGraph$a] */
    @Override // com.withings.environment.ui.sleep.SleepSecondaryGraph
    final a c(ArrayList arrayList) {
        return new SleepSecondaryGraph.a(this.f39040b, arrayList);
    }

    @Override // com.withings.environment.ui.sleep.SleepSecondaryGraph
    protected int getTitleResId() {
        return C1987R.string._TEMPERATURE_;
    }

    public TemperatureSleepGraph(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
