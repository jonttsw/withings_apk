package com.withings.zendesk.ui;

import com.withings.zendesk.models.ZendeskLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import ym0.l;
import zendesk.support.SearchArticle;
/* compiled from: SectionArticlesPage.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062>\u0010\u0005\u001a:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00000\u0001 \u0004*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00000\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lnm0/j;", "Lcom/withings/zendesk/models/ZendeskLabel;", "Lzendesk/support/SearchArticle;", "kotlin.jvm.PlatformType", "it", "Lnm0/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class SectionArticlesPage$onViewCreated$2 extends w implements l<List<? extends j<? extends ZendeskLabel, ? extends List<? extends SearchArticle>>>, y> {
    final /* synthetic */ SectionArticlesPage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionArticlesPage$onViewCreated$2(SectionArticlesPage sectionArticlesPage) {
        super(1);
        this.this$0 = sectionArticlesPage;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(List<? extends j<? extends ZendeskLabel, ? extends List<? extends SearchArticle>>> list) {
        invoke2((List<? extends j<ZendeskLabel, ? extends List<? extends SearchArticle>>>) list);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends j<ZendeskLabel, ? extends List<? extends SearchArticle>>> list) {
        SectionArticlesPageArgs args;
        ArticleAdapter articleAdapter;
        SectionArticlesPageArgs args2;
        SectionArticlesPageArgs args3;
        u.g(list);
        SectionArticlesPage sectionArticlesPage = this.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            String zendeskLabel = ((ZendeskLabel) jVar.c()).getZendeskLabel();
            args = sectionArticlesPage.getArgs();
            if (u.e(zendeskLabel, args.getLabel().getZendeskLabel())) {
                SectionArticlesPage sectionArticlesPage2 = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) jVar.d()) {
                    Long id2 = ((SearchArticle) obj).getSection().getId();
                    args3 = sectionArticlesPage2.getArgs();
                    if (u.e(id2, args3.getSection().getId())) {
                        arrayList.add(obj);
                    }
                }
                SectionArticlesPage sectionArticlesPage3 = this.this$0;
                ArrayList<SearchArticle> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    List<String> labelNames = ((SearchArticle) obj2).getArticle().getLabelNames();
                    args2 = sectionArticlesPage3.getArgs();
                    if (labelNames.contains(args2.getLabel().getZendeskLabel())) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(x.y(arrayList2, 10));
                for (SearchArticle searchArticle : arrayList2) {
                    arrayList3.add(searchArticle.getArticle());
                }
                articleAdapter = this.this$0.articlesAdapter;
                articleAdapter.submitList(arrayList3);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
