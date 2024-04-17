package com.withings.device.setup.ui.select.viewmodel;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.Map;
import kotlin.coroutines.jvm.internal.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SetupChooseDeviceViewModel.kt */
@e(c = "com.withings.device.setup.ui.select.viewmodel.SetupChooseDeviceViewModel", f = "SetupChooseDeviceViewModel.kt", l = {88, 91, ConstantsWs.MEASURE_TYPE_HORIZONTAL_RADIUS, 97}, m = "loadModule")
/* loaded from: classes3.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    SetupChooseDeviceViewModel f37667a;

    /* renamed from: b  reason: collision with root package name */
    rp.b f37668b;

    /* renamed from: c  reason: collision with root package name */
    Map f37669c;

    /* renamed from: d  reason: collision with root package name */
    Map.Entry f37670d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f37671e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ SetupChooseDeviceViewModel f37672f;

    /* renamed from: g  reason: collision with root package name */
    int f37673g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SetupChooseDeviceViewModel setupChooseDeviceViewModel, qm0.d<? super c> dVar) {
        super(dVar);
        this.f37672f = setupChooseDeviceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37671e = obj;
        this.f37673g |= Integer.MIN_VALUE;
        return SetupChooseDeviceViewModel.j0(this.f37672f, null, this);
    }
}
