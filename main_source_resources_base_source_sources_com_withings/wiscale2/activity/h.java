package com.withings.wiscale2.activity;

import javax.inject.Inject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Period;
import ym0.q;
/* compiled from: GetClosestBMR.kt */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final iy.e f48274a;

    /* renamed from: b  reason: collision with root package name */
    private final ky.c f48275b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GetClosestBMR.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.GetClosestBMR$getFlow$1", f = "GetClosestBMR.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements q<ky.d, ky.d, qm0.d<? super ky.d>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ ky.d f48276a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ ky.d f48277b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DateTime f48278c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DateTime dateTime, qm0.d<? super a> dVar) {
            super(3, dVar);
            this.f48278c = dateTime;
        }

        @Override // ym0.q
        public final Object invoke(ky.d dVar, ky.d dVar2, qm0.d<? super ky.d> dVar3) {
            a aVar = new a(this.f48278c, dVar3);
            aVar.f48276a = dVar;
            aVar.f48277b = dVar2;
            return aVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            ky.d dVar = this.f48276a;
            ky.d dVar2 = this.f48277b;
            if (dVar != null && dVar2 != null) {
                DateTime c11 = dVar.c();
                DateTime dateTime = this.f48278c;
                if (new Period(c11, dateTime).getMillis() < new Period(dateTime, dVar2.c()).getMillis()) {
                    return dVar;
                }
            } else if (dVar != null) {
                return dVar;
            }
            return dVar2;
        }
    }

    @Inject
    public h(iy.e measuresGroupRepositoryV2, ky.c measureListenerManagerInterface) {
        u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        this.f48274a = measuresGroupRepositoryV2;
        this.f48275b = measureListenerManagerInterface;
    }

    public final Flow<ky.d> a(long j5, DateTime dateTime) {
        return FlowKt.combine(iy.a.f(this.f48274a, this.f48275b, j5, 226, null, Long.valueOf(dateTime.getMillis()), false, 856), iy.a.f(this.f48274a, this.f48275b, j5, 226, Long.valueOf(dateTime.getMillis()), null, true, 872), new a(dateTime, null));
    }
}
