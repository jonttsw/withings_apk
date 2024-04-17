package com.withings.ecg.details;

import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgDetailsViewModel$deleteNoteGroup$1", f = "EcgDetailsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NoteGroup f38170a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b0 f38171b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b0 b0Var, NoteGroup noteGroup, qm0.d dVar) {
        super(2, dVar);
        this.f38170a = noteGroup;
        this.f38171b = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d0(this.f38171b, this.f38170a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NoteRepository noteRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        NoteGroup noteGroup = this.f38170a;
        noteGroup.setDeleted(true);
        noteGroup.setSynced(false);
        noteRepository = this.f38171b.f38099c;
        noteRepository.update(noteGroup);
        return nm0.y.f85009a;
    }
}
