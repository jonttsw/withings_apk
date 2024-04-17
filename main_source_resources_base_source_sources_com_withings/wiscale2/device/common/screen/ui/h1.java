package com.withings.wiscale2.device.common.screen.ui;

import com.withings.common.compose.component.list.SlideState;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class h1 extends kotlin.jvm.internal.w implements ym0.a<SlideState> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v1.w<SlideState> f53328a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f53329b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i11, v1.w wVar) {
        super(0);
        this.f53328a = wVar;
        this.f53329b = i11;
    }

    @Override // ym0.a
    public final SlideState invoke() {
        SlideState slideState = (SlideState) kotlin.collections.x.N(this.f53329b, this.f53328a);
        if (slideState == null) {
            return SlideState.f34050a;
        }
        return slideState;
    }
}
