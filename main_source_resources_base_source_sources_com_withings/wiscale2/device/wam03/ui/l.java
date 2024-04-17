package com.withings.wiscale2.device.wam03.ui;

import com.withings.wiscale2.MainActivity;
import com.withings.wiscale2.device.wam03.ui.Wam03PostInstallActivity;
/* compiled from: Wam03PostInstallActivity.kt */
/* loaded from: classes5.dex */
final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wam03PostInstallActivity f54999a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Wam03PostInstallActivity wam03PostInstallActivity) {
        super(0);
        this.f54999a = wam03PostInstallActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Wam03PostInstallActivity.a aVar = Wam03PostInstallActivity.f54967l;
        Wam03PostInstallActivity wam03PostInstallActivity = this.f54999a;
        wam03PostInstallActivity.getClass();
        MainActivity.f47950r.getClass();
        wam03PostInstallActivity.startActivity(MainActivity.a.c());
        wam03PostInstallActivity.finish();
        return nm0.y.f85009a;
    }
}
