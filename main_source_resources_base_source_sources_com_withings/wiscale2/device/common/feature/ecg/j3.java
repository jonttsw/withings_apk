package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.core.webcontent.HMWebActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class j3 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51445a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f51445a = ecgActivationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String url = str;
        kotlin.jvm.internal.u.j(url, "url");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        EcgActivationActivity ecgActivationActivity = this.f51445a;
        ecgActivationActivity.startActivity(aVar.c(ecgActivationActivity, null, url));
        return nm0.y.f85009a;
    }
}
