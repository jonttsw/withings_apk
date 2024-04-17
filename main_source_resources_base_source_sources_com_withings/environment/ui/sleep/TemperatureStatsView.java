package com.withings.environment.ui.sleep;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import jm.a;
import l70.u;
/* loaded from: classes3.dex */
public class TemperatureStatsView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private LineCellView f39052a;

    /* renamed from: b  reason: collision with root package name */
    private LineCellView f39053b;

    /* renamed from: c  reason: collision with root package name */
    private LineCellView f39054c;

    public TemperatureStatsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private void a() {
        View.inflate(getContext(), C1987R.layout.view_temperature_stats, this);
        this.f39052a = (LineCellView) findViewById(C1987R.id.temperature_max);
        this.f39053b = (LineCellView) findViewById(C1987R.id.temperature_min);
        this.f39054c = (LineCellView) findViewById(C1987R.id.temperature_average);
    }

    public final void b(double d11, double d12, double d13) {
        u g11 = a.d.a(this.f39052a.getContext()).g(12);
        LineCellView lineCellView = this.f39052a;
        Context context = lineCellView.getContext();
        kotlin.jvm.internal.u.j(context, "context");
        lineCellView.setValue(g11.g(context, d12, null));
        LineCellView lineCellView2 = this.f39053b;
        Context context2 = this.f39052a.getContext();
        kotlin.jvm.internal.u.j(context2, "context");
        lineCellView2.setValue(g11.g(context2, d13, null));
        LineCellView lineCellView3 = this.f39054c;
        Context context3 = this.f39052a.getContext();
        kotlin.jvm.internal.u.j(context3, "context");
        lineCellView3.setValue(g11.g(context3, d11, null));
    }

    public TemperatureStatsView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a();
    }
}
