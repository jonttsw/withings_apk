package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnknownMeasuresActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.unknown.ui.UnknownMeasuresViewModel$assignMeasurementsToUser$1", f = "UnknownMeasuresActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class g extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f58351a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f58352b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, User user, qm0.d<? super g> dVar) {
        super(2, dVar);
        this.f58351a = iVar;
        this.f58352b = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new g(this.f58351a, this.f58352b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        i iVar = this.f58351a;
        List<MeasuresGroup> list = (List) iVar.g0().getValue();
        if (list != null) {
            for (MeasuresGroup measuresGroup : list) {
                User user = this.f58352b;
                measuresGroup.setUserId(user.q());
                i.f0(iVar).f(measuresGroup, user);
            }
        }
        return y.f85009a;
    }
}
