package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.StoredSignalMeta;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.note.model.NoteRepository;
import kotlin.Metadata;
import nm0.y;
/* compiled from: DeviceWithSignalSyncConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/DeviceWithSignalSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceWithSignalSyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final jq.c f50704f;

    /* renamed from: g  reason: collision with root package name */
    private final m70.i f50705g;

    /* renamed from: h  reason: collision with root package name */
    private final vf.c f50706h;

    /* renamed from: i  reason: collision with root package name */
    private final fy.v f50707i;

    /* renamed from: j  reason: collision with root package name */
    private final HeartSignalRepository f50708j;

    /* renamed from: k  reason: collision with root package name */
    private final jq.k f50709k;

    /* renamed from: l  reason: collision with root package name */
    private final kn.e f50710l;

    /* renamed from: m  reason: collision with root package name */
    private final NoteRepository f50711m;

    /* renamed from: n  reason: collision with root package name */
    private final ym0.l<Double, y> f50712n;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceWithSignalSyncConversation(jq.c cVar, m70.i userManager, vf.c accountManager, fy.v insertMeasureGroupUseCase, HeartSignalRepository heartSignalRepository, jq.k kVar, kn.e deviceManager, NoteRepository noteRepository, ym0.l<? super Double, y> lVar) {
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(accountManager, "accountManager");
        kotlin.jvm.internal.u.j(insertMeasureGroupUseCase, "insertMeasureGroupUseCase");
        kotlin.jvm.internal.u.j(heartSignalRepository, "heartSignalRepository");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        this.f50704f = cVar;
        this.f50705g = userManager;
        this.f50706h = accountManager;
        this.f50707i = insertMeasureGroupUseCase;
        this.f50708j = heartSignalRepository;
        this.f50709k = kVar;
        this.f50710l = deviceManager;
        this.f50711m = noteRepository;
        this.f50712n = lVar;
    }

    private final void L(Integer num) {
        StoredSignalMeta storedSignalMeta;
        try {
            m70.i iVar = this.f50705g;
            vf.c cVar = this.f50706h;
            fy.v vVar = this.f50707i;
            HeartSignalRepository heartSignalRepository = this.f50708j;
            jq.k kVar = this.f50709k;
            kn.e eVar = this.f50710l;
            NoteRepository noteRepository = this.f50711m;
            ym0.l<Double, y> lVar = this.f50712n;
            if (num != null) {
                int intValue = num.intValue();
                StoredSignalMeta storedSignalMeta2 = new StoredSignalMeta();
                storedSignalMeta2.type = intValue;
                storedSignalMeta = storedSignalMeta2;
            } else {
                storedSignalMeta = null;
            }
            E(new GetHeartSignalMeasurementsConversation(iVar, cVar, null, storedSignalMeta, vVar, heartSignalRepository, kVar, eVar, noteRepository, lVar, ConstantsWs.WS_STATUS_ERROR_LINK_USER_DEVICE));
        } catch (UnsupportedCommandException unused) {
            x70.b.t(this, "Command CMD_STORED_MEASURE_SIGNAL_GET is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        jq.c cVar = this.f50704f;
        if (cVar.k0()) {
            for (int i11 : cVar.R()) {
                L(Integer.valueOf(i11));
            }
            return;
        }
        L(null);
    }
}
