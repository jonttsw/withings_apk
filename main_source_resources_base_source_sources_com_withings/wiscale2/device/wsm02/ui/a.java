package com.withings.wiscale2.device.wsm02.ui;

import com.withings.device.Device;
import com.withings.devicesetup.ui.SetupActivity;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wsm02InstallSetup.kt */
@e(c = "com.withings.wiscale2.device.wsm02.ui.Wsm02InstallSetup", f = "Wsm02InstallSetup.kt", l = {104}, m = "getPostInstallIntent")
/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    Wsm02InstallSetup f56011a;

    /* renamed from: b  reason: collision with root package name */
    SetupActivity f56012b;

    /* renamed from: c  reason: collision with root package name */
    Device f56013c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f56014d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Wsm02InstallSetup f56015e;

    /* renamed from: f  reason: collision with root package name */
    int f56016f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Wsm02InstallSetup wsm02InstallSetup, d<? super a> dVar) {
        super(dVar);
        this.f56015e = wsm02InstallSetup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56014d = obj;
        this.f56016f |= Integer.MIN_VALUE;
        return Wsm02InstallSetup.o(this.f56015e, null, null, this);
    }
}
