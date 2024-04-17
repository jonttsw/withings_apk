package com.withings.devicesetup.network.conversation;

import com.withings.comm.wpp.generated.object.WifiApScan;
import com.withings.comm.wpp.h;
import com.withings.devicesetup.network.conversation.WifiSetupConversation;
import nj.c;
/* compiled from: WifiSetupConversation.java */
/* loaded from: classes3.dex */
final class a implements c.a<WifiApScan> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WifiSetupConversation f37723a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(WifiSetupConversation wifiSetupConversation) {
        this.f37723a = wifiSetupConversation;
    }

    @Override // nj.c.b
    public final void a(h hVar) {
        WifiSetupConversation.a aVar;
        String str;
        WifiApScan wifiApScan = (WifiApScan) hVar;
        WifiSetupConversation wifiSetupConversation = this.f37723a;
        aVar = wifiSetupConversation.f37718f;
        String str2 = wifiApScan.ssid;
        str = wifiSetupConversation.f37719g;
        aVar.x0(wifiSetupConversation, wifiApScan, str2.equals(str));
    }
}
