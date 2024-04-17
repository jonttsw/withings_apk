package com.withings.zendesk.ui.vm;

import com.withings.zendesk.models.ZendeskLabel;
import com.withings.zendesk.models.ZendeskLabelData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import ym0.l;
import zendesk.support.SearchArticle;
import zendesk.support.Section;
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00000\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lnm0/j;", "Lcom/withings/zendesk/models/ZendeskLabel;", "Lzendesk/support/SearchArticle;", "it", "Lcom/withings/zendesk/models/ZendeskLabelData;", "invoke", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class HelpCenterViewModel$labelsAndSections$1 extends w implements l<List<j<ZendeskLabel, List<SearchArticle>>>, List<ZendeskLabelData>> {
    public static final HelpCenterViewModel$labelsAndSections$1 INSTANCE = new HelpCenterViewModel$labelsAndSections$1();

    HelpCenterViewModel$labelsAndSections$1() {
        super(1);
    }

    @Override // ym0.l
    public final List<ZendeskLabelData> invoke(List<j<ZendeskLabel, List<SearchArticle>>> it) {
        u.j(it, "it");
        List<j<ZendeskLabel, List<SearchArticle>>> list = it;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            ZendeskLabel zendeskLabel = (ZendeskLabel) jVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : (List) jVar.b()) {
                Section section = ((SearchArticle) obj).getSection();
                Object obj2 = linkedHashMap.get(section);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(section, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add((Section) entry.getKey());
            }
            arrayList.add(new ZendeskLabelData(zendeskLabel, arrayList2));
        }
        return arrayList;
    }
}
