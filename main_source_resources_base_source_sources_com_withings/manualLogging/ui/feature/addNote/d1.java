package com.withings.manualLogging.ui.feature.addNote;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddNotesViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.AddNotesViewModel$allSymptoms$1", f = "AddNotesViewModel.kt", l = {71, 71}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class d1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends fx.f>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41447a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f41448b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1 f41449c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(k1 k1Var, qm0.d<? super d1> dVar) {
        super(2, dVar);
        this.f41449c = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        d1 d1Var = new d1(this.f41449c, dVar);
        d1Var.f41448b = obj;
        return d1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends fx.f>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((d1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        hx.j jVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41447a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f41448b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f41448b;
            k1 k1Var = this.f41449c;
            jVar = k1Var.f41483d;
            long j5 = k1Var.f41480a;
            this.f41448b = h0Var;
            this.f41447a = 1;
            obj = jVar.a(j5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f41448b = null;
        this.f41447a = 2;
        if (h0Var.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
