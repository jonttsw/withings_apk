package com.withings.wiscale2.measure.goal.ui;

import android.content.Context;
/* compiled from: Hilt_WeightGoalActivity.java */
/* loaded from: classes5.dex */
final class a implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f58416a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        this.f58416a = bVar;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f58416a.inject();
    }
}
