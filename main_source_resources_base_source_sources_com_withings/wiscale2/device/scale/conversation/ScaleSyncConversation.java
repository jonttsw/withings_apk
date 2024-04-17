package com.withings.wiscale2.device.scale.conversation;

import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.e;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.note.model.NoteRepository;
import com.withings.wiscale2.data.WiscaleDBH;
import fl.p;
import fy.v;
import hy.g;
import java.util.ArrayList;
import java.util.List;
import jq.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ky.d;
import m70.i;
import nm0.y;
import vf.c;
import yb0.c;
import zx.j;
/* compiled from: ScaleSyncConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/scale/conversation/ScaleSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScaleSyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final i f54646f;

    /* renamed from: g  reason: collision with root package name */
    private final c f54647g;

    /* renamed from: h  reason: collision with root package name */
    private final e f54648h;

    /* renamed from: i  reason: collision with root package name */
    private final oi0.b f54649i;

    /* renamed from: j  reason: collision with root package name */
    private final kn.e f54650j;

    /* renamed from: k  reason: collision with root package name */
    private final yb0.c f54651k;

    /* renamed from: l  reason: collision with root package name */
    private final p f54652l;

    /* renamed from: m  reason: collision with root package name */
    private final HeartSignalRepository f54653m;

    /* renamed from: n  reason: collision with root package name */
    private final k f54654n;

    /* renamed from: o  reason: collision with root package name */
    private final NoteRepository f54655o;

    /* renamed from: p  reason: collision with root package name */
    private final v f54656p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f54657q;

    /* compiled from: ScaleSyncConversation.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.p<List<? extends d>, ProbeReply, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f54658a = new w(2);

        @Override // ym0.p
        public final y invoke(List<? extends d> list, ProbeReply probeReply) {
            List<? extends d> measures = list;
            ProbeReply probeReply2 = probeReply;
            u.j(measures, "measures");
            u.j(probeReply2, "probeReply");
            uw.d a11 = uw.d.a();
            ArrayList f11 = g.f(measures);
            a11.getClass();
            uw.d.e(probeReply2, f11);
            return y.f85009a;
        }
    }

    public ScaleSyncConversation() {
        this(false, 4095);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00af A[Catch: all -> 0x0086, TryCatch #1 {all -> 0x0086, blocks: (B:5:0x000e, B:6:0x0020, B:13:0x0039, B:16:0x0063, B:19:0x0079, B:23:0x0099, B:25:0x00af, B:28:0x00b6, B:22:0x0089, B:12:0x0030, B:31:0x010d), top: B:34:0x000e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:5:0x000e, B:6:0x0020, B:13:0x0039, B:16:0x0063, B:19:0x0079, B:23:0x0099, B:25:0x00af, B:28:0x00b6, B:22:0x0089, B:12:0x0030, B:31:0x010d), top: B:34:0x000e, inners: #3 }] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() throws java.io.IOException, com.withings.comm.remote.conversation.ConversationException, com.withings.comm.remote.conversation.WaitForInput.CancelException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.conversation.ScaleSyncConversation.D():void");
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }

    public ScaleSyncConversation(boolean z5, int i11) {
        c cVar;
        i b10 = i.b();
        u.i(b10, "get(...)");
        cVar = c.f103617d;
        if (cVar != null) {
            e a11 = e.a();
            u.i(a11, "get(...)");
            oi0.b h11 = oi0.b.h();
            u.i(h11, "get(...)");
            kn.e c11 = kn.e.c();
            u.i(c11, "get(...)");
            yb0.c cVar2 = c.a.f108754a;
            if (cVar2 != null) {
                p a12 = p.f67672b.a();
                HeartSignalRepository heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b;
                if (heartSignalRepository != null) {
                    k kVar = androidx.compose.foundation.lazy.layout.d.f4445d;
                    if (kVar != null) {
                        NoteRepository noteRepository = ah.i.f781a;
                        if (noteRepository != null) {
                            WiscaleDBH f11 = WiscaleDBH.f();
                            u.i(f11, "get(...)");
                            sw.a z11 = sw.a.z();
                            u.i(z11, "get(...)");
                            v vVar = new v(new zx.v(z11), f11, j.f111082d.a());
                            boolean z12 = (i11 & ModuleCopy.f28574b) != 0 ? false : z5;
                            this.f54646f = b10;
                            this.f54647g = cVar;
                            this.f54648h = a11;
                            this.f54649i = h11;
                            this.f54650j = c11;
                            this.f54651k = cVar2;
                            this.f54652l = a12;
                            this.f54653m = heartSignalRepository;
                            this.f54654n = kVar;
                            this.f54655o = noteRepository;
                            this.f54656p = vVar;
                            this.f54657q = z12;
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
            u.s("instance");
            throw null;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    public ScaleSyncConversation(int i11) {
        this(true, 2047);
    }
}
