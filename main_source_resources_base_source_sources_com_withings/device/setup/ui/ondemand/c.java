package com.withings.device.setup.ui.ondemand;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnDemandDeviceSetup.kt */
@e(c = "com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker", f = "OnDemandDeviceSetup.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_FEET, ConstantsWs.MEASURE_TYPE_NHS_FEET}, m = "uninstallModule")
/* loaded from: classes3.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    OnDemandDeviceSetupUninstallWorker f37608a;

    /* renamed from: b  reason: collision with root package name */
    OnDemandDeviceSetupUninstallWorker f37609b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f37610c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ OnDemandDeviceSetupUninstallWorker f37611d;

    /* renamed from: e  reason: collision with root package name */
    int f37612e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OnDemandDeviceSetupUninstallWorker onDemandDeviceSetupUninstallWorker, d<? super c> dVar) {
        super(dVar);
        this.f37611d = onDemandDeviceSetupUninstallWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37610c = obj;
        this.f37612e |= Integer.MIN_VALUE;
        return OnDemandDeviceSetupUninstallWorker.t(this.f37611d, this);
    }
}
