package com.withings.programs.ui.activity;

import android.content.Context;
/* compiled from: Hilt_ProgramOverviewActivity.java */
/* loaded from: classes4.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_ProgramOverviewActivity f43760a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Hilt_ProgramOverviewActivity hilt_ProgramOverviewActivity) {
        this.f43760a = hilt_ProgramOverviewActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f43760a.inject();
    }
}
