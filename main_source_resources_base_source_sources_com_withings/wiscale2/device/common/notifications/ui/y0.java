package com.withings.wiscale2.device.common.notifications.ui;

import android.provider.Telephony;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.HealthmateApplication;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$defaultApps$1", f = "DeviceNotificationSettingsFragment.kt", l = {492}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class y0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends b>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53048a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f53049b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f1 f53050c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(f1 f1Var, qm0.d<? super y0> dVar) {
        super(2, dVar);
        this.f53050c = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        y0 y0Var = new y0(this.f53050c, dVar);
        y0Var.f53049b = obj;
        return y0Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super List<? extends b>> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((y0) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fb0.b bVar;
        th0.i iVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53048a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            f1 f1Var = this.f53050c;
            bVar = f1Var.f52880h;
            bVar.getClass();
            iVar = f1Var.f52879g;
            iVar.getClass();
            HealthmateApplication healthmateApplication = (HealthmateApplication) f1Var.getApplication();
            String string = healthmateApplication.getString(C1987R.string._HWA03_NOTIFICATION_1_TITLE_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            b bVar2 = new b(string, String.valueOf(1), null);
            String string2 = healthmateApplication.getString(C1987R.string._HWA03_NOTIFICATION_4_TITLE_);
            kotlin.jvm.internal.u.i(string2, "getString(...)");
            List W = kotlin.collections.x.W(bVar2, new b(string2, String.valueOf(4), Telephony.Sms.getDefaultSmsPackage(healthmateApplication)));
            this.f53048a = 1;
            if (((FlowCollector) this.f53049b).emit(W, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
