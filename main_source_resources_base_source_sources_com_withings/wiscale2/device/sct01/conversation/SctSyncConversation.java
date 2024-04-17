package com.withings.wiscale2.device.sct01.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.e;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.note.model.NoteRepository;
import com.withings.wiscale2.data.WiscaleDBH;
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
import oi0.b;
import vf.c;
import ym0.p;
import zx.j;
/* compiled from: SctSyncConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/sct01/conversation/SctSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class SctSyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final i f54789f;

    /* renamed from: g  reason: collision with root package name */
    private final c f54790g;

    /* renamed from: h  reason: collision with root package name */
    private final e f54791h;

    /* renamed from: i  reason: collision with root package name */
    private final b f54792i;

    /* renamed from: j  reason: collision with root package name */
    private final kn.e f54793j;

    /* renamed from: k  reason: collision with root package name */
    private final HeartSignalRepository f54794k;

    /* renamed from: l  reason: collision with root package name */
    private final k f54795l;

    /* renamed from: m  reason: collision with root package name */
    private final NoteRepository f54796m;

    /* renamed from: n  reason: collision with root package name */
    private final v f54797n;

    /* compiled from: SctSyncConversation.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements p<List<? extends d>, ProbeReply, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f54798a = new w(2);

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

    public SctSyncConversation() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:7:0x0018, B:8:0x002a, B:15:0x0041, B:18:0x005f, B:21:0x0075, B:25:0x0095, B:27:0x00ad, B:30:0x00b4, B:24:0x0085, B:14:0x0038, B:33:0x0101), top: B:37:0x0018, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:7:0x0018, B:8:0x002a, B:15:0x0041, B:18:0x005f, B:21:0x0075, B:25:0x0095, B:27:0x00ad, B:30:0x00b4, B:24:0x0085, B:14:0x0038, B:33:0x0101), top: B:37:0x0018, inners: #1, #2 }] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() throws java.io.IOException, com.withings.comm.remote.conversation.ConversationException, com.withings.comm.remote.conversation.WaitForInput.CancelException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.sct01.conversation.SctSyncConversation.D():void");
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }

    public SctSyncConversation(int i11) {
        c cVar;
        i b10 = i.b();
        u.i(b10, "get(...)");
        cVar = c.f103617d;
        if (cVar != null) {
            e a11 = e.a();
            u.i(a11, "get(...)");
            b h11 = b.h();
            u.i(h11, "get(...)");
            kn.e c11 = kn.e.c();
            u.i(c11, "get(...)");
            HeartSignalRepository heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b;
            if (heartSignalRepository != null) {
                k kVar = androidx.compose.foundation.lazy.layout.d.f4445d;
                if (kVar != null) {
                    NoteRepository noteRepository = ah.i.f781a;
                    if (noteRepository != null) {
                        WiscaleDBH f11 = WiscaleDBH.f();
                        u.i(f11, "get(...)");
                        sw.a z5 = sw.a.z();
                        u.i(z5, "get(...)");
                        v vVar = new v(new zx.v(z5), f11, j.f111082d.a());
                        this.f54789f = b10;
                        this.f54790g = cVar;
                        this.f54791h = a11;
                        this.f54792i = h11;
                        this.f54793j = c11;
                        this.f54794k = heartSignalRepository;
                        this.f54795l = kVar;
                        this.f54796m = noteRepository;
                        this.f54797n = vVar;
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
        throw new IllegalArgumentException("You must call init before".toString());
    }
}
