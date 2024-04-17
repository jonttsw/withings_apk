package com.withings.wiscale2.activity.workout.ui.detail;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WorkoutDetailFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutDetailFragment$onOptionsItemSelected$1$1$1", f = "WorkoutDetailFragment.kt", l = {ConstantsWs.MEASURE_TYPE_PH}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class d3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49158a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FragmentActivity f49159b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Bitmap f49160c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(FragmentActivity fragmentActivity, Bitmap bitmap, qm0.d<? super d3> dVar) {
        super(2, dVar);
        this.f49159b = fragmentActivity;
        this.f49160c = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d3(this.f49159b, this.f49160c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49158a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            FragmentActivity activity = this.f49159b;
            kotlin.jvm.internal.u.i(activity, "$activity");
            String string = activity.getString(C1987R.string.workoutSummary_shareContentMessage);
            String string2 = activity.getString(C1987R.string.workoutSummary_shareTitle);
            this.f49158a = 1;
            if (o40.b.c(activity, this.f49160c, string, string2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
