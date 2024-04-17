package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.network.common.NoResponseReceived;
import com.withings.comm.wpp.generated.object.Id;
import com.withings.comm.wpp.generated.object.StoredMeasureMeta;
import com.withings.comm.wpp.generated.object.StoredSignalMeta;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: GetHeartSignalMeasurementsConversation.kt */
/* loaded from: classes5.dex */
final class c extends w implements ym0.p<StoredMeasureMeta, StoredSignalMeta, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GetHeartSignalMeasurementsConversation f50805a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GetHeartSignalMeasurementsConversation getHeartSignalMeasurementsConversation) {
        super(2);
        this.f50805a = getHeartSignalMeasurementsConversation;
    }

    @Override // ym0.p
    public final y invoke(StoredMeasureMeta storedMeasureMeta, StoredSignalMeta storedSignalMeta) {
        StoredMeasureMeta storedMeasureMeta2 = storedMeasureMeta;
        StoredSignalMeta storedSignalMeta2 = storedSignalMeta;
        kotlin.jvm.internal.u.j(storedMeasureMeta2, "storedMeasureMeta");
        kotlin.jvm.internal.u.j(storedSignalMeta2, "storedSignalMeta");
        GetHeartSignalMeasurementsConversation getHeartSignalMeasurementsConversation = this.f50805a;
        GetHeartSignalMeasurementsConversation.Q(getHeartSignalMeasurementsConversation, storedMeasureMeta2, storedSignalMeta2);
        try {
            nj.a aVar = new nj.a(getHeartSignalMeasurementsConversation.x());
            aVar.c((short) 328, new Id().setValue(storedMeasureMeta2.uid), storedSignalMeta2);
            aVar.j();
        } catch (NoResponseReceived unused) {
            x70.b.t(getHeartSignalMeasurementsConversation, "No response received for command CMD_STORED_MEASURE_SIGNAL_DEL", getHeartSignalMeasurementsConversation.x(), Long.valueOf(getHeartSignalMeasurementsConversation.x().i().softVersion));
        }
        return y.f85009a;
    }
}
