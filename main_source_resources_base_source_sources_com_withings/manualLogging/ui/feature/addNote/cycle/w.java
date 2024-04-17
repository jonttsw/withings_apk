package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.manualLogging.core.entity.cycle.CycleRegularity;
import java.util.List;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class w extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<CycleRegularity> f41378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<CycleRegularity, nm0.y> f41379b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(List<? extends CycleRegularity> list, ym0.l<? super CycleRegularity, nm0.y> lVar) {
        super(1);
        this.f41378a = list;
        this.f41379b = lVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        int intValue = num.intValue();
        this.f41379b.invoke(this.f41378a.get(intValue));
        return nm0.y.f85009a;
    }
}
