package com.withings.cycletracking.ui;

import android.content.Context;
import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.w4;
import com.withings.common.compose.component.z4;
import com.withings.cycletracking.ui.viewmodel.PredictionEvent;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CycleTrackingDatavizScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingDatavizScreenKt$CycleTrackingDatavizScreen$3$1$1", f = "CycleTrackingDatavizScreen.kt", l = {ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW, ConstantsWs.MEASURE_TYPE_CYCLE_DURATION, ConstantsWs.MEASURE_TYPE_MENSTRUATION_DURATION, 186}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35528a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z4 f35529b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PredictionEvent f35530c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f35531d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(z4 z4Var, PredictionEvent predictionEvent, Context context, qm0.d<? super e1> dVar) {
        super(2, dVar);
        this.f35529b = z4Var;
        this.f35530c = predictionEvent;
        this.f35531d = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e1(this.f35529b, this.f35530c, this.f35531d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f35528a;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            z4 z4Var = this.f35529b;
            w4 a11 = z4Var.a();
            if (a11 != null) {
                a11.dismiss();
            }
            int ordinal = this.f35530c.ordinal();
            Context context = this.f35531d;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            this.f35528a = 4;
                            ToastStyle toastStyle = ToastStyle.f33349b;
                            String string = context.getString(C1987R.string.cycleTracking_toast_title);
                            String string2 = context.getString(C1987R.string.cycleTracking_toast_predictionFailed);
                            kotlin.jvm.internal.u.g(string2);
                            kotlin.jvm.internal.u.g(string);
                            if (z4.c(z4Var, toastStyle, string2, string, 0L, null, this, 24) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        this.f35528a = 3;
                        ToastStyle toastStyle2 = ToastStyle.f33349b;
                        String string3 = context.getString(C1987R.string.cycleTracking_toast_title);
                        String string4 = context.getString(C1987R.string.cycleTracking_toast_noInternetConnection);
                        kotlin.jvm.internal.u.g(string4);
                        kotlin.jvm.internal.u.g(string3);
                        if (z4.c(this.f35529b, toastStyle2, string4, string3, 0L, null, this, 24) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    this.f35528a = 2;
                    ToastStyle toastStyle3 = ToastStyle.f33348a;
                    String string5 = context.getString(C1987R.string.cycleTracking_toast_title);
                    String string6 = context.getString(C1987R.string.cycleTracking_toast_predictionSucceed);
                    kotlin.jvm.internal.u.g(string6);
                    kotlin.jvm.internal.u.g(string5);
                    if (z4.c(this.f35529b, toastStyle3, string6, string5, 0L, null, this, 24) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                this.f35528a = 1;
                ToastStyle toastStyle4 = ToastStyle.f33351d;
                String string7 = context.getString(C1987R.string.cycleTracking_toast_title);
                String string8 = context.getString(C1987R.string.cycleTracking_toast_updating);
                kotlin.jvm.internal.u.g(string8);
                kotlin.jvm.internal.u.g(string7);
                if (z4.c(this.f35529b, toastStyle4, string8, string7, 0L, null, this, 24) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return nm0.y.f85009a;
    }
}
