package com.withings.wiscale2.device.common.conversation;

import com.withings.library.measure.MeasuresGroup;
import com.withings.measure.core.models.MeasureGroupOrigin;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetHeartSignalMeasurementsConversation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.conversation.GetHeartSignalMeasurementsConversation$saveMeasureGroup$2", f = "GetHeartSignalMeasurementsConversation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Long>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GetHeartSignalMeasurementsConversation f50806a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f50807b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f50808c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GetHeartSignalMeasurementsConversation getHeartSignalMeasurementsConversation, User user, MeasuresGroup measuresGroup, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f50806a = getHeartSignalMeasurementsConversation;
        this.f50807b = user;
        this.f50808c = measuresGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f50806a, this.f50807b, this.f50808c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Long> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.v vVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        vVar = this.f50806a.f50721j;
        ky.d a11 = hy.g.a(this.f50808c);
        MeasureGroupOrigin measureGroupOrigin = MeasureGroupOrigin.f41680a;
        return new Long(vVar.b(this.f50807b, a11, false));
    }
}
