package com.withings.wiscale2.user.ui.profile;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity f61975a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f61976b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f61977c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f61978d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(EditProfileActivity editProfileActivity, boolean z5, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f61975a = editProfileActivity;
        this.f61976b = z5;
        this.f61977c = aVar;
        this.f61978d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f61978d | 1);
        ym0.a<nm0.y> aVar2 = this.f61977c;
        boolean z5 = this.f61976b;
        this.f61975a.D3(g11, aVar, aVar2, z5);
        return nm0.y.f85009a;
    }
}
