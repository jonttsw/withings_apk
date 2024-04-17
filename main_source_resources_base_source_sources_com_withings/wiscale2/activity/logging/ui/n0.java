package com.withings.wiscale2.activity.logging.ui;

import com.withings.vasistas.model.Vasistas;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditWorkoutViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.logging.ui.EditWorkoutViewModel$computeCalories$1", f = "EditWorkoutViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class n0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f48420a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<Vasistas> f48421b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m0 f48422c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f48423d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f48424e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(List<Vasistas> list, m0 m0Var, int i11, long j5, qm0.d<? super n0> dVar) {
        super(2, dVar);
        this.f48421b = list;
        this.f48422c = m0Var;
        this.f48423d = i11;
        this.f48424e = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        n0 n0Var = new n0(this.f48421b, this.f48422c, this.f48423d, this.f48424e, dVar);
        n0Var.f48420a = obj;
        return n0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((n0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ba0.a aVar;
        ba0.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f48420a;
        int i11 = 0;
        long j5 = this.f48424e;
        int i12 = this.f48423d;
        m0 m0Var = this.f48422c;
        List<Vasistas> list = this.f48421b;
        if (list != null) {
            aVar2 = m0Var.M;
            if (aVar2 != null) {
                i11 = aVar2.b(i12, list, j5);
            }
        } else {
            aVar = m0Var.M;
            if (aVar != null) {
                i11 = aVar.a(i12, j5);
            }
        }
        m0.G0(m0Var, i11);
        m0Var.n1().postValue(Boolean.FALSE);
        return nm0.y.f85009a;
    }
}
