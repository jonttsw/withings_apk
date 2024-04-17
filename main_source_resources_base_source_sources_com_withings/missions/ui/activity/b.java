package com.withings.missions.ui.activity;

import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: DailyMissionsSuccessActivity.kt */
/* loaded from: classes4.dex */
final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DailyMissionsSuccessActivity f42319a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DailyMissionsSuccessActivity dailyMissionsSuccessActivity) {
        super(2);
        this.f42319a = dailyMissionsSuccessActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            DailyMissionsSuccessActivity dailyMissionsSuccessActivity = this.f42319a;
            String string = dailyMissionsSuccessActivity.getString(C1987R.string.missions_allMissionCompleted_title);
            u.i(string, "getString(...)");
            String string2 = dailyMissionsSuccessActivity.getString(C1987R.string.missions_allMissionCompleted_description);
            u.i(string2, "getString(...)");
            lk.a.a(string, string2, 0, new a(dailyMissionsSuccessActivity), aVar2, 0, 4);
        }
        return y.f85009a;
    }
}
