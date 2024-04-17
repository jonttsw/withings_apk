package com.withings.wiscale2.device.common.feature.afib;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AfibActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.afib.AfibActivationViewModel$setNotification$1", f = "AfibActivationActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f51018a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f51019b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, boolean z5, qm0.d<? super g> dVar) {
        super(2, dVar);
        this.f51018a = hVar;
        this.f51019b = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new g(this.f51018a, this.f51019b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zo.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        aVar = this.f51018a.f51022c;
        aVar.y(this.f51019b, 1);
        return y.f85009a;
    }
}
