package com.withings.common.compose.component;

import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Avatar.kt */
/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Integer f33742a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f33743b = C1987R.drawable.icon_medium_navigation_plus;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AvatarSize f33744c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f33745d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Integer num, AvatarSize avatarSize, ym0.a aVar) {
        super(2);
        this.f33742a = num;
        this.f33744c = avatarSize;
        this.f33745d = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, 687292059, new e(this.f33742a, this.f33743b, this.f33744c, this.f33745d)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
