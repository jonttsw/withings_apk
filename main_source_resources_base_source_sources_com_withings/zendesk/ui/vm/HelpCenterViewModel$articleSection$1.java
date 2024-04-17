package com.withings.zendesk.ui.vm;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import ym0.l;
import zendesk.support.Article;
import zendesk.support.SearchArticle;
import zendesk.support.Section;
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnm0/j;", "Lzendesk/support/Article;", "", "Lzendesk/support/SearchArticle;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lzendesk/support/Section;", "invoke", "(Lnm0/j;)Lzendesk/support/Section;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class HelpCenterViewModel$articleSection$1 extends w implements l<j<Article, List<SearchArticle>>, Section> {
    public static final HelpCenterViewModel$articleSection$1 INSTANCE = new HelpCenterViewModel$articleSection$1();

    HelpCenterViewModel$articleSection$1() {
        super(1);
    }

    @Override // ym0.l
    public final Section invoke(j<Article, List<SearchArticle>> jVar) {
        Object obj;
        Article a11 = jVar.a();
        Iterator<T> it = jVar.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (u.e(((SearchArticle) obj).getArticle().getId(), a11.getId())) {
                break;
            }
        }
        SearchArticle searchArticle = (SearchArticle) obj;
        if (searchArticle != null) {
            return searchArticle.getSection();
        }
        return null;
    }
}
