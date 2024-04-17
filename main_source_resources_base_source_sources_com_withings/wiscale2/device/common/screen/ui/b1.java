package com.withings.wiscale2.device.common.screen.ui;

import com.withings.common.compose.component.list.SlideState;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class b1 extends kotlin.jvm.internal.w implements ym0.p<Integer, SlideState, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f53268a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v1.w<SlideState> f53269b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(int i11, v1.w<SlideState> wVar) {
        super(2);
        this.f53268a = i11;
        this.f53269b = wVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, SlideState slideState) {
        int intValue = num.intValue();
        SlideState state = slideState;
        kotlin.jvm.internal.u.j(state, "state");
        if (intValue > this.f53268a) {
            this.f53269b.set(intValue, state);
            return nm0.y.f85009a;
        }
        throw new IndexOutOfBoundsException();
    }
}
