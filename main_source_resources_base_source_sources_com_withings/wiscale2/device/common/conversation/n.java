package com.withings.wiscale2.device.common.conversation;

import android.content.Context;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.user.User;
import com.withings.wiscale2.device.SyncReminderNotificationManager;
import com.withings.wiscale2.device.common.conversation.SportVasistasSyncConversation;
import com.withings.wiscale2.device.common.conversation.VasistasSyncConversation;
import java.util.List;
import kotlin.collections.x;
/* compiled from: SyncConversation.kt */
/* loaded from: classes5.dex */
public final class n implements k {

    /* renamed from: a  reason: collision with root package name */
    private final SyncReminderNotificationManager f50837a;

    /* renamed from: b  reason: collision with root package name */
    private xb0.k f50838b;

    /* renamed from: c  reason: collision with root package name */
    private Device f50839c;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.withings.wiscale2.device.SyncReminderNotificationManager] */
    public n() {
        kotlin.jvm.internal.u.i(m70.i.b(), "get(...)");
        this.f50837a = new Object();
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final List<SportVasistasSyncConversation.a> a(WppDeviceConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        return x.V(new Object());
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final void b(WppDeviceConversation conversation, float f11) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        xb0.k kVar = this.f50838b;
        if (kVar != null) {
            kVar.b(f11);
        } else {
            kotlin.jvm.internal.u.s("syncNotifier");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final void c(WppDeviceConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        Context r7 = conversation.r();
        Device device = this.f50839c;
        if (device != null) {
            long id2 = device.getId();
            this.f50837a.getClass();
            SyncReminderNotificationManager.a(r7, id2);
            return;
        }
        kotlin.jvm.internal.u.s("device");
        throw null;
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final List<VasistasSyncConversation.a> d(WppDeviceConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        return x.V(new m());
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final List<VasistasSyncConversation.a> e(WppDeviceConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        return x.V(new m());
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final List<VasistasSyncConversation.a> f(WppDeviceConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        return x.V(new m());
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final void g(WppDeviceConversation conversation, Device device, User user) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f50839c = device;
        Context r7 = conversation.r();
        kotlin.jvm.internal.u.i(r7, "getContext(...)");
        xb0.k kVar = new xb0.k(r7, device);
        this.f50838b = kVar;
        kVar.c();
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final List<VasistasSyncConversation.a> h(WppDeviceConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        return x.V(new m());
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final List<VasistasSyncConversation.a> i(WppDeviceConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        return x.V(new m());
    }

    @Override // com.withings.wiscale2.device.common.conversation.k
    public final void j(WppDeviceConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        xb0.k kVar = this.f50838b;
        if (kVar != null) {
            kVar.a();
        } else {
            kotlin.jvm.internal.u.s("syncNotifier");
            throw null;
        }
    }
}
