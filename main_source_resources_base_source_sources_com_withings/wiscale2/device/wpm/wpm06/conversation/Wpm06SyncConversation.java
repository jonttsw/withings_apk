package com.withings.wiscale2.device.wpm.wpm06.conversation;

import android.content.Context;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.conversation.SafeCheckForUpgradeConversation;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.note.model.NoteRepository;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.data.WiscaleDBH;
import com.withings.wiscale2.device.common.conversation.DeviceWithSignalSyncConversation;
import fl.o;
import fl.p;
import fy.v;
import java.io.IOException;
import jl.d;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import sw.a;
import vf.c;
import x70.b;
import xb0.h;
import zx.j;
/* compiled from: Wpm06SyncConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm06/conversation/Wpm06SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm06SyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final i f55954f;

    /* renamed from: g  reason: collision with root package name */
    private final c f55955g;

    /* renamed from: h  reason: collision with root package name */
    private final e f55956h;

    /* renamed from: i  reason: collision with root package name */
    private final v f55957i;

    /* renamed from: j  reason: collision with root package name */
    private final HeartSignalRepository f55958j;

    /* renamed from: k  reason: collision with root package name */
    private final NoteRepository f55959k;

    public Wpm06SyncConversation() {
        this(0);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        jq.c cVar;
        e eVar = this.f55956h;
        if (x().c() != 2) {
            return;
        }
        try {
            com.withings.wiscale2.notification.i.j(r(), r().getString(C1987R.string._ANDROID_STICKY_SERVICE_ACTIVE_CONTENT_));
            try {
                try {
                    E(new Wpm06InitConversation(0));
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
                    E(new DeviceWithSignalSyncConversation(cVar, this.f55954f, this.f55955g, this.f55957i, this.f55958j, null, this.f55956h, this.f55959k, null));
                }
                com.withings.wiscale2.notification.i.a();
                E(new SafeCheckForUpgradeConversation());
                Context r7 = r();
                u.i(r7, "getContext(...)");
                d dVar = new d(r7);
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

    public Wpm06SyncConversation(int i11) {
        c cVar;
        i b10 = i.b();
        u.i(b10, "get(...)");
        cVar = c.f103617d;
        if (cVar != null) {
            e c11 = e.c();
            u.i(c11, "get(...)");
            WiscaleDBH f11 = WiscaleDBH.f();
            u.i(f11, "get(...)");
            a z5 = a.z();
            u.i(z5, "get(...)");
            v vVar = new v(new zx.v(z5), f11, j.f111082d.a());
            HeartSignalRepository heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b;
            if (heartSignalRepository != null) {
                NoteRepository noteRepository = ah.i.f781a;
                if (noteRepository != null) {
                    this.f55954f = b10;
                    this.f55955g = cVar;
                    this.f55956h = c11;
                    this.f55957i = vVar;
                    this.f55958j = heartSignalRepository;
                    this.f55959k = noteRepository;
                    return;
                }
                u.s("noteRepository");
                throw null;
            }
            u.s("heartSignalRepository");
            throw null;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }
}
