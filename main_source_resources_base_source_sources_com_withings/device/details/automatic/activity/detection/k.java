package com.withings.device.details.automatic.activity.detection;

import android.content.Intent;
/* compiled from: AutomaticActivityDetection.kt */
/* loaded from: classes3.dex */
final class k extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AutomaticActivityDetection f36718a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Intent f36719b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AutomaticActivityDetection automaticActivityDetection, Intent intent) {
        super(0);
        this.f36718a = automaticActivityDetection;
        this.f36719b = intent;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f36718a.startActivity(this.f36719b);
        return nm0.y.f85009a;
    }
}
