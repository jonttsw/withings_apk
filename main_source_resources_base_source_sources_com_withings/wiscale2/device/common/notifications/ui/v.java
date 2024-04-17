package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.comm.wpp.generated.object.AncsStatus;
import com.withings.wiscale2.device.common.notifications.ui.m;
import java.util.Map;
import k1.o1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.w implements ym0.l<Map<String, Boolean>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1 f53024a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f53025b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o1<k1> f53026c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f1 f1Var, m mVar, k1.r0 r0Var) {
        super(1);
        this.f53024a = f1Var;
        this.f53025b = mVar;
        this.f53026c = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Map<String, Boolean> map) {
        short s11;
        m.a aVar;
        Map<String, Boolean> result = map;
        kotlin.jvm.internal.u.j(result, "result");
        if (!result.isEmpty()) {
            for (Map.Entry<String, Boolean> entry : result.entrySet()) {
                if (!entry.getValue().booleanValue()) {
                    break;
                }
            }
        }
        m.b bVar = m.f52947s;
        k1 value = this.f53026c.getValue();
        if (value != null) {
            s11 = value.a();
        } else {
            s11 = -1;
        }
        AncsStatus Z0 = this.f53024a.Z0(true, s11);
        aVar = this.f53025b.f52955n;
        if (aVar != null) {
            aVar.C1(Z0);
        }
        return nm0.y.f85009a;
    }
}
