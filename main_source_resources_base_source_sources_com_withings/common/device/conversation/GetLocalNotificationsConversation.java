package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.LocalNotification;
import com.withings.comm.wpp.h;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: GetLocalNotificationsConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/common/device/conversation/GetLocalNotificationsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetLocalNotificationsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final a f35138f;

    /* compiled from: GetLocalNotificationsConversation.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void j(ArrayList arrayList);
    }

    public GetLocalNotificationsConversation(a delegate) {
        u.j(delegate, "delegate");
        this.f35138f = delegate;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        ?? aVar = new nj.a(x());
        aVar.c((short) 2449, new h[0]);
        this.f35138f.j(aVar.z(LocalNotification.class));
    }
}
