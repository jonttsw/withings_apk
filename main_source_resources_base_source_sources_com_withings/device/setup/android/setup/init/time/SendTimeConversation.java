package com.withings.device.setup.android.setup.init.time;

import ah.t;
import cj.b;
import com.google.gson.JsonObject;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.Traces;
import com.withings.comm.trace.e;
import com.withings.comm.wpp.generated.object.TimeSet;
import com.withings.comm.wpp.generated.object.TimeSetReply;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.a;
/* compiled from: SendTimeConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/time/SendTimeConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendTimeConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37456f;

    public SendTimeConversation(e traceManager) {
        u.j(traceManager, "traceManager");
        this.f37456f = traceManager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        ?? aVar = new a(x());
        TimeSet t11 = t.t();
        aVar.c((short) 1281, t11);
        TimeSetReply timeSetReply = (TimeSetReply) aVar.A(TimeSetReply.class);
        if (timeSetReply != null) {
            b x11 = x();
            Long valueOf = Long.valueOf(t11.utc);
            int i11 = t11.gmtOffset;
            int i12 = timeSetReply.drift;
            JsonObject a11 = Traces.a("time_set");
            a11.addProperty("utc_time", valueOf.toString());
            a11.addProperty("gmt_offset", Integer.valueOf(i11));
            a11.addProperty("drift", Integer.valueOf(i12));
            this.f37456f.d(x11, a11);
        }
    }
}
