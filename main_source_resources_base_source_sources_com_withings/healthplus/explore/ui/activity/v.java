package com.withings.healthplus.explore.ui.activity;

import com.withings.core.webcontent.HMWebActivity;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class v extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40339a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ExploreTabActivity exploreTabActivity) {
        super(1);
        this.f40339a = exploreTabActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String authorLink = str;
        kotlin.jvm.internal.u.j(authorLink, "authorLink");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        ExploreTabActivity exploreTabActivity = this.f40339a;
        exploreTabActivity.startActivity(aVar.c(exploreTabActivity, null, authorLink));
        return nm0.y.f85009a;
    }
}
