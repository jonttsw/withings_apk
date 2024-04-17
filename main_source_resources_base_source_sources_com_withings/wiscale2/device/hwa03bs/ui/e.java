package com.withings.wiscale2.device.hwa03bs.ui;

import androidx.appcompat.widget.Toolbar;
import com.withings.measure.android.data.FitnessLevel;
import com.withings.wiscale2.measure.goal.ui.StepGoalActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: Hwa03PostInstallActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.hwa03bs.ui.Hwa03PostInstallActivity$askForStepGoal$1", f = "Hwa03PostInstallActivity.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f54257a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Hwa03PostInstallActivity f54258b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hwa03PostInstallActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.hwa03bs.ui.Hwa03PostInstallActivity$askForStepGoal$1$fitnessLevelValue$1", f = "Hwa03PostInstallActivity.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Integer>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54259a;

        /* renamed from: b  reason: collision with root package name */
        int f54260b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Hwa03PostInstallActivity f54261c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Hwa03PostInstallActivity hwa03PostInstallActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f54261c = hwa03PostInstallActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f54261c, dVar);
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
            int i12 = this.f54260b;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = this.f54259a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                Hwa03PostInstallActivity hwa03PostInstallActivity = this.f54261c;
                fy.p pVar = hwa03PostInstallActivity.f54242i;
                if (pVar != null) {
                    this.f54259a = 127;
                    this.f54260b = 1;
                    Object a11 = fy.p.a(pVar, Hwa03PostInstallActivity.F3(hwa03PostInstallActivity).q(), null, new int[]{127}, this, 54);
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
    public e(Hwa03PostInstallActivity hwa03PostInstallActivity, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f54258b = hwa03PostInstallActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f54258b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Toolbar toolbar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f54257a;
        Hwa03PostInstallActivity hwa03PostInstallActivity = this.f54258b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(hwa03PostInstallActivity, null);
            this.f54257a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        int intValue = ((Number) obj).intValue();
        toolbar = hwa03PostInstallActivity.f54244k;
        if (toolbar != null) {
            hwa03PostInstallActivity.startActivityForResult(StepGoalActivity.J3(toolbar.getContext(), Hwa03PostInstallActivity.F3(hwa03PostInstallActivity), intValue), 11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("toolbar");
        throw null;
    }
}
