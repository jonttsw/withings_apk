package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.common.notifications.ui.l1;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$1", f = "DeviceNotificationSettingsFragment.kt", l = {ConstantsWs.WS_STATUS_INVALID_PASSWORD_NO_LOWERCASE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53017a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f53018b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceNotificationSettingsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$1$1", f = "DeviceNotificationSettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.t<Boolean, h1, Device, List<? extends com.withings.wiscale2.device.common.notifications.ui.b>, List<? extends com.withings.wiscale2.device.common.notifications.ui.a>, qm0.d<? super l1.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ h1 f53019a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Device f53020b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ List f53021c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ List f53022d;

        a(qm0.d<? super a> dVar) {
            super(6, dVar);
        }

        @Override // ym0.t
        public final Object c(Boolean bool, h1 h1Var, Device device, List<? extends com.withings.wiscale2.device.common.notifications.ui.b> list, List<? extends com.withings.wiscale2.device.common.notifications.ui.a> list2, qm0.d<? super l1.a> dVar) {
            bool.getClass();
            a aVar = new a(dVar);
            aVar.f53019a = h1Var;
            aVar.f53020b = device;
            aVar.f53021c = list;
            aVar.f53022d = list2;
            return aVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            h1 h1Var = this.f53019a;
            return new l1.a(this.f53020b.areNotificationsEnabled(), h1Var, this.f53021c, this.f53022d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f1 f53023a;

        b(f1 f1Var) {
            this.f53023a = f1Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            MutableStateFlow mutableStateFlow;
            mutableStateFlow = this.f53023a.f52893u;
            mutableStateFlow.setValue((l1.a) obj);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(f1 f1Var, qm0.d<? super u0> dVar) {
        super(2, dVar);
        this.f53018b = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new u0(this.f53018b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((u0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Flow flow;
        Flow flow2;
        Flow flow3;
        Flow flow4;
        Flow flow5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53017a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            f1 f1Var = this.f53018b;
            flow = f1Var.f52882j;
            flow2 = f1Var.f52881i;
            flow3 = f1Var.f52883k;
            flow4 = f1Var.f52887o;
            flow5 = f1Var.f52888p;
            Flow combine = FlowKt.combine(flow, flow2, flow3, flow4, flow5, new a(null));
            b bVar = new b(f1Var);
            this.f53017a = 1;
            if (combine.collect(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
