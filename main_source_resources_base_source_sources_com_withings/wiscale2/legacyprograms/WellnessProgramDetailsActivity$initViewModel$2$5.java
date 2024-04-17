package com.withings.wiscale2.legacyprograms;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/withings/wiscale2/legacyprograms/ProgramDeviceContainer;", "devices", "Lnm0/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramDetailsActivity$initViewModel$2$5 extends w implements l<List<? extends ProgramDeviceContainer>, y> {
    final /* synthetic */ WellnessProgramDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailsActivity$initViewModel$2$5(WellnessProgramDetailsActivity wellnessProgramDetailsActivity) {
        super(1);
        this.this$0 = wellnessProgramDetailsActivity;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(List<? extends ProgramDeviceContainer> list) {
        invoke2((List<ProgramDeviceContainer>) list);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ProgramDeviceContainer> list) {
        if (list != null) {
            this.this$0.displayDevices(list);
        }
    }
}
