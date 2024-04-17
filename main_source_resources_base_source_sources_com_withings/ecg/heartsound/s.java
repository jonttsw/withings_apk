package com.withings.ecg.heartsound;

import com.withings.note.model.NoteGroup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeartSoundDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.heartsound.HeartSoundDetailsViewModel$deleteMeasureGroup$1", f = "HeartSoundDetailsFragment.kt", l = {495}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class s extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38524a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r f38525b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NoteGroup f38526c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, NoteGroup noteGroup, qm0.d<? super s> dVar) {
        super(2, dVar);
        this.f38525b = rVar;
        this.f38526c = noteGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new s(this.f38525b, this.f38526c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((s) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.k kVar;
        fy.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38524a;
        r rVar = this.f38525b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            kVar = rVar.f38507c;
            long remoteMeasureGroupId = this.f38526c.getRemoteMeasureGroupId();
            this.f38524a = 1;
            obj = kVar.b(remoteMeasureGroupId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ky.d dVar2 = (ky.d) obj;
        if (dVar2 != null) {
            dVar = rVar.f38508d;
            dVar.a(dVar2);
            return nm0.y.f85009a;
        }
        return null;
    }
}
