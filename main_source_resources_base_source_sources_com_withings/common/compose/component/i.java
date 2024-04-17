package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Avatar.kt */
/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f33847a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Integer f33848b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f33849c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f33850d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f33851e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AvatarSize f33852f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f33853g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f33854h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, Integer num, Integer num2, String str2, String str3, AvatarSize avatarSize, boolean z5, ym0.a<nm0.y> aVar) {
        super(2);
        this.f33847a = str;
        this.f33848b = num;
        this.f33849c = num2;
        this.f33850d = str2;
        this.f33851e = str3;
        this.f33852f = avatarSize;
        this.f33853g = z5;
        this.f33854h = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, -532159697, new h(this.f33847a, this.f33848b, this.f33849c, this.f33850d, this.f33851e, this.f33852f, this.f33853g, this.f33854h)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
