package com.withings.ecg.details;
/* compiled from: EcgListActivity.kt */
/* loaded from: classes3.dex */
final class o1 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgListActivity f38281a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(EcgListActivity ecgListActivity) {
        super(1);
        this.f38281a = ecgListActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        if (bool != null) {
            this.f38281a.finish();
        }
        return nm0.y.f85009a;
    }
}
