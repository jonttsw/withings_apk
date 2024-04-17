package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$2", f = "DeviceNotificationSettingsFragment.kt", l = {ConstantsWs.WS_STATUS_P4_ERROR_HEIGHT_TOO_SMALL}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class v0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53027a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f53028b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceNotificationSettingsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$2$1", f = "DeviceNotificationSettingsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.r<Boolean, Device, List<? extends String>, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Device f53029a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ List f53030b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f1 f53031c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1 f1Var, qm0.d<? super a> dVar) {
            super(4, dVar);
            this.f53031c = f1Var;
        }

        @Override // ym0.r
        public final Object invoke(Boolean bool, Device device, List<? extends String> list, qm0.d<? super Boolean> dVar) {
            bool.getClass();
            a aVar = new a(this.f53031c, dVar);
            aVar.f53029a = device;
            aVar.f53030b = list;
            return aVar.invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
            if ((!r2) != false) goto L7;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            /*
                r1 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                nm0.l.b(r2)
                com.withings.device.Device r2 = r1.f53029a
                java.util.List r0 = r1.f53030b
                java.util.List r0 = (java.util.List) r0
                boolean r2 = r2.areNotificationsEnabled()
                if (r2 == 0) goto L28
                com.withings.wiscale2.device.common.notifications.ui.f1 r2 = r1.f53031c
                th0.i r2 = com.withings.wiscale2.device.common.notifications.ui.f1.y0(r2)
                boolean r2 = r2.b()
                if (r2 != 0) goto L28
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r2 = r0.isEmpty()
                r0 = 1
                r2 = r2 ^ r0
                if (r2 == 0) goto L28
                goto L29
            L28:
                r0 = 0
            L29:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.notifications.ui.v0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f1 f53032a;

        b(f1 f1Var) {
            this.f53032a = f1Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            MutableStateFlow mutableStateFlow;
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            mutableStateFlow = this.f53032a.f52889q;
            mutableStateFlow.setValue(bool);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(f1 f1Var, qm0.d<? super v0> dVar) {
        super(2, dVar);
        this.f53028b = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new v0(this.f53028b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((v0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Flow flow;
        Flow flow2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53027a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            f1 f1Var = this.f53028b;
            flow = f1Var.f52882j;
            flow2 = f1Var.f52883k;
            Flow combine = FlowKt.combine(flow, flow2, f1Var.O0(), new a(f1Var, null));
            b bVar = new b(f1Var);
            this.f53027a = 1;
            if (combine.collect(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
