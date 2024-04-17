package com.withings.wiscale2.device.common.notifications.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationSettingsFragment$onCreateView$1$1$1", f = "DeviceNotificationSettingsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class p0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1 f52995a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(f1 f1Var, qm0.d<? super p0> dVar) {
        super(2, dVar);
        this.f52995a = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new p0(this.f52995a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((p0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        f1 f1Var = this.f52995a;
        f1Var.getClass();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(f1Var), Dispatchers.getIO(), null, new b1(f1Var, null), 2, null);
        return nm0.y.f85009a;
    }
}
