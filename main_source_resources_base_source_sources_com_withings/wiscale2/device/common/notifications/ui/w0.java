package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$allApps$1", f = "DeviceNotificationSettingsFragment.kt", l = {ConstantsWs.WS_STATUS_EXPIRED_PROVIDER_TOKEN}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class w0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends a>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53036a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f53037b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f1 f53038c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(f1 f1Var, qm0.d<? super w0> dVar) {
        super(2, dVar);
        this.f53038c = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        w0 w0Var = new w0(this.f53038c, dVar);
        w0Var.f53037b = obj;
        return w0Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super List<? extends a>> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((w0) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        gb0.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53036a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f53037b;
            cVar = this.f53038c.f52875c;
            List<gb0.a> j5 = cVar.j();
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(j5, 10));
            for (gb0.a aVar : j5) {
                arrayList.add(new a(aVar.b(), aVar.a().b(), aVar.a().a()));
            }
            this.f53036a = 1;
            if (flowCollector.emit(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
