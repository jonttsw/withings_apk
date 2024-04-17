package com.withings.ecg.details;

import com.withings.ecg.graph.EcgEntry;
import com.withings.library.ecg.EcgLeadType;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: EcgDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgDetailsViewModel$graphEntriesLiveData$1$2$1", f = "EcgDetailsFragment.kt", l = {616}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends EcgEntry>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38230a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38231b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Map<EcgLeadType, List<EcgEntry>> f38232c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Map<EcgLeadType, List<EcgEntry>> map, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f38232c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        h0 h0Var = new h0(this.f38232c, dVar);
        h0Var.f38231b = obj;
        return h0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends EcgEntry>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((h0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38230a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f38231b;
            List<EcgEntry> list = this.f38232c.get(EcgLeadType.DI);
            if (list == null) {
                list = kotlin.collections.i0.f76187a;
            }
            this.f38230a = 1;
            if (h0Var.emit(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
