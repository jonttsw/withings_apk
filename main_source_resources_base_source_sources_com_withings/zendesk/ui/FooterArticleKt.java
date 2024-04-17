package com.withings.zendesk.ui;

import androidx.compose.foundation.h;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.h6;
import androidx.compose.material.t3;
import androidx.compose.material3.g9;
import androidx.compose.material3.i1;
import androidx.compose.material3.j5;
import androidx.compose.runtime.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.common.compose.component.y3;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import dq.x;
import en0.r;
import java.util.List;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import r0.d0;
import x1.b;
import ym0.l;
import ym0.p;
import zendesk.support.Article;
import zendesk.support.SearchArticle;
/* compiled from: FooterArticle.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0012\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/Function0;", "Lnm0/y;", "onSearchClicked", "onCommunityClicked", "onContactClicked", "MoreLink", "(Lym0/a;Lym0/a;Lym0/a;Landroidx/compose/runtime/a;I)V", "", "title", "onClick", "Link", "(Ljava/lang/String;Lym0/a;Landroidx/compose/runtime/a;I)V", "", "Lzendesk/support/SearchArticle;", "articles", "Lkotlin/Function1;", "Lzendesk/support/Article;", "onArticleClicked", "RelatedArticles", "(Ljava/util/List;Lym0/l;Landroidx/compose/runtime/a;I)V", "item", "RelatedArticleItem", "(Lzendesk/support/SearchArticle;Lym0/l;Landroidx/compose/runtime/a;I)V", "zendesk_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FooterArticleKt {
    public static final void Link(String title, ym0.a<y> onClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        u.j(title, "title");
        u.j(onClick, "onClick");
        androidx.compose.runtime.b g11 = aVar.g(-831785330);
        if ((i11 & 14) == 0) {
            if (g11.K(title)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onClick)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.e j5 = x0.j(h.b(e1.f(aVar2, 56), false, onClick, 7), yk.h.d(), 0.0f, yk.h.c(), 0.0f, 10);
            l0 b10 = j5.b(g11, 693286680, b.a.i(), g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            g.D.getClass();
            ym0.a a11 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(j5);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a11);
                } else {
                    g11.m();
                }
                p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    nk.a.a(new LayoutWeightElement(r.f(1.0f, Float.MAX_VALUE), true), title, 1, 0L, 2, 0, null, null, g11, ((i12 << 3) & 112) | 24960, ConstantsWs.WS_STATUS_SHARINGGETERROR);
                    d0.a(e1.r(aVar2, yk.h.d()), g11);
                    t3.b(f1.h.a(), ConstantsWs.PRODUCT_TYPE_ACCESSORY, null, ((i1) g11.D(androidx.compose.material3.j1.e())).D(), g11, 48, 4);
                    g9.a(g11);
                } else {
                    throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
                }
            } else {
                a3.g.s();
                throw null;
            }
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new FooterArticleKt$Link$2(title, onClick, i11));
        }
    }

    public static final void MoreLink(ym0.a<y> onSearchClicked, ym0.a<y> onCommunityClicked, ym0.a<y> onContactClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u.j(onSearchClicked, "onSearchClicked");
        u.j(onCommunityClicked, "onCommunityClicked");
        u.j(onContactClicked, "onContactClicked");
        androidx.compose.runtime.b g11 = aVar.g(-1563157626);
        if ((i11 & 14) == 0) {
            if (g11.w(onSearchClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onCommunityClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onContactClicked)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            y3.d(null, ay.b.u(C1987R.string.helpCenter_footerMoreLinkTitle, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, 859934672, new FooterArticleKt$MoreLink$1(onSearchClicked, onCommunityClicked, onContactClicked)), g11, 1572864, 61);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new FooterArticleKt$MoreLink$2(onSearchClicked, onCommunityClicked, onContactClicked, i11));
        }
    }

    public static final void RelatedArticleItem(SearchArticle item, l<? super Article, y> onArticleClicked, androidx.compose.runtime.a aVar, int i11) {
        u.j(item, "item");
        u.j(onArticleClicked, "onArticleClicked");
        androidx.compose.runtime.b g11 = aVar.g(-1710961108);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.e j5 = x0.j(h.b(e1.f(aVar2, 56), false, new FooterArticleKt$RelatedArticleItem$1(onArticleClicked, item), 7), yk.h.d(), 0.0f, yk.h.c(), 0.0f, 10);
        l0 b10 = j5.b(g11, 693286680, b.a.i(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(j5);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(r.f(1.0f, Float.MAX_VALUE), true);
                String title = item.getArticle().getTitle();
                if (title == null) {
                    title = "";
                }
                nk.u.b(layoutWeightElement, title, 2, 0L, 2, null, 0, g11, 24960, 104);
                d0.a(e1.r(aVar2, yk.h.d()), g11);
                t3.b(f1.h.a(), ConstantsWs.PRODUCT_TYPE_ACCESSORY, null, ((i1) g11.D(androidx.compose.material3.j1.e())).D(), g11, 48, 4);
                v b12 = h6.b(g11);
                if (b12 != null) {
                    b12.G(new FooterArticleKt$RelatedArticleItem$3(item, onArticleClicked, i11));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(defpackage.b.b("invalid weight ", 1.0f, "; must be greater than zero").toString());
        }
        a3.g.s();
        throw null;
    }

    public static final void RelatedArticles(List<? extends SearchArticle> articles, l<? super Article, y> onArticleClicked, androidx.compose.runtime.a aVar, int i11) {
        u.j(articles, "articles");
        u.j(onArticleClicked, "onArticleClicked");
        androidx.compose.runtime.b g11 = aVar.g(-1745015694);
        y3.d(null, ay.b.u(C1987R.string.helpCenter_relatedArticles, g11), null, 0.0f, 0.0f, 0L, s1.b.b(g11, -1092580676, new FooterArticleKt$RelatedArticles$1(articles, onArticleClicked)), g11, 1572864, 61);
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new FooterArticleKt$RelatedArticles$2(articles, onArticleClicked, i11));
        }
    }
}
