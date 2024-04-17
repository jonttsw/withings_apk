package com.withings.zendesk.ui;

import androidx.compose.material.v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.protobuf.t;
import java.util.List;
import k1.j1;
import k1.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l0.q;
import nm0.y;
import yk.o;
import ym0.p;
import zendesk.support.SearchArticle;
/* compiled from: ArticlePage.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class ArticlePage$bindFooter$1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
    final /* synthetic */ List<SearchArticle> $relatedArticles;
    final /* synthetic */ ArticlePage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArticlePage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "(Landroidx/compose/runtime/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.withings.zendesk.ui.ArticlePage$bindFooter$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends w implements p<androidx.compose.runtime.a, Integer, y> {
        final /* synthetic */ List<SearchArticle> $relatedArticles;
        final /* synthetic */ ArticlePage this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends SearchArticle> list, ArticlePage articlePage) {
            super(2);
            this.$relatedArticles = list;
            this.this$0 = articlePage;
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
            invoke(aVar, num.intValue());
            return y.f85009a;
        }

        public final void invoke(androidx.compose.runtime.a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.h()) {
                aVar.C();
                return;
            }
            List<SearchArticle> list = this.$relatedArticles;
            ArticlePage articlePage = this.this$0;
            aVar.s(-483455358);
            e.a aVar2 = androidx.compose.ui.e.f8927a;
            l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar, -1323940314);
            int G = aVar.G();
            v0 l5 = aVar.l();
            g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
            if (aVar.i() instanceof k1.d) {
                aVar.A();
                if (aVar.e()) {
                    aVar.F(a12);
                } else {
                    aVar.m();
                }
                p c12 = t.c(aVar, a11, aVar, l5);
                if (aVar.e() || !u.e(aVar.t(), Integer.valueOf(G))) {
                    q.a(G, aVar, G, c12);
                }
                c11.invoke(j1.a(aVar), aVar, 0);
                aVar.s(2058660585);
                FooterArticleKt.RelatedArticles(list, new ArticlePage$bindFooter$1$1$1$1(articlePage), aVar, 8);
                FooterArticleKt.MoreLink(new ArticlePage$bindFooter$1$1$1$2(articlePage), new ArticlePage$bindFooter$1$1$1$3(articlePage), new ArticlePage$bindFooter$1$1$1$4(articlePage), aVar, 0);
                aVar.J();
                aVar.o();
                aVar.J();
                aVar.J();
                return;
            }
            a3.g.s();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArticlePage$bindFooter$1(List<? extends SearchArticle> list, ArticlePage articlePage) {
        super(2);
        this.$relatedArticles = list;
        this.this$0 = articlePage;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(androidx.compose.runtime.a aVar, Integer num) {
        invoke(aVar, num.intValue());
        return y.f85009a;
    }

    public final void invoke(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.h()) {
            aVar.C();
        } else {
            o.b(false, s1.b.b(aVar, -443012712, new AnonymousClass1(this.$relatedArticles, this.this$0)), aVar, 48, 1);
        }
    }
}
