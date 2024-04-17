package com.withings.wiscale2.device.wpm.wpm04.conversation;

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
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import vf.c;
import x70.b;
import xb0.h;
/* compiled from: Wpm04SyncConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/conversation/Wpm04SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm04SyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final i f55812f;

    /* renamed from: g  reason: collision with root package name */
    private final c f55813g;

    /* renamed from: h  reason: collision with root package name */
    private final e f55814h;

    /* renamed from: i  reason: collision with root package name */
    private final v f55815i;

    /* renamed from: j  reason: collision with root package name */
    private final HeartSignalRepository f55816j;

    /* renamed from: k  reason: collision with root package name */
    private final NoteRepository f55817k;

    public Wpm04SyncConversation(i userManager, c accountManager, e deviceManager, v insertMeasureGroupUseCase) {
        HeartSignalRepository heartSignalRepository = d.f4443b;
        if (heartSignalRepository != null) {
            NoteRepository noteRepository = ah.i.f781a;
            if (noteRepository != null) {
                u.j(userManager, "userManager");
                u.j(accountManager, "accountManager");
                u.j(deviceManager, "deviceManager");
                u.j(insertMeasureGroupUseCase, "insertMeasureGroupUseCase");
                this.f55812f = userManager;
                this.f55813g = accountManager;
                this.f55814h = deviceManager;
                this.f55815i = insertMeasureGroupUseCase;
                this.f55816j = heartSignalRepository;
                this.f55817k = noteRepository;
                return;
            }
            u.s("noteRepository");
            throw null;
        }
        u.s("heartSignalRepository");
        throw null;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        jq.c cVar;
        if (x().c() == 2 && x().c() != 6) {
            try {
                com.withings.wiscale2.notification.i.j(r(), r().getString(C1987R.string._ANDROID_STICKY_SERVICE_ACTIVE_CONTENT_));
                try {
                    try {
                        E(new Wpm04InitConversation(this.f55814h));
                    } catch (IOException e11) {
                        throw e11;
                    }
                } catch (Exception e12) {
                    b.t(this, "Unable to init the wpm", e12);
                }
                com.withings.wiscale2.notification.i.j(r(), r().getString(C1987R.string._WBS_RESYNCHRO_TEXT_));
                new h(x(), e.c()).a();
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
                    E(new DeviceWithSignalSyncConversation(cVar, this.f55812f, this.f55813g, this.f55815i, this.f55816j, null, this.f55814h, this.f55817k, null));
                }
                com.withings.wiscale2.notification.i.a();
                E(new SafeCheckForUpgradeConversation());
                Context r7 = r();
                u.i(r7, "getContext(...)");
                jl.d dVar = new jl.d(r7);
                com.withings.comm.trace.e a12 = com.withings.comm.trace.e.a();
                u.i(a12, "get(...)");
                e c11 = e.c();
                u.i(c11, "get(...)");
                E(new DebugDumpConversation(a12, new jl.b(c11), dVar, new jl.c(0L)));
                oi0.b.h().m(ConstantsWs.CALLCTX_TBP_DEVICE_SYNC, null);
            } catch (Throwable th2) {
                com.withings.wiscale2.notification.i.a();
                throw th2;
            }
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final /* bridge */ /* synthetic */ WppDeviceConversation.b u() {
        return null;
    }
}
