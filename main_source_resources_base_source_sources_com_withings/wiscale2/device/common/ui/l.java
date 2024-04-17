package com.withings.wiscale2.device.common.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseDeviceInfoFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.BaseDeviceInfoFragment$onSyncDisabledStateChanged$1", f = "BaseDeviceInfoFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f54015a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, qm0.d<? super l> dVar) {
        super(2, dVar);
        this.f54015a = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l(this.f54015a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fl.e eVar;
        fl.e eVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        h hVar = this.f54015a;
        hVar.G1().t(hVar.F1());
        if (hVar.F1().isSyncDisabled()) {
            eVar2 = fl.e.f67637h;
            if (eVar2 != null) {
                eVar2.j(hVar.F1());
            } else {
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
        } else {
            eVar = fl.e.f67637h;
            if (eVar != null) {
                eVar.h(hVar.F1());
            } else {
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
