package com.withings.cycletracking.ui;

import android.content.Context;
import com.withings.common.compose.component.ToastStyle;
import com.withings.common.compose.component.w4;
import com.withings.common.compose.component.z4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CycleTrackingDatavizScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingDatavizScreenKt$CycleTrackingDatavizScreen$2$1$1", f = "CycleTrackingDatavizScreen.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35521a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z4 f35522b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f35523c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(z4 z4Var, Context context, qm0.d<? super d1> dVar) {
        super(2, dVar);
        this.f35522b = z4Var;
        this.f35523c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d1(this.f35522b, this.f35523c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f35521a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            w4 a11 = this.f35522b.a();
            if (a11 != null) {
                a11.dismiss();
            }
            this.f35521a = 1;
            ToastStyle toastStyle = ToastStyle.f33351d;
            Context context = this.f35523c;
            String string = context.getString(C1987R.string.cycletracking_longpressAnimation_toast_title);
            String string2 = context.getString(C1987R.string.cycletracking_longpressAnimation_toast_description);
            kotlin.jvm.internal.u.g(string2);
            kotlin.jvm.internal.u.g(string);
            if (z4.c(this.f35522b, toastStyle, string2, string, 0L, null, this, 24) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
