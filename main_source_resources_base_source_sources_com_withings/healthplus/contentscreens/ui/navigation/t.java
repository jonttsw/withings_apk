package com.withings.healthplus.contentscreens.ui.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.material3.j5;
import androidx.compose.runtime.a;
import androidx.lifecycle.g1;
import androidx.lifecycle.n1;
import androidx.lifecycle.u;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.congrats.ui.model.SuccessTaskInfo;
import com.withings.healthplus.contentscreens.ui.model.ContentScreenUi;
import com.withings.healthplus.contentscreens.ui.model.ContentState;
import com.withings.healthplus.contentscreens.ui.viewmodel.ContentScreenViewModel;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import i6.a;
import java.util.List;
import k1.r0;
import kotlin.jvm.internal.w;
import lu.j0;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class t extends w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f40177a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, y> f40178b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<Uri, y> f40179c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi>, y> f40180d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.q<TaskType, String, String, y> f40181e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.q<vt.a, SuccessTaskInfo, Integer, y> f40182f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f40183g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ r8.n f40184h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(ym0.a<y> aVar, ym0.l<? super String, y> lVar, ym0.l<? super Uri, y> lVar2, ym0.l<? super List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi>, y> lVar3, ym0.q<? super TaskType, ? super String, ? super String, y> qVar, ym0.q<? super vt.a, ? super SuccessTaskInfo, ? super Integer, y> qVar2, ym0.a<y> aVar2, r8.n nVar) {
        super(4);
        this.f40177a = aVar;
        this.f40178b = lVar;
        this.f40179c = lVar2;
        this.f40180d = lVar3;
        this.f40181e = qVar;
        this.f40182f = qVar2;
        this.f40183g = aVar2;
        this.f40184h = nVar;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        i6.a aVar2;
        String string;
        String str;
        String str2;
        String str3;
        r8.n nVar;
        String str4;
        String str5;
        String str6;
        boolean z5;
        androidx.navigation.d dVar2 = dVar;
        androidx.compose.runtime.a aVar3 = aVar;
        j5.e(num, cVar, "$this$composable", dVar2, "it");
        aVar3.s(1890788296);
        n1 a11 = j6.a.a(aVar3);
        if (a11 != null) {
            fk0.c a12 = e6.a.a(a11, aVar3);
            aVar3.s(1729797275);
            if (a11 instanceof u) {
                aVar2 = ((u) a11).getDefaultViewModelCreationExtras();
            } else {
                aVar2 = a.C1058a.f71431b;
            }
            g1 a13 = j6.b.a(ContentScreenViewModel.class, a11, null, a12, aVar2, aVar3);
            aVar3.J();
            aVar3.J();
            ContentScreenViewModel contentScreenViewModel = (ContentScreenViewModel) a13;
            r0 c11 = h6.b.c(contentScreenViewModel.k0(), aVar3);
            r0 c12 = h6.b.c(contentScreenViewModel.i0(), aVar3);
            Bundle c13 = dVar2.c();
            if (c13 != null && (string = c13.getString(NavigationArguments.CONTENT_ID)) != null) {
                Bundle c14 = dVar2.c();
                y yVar = null;
                if (c14 != null) {
                    str = c14.getString(NavigationArguments.PROGRAM_INFORMATION);
                } else {
                    str = null;
                }
                Bundle c15 = dVar2.c();
                if (c15 != null) {
                    str2 = c15.getString(NavigationArguments.MISSION_INFORMATION);
                } else {
                    str2 = null;
                }
                Bundle c16 = dVar2.c();
                if (c16 != null) {
                    str3 = c16.getString(NavigationArguments.ORIGINAL_CONTENT_ID_TO_BE_SWAPPED);
                } else {
                    str3 = null;
                }
                aVar3.s(-2038900130);
                r8.n nVar2 = this.f40184h;
                if (str3 == null) {
                    nVar = nVar2;
                    str4 = str2;
                    str5 = str;
                    str6 = string;
                } else {
                    nVar = nVar2;
                    str4 = str2;
                    str5 = str;
                    str6 = string;
                    j0.b(this.f40178b, this.f40177a, this.f40183g, this.f40179c, new o(nVar2, string, str, str2), this.f40180d, new p(nVar2, string, str, str2), null, null, aVar3, 0, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
                    yVar = y.f85009a;
                }
                aVar3.J();
                if (yVar == null) {
                    ContentState contentState = (ContentState) c11.getValue();
                    List list = (List) c12.getValue();
                    if (contentScreenViewModel.q0() != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z11 = z5;
                    r8.n nVar3 = nVar;
                    String str7 = str4;
                    String str8 = str5;
                    q qVar = new q(nVar3, str6, str8, str7);
                    r rVar = new r(nVar3, str6, str8, str7);
                    aVar3.s(-2038896992);
                    ym0.q<TaskType, String, String, y> qVar2 = this.f40181e;
                    boolean K = aVar3.K(qVar2) | aVar3.K(str8);
                    Object t11 = aVar3.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new s(qVar2, str8);
                        aVar3.n(t11);
                    }
                    aVar3.J();
                    lu.m.a(contentState, z11, list, this.f40177a, this.f40178b, this.f40179c, this.f40180d, qVar, rVar, (ym0.p) t11, null, null, this.f40182f, aVar3, 512, 0, 3072);
                }
                return y.f85009a;
            }
            throw new Exception("contentId shouldn't be null");
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
