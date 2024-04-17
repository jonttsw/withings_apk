package com.withings.common.compose.component;
/* compiled from: SegmentedControl.kt */
/* loaded from: classes3.dex */
final class e4 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f33738a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f33739b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(int i11, ym0.l lVar) {
        super(0);
        this.f33738a = lVar;
        this.f33739b = i11;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f33738a.invoke(Integer.valueOf(this.f33739b));
        return nm0.y.f85009a;
    }
}
