package com.withings.tutorials.ui;

import com.withings.device.Device;
import java.util.List;
import k1.o1;
import k1.r0;
import u60.e;
/* compiled from: DeviceIntroductionActivity.kt */
/* loaded from: classes4.dex */
final class n extends kotlin.jvm.internal.w implements ym0.a<List<? extends o60.f>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<Device> f44772a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<List<o60.f>> f44773b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r0 r0Var, r0 r0Var2, DeviceIntroductionActivity deviceIntroductionActivity) {
        super(0);
        this.f44772a = r0Var;
        this.f44773b = r0Var2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Comparator] */
    @Override // ym0.a
    public final List<? extends o60.f> invoke() {
        Device value = this.f44772a.getValue();
        List list = kotlin.collections.i0.f76187a;
        if (value != null) {
            List<o60.f> value2 = this.f44773b.getValue();
            int modelId = value.getModelId();
            kotlin.jvm.internal.u.j(value2, "<this>");
            if (modelId == 102) {
                list = kotlin.collections.x.W(e.a.f101517c, e.b.f101518c);
            }
            return kotlin.collections.x.D0(ah.l.v(value2, list, t.f46313a), new Object());
        }
        return list;
    }
}
