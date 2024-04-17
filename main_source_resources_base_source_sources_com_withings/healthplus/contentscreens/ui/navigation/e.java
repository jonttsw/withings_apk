package com.withings.healthplus.contentscreens.ui.navigation;

import com.withings.healthplus.contentscreens.ui.navigation.ContentScreenNavigation;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.l<String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f40145a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f40146b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f40147c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f40148d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r8.n nVar, String str, String str2, String str3) {
        super(1);
        this.f40145a = nVar;
        this.f40146b = str;
        this.f40147c = str2;
        this.f40148d = str3;
    }

    @Override // ym0.l
    public final y invoke(String str) {
        String videoUrl = str;
        u.j(videoUrl, "videoUrl");
        ContentScreenNavigation.Destinations.f40134b.getClass();
        this.f40145a.J(ContentScreenNavigation.Destinations.a.d(this.f40146b, videoUrl, this.f40147c, this.f40148d), d.f40144a);
        return y.f85009a;
    }
}
