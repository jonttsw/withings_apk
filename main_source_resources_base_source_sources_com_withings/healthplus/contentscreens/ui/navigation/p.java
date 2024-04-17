package com.withings.healthplus.contentscreens.ui.navigation;

import com.withings.healthplus.contentscreens.ui.navigation.ContentScreenNavigation;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class p extends w implements ym0.l<String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f40163a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f40164b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f40165c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f40166d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r8.n nVar, String str, String str2, String str3) {
        super(1);
        this.f40163a = nVar;
        this.f40164b = str;
        this.f40165c = str2;
        this.f40166d = str3;
    }

    @Override // ym0.l
    public final y invoke(String str) {
        String videoUrl = str;
        u.j(videoUrl, "videoUrl");
        ContentScreenNavigation.Destinations.f40134b.getClass();
        androidx.navigation.e.L(this.f40163a, ContentScreenNavigation.Destinations.a.c(this.f40164b, videoUrl, this.f40165c, this.f40166d), null, 6);
        return y.f85009a;
    }
}
