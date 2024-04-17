package com.withings.tutorials.ui.screens.explanations;

import com.withings.tutorials.core.model.ExplanationsType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExplanationsViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.explanations.ExplanationsViewModel$setExplanationAsSeen$1", f = "ExplanationsViewModel.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class y extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45291a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExplanationsViewModel f45292b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ExplanationsType f45293c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f45294d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ExplanationsViewModel explanationsViewModel, ExplanationsType explanationsType, long j5, qm0.d<? super y> dVar) {
        super(2, dVar);
        this.f45292b = explanationsViewModel;
        this.f45293c = explanationsType;
        this.f45294d = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y(this.f45292b, this.f45293c, this.f45294d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((y) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        p60.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f45291a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            cVar = this.f45292b.f45094a;
            Long l5 = new Long(this.f45294d);
            this.f45291a = 1;
            if (cVar.a(this.f45293c, l5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
