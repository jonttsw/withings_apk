package com.withings.device.setup.ui.ondemand;

import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnDemandDeviceSetup.kt */
@e(c = "com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker", f = "OnDemandDeviceSetup.kt", l = {113, 113, 114}, m = "loadModule")
/* loaded from: classes3.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    OnDemandDeviceSetupInstallWorker f37602a;

    /* renamed from: b  reason: collision with root package name */
    OnDemandDeviceSetupInstallWorker f37603b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f37604c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ OnDemandDeviceSetupInstallWorker f37605d;

    /* renamed from: e  reason: collision with root package name */
    int f37606e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OnDemandDeviceSetupInstallWorker onDemandDeviceSetupInstallWorker, d<? super a> dVar) {
        super(dVar);
        this.f37605d = onDemandDeviceSetupInstallWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37604c = obj;
        this.f37606e |= Integer.MIN_VALUE;
        return OnDemandDeviceSetupInstallWorker.t(this.f37605d, this);
    }
}
