package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.recyclerview.widget.RecyclerView;
import com.withings.views.measure.detail.ui.views.StatCellCardView;
import com.withings.wiscale2.track.data.SleepStat;
/* compiled from: SleepDayFragment.kt */
/* loaded from: classes5.dex */
public final class v3 extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final StatCellCardView f61542a;

    public v3(StatCellCardView statCellCardView) {
        super(statCellCardView);
        this.f61542a = statCellCardView;
    }

    public static void a(SleepStat sleepStat, v3 this$0) {
        kotlin.jvm.internal.u.j(sleepStat, "$sleepStat");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (sleepStat.getIntent() != null) {
            this$0.f61542a.getContext().startActivity(sleepStat.getIntent());
        }
    }

    public final void b(SleepStat sleepStat) {
        kotlin.jvm.internal.u.j(sleepStat, "sleepStat");
        StatCellCardView statCellCardView = this.f61542a;
        statCellCardView.getTitleView().setText(sleepStat.getTitleResId());
        statCellCardView.setValue(sleepStat.getFormattedValue());
        statCellCardView.setColorRes(sleepStat.getColor());
        statCellCardView.setOnClickListener(new uk.a(6, sleepStat, this));
    }
}
