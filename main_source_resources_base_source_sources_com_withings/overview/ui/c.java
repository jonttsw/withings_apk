package com.withings.overview.ui;

import android.content.Intent;
import gm.b;
import kotlin.jvm.internal.u;
/* compiled from: StartTrackingActivity.kt */
/* loaded from: classes4.dex */
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StartTrackingActivity f43355a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(StartTrackingActivity startTrackingActivity) {
        this.f43355a = startTrackingActivity;
    }

    @Override // gm.b.a
    public final void q(Intent intent, String str) {
        androidx.activity.result.b bVar;
        u.j(intent, "intent");
        bVar = this.f43355a.f43346g;
        bVar.a(intent);
    }
}
