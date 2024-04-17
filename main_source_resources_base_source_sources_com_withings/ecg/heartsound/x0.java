package com.withings.ecg.heartsound;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SignalCacheDisplayer.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.heartsound.SignalCacheDisplayer$Companion$clear$1", f = "SignalCacheDisplayer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class x0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38557a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f38558b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context, qm0.d<? super x0> dVar) {
        super(2, dVar);
        this.f38558b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x0(this.f38558b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((x0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38557a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f38557a = 1;
            Object b10 = pm.j.f91494g.b(this.f38558b, "timeline-cache", this);
            if (b10 != CoroutineSingletons.f76214a) {
                b10 = nm0.y.f85009a;
            }
            if (b10 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
