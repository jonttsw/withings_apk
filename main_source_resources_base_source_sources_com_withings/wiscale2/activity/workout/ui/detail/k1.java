package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.activity.workout.model.WorkoutDataBuilder;
import com.withings.wiscale2.activity.workout.model.WorkoutSaver;
import com.withings.wiscale2.track.data.GpsSummary;
import com.withings.wiscale2.track.data.Track;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PostWorkoutActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.PostWorkoutViewModel$onWorkoutCategorySelected$1", f = "PostWorkoutActivity.kt", l = {ConstantsWs.MEASURE_TYPE_EDA_LEFT_FOOT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class k1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Track f49355a;

    /* renamed from: b  reason: collision with root package name */
    Track f49356b;

    /* renamed from: c  reason: collision with root package name */
    int f49357c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l1 f49358d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Integer f49359e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, Integer num, qm0.d<? super k1> dVar) {
        super(2, dVar);
        this.f49358d = l1Var;
        this.f49359e = num;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k1(this.f49358d, this.f49359e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((k1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Track value;
        int i11;
        Track track;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.f49357c;
        if (i12 != 0) {
            if (i12 == 1) {
                track = this.f49356b;
                value = this.f49355a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            l1 l1Var = this.f49358d;
            value = l1Var.r0().getValue();
            if (value != null) {
                Integer num = this.f49359e;
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 36;
                }
                value.setCategory(i11);
                value.setAttrib(7);
                value.setData(WorkoutDataBuilder.buildWorkoutData$default(l1.i0(l1Var), value, false, 2, null));
                ua0.a g02 = l1.g0(l1Var);
                this.f49355a = value;
                this.f49356b = value;
                this.f49357c = 1;
                obj = g02.b(value, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                track = value;
            }
            return nm0.y.f85009a;
        }
        track.setGpsSummary((GpsSummary) obj);
        value.setSyncedToWs(false);
        WorkoutSaver.save(value);
        return nm0.y.f85009a;
    }
}
