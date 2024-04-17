package com.withings.wiscale2.device.common.conversation;

import com.withings.vasistas.ws.WsVasistasSerie;
/* compiled from: GetHeartSignalMeasurementsConversation.kt */
/* loaded from: classes5.dex */
public final class b implements ym0.p<Integer, Long, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GetHeartSignalMeasurementsConversation f50804a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(GetHeartSignalMeasurementsConversation getHeartSignalMeasurementsConversation) {
        this.f50804a = getHeartSignalMeasurementsConversation;
    }

    @Override // ym0.p
    public final Boolean invoke(Integer num, Long l5) {
        fl.o oVar;
        int intValue = num.intValue();
        long longValue = l5.longValue();
        oVar = this.f50804a.f50728q;
        if (oVar != null) {
            return Boolean.valueOf(((jq.c) oVar).j(intValue, longValue));
        }
        kotlin.jvm.internal.u.s(WsVasistasSerie.KEY_MODEL);
        throw null;
    }
}
