package com.withings.healthplus.explore.ui.activity;

import com.withings.contentproviders.eightfit.model.ContentCategory;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.library.ui.navigation.LibraryNavigation;
import com.withings.healthplus.swipe.ui.SwipeTypeAction;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class f0 extends kotlin.jvm.internal.w implements ym0.r<ContentCategory, String, String, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40310a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ExploreTabActivity exploreTabActivity) {
        super(4);
        this.f40310a = exploreTabActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(ContentCategory contentCategory, String str, String str2, Integer num) {
        TaskType a11;
        ContentCategory contentCategory2 = contentCategory;
        String str3 = str;
        String programInformation = str2;
        Integer num2 = num;
        kotlin.jvm.internal.u.j(programInformation, "programInformation");
        int a12 = SwipeTypeAction.f40498b.a();
        ExploreTabActivity exploreTabActivity = this.f40310a;
        if (num2 != null && num2.intValue() == a12) {
            if (contentCategory2 != null && (a11 = qu.a.a(contentCategory2)) != null) {
                r8.n nVar = exploreTabActivity.f40243f;
                if (nVar != null) {
                    androidx.navigation.e.L(nVar, LibraryNavigation.Destinations.a.a(LibraryNavigation.Destinations.f40407b, a11, ExploreTabActivity.D3(exploreTabActivity).b(), str3, programInformation, 20), null, 6);
                } else {
                    kotlin.jvm.internal.u.s("navController");
                    throw null;
                }
            }
        } else {
            int a13 = SwipeTypeAction.f40499c.a();
            if (num2 != null && num2.intValue() == a13) {
                cr.a.a(new nm0.j(str3, contentCategory2), new d0(exploreTabActivity));
            } else {
                int a14 = SwipeTypeAction.f40500d.a();
                if (num2 != null && num2.intValue() == a14) {
                    cr.a.a(new nm0.j(str3, contentCategory2), new e0(exploreTabActivity));
                }
            }
        }
        return nm0.y.f85009a;
    }
}
