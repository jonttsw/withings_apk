package com.withings.measure.detail.ui.screen;

import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeasureDetailViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measure.detail.ui.screen.MeasureDetailPagerViewModelLegacy$getAllMeasureGroups$2", f = "MeasureDetailViewModel.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class r extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends MeasuresGroup>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41791a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f41792b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q f41793c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(User user, q qVar, qm0.d<? super r> dVar) {
        super(2, dVar);
        this.f41792b = user;
        this.f41793c = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new r(this.f41792b, this.f41793c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends MeasuresGroup>> dVar) {
        return ((r) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41791a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            xw.b bVar = new xw.b();
            sw.a z5 = sw.a.z();
            kotlin.jvm.internal.u.i(z5, "get(...)");
            zx.v vVar = new zx.v(z5);
            sw.a z11 = sw.a.z();
            kotlin.jvm.internal.u.i(z11, "get(...)");
            fy.n nVar = new fy.n(new dy.d(vVar, new zx.w(z11, bVar), bVar));
            User user = this.f41792b;
            this.f41791a = 1;
            obj = nVar.a(user.q(), new Long(user.f().getMillis()), true, null, new int[]{this.f41793c.f0().getMeasureType()}, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return hy.g.f((List) obj);
    }
}
