package com.withings.wiscale2.manuallogging.ui.addSleep;

import androidx.activity.b0;
import androidx.navigation.c0;
import androidx.navigation.compose.r;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: AddSleepTrackActivity.kt */
/* loaded from: classes5.dex */
final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddSleepTrackActivity f58070a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AddSleepTrackActivity addSleepTrackActivity) {
        super(2);
        this.f58070a = addSleepTrackActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        r8.n nVar;
        r8.n nVar2;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = r.c(new c0[0], aVar2);
            AddSleepTrackActivity addSleepTrackActivity = this.f58070a;
            addSleepTrackActivity.f58020e = c11;
            xb.b v11 = b0.v(aVar2);
            nVar = addSleepTrackActivity.f58020e;
            if (nVar != null) {
                nVar.D().b(v11);
                nVar2 = addSleepTrackActivity.f58020e;
                if (nVar2 != null) {
                    px.c.a(nVar2, AddSleepTrackActivity.B3(addSleepTrackActivity), new f(addSleepTrackActivity), new g(addSleepTrackActivity), new h(addSleepTrackActivity), new i(addSleepTrackActivity), aVar2, 72);
                } else {
                    u.s("navController");
                    throw null;
                }
            } else {
                u.s("navController");
                throw null;
            }
        }
        return y.f85009a;
    }
}
