package com.withings.wiscale2.device.common.screen.ui;

import com.withings.common.compose.component.list.SlideState;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class c1 extends kotlin.jvm.internal.w implements ym0.p<Integer, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v1.w<SlideState> f53276a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<sc0.b> f53277b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.p<Integer, Integer, nm0.y> f53278c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(v1.w<SlideState> wVar, List<sc0.b> list, ym0.p<? super Integer, ? super Integer, nm0.y> pVar) {
        super(2);
        this.f53276a = wVar;
        this.f53277b = list;
        this.f53278c = pVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, Integer num2) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        v1.w<SlideState> wVar = this.f53276a;
        wVar.clear();
        List<sc0.b> list = this.f53277b;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (sc0.b bVar : list) {
            arrayList.add(SlideState.f34050a);
        }
        wVar.addAll(arrayList);
        this.f53278c.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        return nm0.y.f85009a;
    }
}
