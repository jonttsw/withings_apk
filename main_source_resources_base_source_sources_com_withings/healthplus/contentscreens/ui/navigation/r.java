package com.withings.healthplus.contentscreens.ui.navigation;

import com.withings.healthplus.contentscreens.ui.navigation.ContentScreenNavigation;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class r extends w implements ym0.l<String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f40171a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f40172b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f40173c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f40174d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(r8.n nVar, String str, String str2, String str3) {
        super(1);
        this.f40171a = nVar;
        this.f40172b = str;
        this.f40173c = str2;
        this.f40174d = str3;
    }

    @Override // ym0.l
    public final y invoke(String str) {
        String videoUrl = str;
        u.j(videoUrl, "videoUrl");
        ContentScreenNavigation.Destinations.f40134b.getClass();
        androidx.navigation.e.L(this.f40171a, ContentScreenNavigation.Destinations.a.c(this.f40172b, videoUrl, this.f40173c, this.f40174d), null, 6);
        return y.f85009a;
    }
}
