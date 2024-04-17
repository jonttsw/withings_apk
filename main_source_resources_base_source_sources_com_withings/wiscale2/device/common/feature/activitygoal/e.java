package com.withings.wiscale2.device.common.feature.activitygoal;

import com.withings.measure.android.data.FitnessLevel;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DailyStepsGoalLiveData.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.activitygoal.DailyStepsGoalLiveData$getStepGoalFromFitnessLevel$2", f = "DailyStepsGoalLiveData.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Integer>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50923a;

    /* renamed from: b  reason: collision with root package name */
    int f50924b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f f50925c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f50926d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, long j5, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f50925c = fVar;
        this.f50926d = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f50925c, this.f50926d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Integer> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        FitnessLevel fitnessLevel;
        Double d11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.f50924b;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = this.f50923a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            f fVar = this.f50925c;
            User i13 = fVar.y().i(this.f50926d);
            if (i13 != null) {
                this.f50923a = 127;
                this.f50924b = 1;
                Object a11 = fy.p.a(fVar.v(), i13.q(), null, new int[]{127}, this, 54);
                if (a11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i11 = 127;
                obj = a11;
            }
            fitnessLevel = FitnessLevel.f41673g;
            return new Integer(zx.a.b(fitnessLevel));
        }
        ky.d dVar = (ky.d) obj;
        if (dVar != null) {
            d11 = new Double(ly.a.f(i11, dVar));
        } else {
            d11 = null;
        }
        if (d11 != null) {
            double doubleValue = d11.doubleValue();
            FitnessLevel.f41671e.getClass();
            fitnessLevel = FitnessLevel.a.a((int) doubleValue);
            return new Integer(zx.a.b(fitnessLevel));
        }
        fitnessLevel = FitnessLevel.f41673g;
        return new Integer(zx.a.b(fitnessLevel));
    }
}
