package com.withings.ecg.live;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.live.EcgViewModel$isInSessionPatient$1", f = "LiveEcgActivity.kt", l = {400}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38689a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f38690b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Long f38691c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f38692d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar, Long l5, String str, qm0.d<? super k> dVar) {
        super(2, dVar);
        this.f38690b = cVar;
        this.f38691c = l5;
        this.f38692d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k(this.f38690b, this.f38691c, this.f38692d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pi.i iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38689a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            iVar = this.f38690b.f38632e;
            long longValue = this.f38691c.longValue();
            this.f38689a = 1;
            obj = iVar.a(longValue, this.f38692d);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
