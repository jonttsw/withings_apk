package com.withings.comm.trace;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TraceFilesRepository.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.comm.trace.TraceFilesRepositoryKt$addBlocking$1", f = "TraceFilesRepository.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33209a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ij.e f33210b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u70.i f33211c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f33212d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ b f33213e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ij.e eVar, u70.i iVar, int i11, b bVar, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f33210b = eVar;
        this.f33211c = iVar;
        this.f33212d = i11;
        this.f33213e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f33210b, this.f33211c, this.f33212d, this.f33213e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f33209a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            this.f33209a = 1;
            if (this.f33210b.d(this.f33211c, this.f33212d, this.f33213e, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
