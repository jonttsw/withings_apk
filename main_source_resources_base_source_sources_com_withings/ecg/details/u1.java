package com.withings.ecg.details;

import com.withings.ecg.details.t1;
import com.withings.note.model.NoteRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgListViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgListViewModel$initSelectedEcg$2", f = "EcgListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class u1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends t1.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t1 f38342a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(t1 t1Var, qm0.d<? super u1> dVar) {
        super(2, dVar);
        this.f38342a = t1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new u1(this.f38342a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends t1.a>> dVar) {
        return ((u1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Long l5;
        ArrayList arrayList;
        Long l6;
        ArrayList arrayList2;
        Long l11;
        NoteRepository noteRepository;
        NoteRepository noteRepository2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        t1 t1Var = this.f38342a;
        l5 = t1Var.f38312b;
        if (l5 != null) {
            long longValue = l5.longValue();
            noteRepository2 = t1Var.f38316f;
            arrayList = t1.g0(t1Var, noteRepository2.getNoteGroupForMeasureGroupWsId(longValue));
        } else {
            arrayList = null;
        }
        l6 = t1Var.f38313c;
        if (l6 != null) {
            long longValue2 = l6.longValue();
            noteRepository = t1Var.f38316f;
            arrayList2 = t1.g0(t1Var, noteRepository.getNoteGroupForMeasureGroupDbId(longValue2));
        } else {
            arrayList2 = null;
        }
        l11 = t1Var.f38311a;
        if (l11 != null) {
            return kotlin.collections.x.V(new t1.a(null, new Long(l11.longValue())));
        }
        if (arrayList == null) {
            return arrayList2;
        }
        return arrayList;
    }
}
