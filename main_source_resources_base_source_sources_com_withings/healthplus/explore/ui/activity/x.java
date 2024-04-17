package com.withings.healthplus.explore.ui.activity;

import android.content.Intent;
import gm.b;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
public final class x implements b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40341a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(ExploreTabActivity exploreTabActivity) {
        this.f40341a = exploreTabActivity;
    }

    @Override // gm.b.a
    public final void q(Intent intent, String str) {
        kotlin.jvm.internal.u.j(intent, "intent");
        this.f40341a.startActivity(intent);
    }
}
