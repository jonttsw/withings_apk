package com.withings.healthplus.congrats.ui.activity;

import android.content.Context;
/* compiled from: Hilt_CompletionActivity.java */
/* loaded from: classes3.dex */
final class f implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_CompletionActivity f40093a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Hilt_CompletionActivity hilt_CompletionActivity) {
        this.f40093a = hilt_CompletionActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f40093a.inject();
    }
}
