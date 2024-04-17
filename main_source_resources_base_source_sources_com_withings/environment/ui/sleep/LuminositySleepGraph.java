package com.withings.environment.ui.sleep;

import android.content.Context;
import android.util.AttributeSet;
import com.withings.environment.ui.sleep.SleepSecondaryGraphCard;
import com.withings.graph.GraphView;
import com.withings.library.measure.Measure;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* loaded from: classes3.dex */
public class LuminositySleepGraph extends SleepSecondaryGraphCard {
    public LuminositySleepGraph(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.withings.environment.ui.sleep.SleepSecondaryGraphCard
    final SleepSecondaryGraphCard.a a(List<Measure> list) {
        return new SleepSecondaryGraphCard.a(this.f39048b, list);
    }

    @Override // com.withings.environment.ui.sleep.SleepSecondaryGraphCard
    protected int getTitleResId() {
        return C1987R.string._LUMINOSITY_;
    }

    public LuminositySleepGraph(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    /* loaded from: classes3.dex */
    private class a extends SleepSecondaryGraphCard.a {
        @Override // f80.i
        protected final void b(float f11, float f12, GraphView graphView) {
        }
    }
}
