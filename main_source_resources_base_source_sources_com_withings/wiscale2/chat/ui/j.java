package com.withings.wiscale2.chat.ui;

import android.content.Context;
/* compiled from: Hilt_ChatActivity.java */
/* loaded from: classes4.dex */
final class j implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ChatActivity f50410a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Hilt_ChatActivity hilt_ChatActivity) {
        this.f50410a = hilt_ChatActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f50410a.inject();
    }
}
