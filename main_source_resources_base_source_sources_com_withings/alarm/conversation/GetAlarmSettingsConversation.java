package com.withings.alarm.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.FeatureMask;
import com.withings.comm.wpp.generated.object.NbAlarm;
import com.withings.comm.wpp.h;
import com.withings.features.FeatureFlag;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import pg.e;
import pg.f;
/* compiled from: GetAlarmSettingsConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/alarm/conversation/GetAlarmSettingsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "alarm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetAlarmSettingsConversation extends WppDeviceConversation {
    /* JADX WARN: Type inference failed for: r1v0, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        boolean z5;
        boolean z11;
        boolean z12;
        try {
            Object e11 = x().e();
            ?? aVar = new nj.a(x());
            aVar.c((short) 298, new h[0]);
            aVar.j();
            for (h hVar : aVar.D().d()) {
                if (hVar instanceof NbAlarm) {
                    u.h(e11, "null cannot be cast to non-null type com.withings.alarm.MaxNumberOfAlarmsHolder");
                    ((f) e11).f(((NbAlarm) hVar).f33260nb);
                } else if (hVar instanceof FeatureMask) {
                    u.h(e11, "null cannot be cast to non-null type com.withings.alarm.InfoHolderWithAlarmFeatureMask");
                    e eVar = (e) e11;
                    boolean z13 = true;
                    if ((((FeatureMask) hVar).mask & 1) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    eVar.g(Boolean.valueOf(z5));
                    if ((((FeatureMask) hVar).mask & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    eVar.j(Boolean.valueOf(z11));
                    if ((((FeatureMask) hVar).mask & 4) != 0 && wr.b.c(FeatureFlag.f39126q0)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    eVar.b(Boolean.valueOf(z12));
                    if ((((FeatureMask) hVar).mask & 8) == 0 || !wr.b.c(FeatureFlag.f39126q0)) {
                        z13 = false;
                    }
                    eVar.e(Boolean.valueOf(z13));
                }
            }
        } catch (IOException unused) {
        }
    }
}
