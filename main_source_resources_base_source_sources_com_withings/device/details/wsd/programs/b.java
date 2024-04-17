package com.withings.device.details.wsd.programs;

import com.withings.alarm.model.WsdProgramElement;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: WsdProgramActivity.kt */
/* loaded from: classes3.dex */
final class b extends w implements l<List<? extends WsdProgramElement>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdProgramActivity f37168a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WsdProgramActivity wsdProgramActivity) {
        super(1);
        this.f37168a = wsdProgramActivity;
    }

    @Override // ym0.l
    public final y invoke(List<? extends WsdProgramElement> list) {
        WsdProgramActivity wsdProgramActivity = this.f37168a;
        WsdProgramActivity.D3(wsdProgramActivity).submitList(list);
        WsdProgramActivity.R3(wsdProgramActivity);
        return y.f85009a;
    }
}
