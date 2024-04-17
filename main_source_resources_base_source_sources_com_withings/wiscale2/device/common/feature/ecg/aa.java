package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.core.webcontent.HMWebActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class aa extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51184a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(1);
        this.f51184a = wBS08EcgActivationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String url = str;
        kotlin.jvm.internal.u.j(url, "url");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51184a;
        wBS08EcgActivationActivity.startActivity(aVar.c(wBS08EcgActivationActivity, null, url));
        return nm0.y.f85009a;
    }
}
