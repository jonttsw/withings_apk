package com.withings.tutorials.ui;

import android.content.Context;
import android.content.Intent;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.core.UtilityIntroduction;
import kotlin.collections.s0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DeviceIntroductionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionActivity$onCreate$1$1$3$3", f = "DeviceIntroductionActivity.kt", l = {ConstantsWs.MEASURE_TYPE_PPG_AFIB_RESULT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class g extends kotlin.coroutines.jvm.internal.i implements ym0.q<UtilityIntroduction, Device, qm0.d<? super Intent>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f44745a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ UtilityIntroduction f44746b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Device f44747c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DeviceIntroductionActivity f44748d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f44749e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceIntroductionActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.DeviceIntroductionActivity$onCreate$1$1$3$3$1", f = "DeviceIntroductionActivity.kt", l = {ConstantsWs.MEASURE_TYPE_IRREGULAR_HEART_BEAT}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Intent>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f44750a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UtilityIntroduction f44751b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Device f44752c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DeviceIntroductionActivity f44753d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f44754e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(UtilityIntroduction utilityIntroduction, Device device, DeviceIntroductionActivity deviceIntroductionActivity, Context context, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f44751b = utilityIntroduction;
            this.f44752c = device;
            this.f44753d = deviceIntroductionActivity;
            this.f44754e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f44751b, this.f44752c, this.f44753d, this.f44754e, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Intent> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f44750a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                int i12 = v70.a.f103433b;
                UtilityIntroduction utilityIntroduction = this.f44751b;
                String name = utilityIntroduction.name();
                Device device = this.f44752c;
                v70.a.b(name, "device_tutorial", s0.i(new nm0.j("device_model", new Integer(device.getModelId()))));
                h70.d dVar = this.f44753d.f44597i;
                if (dVar != null) {
                    this.f44750a = 1;
                    obj = dVar.b(this.f44754e, device, utilityIntroduction, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    kotlin.jvm.internal.u.s("getUtilitiesIntentUseCase");
                    throw null;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DeviceIntroductionActivity deviceIntroductionActivity, Context context, qm0.d<? super g> dVar) {
        super(3, dVar);
        this.f44748d = deviceIntroductionActivity;
        this.f44749e = context;
    }

    @Override // ym0.q
    public final Object invoke(UtilityIntroduction utilityIntroduction, Device device, qm0.d<? super Intent> dVar) {
        g gVar = new g(this.f44748d, this.f44749e, dVar);
        gVar.f44746b = utilityIntroduction;
        gVar.f44747c = device;
        return gVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f44745a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            UtilityIntroduction utilityIntroduction = this.f44746b;
            Device device = this.f44747c;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(utilityIntroduction, device, this.f44748d, this.f44749e, null);
            this.f44746b = null;
            this.f44745a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
