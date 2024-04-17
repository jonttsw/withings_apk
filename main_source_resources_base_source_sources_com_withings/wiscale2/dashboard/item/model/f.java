package com.withings.wiscale2.dashboard.item.model;

import com.withings.device.Device;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: SummaryItemData.kt */
/* loaded from: classes4.dex */
final class f extends w implements p<Boolean, List<? extends Device>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f50585a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f50586b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, d dVar) {
        super(2);
        this.f50585a = eVar;
        this.f50586b = dVar;
    }

    @Override // ym0.p
    public final y invoke(Boolean bool, List<? extends Device> list) {
        Boolean isAvailable = bool;
        List<? extends Device> relatedDevices = list;
        u.j(isAvailable, "isAvailable");
        u.j(relatedDevices, "relatedDevices");
        e eVar = this.f50585a;
        eVar.postValue(new c(eVar.y(), eVar.v(), eVar.A(), eVar.C(), isAvailable.booleanValue(), relatedDevices, this.f50586b));
        return y.f85009a;
    }
}
