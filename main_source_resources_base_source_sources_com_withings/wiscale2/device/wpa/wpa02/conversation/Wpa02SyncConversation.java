package com.withings.wiscale2.device.wpa.wpa02.conversation;

import android.content.Context;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.notification.i;
import java.io.IOException;
import jl.d;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import xb0.h;
/* compiled from: Wpa02SyncConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/conversation/Wpa02SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02SyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f55048f;

    public Wpa02SyncConversation() {
        this(0);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        e eVar = this.f55048f;
        if (x().c() != 2) {
            return;
        }
        try {
            i.j(r(), r().getString(C1987R.string._ANDROID_STICKY_SERVICE_ACTIVE_CONTENT_));
            try {
                E(new Wpa02InitConversation());
            } catch (IOException e11) {
                throw e11;
            } catch (Exception e12) {
                x70.b.d(this, "Unable to init the wpa", e12);
            }
            i.j(r(), r().getString(C1987R.string._WBS_RESYNCHRO_TEXT_));
            new h(x(), eVar).a();
            i.a();
            Context r7 = r();
            u.i(r7, "getContext(...)");
            d dVar = new d(r7);
            com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
            u.i(a11, "get(...)");
            E(new DebugDumpConversation(a11, new jl.b(eVar), dVar, new jl.c(0L)));
            oi0.b.h().m(ConstantsWs.CALLCTX_TBP_DEVICE_SYNC, null);
        } catch (Throwable th2) {
            i.a();
            throw th2;
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final /* bridge */ /* synthetic */ WppDeviceConversation.b u() {
        return null;
    }

    public Wpa02SyncConversation(int i11) {
        e c11 = e.c();
        u.i(c11, "get(...)");
        this.f55048f = c11;
    }
}
