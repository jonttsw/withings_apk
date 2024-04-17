package com.withings.healthplus.explore.ui.activity;

import android.net.Uri;
import com.withings.core.webcontent.HMWebActivity;
import org.apache.http.HttpHost;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.l<Uri, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40342a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ExploreTabActivity exploreTabActivity) {
        super(1);
        this.f40342a = exploreTabActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Uri uri) {
        String scheme;
        Uri uri2 = uri;
        kotlin.jvm.internal.u.j(uri2, "uri");
        gm.b bVar = gm.b.f69354a;
        ExploreTabActivity exploreTabActivity = this.f40342a;
        if (!bVar.e(uri2, new x(exploreTabActivity)) && (scheme = uri2.getScheme()) != null && dp0.j.R(scheme, HttpHost.DEFAULT_SCHEME_NAME, false)) {
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            String uri3 = uri2.toString();
            kotlin.jvm.internal.u.i(uri3, "toString(...)");
            exploreTabActivity.startActivity(aVar.c(exploreTabActivity, null, uri3));
        }
        return nm0.y.f85009a;
    }
}
