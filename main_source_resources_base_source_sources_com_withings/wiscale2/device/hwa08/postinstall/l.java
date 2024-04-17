package com.withings.wiscale2.device.hwa08.postinstall;

import android.content.Intent;
import com.withings.ecg.instruction.EcgInstructionScreenActivity;
import com.withings.wiscale2.device.hwa08.postinstall.Hwa08PostInstallActivity;
/* compiled from: Hwa08PostInstallActivity.kt */
/* loaded from: classes5.dex */
final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hwa08PostInstallActivity f54466a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Hwa08PostInstallActivity hwa08PostInstallActivity) {
        super(0);
        this.f54466a = hwa08PostInstallActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Hwa08PostInstallActivity.b bVar = Hwa08PostInstallActivity.f54404n;
        Hwa08PostInstallActivity hwa08PostInstallActivity = this.f54466a;
        hwa08PostInstallActivity.getClass();
        hwa08PostInstallActivity.startActivityForResult(new Intent(hwa08PostInstallActivity, EcgInstructionScreenActivity.class), 22);
        return nm0.y.f85009a;
    }
}
