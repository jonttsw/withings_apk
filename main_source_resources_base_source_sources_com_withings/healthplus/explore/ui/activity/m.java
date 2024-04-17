package com.withings.healthplus.explore.ui.activity;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import vk.a;
/* compiled from: ExploreTabActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.healthplus.explore.ui.activity.ExploreTabActivity$onCreate$1$1$2", f = "ExploreTabActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40328a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ExploreTabActivity exploreTabActivity, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f40328a = exploreTabActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f40328a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        ExploreTabActivity exploreTabActivity = this.f40328a;
        vk.a aVar = (vk.a) ExploreTabActivity.E3(exploreTabActivity).k0().getValue();
        if (kotlin.jvm.internal.u.e(aVar, a.b.f103949a)) {
            exploreTabActivity.setRequestedOrientation(7);
            exploreTabActivity.getWindow().clearFlags(128);
        } else if (kotlin.jvm.internal.u.e(aVar, a.C1765a.f103948a)) {
            exploreTabActivity.setRequestedOrientation(6);
            exploreTabActivity.getWindow().addFlags(128);
        }
        return nm0.y.f85009a;
    }
}
