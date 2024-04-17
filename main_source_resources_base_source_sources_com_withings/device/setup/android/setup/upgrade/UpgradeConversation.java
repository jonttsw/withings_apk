package com.withings.device.setup.android.setup.upgrade;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import java.io.IOException;
import jo.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import ln.g;
/* compiled from: UpgradeConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/upgrade/UpgradeConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class UpgradeConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final a f37475f;

    /* renamed from: g  reason: collision with root package name */
    private final ln.a f37476g;

    public UpgradeConversation(a mutableSetupStateRepository, ln.a aVar) {
        u.j(mutableSetupStateRepository, "mutableSetupStateRepository");
        this.f37475f = mutableSetupStateRepository;
        this.f37476g = aVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        boolean z5;
        BluetoothUpgradeConversation bluetoothUpgradeConversation;
        ln.a aVar = this.f37476g;
        u.j(aVar, "<this>");
        if (aVar instanceof g) {
            g gVar = (g) aVar;
            z5 = true;
        } else {
            z5 = false;
        }
        a aVar2 = this.f37475f;
        if (z5) {
            bluetoothUpgradeConversation = new BluetoothUpgradeConversation(aVar2);
        } else {
            bluetoothUpgradeConversation = new BluetoothUpgradeConversation(aVar2);
        }
        try {
            E(bluetoothUpgradeConversation);
        } catch (IOException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new IOException("Unable to upgrade the device", e12);
        }
    }
}
