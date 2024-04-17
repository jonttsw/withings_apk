package com.withings.device.setup.android.setup.init.notification;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.LocalNotification;
import com.withings.comm.wpp.generated.object.Null;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nj.a;
/* compiled from: SetLocalNotificationsConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/notification/SetLocalNotificationsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetLocalNotificationsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final List<LocalNotification> f37451f;

    /* JADX WARN: Multi-variable type inference failed */
    public SetLocalNotificationsConversation(List<? extends LocalNotification> localNotifications) {
        u.j(localNotifications, "localNotifications");
        this.f37451f = localNotifications;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        a aVar = new a(x());
        aVar.b(x.m0(new Null(), this.f37451f), (short) 2448);
        aVar.j();
    }
}
