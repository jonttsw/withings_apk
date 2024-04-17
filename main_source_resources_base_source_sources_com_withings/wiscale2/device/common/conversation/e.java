package com.withings.wiscale2.device.common.conversation;

import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import zx.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetHeartSignalMeasurementsConversation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.conversation.GetHeartSignalMeasurementsConversation$saveMeasureGroup$measuresGroup$1", f = "GetHeartSignalMeasurementsConversation.kt", l = {250}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super ky.d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50809a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GetHeartSignalMeasurementsConversation f50810b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f50811c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f50812d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GetHeartSignalMeasurementsConversation getHeartSignalMeasurementsConversation, User user, HeartSignalMeasurement heartSignalMeasurement, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f50810b = getHeartSignalMeasurementsConversation;
        this.f50811c = user;
        this.f50812d = heartSignalMeasurement;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f50810b, this.f50811c, this.f50812d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super ky.d> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Long l5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50809a;
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
            fy.m mVar = new fy.m(new dy.d(vVar, new w(z11, bVar), bVar), bVar);
            l5 = this.f50810b.f50729r;
            kotlin.jvm.internal.u.g(l5);
            long longValue = l5.longValue();
            long q11 = this.f50811c.q();
            long millis = this.f50812d.getTimestamp().getMillis();
            this.f50809a = 1;
            obj = mVar.b(longValue, q11, millis, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
