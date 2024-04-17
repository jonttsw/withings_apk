package com.withings.ecg.heartsound;
/* compiled from: HeartSoundListActivity.kt */
/* loaded from: classes3.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartSoundListActivity f38485a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(HeartSoundListActivity heartSoundListActivity) {
        super(1);
        this.f38485a = heartSoundListActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        this.f38485a.finish();
        return nm0.y.f85009a;
    }
}
