package com.withings.zendesk.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.zendesk.models.SectionResponse;
import com.withings.zendesk.models.ZendeskLabel;
import com.withings.zendesk.repositories.network.ZendeskSectionsRetriever;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import qm0.d;
import qm0.i;
import rm0.a;
import zendesk.support.Article;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpCenterSearch;
import zendesk.support.SearchArticle;
import zendesk.support.SimpleArticle;
import zendesk.support.SuggestedArticleResponse;
import zendesk.support.SuggestedArticleSearch;
/* compiled from: HelpCenterProviderExtension.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001aD\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\u000e\u001a\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001e\u0010\u001b\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lzendesk/support/HelpCenterProvider;", "", "categoryId", "sectionId", "", "Lzendesk/support/SearchArticle;", "awaitArticlesForCategory", "(Lzendesk/support/HelpCenterProvider;JJLqm0/d;)Ljava/lang/Object;", "Lcom/withings/zendesk/models/ZendeskLabel;", "labels", "", FirebaseAnalytics.Event.SEARCH, "", "Lzendesk/support/Article;", "(Lzendesk/support/HelpCenterProvider;JLjava/util/List;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lzendesk/support/SimpleArticle;", "suggestionByCategory", "(Lzendesk/support/HelpCenterProvider;JLqm0/d;)Ljava/lang/Object;", Constants.ScionAnalytics.PARAM_LABEL, "suggestionByLabel", "(Lzendesk/support/HelpCenterProvider;JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "suggestionByLabelAndSection", "(Lzendesk/support/HelpCenterProvider;Ljava/lang/String;JLqm0/d;)Ljava/lang/Object;", ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE, "relatedArticles", "(Lzendesk/support/HelpCenterProvider;Lzendesk/support/Article;Lqm0/d;)Ljava/lang/Object;", "articleId", "getArticleById", "zendesk_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterProviderExtensionKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object awaitArticlesForCategory(HelpCenterProvider helpCenterProvider, long j5, long j11, d<? super List<? extends SearchArticle>> dVar) {
        final i iVar = new i(a.b(dVar));
        List<SectionResponse> sections = new ZendeskSectionsRetriever().getSections(j5, j11);
        HelpCenterSearch.Builder withIncludes = new HelpCenterSearch.Builder().withCategoryId(new Long(j5)).withIncludes("sections", "categories");
        List<SectionResponse> list = sections;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (SectionResponse sectionResponse : list) {
            arrayList.add(new Long(sectionResponse.getId()));
        }
        helpCenterProvider.searchArticles(withIncludes.withSectionIds(arrayList).perPage(new Integer(1000)).build(), new yj0.d<List<? extends SearchArticle>>() { // from class: com.withings.zendesk.ktx.HelpCenterProviderExtensionKt$awaitArticlesForCategory$2$2
            @Override // yj0.d
            public void onError(yj0.a aVar) {
                iVar.resumeWith(i0.f76187a);
            }

            @Override // yj0.d
            public void onSuccess(List<? extends SearchArticle> list2) {
                d<List<? extends SearchArticle>> dVar2 = iVar;
                if (list2 == null) {
                    list2 = i0.f76187a;
                }
                dVar2.resumeWith(list2);
            }
        });
        Object a11 = iVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        return a11;
    }

    public static final Object getArticleById(HelpCenterProvider helpCenterProvider, long j5, d<? super Article> dVar) {
        final i iVar = new i(a.b(dVar));
        helpCenterProvider.getArticle(new Long(j5), new yj0.d<Article>() { // from class: com.withings.zendesk.ktx.HelpCenterProviderExtensionKt$getArticleById$2$1
            @Override // yj0.d
            public void onError(yj0.a aVar) {
                iVar.resumeWith(null);
            }

            @Override // yj0.d
            public void onSuccess(Article article) {
                u.j(article, "article");
                iVar.resumeWith(article);
            }
        });
        Object a11 = iVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        return a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object relatedArticles(HelpCenterProvider helpCenterProvider, Article article, d<? super List<? extends SearchArticle>> dVar) {
        final i iVar = new i(a.b(dVar));
        helpCenterProvider.searchArticles(new HelpCenterSearch.Builder().withIncludes("sections", "categories").withSectionId(article.getSectionId()).perPage(new Integer(25)).build(), new yj0.d<List<? extends SearchArticle>>() { // from class: com.withings.zendesk.ktx.HelpCenterProviderExtensionKt$relatedArticles$2$1
            @Override // yj0.d
            public void onError(yj0.a aVar) {
                iVar.resumeWith(i0.f76187a);
            }

            @Override // yj0.d
            public void onSuccess(List<? extends SearchArticle> list) {
                d<List<? extends SearchArticle>> dVar2 = iVar;
                if (list == null) {
                    list = i0.f76187a;
                }
                dVar2.resumeWith(x.D0(list, new Comparator() { // from class: com.withings.zendesk.ktx.HelpCenterProviderExtensionKt$relatedArticles$2$1$onSuccess$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t11, T t12) {
                        return pm0.a.b(Integer.valueOf(((SearchArticle) t12).getArticle().getUpvoteCount()), Integer.valueOf(((SearchArticle) t11).getArticle().getUpvoteCount()));
                    }
                }));
            }
        });
        Object a11 = iVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        return a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object search(HelpCenterProvider helpCenterProvider, long j5, final List<ZendeskLabel> list, String str, d<? super Map<ZendeskLabel, ? extends List<? extends Article>>> dVar) {
        final i iVar = new i(a.b(dVar));
        HelpCenterSearch.Builder withIncludes = new HelpCenterSearch.Builder().withCategoryId(new Long(j5)).withQuery(str).withIncludes("sections", "categories");
        List<ZendeskLabel> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (ZendeskLabel zendeskLabel : list2) {
            arrayList.add(zendeskLabel.getZendeskLabel());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        helpCenterProvider.searchArticles(withIncludes.withLabelNames((String[]) Arrays.copyOf(strArr, strArr.length)).perPage(new Integer(25)).build(), new yj0.d<List<? extends SearchArticle>>() { // from class: com.withings.zendesk.ktx.HelpCenterProviderExtensionKt$search$2$2
            @Override // yj0.d
            public void onError(yj0.a aVar) {
                Map map;
                d<Map<ZendeskLabel, ? extends List<? extends Article>>> dVar2 = iVar;
                map = j0.f76190a;
                dVar2.resumeWith(map);
            }

            @Override // yj0.d
            public void onSuccess(List<? extends SearchArticle> list3) {
                d<Map<ZendeskLabel, ? extends List<? extends Article>>> dVar2 = iVar;
                if (list3 == null) {
                    list3 = i0.f76187a;
                }
                List<? extends SearchArticle> list4 = list3;
                ArrayList arrayList2 = new ArrayList(x.y(list4, 10));
                for (SearchArticle searchArticle : list4) {
                    arrayList2.add(searchArticle.getArticle());
                }
                List<ZendeskLabel> list5 = list;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : arrayList2) {
                    Article article = (Article) obj;
                    for (ZendeskLabel zendeskLabel2 : list5) {
                        if (article.getLabelNames().contains(zendeskLabel2.getZendeskLabel())) {
                            Object obj2 = linkedHashMap.get(zendeskLabel2);
                            if (obj2 == null) {
                                obj2 = new ArrayList();
                                linkedHashMap.put(zendeskLabel2, obj2);
                            }
                            ((List) obj2).add(obj);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                dVar2.resumeWith(linkedHashMap);
            }
        });
        Object a11 = iVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        return a11;
    }

    public static final Object suggestionByCategory(HelpCenterProvider helpCenterProvider, long j5, d<? super List<? extends SimpleArticle>> dVar) {
        final i iVar = new i(a.b(dVar));
        helpCenterProvider.getSuggestedArticles(new SuggestedArticleSearch.Builder().withCategoryId(new Long(j5)).build(), new yj0.d<SuggestedArticleResponse>() { // from class: com.withings.zendesk.ktx.HelpCenterProviderExtensionKt$suggestionByCategory$2$1
            @Override // yj0.d
            public void onError(yj0.a aVar) {
                iVar.resumeWith(i0.f76187a);
            }

            @Override // yj0.d
            public void onSuccess(SuggestedArticleResponse suggestedArticleResponse) {
                d<List<? extends SimpleArticle>> dVar2 = iVar;
                List<SimpleArticle> results = suggestedArticleResponse != null ? suggestedArticleResponse.getResults() : null;
                if (results == null) {
                    results = i0.f76187a;
                }
                dVar2.resumeWith(results);
            }
        });
        Object a11 = iVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        return a11;
    }

    public static final Object suggestionByLabel(HelpCenterProvider helpCenterProvider, long j5, String str, d<? super List<? extends SimpleArticle>> dVar) {
        final i iVar = new i(a.b(dVar));
        helpCenterProvider.getSuggestedArticles(new SuggestedArticleSearch.Builder().withCategoryId(new Long(j5)).build(), new yj0.d<SuggestedArticleResponse>() { // from class: com.withings.zendesk.ktx.HelpCenterProviderExtensionKt$suggestionByLabel$2$1
            @Override // yj0.d
            public void onError(yj0.a aVar) {
                iVar.resumeWith(i0.f76187a);
            }

            @Override // yj0.d
            public void onSuccess(SuggestedArticleResponse suggestedArticleResponse) {
                d<List<? extends SimpleArticle>> dVar2 = iVar;
                List<SimpleArticle> results = suggestedArticleResponse != null ? suggestedArticleResponse.getResults() : null;
                if (results == null) {
                    results = i0.f76187a;
                }
                dVar2.resumeWith(results);
            }
        });
        Object a11 = iVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        return a11;
    }

    public static final Object suggestionByLabelAndSection(HelpCenterProvider helpCenterProvider, String str, long j5, d<? super List<? extends SimpleArticle>> dVar) {
        final i iVar = new i(a.b(dVar));
        helpCenterProvider.getSuggestedArticles(new SuggestedArticleSearch.Builder().withLabelNames(str).withSectionId(new Long(j5)).build(), new yj0.d<SuggestedArticleResponse>() { // from class: com.withings.zendesk.ktx.HelpCenterProviderExtensionKt$suggestionByLabelAndSection$2$1
            @Override // yj0.d
            public void onError(yj0.a aVar) {
                iVar.resumeWith(i0.f76187a);
            }

            @Override // yj0.d
            public void onSuccess(SuggestedArticleResponse suggestedArticleResponse) {
                d<List<? extends SimpleArticle>> dVar2 = iVar;
                List<SimpleArticle> results = suggestedArticleResponse != null ? suggestedArticleResponse.getResults() : null;
                if (results == null) {
                    results = i0.f76187a;
                }
                dVar2.resumeWith(results);
            }
        });
        Object a11 = iVar.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        return a11;
    }
}
