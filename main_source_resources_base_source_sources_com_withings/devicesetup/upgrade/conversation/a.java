package com.withings.devicesetup.upgrade.conversation;

import com.withings.webservices.legacy.common.ProgressDownload;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BluetoothUpgradeConversation.java */
/* loaded from: classes3.dex */
public final class a implements ProgressDownload.Listener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BluetoothUpgradeConversation f37966a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(BluetoothUpgradeConversation bluetoothUpgradeConversation) {
        this.f37966a = bluetoothUpgradeConversation;
    }

    @Override // com.withings.webservices.legacy.common.ProgressDownload.Listener
    public final void onDownloadProgress(long j5, long j11, boolean z5) {
        fq.a aVar;
        aVar = this.f37966a.f37949f;
        aVar.B(((float) j5) / ((float) j11));
    }
}
