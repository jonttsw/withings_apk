package com.withings.manualLogging.ui.feature.addNote;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddNotesViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.AddNotesViewModel$oldNoteGroup$1", f = "AddNotesViewModel.kt", l = {57, 56}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class i1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<fx.e>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41469a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f41470b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1 f41471c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, qm0.d<? super i1> dVar) {
        super(2, dVar);
        this.f41471c = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        i1 i1Var = new i1(this.f41471c, dVar);
        i1Var.f41470b = obj;
        return i1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<fx.e> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((i1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        hx.i iVar;
        long j5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41469a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f41470b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f41470b;
            k1 k1Var = this.f41471c;
            iVar = k1Var.f41484e;
            j5 = k1Var.f41481b;
            long j11 = k1Var.f41480a;
            this.f41470b = h0Var;
            this.f41469a = 1;
            obj = iVar.b(j11, j5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f41470b = null;
        this.f41469a = 2;
        if (h0Var.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
