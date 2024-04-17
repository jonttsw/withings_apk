package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class j2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51440a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f51441b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f51442c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f51443d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f51444e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(EcgActivationActivity ecgActivationActivity, androidx.compose.ui.e eVar, int i11, int i12, int i13) {
        super(2);
        this.f51440a = ecgActivationActivity;
        this.f51441b = eVar;
        this.f51442c = i11;
        this.f51443d = i12;
        this.f51444e = i13;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f51444e | 1);
        int i11 = this.f51443d;
        this.f51440a.A3(this.f51442c, i11, g11, aVar, this.f51441b);
        return nm0.y.f85009a;
    }
}
