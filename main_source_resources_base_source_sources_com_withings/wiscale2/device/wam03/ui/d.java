package com.withings.wiscale2.device.wam03.ui;

import androidx.appcompat.widget.Toolbar;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.android.data.FitnessLevel;
import com.withings.wiscale2.measure.goal.ui.StepGoalActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: Wam03PostInstallActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wam03.ui.Wam03PostInstallActivity$askForStepGoal$1", f = "Wam03PostInstallActivity.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_PR_INTERVAL_DURATION}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f54987a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Wam03PostInstallActivity f54988b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wam03PostInstallActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wam03.ui.Wam03PostInstallActivity$askForStepGoal$1$fitnessLevelValue$1", f = "Wam03PostInstallActivity.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Integer>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54989a;

        /* renamed from: b  reason: collision with root package name */
        int f54990b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Wam03PostInstallActivity f54991c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Wam03PostInstallActivity wam03PostInstallActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f54991c = wam03PostInstallActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f54991c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Integer> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            int e11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f54990b;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = this.f54989a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Wam03PostInstallActivity wam03PostInstallActivity = this.f54991c;
                fy.p pVar = wam03PostInstallActivity.f54973i;
                if (pVar != null) {
                    this.f54989a = 127;
                    this.f54990b = 1;
                    Object a11 = fy.p.a(pVar, Wam03PostInstallActivity.F3(wam03PostInstallActivity).q(), null, new int[]{127}, this, 54);
                    if (a11 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i11 = 127;
                    obj = a11;
                } else {
                    kotlin.jvm.internal.u.s("getMostRecentMeasuresGroup");
                    throw null;
                }
            }
            ky.d dVar = (ky.d) obj;
            if (dVar != null) {
                e11 = (int) ly.a.f(i11, dVar);
            } else {
                e11 = FitnessLevel.f41672f.e();
            }
            return new Integer(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Wam03PostInstallActivity wam03PostInstallActivity, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f54988b = wam03PostInstallActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f54988b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Toolbar toolbar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f54987a;
        Wam03PostInstallActivity wam03PostInstallActivity = this.f54988b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(wam03PostInstallActivity, null);
            this.f54987a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        int intValue = ((Number) obj).intValue();
        toolbar = wam03PostInstallActivity.f54975k;
        if (toolbar != null) {
            wam03PostInstallActivity.startActivityForResult(StepGoalActivity.J3(toolbar.getContext(), Wam03PostInstallActivity.F3(wam03PostInstallActivity), intValue), 11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("toolbar");
        throw null;
    }
}
