package com.withings.core.webcontent;

import android.net.Uri;
import ga.f;
import gm.b;
import gm.e;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: HMWebActivity.kt */
/* loaded from: classes3.dex */
final class a extends w implements p<Uri, b.InterfaceC0988b, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HMWebActivity f35399a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HMWebActivity hMWebActivity) {
        super(2);
        this.f35399a = hMWebActivity;
    }

    @Override // ym0.p
    public final y invoke(Uri uri, b.InterfaceC0988b interfaceC0988b) {
        Uri shareData = uri;
        b.InterfaceC0988b callback = interfaceC0988b;
        u.j(shareData, "shareData");
        u.j(callback, "callback");
        String queryParameter = shareData.getQueryParameter("url");
        HMWebActivity activity = this.f35399a;
        if (queryParameter != null) {
            u.j(activity, "activity");
            String queryParameter2 = shareData.getQueryParameter("picture");
            f.a aVar = new f.a(activity);
            aVar.d(queryParameter2);
            aVar.r(new e(callback, activity, shareData, activity, queryParameter2, callback, shareData));
            w9.a.a(activity).d(aVar.b());
        }
        activity.loadUrl("javascript:clickedShareFromNavBar()");
        return y.f85009a;
    }
}
