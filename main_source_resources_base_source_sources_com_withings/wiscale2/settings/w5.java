package com.withings.wiscale2.settings;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: TracesLogsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.settings.TracesLogsViewModel$delete$1", f = "TracesLogsActivity.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class w5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60367a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TracesLogsViewModel f60368b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(TracesLogsViewModel tracesLogsViewModel, qm0.d<? super w5> dVar) {
        super(2, dVar);
        this.f60368b = tracesLogsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new w5(this.f60368b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((w5) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.f76214a;
        int i11 = this.f60367a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            v5 v5Var = new v5(this.f60368b.g0());
            this.f60367a = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new t5(v5Var, null), this);
            if (withContext != obj2) {
                withContext = nm0.y.f85009a;
            }
            if (withContext == obj2) {
                return obj2;
            }
        }
        return nm0.y.f85009a;
    }
}
