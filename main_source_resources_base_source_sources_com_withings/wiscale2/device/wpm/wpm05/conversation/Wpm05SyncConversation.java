package com.withings.wiscale2.device.wpm.wpm05.conversation;

import android.content.Context;
import androidx.compose.foundation.lazy.layout.d;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.conversation.SafeCheckForUpgradeConversation;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.note.model.NoteRepository;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.conversation.DeviceWithSignalSyncConversation;
import fl.o;
import fl.p;
import fy.v;
import java.io.IOException;
import jq.k;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import vf.c;
import x70.b;
import xb0.h;
/* compiled from: Wpm05SyncConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm05/conversation/Wpm05SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm05SyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final i f55910f;

    /* renamed from: g  reason: collision with root package name */
    private final c f55911g;

    /* renamed from: h  reason: collision with root package name */
    private final e f55912h;

    /* renamed from: i  reason: collision with root package name */
    private final v f55913i;

    /* renamed from: j  reason: collision with root package name */
    private final HeartSignalRepository f55914j;

    /* renamed from: k  reason: collision with root package name */
    private final k f55915k;

    /* renamed from: l  reason: collision with root package name */
    private final NoteRepository f55916l;

    public Wpm05SyncConversation(i userManager, c accountManager, e deviceManager, v insertMeasureGroupUseCase) {
        HeartSignalRepository heartSignalRepository = d.f4443b;
        if (heartSignalRepository != null) {
            k kVar = d.f4445d;
            if (kVar != null) {
                NoteRepository noteRepository = ah.i.f781a;
                if (noteRepository != null) {
                    u.j(userManager, "userManager");
                    u.j(accountManager, "accountManager");
                    u.j(deviceManager, "deviceManager");
                    u.j(insertMeasureGroupUseCase, "insertMeasureGroupUseCase");
                    this.f55910f = userManager;
                    this.f55911g = accountManager;
                    this.f55912h = deviceManager;
                    this.f55913i = insertMeasureGroupUseCase;
                    this.f55914j = heartSignalRepository;
                    this.f55915k = kVar;
                    this.f55916l = noteRepository;
                    return;
                }
                u.s("noteRepository");
                throw null;
            }
            u.s("signalSyncNotifier");
            throw null;
        }
        u.s("heartSignalRepository");
        throw null;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        jq.c cVar;
        e eVar = this.f55912h;
        if (x().c() != 2) {
            return;
        }
        try {
            com.withings.wiscale2.notification.i.j(r(), r().getString(C1987R.string._ANDROID_STICKY_SERVICE_ACTIVE_CONTENT_));
            try {
                try {
                    E(new Wpm05InitConversation(0));
                } catch (Exception e11) {
                    b.t(this, "Unable to init the wpm", e11);
                }
                com.withings.wiscale2.notification.i.j(r(), r().getString(C1987R.string._WBS_RESYNCHRO_TEXT_));
                new h(x(), eVar).a();
                p a11 = p.f67672b.a();
                cj.b x11 = x();
                u.i(x11, "getWppDevice(...)");
                o f11 = a11.f(x11);
                if (f11 instanceof jq.c) {
                    cVar = (jq.c) f11;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    E(new DeviceWithSignalSyncConversation(cVar, this.f55910f, this.f55911g, this.f55913i, this.f55914j, this.f55915k, this.f55912h, this.f55916l, null));
                }
                com.withings.wiscale2.notification.i.a();
                E(new SafeCheckForUpgradeConversation());
                Context r7 = r();
                u.i(r7, "getContext(...)");
                jl.d dVar = new jl.d(r7);
                com.withings.comm.trace.e a12 = com.withings.comm.trace.e.a();
                u.i(a12, "get(...)");
                E(new DebugDumpConversation(a12, new jl.b(eVar), dVar, new jl.c(0L)));
                oi0.b.h().m(ConstantsWs.CALLCTX_TBP_DEVICE_SYNC, null);
            } catch (IOException e12) {
                throw e12;
            }
        } catch (Throwable th2) {
            com.withings.wiscale2.notification.i.a();
            throw th2;
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final /* bridge */ /* synthetic */ WppDeviceConversation.b u() {
        return null;
    }
}
