package com.withings.notifications.ui;

import androidx.camera.core.y1;
import com.withings.device.Device;
import x9.c;
/* compiled from: NotificationUiMapper.kt */
/* loaded from: classes4.dex */
final class q extends kotlin.jvm.internal.w implements ym0.r<x9.r, c.b.C1856b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Device> f43092a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Integer> f43093b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(k1.r0<Device> r0Var, k1.r0<Integer> r0Var2) {
        super(4);
        this.f43092a = r0Var;
        this.f43093b = r0Var2;
    }

    @Override // ym0.r
    public final nm0.y invoke(x9.r rVar, c.b.C1856b c1856b, androidx.compose.runtime.a aVar, Integer num) {
        Long l5;
        Integer num2;
        String str;
        x9.r SubcomposeAsyncImage = rVar;
        c.b.C1856b it = c1856b;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 641) == 128 && aVar2.h()) {
            aVar2.C();
        } else {
            int i11 = p.f42986c;
            k1.r0<Device> r0Var = this.f43092a;
            Device value = r0Var.getValue();
            if (value != null) {
                l5 = Long.valueOf(value.getId());
            } else {
                l5 = null;
            }
            Device value2 = r0Var.getValue();
            if (value2 != null) {
                num2 = Integer.valueOf(value2.getModelId());
            } else {
                num2 = null;
            }
            Device value3 = r0Var.getValue();
            if (value3 != null) {
                str = value3.getColor();
            } else {
                str = null;
            }
            StringBuilder sb2 = new StringBuilder("Device image has a problem for device id [");
            sb2.append(l5);
            sb2.append("] model [");
            sb2.append(num2);
            sb2.append("] and color [");
            x70.b.n(new IllegalStateException(y1.e(sb2, str, "]")));
            this.f43093b.setValue(null);
        }
        return nm0.y.f85009a;
    }
}
