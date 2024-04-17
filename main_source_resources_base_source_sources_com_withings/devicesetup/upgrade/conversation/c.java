package com.withings.devicesetup.upgrade.conversation;

import nj.d;
/* compiled from: NetUpgradeConversation.java */
/* loaded from: classes3.dex */
final class c implements d.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NetUpgradeConversation f37968a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(NetUpgradeConversation netUpgradeConversation) {
        this.f37968a = netUpgradeConversation;
    }

    @Override // nj.d.a
    public final void a(float f11) {
        eq.c cVar;
        NetUpgradeConversation netUpgradeConversation = this.f37968a;
        x70.b.s(this, netUpgradeConversation.v(), "Upgrade of %s progress : %d%%", netUpgradeConversation.x(), Integer.valueOf((int) (100.0f * f11)));
        netUpgradeConversation.f37962i = f11;
        cVar = netUpgradeConversation.f37960g;
        cVar.g3(f11);
    }

    @Override // nj.d.a
    public final void b(short s11) {
        this.f37968a.f37963j = s11;
    }
}
