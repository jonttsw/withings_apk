package com.withings.wiscale2.heart.heartrate;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.heartrate.HeartRateDayViewModel$hrMeasures$1$1", f = "HeartRateDayFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGCONSUMER, 305}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class k0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends MeasuresGroup>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57682a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57683b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f57684c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e0 e0Var, qm0.d<? super k0> dVar) {
        super(2, dVar);
        this.f57684c = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        k0 k0Var = new k0(this.f57684c, dVar);
        k0Var.f57683b = obj;
        return k0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends MeasuresGroup>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((k0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        fy.l lVar;
        User user;
        DateTime dateTime;
        DateTime dateTime2;
        User user2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57682a;
        e0 e0Var = this.f57684c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f57683b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f57683b;
            lVar = e0Var.f57591h;
            user = e0Var.f57584a;
            dateTime = e0Var.f57585b;
            long millis = dateTime.getMillis();
            dateTime2 = e0Var.f57597n;
            long millis2 = dateTime2.getMillis();
            Long l5 = new Long(millis);
            Long l6 = new Long(millis2);
            this.f57683b = h0Var;
            this.f57682a = 1;
            obj = fy.l.c(lVar, user.q(), l5, l6, false, new int[]{11}, this, 16);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        user2 = e0Var.f57584a;
        ArrayList f11 = hy.g.f(new jq.j(user2).a((List) obj));
        this.f57683b = null;
        this.f57682a = 2;
        if (h0Var.emit(f11, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
