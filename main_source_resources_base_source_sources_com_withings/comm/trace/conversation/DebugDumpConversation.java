package com.withings.comm.trace.conversation;

import com.google.gson.JsonObject;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.Traces;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.DebugDumpAnchor;
import com.withings.comm.wpp.generated.object.DebugDumpData;
import com.withings.comm.wpp.generated.object.DebugDumpFormat;
import com.withings.comm.wpp.generated.object.DebugDumpMask;
import com.withings.comm.wpp.generated.object.DebugDumpType;
import com.withings.comm.wpp.h;
import com.withings.util.log.Fail;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import nj.c;
/* compiled from: DebugDumpConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/comm/trace/conversation/DebugDumpConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "library_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DebugDumpConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final com.withings.comm.trace.e f33197f;

    /* renamed from: g  reason: collision with root package name */
    private final kj.d f33198g;

    /* renamed from: h  reason: collision with root package name */
    private final kj.c f33199h;

    /* renamed from: i  reason: collision with root package name */
    private final kj.b f33200i;

    public DebugDumpConversation(com.withings.comm.trace.e traceManager, kj.d maskProvider, kj.c cVar, jl.c cVar2) {
        u.j(traceManager, "traceManager");
        u.j(maskProvider, "maskProvider");
        this.f33197f = traceManager;
        this.f33198g = maskProvider;
        this.f33199h = cVar;
        this.f33200i = cVar2;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws ConversationException, IOException {
        kj.c cVar = this.f33199h;
        if (cVar == null || cVar.b(this)) {
            int a11 = this.f33198g.a(this);
            if (a11 != -1) {
                cj.b x11 = x();
                JsonObject a12 = Traces.a("debugMask");
                a12.addProperty("debug_mask", Integer.valueOf(a11));
                this.f33197f.d(x11, a12);
                nj.a aVar = new nj.a(x());
                aVar.c((short) 279, new DebugDumpMask().setMask(a11));
                aVar.j();
            }
            final f fVar = new f();
            try {
                x().k().l("Logs are disabled for debug dump...", true);
                nj.c cVar2 = new nj.c(x());
                cVar2.u(60000L);
                cVar2.y(DebugDumpType.class, new c.b() { // from class: com.withings.comm.trace.conversation.a
                    @Override // nj.c.b
                    public final void a(h hVar) {
                        DebugDumpType debugDumpType = (DebugDumpType) hVar;
                        f result = f.this;
                        u.j(result, "$result");
                        ArrayList b10 = result.b();
                        u.g(debugDumpType);
                        b10.add(new kj.a(debugDumpType));
                    }
                });
                cVar2.y(DebugDumpData.class, new c.b() { // from class: com.withings.comm.trace.conversation.b
                    @Override // nj.c.b
                    public final void a(h hVar) {
                        f result = f.this;
                        u.j(result, "$result");
                        byte[] buf = ((DebugDumpData) hVar).buf;
                        u.i(buf, "buf");
                        ((kj.a) x.T(result.b())).a(buf);
                    }
                });
                cVar2.y(DebugDumpFormat.class, new c.b() { // from class: com.withings.comm.trace.conversation.c
                    @Override // nj.c.b
                    public final void a(h hVar) {
                        f result = f.this;
                        u.j(result, "$result");
                        short s11 = ((DebugDumpFormat) hVar).value;
                        ((kj.a) x.T(result.b())).getClass();
                    }
                });
                cVar2.y(DebugDumpAnchor.class, new c.b() { // from class: com.withings.comm.trace.conversation.d
                    @Override // nj.c.b
                    public final void a(h hVar) {
                        f result = f.this;
                        u.j(result, "$result");
                        result.c((DebugDumpAnchor) hVar);
                    }
                });
                kj.b bVar = this.f33200i;
                if (bVar != null) {
                    cVar2.c((short) 280, new DebugDumpAnchor().setValue(bVar.a(this)));
                    cVar2.j();
                } else {
                    cVar2.c((short) 280, new h[0]);
                    cVar2.j();
                }
                x().k().l("Debug dump done. Logs are enabled again.", false);
                BuildersKt.runBlocking$default(null, new e(fVar, this, null), 1, null);
                DebugDumpAnchor a13 = fVar.a();
                if (a13 != null) {
                    if (bVar != null) {
                        bVar.b(this, a13.value);
                        return;
                    } else {
                        Fail.j("anchorDelegate should not be null here");
                        return;
                    }
                }
                try {
                    nj.a aVar2 = new nj.a(x());
                    aVar2.u(20000L);
                    aVar2.c((short) 309, new h[0]);
                    aVar2.j();
                } catch (UnsupportedCommandException unused) {
                    x70.b.u(this, v(), "Unsupported command CMD_DEBUG_DUMP_ACK (%s)", Wpp.prettyCommand((short) 309));
                }
                if (cVar != null) {
                    cVar.a(this);
                }
            } catch (Throwable th2) {
                x().k().l("Debug dump done. Logs are enabled again.", false);
                throw th2;
            }
        }
    }

    public final kj.d L() {
        return this.f33198g;
    }

    public final kj.c M() {
        return this.f33199h;
    }

    public final com.withings.comm.trace.e N() {
        return this.f33197f;
    }
}
