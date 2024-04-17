package com.withings.manualLogging.ui.feature.addNote;

import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddNotesViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.AddNotesViewModel$userInfo$1", f = "AddNotesViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class n1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<nm0.j<? extends User, ? extends Boolean>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41534a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f41535b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1 f41536c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(k1 k1Var, qm0.d<? super n1> dVar) {
        super(2, dVar);
        this.f41536c = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        n1 n1Var = new n1(this.f41536c, dVar);
        n1Var.f41535b = obj;
        return n1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<nm0.j<? extends User, ? extends Boolean>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((n1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        m70.i iVar;
        m70.i iVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41534a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            k1 k1Var = this.f41536c;
            iVar = k1Var.f41486g;
            User i12 = iVar.i(k1Var.f41480a);
            iVar2 = k1Var.f41486g;
            nm0.j jVar = new nm0.j(i12, Boolean.valueOf(iVar2.k(i12)));
            this.f41534a = 1;
            if (((androidx.lifecycle.h0) this.f41535b).emit(jVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
