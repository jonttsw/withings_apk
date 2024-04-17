package com.withings.tutorials.ui.screens.modes.pregnancy;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PregnancyModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$lastWeightInConceptionMonth$1", f = "PregnancyModeViewModel.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class s1 extends kotlin.coroutines.jvm.internal.i implements ym0.q<DateTime, DateTime, qm0.d<? super Double>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46132a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ DateTime f46133b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ DateTime f46134c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PregnancyModeViewModel f46135d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(PregnancyModeViewModel pregnancyModeViewModel, qm0.d<? super s1> dVar) {
        super(3, dVar);
        this.f46135d = pregnancyModeViewModel;
    }

    @Override // ym0.q
    public final Object invoke(DateTime dateTime, DateTime dateTime2, qm0.d<? super Double> dVar) {
        s1 s1Var = new s1(this.f46135d, dVar);
        s1Var.f46133b = dateTime;
        s1Var.f46134c = dateTime2;
        return s1Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w60.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f46132a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            DateTime dateTime = this.f46133b;
            DateTime dateTime2 = this.f46134c;
            PregnancyModeViewModel pregnancyModeViewModel = this.f46135d;
            bVar = pregnancyModeViewModel.f45797k;
            long j5 = pregnancyModeViewModel.f45798l;
            this.f46133b = null;
            this.f46132a = 1;
            obj = bVar.b(j5, dateTime2, dateTime, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
