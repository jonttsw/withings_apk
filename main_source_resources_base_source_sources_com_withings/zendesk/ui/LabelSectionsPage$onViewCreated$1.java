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
/* compiled from: LabelSectionsPage.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062>\u0010\u0005\u001a:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00000\u0001 \u0004*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00000\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lnm0/j;", "Lcom/withings/zendesk/models/ZendeskLabel;", "Lzendesk/support/SearchArticle;", "kotlin.jvm.PlatformType", "it", "Lnm0/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class LabelSectionsPage$onViewCreated$1 extends w implements l<List<? extends j<? extends ZendeskLabel, ? extends List<? extends SearchArticle>>>, y> {
    final /* synthetic */ LabelSectionsPage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelSectionsPage$onViewCreated$1(LabelSectionsPage labelSectionsPage) {
        super(1);
        this.this$0 = labelSectionsPage;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(List<? extends j<? extends ZendeskLabel, ? extends List<? extends SearchArticle>>> list) {
        invoke2((List<? extends j<ZendeskLabel, ? extends List<? extends SearchArticle>>>) list);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends j<ZendeskLabel, ? extends List<? extends SearchArticle>>> list) {
        SectionAdapter sectionAdapter;
        LabelSectionsPageArgs args;
        sectionAdapter = this.this$0.sectionAdapter;
        u.g(list);
        LabelSectionsPage labelSectionsPage = this.this$0;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            String zendeskLabel = ((ZendeskLabel) jVar.c()).getZendeskLabel();
            args = labelSectionsPage.getArgs();
            if (u.e(zendeskLabel, args.getLabel().getZendeskLabel())) {
                Iterable<SearchArticle> iterable = (Iterable) jVar.d();
                ArrayList arrayList = new ArrayList(x.y(iterable, 10));
                for (SearchArticle searchArticle : iterable) {
                    arrayList.add(searchArticle.getSection());
                }
                sectionAdapter.submitList(x.B(arrayList));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
