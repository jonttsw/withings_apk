package com.withings.wiscale2.device.hwa03bs.ui;

import com.withings.wiscale2.MainActivity;
/* compiled from: Hwa03PostInstallActivity.kt */
/* loaded from: classes5.dex */
final class m extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa03PostInstallActivity f54269a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Hwa03PostInstallActivity hwa03PostInstallActivity) {
        super(0);
        this.f54269a = hwa03PostInstallActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        fn0.k<Object>[] kVarArr = Hwa03PostInstallActivity.f54237l;
        Hwa03PostInstallActivity hwa03PostInstallActivity = this.f54269a;
        hwa03PostInstallActivity.getClass();
        MainActivity.f47950r.getClass();
        hwa03PostInstallActivity.startActivity(MainActivity.a.c());
        hwa03PostInstallActivity.finish();
        return nm0.y.f85009a;
    }
}
