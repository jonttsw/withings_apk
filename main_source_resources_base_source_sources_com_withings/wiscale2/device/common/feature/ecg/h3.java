package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class h3 extends kotlin.jvm.internal.w implements ym0.l<Intent, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51394a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f51394a = ecgActivationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Intent intent) {
        Intent intent2 = intent;
        if (intent2 != null) {
            this.f51394a.startActivity(intent2);
        }
        return nm0.y.f85009a;
    }
}
