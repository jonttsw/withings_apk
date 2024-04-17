package com.withings.wiscale2.settings;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.SettingsActivity$onCreate$1$1$5", f = "SettingsActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class r4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f60287a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(r8.n nVar, qm0.d<? super r4> dVar) {
        super(2, dVar);
        this.f60287a = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new r4(this.f60287a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((r4) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        r8.n nVar = this.f60287a;
        androidx.navigation.e.L(nVar, "multi-factor", null, 6);
        androidx.navigation.e.L(nVar, "recovery_code", null, 6);
        return nm0.y.f85009a;
    }
}
