package com.withings.wiscale2.device.wsd.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.h;
import com.withings.device.details.wsd.conversation.WsdInitConversation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.y;
import qj.m;
import u70.a;
/* compiled from: WsdWakeUpConversation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/device/wsd/conversation/WsdWakeUpConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lu70/a$c;", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "d", com.huawei.hms.feature.dynamic.e.e.f28630a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WsdWakeUpConversation extends WppDeviceConversation implements a.c {

    /* renamed from: f  reason: collision with root package name */
    private final a f55975f;

    /* renamed from: g  reason: collision with root package name */
    private final g f55976g;

    /* renamed from: h  reason: collision with root package name */
    private final List<e> f55977h;

    /* compiled from: WsdWakeUpConversation.kt */
    /* loaded from: classes5.dex */
    public interface a extends WppDeviceConversation.b {
        void B2();

        void i2(WsdWakeUpConversation wsdWakeUpConversation);

        void k(WsdWakeUpConversation wsdWakeUpConversation, m mVar);
    }

    /* compiled from: WsdWakeUpConversation.kt */
    /* loaded from: classes5.dex */
    private static final class b implements e {
        @Override // com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation.e
        public final void a(WsdWakeUpConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            conversation.N().k(conversation, new sn.a(bVar).a());
        }
    }

    /* compiled from: WsdWakeUpConversation.kt */
    /* loaded from: classes5.dex */
    private static final class c implements e {
        @Override // com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation.e
        public final void a(WsdWakeUpConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            nj.a aVar = new nj.a(bVar.k());
            aVar.c((short) 2321, new h[0]);
            aVar.j();
        }
    }

    /* compiled from: WsdWakeUpConversation.kt */
    /* loaded from: classes5.dex */
    private static final class d implements e {
        @Override // com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation.e
        public final void a(WsdWakeUpConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            nj.a aVar = new nj.a(bVar.k());
            aVar.c((short) 2308, new h[0]);
            aVar.j();
        }
    }

    /* compiled from: WsdWakeUpConversation.kt */
    /* loaded from: classes5.dex */
    public interface e {
        void a(WsdWakeUpConversation wsdWakeUpConversation, cj.b bVar) throws IOException;
    }

    /* compiled from: WsdWakeUpConversation.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<u70.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f55978a = new w(0);

        @Override // ym0.a
        public final u70.a invoke() {
            return u70.a.b();
        }
    }

    public WsdWakeUpConversation(a delegate) {
        u.j(delegate, "delegate");
        this.f55975f = delegate;
        this.f55976g = nm0.h.b(f.f55978a);
        this.f55977h = Collections.synchronizedList(new ArrayList());
    }

    private final void L(e eVar) {
        List<e> list = this.f55977h;
        if (!list.contains(eVar)) {
            list.add(eVar);
        }
        G(Boolean.TRUE);
    }

    private final u70.a M() {
        return (u70.a) this.f55976g.getValue();
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        a aVar = this.f55975f;
        try {
            B(60000L, false, false);
            M().a(this);
            E(new WsdInitConversation());
            aVar.i2(this);
            while (true) {
                Object K = K();
                u.i(K, "waitForInput(...)");
                if (!((Boolean) K).booleanValue()) {
                    aVar.B2();
                    return;
                }
                while (true) {
                    List<e> taskList = this.f55977h;
                    u.i(taskList, "taskList");
                    if (!taskList.isEmpty()) {
                        cj.b x11 = x();
                        u.i(x11, "getWppDevice(...)");
                        taskList.remove(0).a(this, x11);
                    }
                }
            }
        } finally {
            M().h(this);
        }
    }

    @Override // u70.a.c
    public final long H() {
        return 0L;
    }

    public final a N() {
        return this.f55975f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation$e, java.lang.Object] */
    public final void O() {
        L(new Object());
        y yVar = y.f85009a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation$e, java.lang.Object] */
    public final void P() {
        L(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation$e, java.lang.Object] */
    public final void Q() {
        L(new Object());
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        this.f55975f.B2();
        G(Boolean.FALSE);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f55975f;
    }

    @Override // u70.a.c
    public final void Q2() {
    }
}
