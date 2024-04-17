package com.withings.wiscale2.manuallogging.ui.addSleep;

import kotlin.jvm.internal.w;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: AddSleepTrackActivity.kt */
/* loaded from: classes5.dex */
final class g extends w implements p<Long, Long, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddSleepTrackActivity f58067a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddSleepTrackActivity addSleepTrackActivity) {
        super(2);
        this.f58067a = addSleepTrackActivity;
    }

    @Override // ym0.p
    public final y invoke(Long l5, Long l6) {
        long longValue = l5.longValue();
        long longValue2 = l6.longValue();
        AddSleepTrackActivity addSleepTrackActivity = this.f58067a;
        AddSleepTrackActivity.B3(addSleepTrackActivity).y0(new DateTime(longValue), new DateTime(longValue2));
        addSleepTrackActivity.setResult(-1);
        addSleepTrackActivity.finish();
        return y.f85009a;
    }
}
