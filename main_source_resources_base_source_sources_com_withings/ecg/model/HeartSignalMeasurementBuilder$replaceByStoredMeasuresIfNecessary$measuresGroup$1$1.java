package com.withings.ecg.model;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import fy.m;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import sw.a;
import xw.b;
import ym0.p;
import zx.v;
import zx.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeartSignalMeasurementBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lky/d;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lky/d;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.ecg.model.HeartSignalMeasurementBuilder$replaceByStoredMeasuresIfNecessary$measuresGroup$1$1", f = "HeartSignalMeasurementBuilder.kt", l = {ConstantsWs.MEASURE_TYPE_HORIZONTAL_RADIUS}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class HeartSignalMeasurementBuilder$replaceByStoredMeasuresIfNecessary$measuresGroup$1$1 extends i implements p<CoroutineScope, d<? super ky.d>, Object> {
    final /* synthetic */ User $user;
    int label;
    final /* synthetic */ HeartSignalMeasurementBuilder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartSignalMeasurementBuilder$replaceByStoredMeasuresIfNecessary$measuresGroup$1$1(HeartSignalMeasurementBuilder heartSignalMeasurementBuilder, User user, d<? super HeartSignalMeasurementBuilder$replaceByStoredMeasuresIfNecessary$measuresGroup$1$1> dVar) {
        super(2, dVar);
        this.this$0 = heartSignalMeasurementBuilder;
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new HeartSignalMeasurementBuilder$replaceByStoredMeasuresIfNecessary$measuresGroup$1$1(this.this$0, this.$user, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HeartSignalInfo heartSignalInfo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            b bVar = new b();
            a z5 = a.z();
            u.i(z5, "get(...)");
            v vVar = new v(z5);
            a z11 = a.z();
            u.i(z11, "get(...)");
            m mVar = new m(new dy.d(vVar, new w(z11, bVar), bVar), bVar);
            long longValue = this.this$0.getDeviceId().longValue();
            long q11 = this.$user.q();
            heartSignalInfo = this.this$0.info;
            if (heartSignalInfo != null) {
                this.label = 1;
                obj = mVar.b(longValue, q11, 1000 * heartSignalInfo.getMeasureMeta().time, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                u.s("info");
                throw null;
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super ky.d> dVar) {
        return ((HeartSignalMeasurementBuilder$replaceByStoredMeasuresIfNecessary$measuresGroup$1$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
