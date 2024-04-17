package com.withings.wiscale2.device.common.tutorial.navigation;

import com.withings.wiscale2.device.common.tutorial.navigation.NavigationTutorialActivity;
import dq.u;
/* compiled from: NavigationTutorialActivity.kt */
/* loaded from: classes5.dex */
public final class c implements u {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NavigationTutorialActivity f53648a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(NavigationTutorialActivity navigationTutorialActivity) {
        this.f53648a = navigationTutorialActivity;
    }

    @Override // dq.u
    public final void p() {
        NavigationTutorialActivity.a aVar;
        aVar = this.f53648a.f53632h;
        if (aVar != null) {
            aVar.m0();
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }
}
