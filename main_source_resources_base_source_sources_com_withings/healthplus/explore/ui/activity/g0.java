package com.withings.healthplus.explore.ui.activity;

import android.content.Intent;
import gm.b;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
public final class g0 implements b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40312a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(ExploreTabActivity exploreTabActivity) {
        this.f40312a = exploreTabActivity;
    }

    @Override // gm.b.a
    public final void q(Intent intent, String str) {
        kotlin.jvm.internal.u.j(intent, "intent");
        this.f40312a.startActivity(intent);
    }
}
