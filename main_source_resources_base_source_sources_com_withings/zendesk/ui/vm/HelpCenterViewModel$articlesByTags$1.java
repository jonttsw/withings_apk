package com.withings.zendesk.ui.vm;

import com.withings.zendesk.ktx.ZendeskLabelExtensionKt;
import com.withings.zendesk.models.ZendeskLabel;
import cp0.g;
import cp0.n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import pm0.a;
import ym0.l;
import zendesk.support.SearchArticle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lzendesk/support/SearchArticle;", "list", "Lnm0/j;", "Lcom/withings/zendesk/models/ZendeskLabel;", "invoke", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterViewModel$articlesByTags$1 extends w implements l<List<SearchArticle>, List<j<ZendeskLabel, List<SearchArticle>>>> {
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HelpCenterViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/withings/zendesk/models/ZendeskLabel;", "invoke", "(Lcom/withings/zendesk/models/ZendeskLabel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.withings.zendesk.ui.vm.HelpCenterViewModel$articlesByTags$1$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends w implements l<ZendeskLabel, Boolean> {
        final /* synthetic */ HelpCenterViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HelpCenterViewModel helpCenterViewModel) {
            super(1);
            this.this$0 = helpCenterViewModel;
        }

        @Override // ym0.l
        public final Boolean invoke(ZendeskLabel it) {
            u.j(it, "it");
            return Boolean.valueOf((u.e(ZendeskLabelExtensionKt.wordingResId(it, this.this$0.getApplication()), it.getZendeskLabel()) || ZendeskLabelExtensionKt.glyphResId(it, this.this$0.getApplication()) == 0) ? false : true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterViewModel$articlesByTags$1(HelpCenterViewModel helpCenterViewModel) {
        super(1);
        this.this$0 = helpCenterViewModel;
    }

    @Override // ym0.l
    public final List<j<ZendeskLabel, List<SearchArticle>>> invoke(List<SearchArticle> list) {
        u.j(list, "list");
        g h11 = n.h(x.t(this.this$0.getLabels$zendesk_release()), new AnonymousClass1(this.this$0));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = h11.iterator();
        while (true) {
            g.a aVar = (g.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            ZendeskLabel zendeskLabel = (ZendeskLabel) next;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SearchArticle) obj).getArticle().getLabelNames().contains(zendeskLabel.getZendeskLabel())) {
                    arrayList.add(obj);
                }
            }
            linkedHashMap.put(next, arrayList);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return x.D0(s0.o(linkedHashMap2), new Comparator() { // from class: com.withings.zendesk.ui.vm.HelpCenterViewModel$articlesByTags$1$invoke$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(Integer.valueOf(((ZendeskLabel) ((j) t11).a()).getOrder()), Integer.valueOf(((ZendeskLabel) ((j) t12).a()).getOrder()));
            }
        });
    }
}
