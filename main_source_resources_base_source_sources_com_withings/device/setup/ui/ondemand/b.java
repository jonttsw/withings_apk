package com.withings.device.setup.ui.ondemand;

import androidx.work.f;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnDemandDeviceSetup.kt */
/* loaded from: classes3.dex */
public final class b extends w implements l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ OnDemandDeviceSetupInstallWorker f37607a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OnDemandDeviceSetupInstallWorker onDemandDeviceSetupInstallWorker) {
        super(1);
        this.f37607a = onDemandDeviceSetupInstallWorker;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        int intValue = num.intValue();
        f.a aVar = new f.a();
        aVar.e(intValue, "WorkProgressData");
        this.f37607a.setProgressAsync(aVar.a());
        return y.f85009a;
    }
}
