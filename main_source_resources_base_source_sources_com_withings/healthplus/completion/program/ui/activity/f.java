package com.withings.healthplus.completion.program.ui.activity;

import android.content.Context;
/* compiled from: Hilt_EndProgramActivity.java */
/* loaded from: classes3.dex */
final class f implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_EndProgramActivity f40047a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Hilt_EndProgramActivity hilt_EndProgramActivity) {
        this.f40047a = hilt_EndProgramActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f40047a.inject();
    }
}
