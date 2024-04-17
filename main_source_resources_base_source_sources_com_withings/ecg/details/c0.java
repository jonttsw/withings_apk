package com.withings.ecg.details;

import com.withings.note.model.NoteGroup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgDetailsViewModel$deleteMeasureGroup$1", f = "EcgDetailsFragment.kt", l = {729}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38149a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b0 f38150b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NoteGroup f38151c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var, NoteGroup noteGroup, qm0.d<? super c0> dVar) {
        super(2, dVar);
        this.f38150b = b0Var;
        this.f38151c = noteGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c0(this.f38150b, this.f38151c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.k kVar;
        fy.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38149a;
        b0 b0Var = this.f38150b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            kVar = b0Var.f38100d;
            long remoteMeasureGroupId = this.f38151c.getRemoteMeasureGroupId();
            this.f38149a = 1;
            obj = kVar.b(remoteMeasureGroupId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ky.d dVar2 = (ky.d) obj;
        if (dVar2 != null) {
            dVar = b0Var.f38101e;
            dVar.a(dVar2);
            return nm0.y.f85009a;
        }
        return null;
    }
}
