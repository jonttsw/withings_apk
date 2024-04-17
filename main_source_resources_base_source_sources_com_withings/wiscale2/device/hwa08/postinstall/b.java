package com.withings.wiscale2.device.hwa08.postinstall;

import androidx.appcompat.widget.Toolbar;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.android.data.FitnessLevel;
import com.withings.wiscale2.measure.goal.ui.StepGoalActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: Hwa08PostInstallActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.hwa08.postinstall.Hwa08PostInstallActivity$askForStepGoal$1", f = "Hwa08PostInstallActivity.kt", l = {ConstantsWs.MEASURE_TYPE_CAN}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f54425a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Hwa08PostInstallActivity f54426b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hwa08PostInstallActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.hwa08.postinstall.Hwa08PostInstallActivity$askForStepGoal$1$fitnessLevelValue$1", f = "Hwa08PostInstallActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Integer>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54427a;

        /* renamed from: b  reason: collision with root package name */
        int f54428b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Hwa08PostInstallActivity f54429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Hwa08PostInstallActivity hwa08PostInstallActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f54429c = hwa08PostInstallActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f54429c, dVar);
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
            int i12 = this.f54428b;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = this.f54427a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Hwa08PostInstallActivity hwa08PostInstallActivity = this.f54429c;
                fy.p pVar = hwa08PostInstallActivity.f54413l;
                if (pVar != null) {
                    this.f54427a = 127;
                    this.f54428b = 1;
                    Object a11 = fy.p.a(pVar, Hwa08PostInstallActivity.F3(hwa08PostInstallActivity).q(), null, new int[]{127}, this, 54);
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
    public b(Hwa08PostInstallActivity hwa08PostInstallActivity, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f54426b = hwa08PostInstallActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f54426b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Toolbar toolbar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f54425a;
        Hwa08PostInstallActivity hwa08PostInstallActivity = this.f54426b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(hwa08PostInstallActivity, null);
            this.f54425a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        int intValue = ((Number) obj).intValue();
        toolbar = hwa08PostInstallActivity.f54411j;
        if (toolbar != null) {
            hwa08PostInstallActivity.startActivityForResult(StepGoalActivity.J3(toolbar.getContext(), Hwa08PostInstallActivity.F3(hwa08PostInstallActivity), intValue), 11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("toolbar");
        throw null;
    }
}
