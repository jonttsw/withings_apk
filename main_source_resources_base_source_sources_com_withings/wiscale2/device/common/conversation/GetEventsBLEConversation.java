package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.EventV2;
import com.withings.comm.wpp.generated.object.WppString;
import com.withings.wiscale2.device.common.event.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.x;
/* compiled from: GetEventsBLEConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/GetEventsBLEConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GetEventsBLEConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final yb0.c f50715f;

    /* renamed from: g  reason: collision with root package name */
    private final kn.e f50716g;

    public GetEventsBLEConversation(yb0.c eventRepository, kn.e deviceManager) {
        kotlin.jvm.internal.u.j(eventRepository, "eventRepository");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        this.f50715f = eventRepository;
        this.f50716g = deviceManager;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        Long l5;
        try {
            nj.c cVar = new nj.c(x());
            cVar.c((short) 2451, new com.withings.comm.wpp.h[0]);
            cVar.j();
            HashMap hashMap = new HashMap();
            EventV2 eventV2 = new EventV2();
            List<com.withings.comm.wpp.f> B = cVar.B();
            kotlin.jvm.internal.u.i(B, "getResponses(...)");
            ArrayList arrayList = new ArrayList();
            for (com.withings.comm.wpp.f fVar : B) {
                List<com.withings.comm.wpp.h> d11 = fVar.d();
                kotlin.jvm.internal.u.i(d11, "getObjects(...)");
                x.n(d11, arrayList);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.withings.comm.wpp.h hVar = (com.withings.comm.wpp.h) it.next();
                if (hVar instanceof EventV2) {
                    kotlin.jvm.internal.u.g(hVar);
                    eventV2 = hVar;
                } else if (hVar instanceof WppString) {
                    if (hashMap.get(eventV2) == null) {
                        hashMap.put(eventV2, "");
                    }
                    EventV2 eventV22 = (EventV2) eventV2;
                    hashMap.put(eventV22, hashMap.get(eventV22) + ((WppString) hVar).val);
                }
            }
            Set entrySet = hashMap.entrySet();
            kotlin.jvm.internal.u.i(entrySet, "<get-entries>(...)");
            Set<Map.Entry> set = entrySet;
            ArrayList arrayList2 = new ArrayList(x.y(set, 10));
            for (Map.Entry entry : set) {
                String valueOf = String.valueOf(((EventV2) entry.getKey()).type);
                long j5 = ((EventV2) entry.getKey()).epoch;
                Object value = entry.getValue();
                kotlin.jvm.internal.u.i(value, "<get-value>(...)");
                String str = (String) value;
                long j11 = ((EventV2) entry.getKey()).userid;
                Long valueOf2 = Long.valueOf(j11);
                if (j11 != 0) {
                    l5 = valueOf2;
                } else {
                    l5 = null;
                }
                arrayList2.add(new Event(null, valueOf, j5, str, l5, this.f50716g.f(x().g()).getId()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                this.f50715f.b(arrayList2);
            }
        } catch (UnsupportedCommandException unused) {
            x70.b.t(this, "Command CMD_EVENTS_GET_V2 is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
        }
        try {
            nj.c cVar2 = new nj.c(x());
            cVar2.c((short) 2452, new com.withings.comm.wpp.h[0]);
            cVar2.j();
        } catch (UnsupportedCommandException unused2) {
            x70.b.t(this, "Command CMD_EVENTS_DEL is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
        }
    }
}
