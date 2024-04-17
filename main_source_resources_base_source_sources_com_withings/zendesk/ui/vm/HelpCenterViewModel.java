package com.withings.zendesk.ui.vm;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b;
import androidx.lifecycle.e1;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.zendesk.models.ZendeskLabel;
import com.withings.zendesk.models.ZendeskLabelData;
import com.withings.zendesk.models.ZendeskStatic;
import com.withings.zendesk.repositories.data.ZendeskManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import nm0.j;
import xw.a;
import zendesk.support.Article;
import zendesk.support.HelpCenterProvider;
import zendesk.support.ProviderStore;
import zendesk.support.SearchArticle;
import zendesk.support.Section;
import zendesk.support.SimpleArticle;
import zendesk.support.Support;
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B#\u0012\u0006\u0010;\u001a\u00020:\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b=\u0010>J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00110\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR5\u0010!\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00110 0\u00110\u001a8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\u001a8\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR%\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00110\u001a8\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001a8\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001f\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u001a8\u0006¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001fR#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00110\u001a8\u0006¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001fR\u001d\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R/\u00108\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000202\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00110 0\u001a8\u0006¢\u0006\f\n\u0004\b8\u0010\u001d\u001a\u0004\b9\u0010\u001f¨\u0006@"}, d2 = {"Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "Landroidx/lifecycle/b;", "", "id", "Lnm0/y;", "setArticleId", "(J)V", "sectionId", "Ljava/lang/Long;", "getSectionId", "()Ljava/lang/Long;", "Lzendesk/support/HelpCenterProvider;", "helpCenterProvider", "Lzendesk/support/HelpCenterProvider;", "Lcom/withings/zendesk/models/ZendeskStatic;", "zendeskStatic", "Lcom/withings/zendesk/models/ZendeskStatic;", "", "Lcom/withings/zendesk/models/ZendeskLabel;", "labels", "Ljava/util/List;", "getLabels$zendesk_release", "()Ljava/util/List;", "Landroidx/lifecycle/k0;", "_articleId", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/LiveData;", "Lzendesk/support/SearchArticle;", "articles", "Landroidx/lifecycle/LiveData;", "getArticles", "()Landroidx/lifecycle/LiveData;", "Lnm0/j;", "articlesByTags", "getArticlesByTags", "Lcom/withings/zendesk/models/ZendeskLabelData;", "labelsAndSections", "getLabelsAndSections", "Lzendesk/support/SimpleArticle;", "popularArticles", "getPopularArticles", "Lzendesk/support/Article;", ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE, "getArticle", "Lzendesk/support/Section;", "articleSection", "getArticleSection", "relatedArticles", "getRelatedArticles", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "searchQuery", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getSearchQuery", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "searchResult", "getSearchResult", "Landroid/app/Application;", "app", "categoryId", "<init>", "(Landroid/app/Application;Ljava/lang/Long;Ljava/lang/Long;)V", "Companion", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterViewModel extends b {
    private static final int MAX_RELATED_ARTICLE = 5;
    private final k0<Long> _articleId;
    private final LiveData<Article> article;
    private final LiveData<Section> articleSection;
    private final LiveData<List<SearchArticle>> articles;
    private final LiveData<List<j<ZendeskLabel, List<SearchArticle>>>> articlesByTags;
    private final HelpCenterProvider helpCenterProvider;
    private final List<ZendeskLabel> labels;
    private final LiveData<List<ZendeskLabelData>> labelsAndSections;
    private final LiveData<List<SimpleArticle>> popularArticles;
    private final LiveData<List<SearchArticle>> relatedArticles;
    private final MutableSharedFlow<String> searchQuery;
    private final LiveData<j<String, List<Object>>> searchResult;
    private final Long sectionId;
    private final ZendeskStatic zendeskStatic;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HelpCenterViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/zendesk/ui/vm/HelpCenterViewModel$Companion;", "", "()V", "MAX_RELATED_ARTICLE", "", "zendesk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterViewModel(Application app, Long l5, Long l6) {
        super(app);
        HelpCenterProvider helpCenterProvider;
        List<ZendeskLabel> list;
        u.j(app, "app");
        this.sectionId = l6;
        ProviderStore provider = Support.INSTANCE.provider();
        if (provider != null) {
            helpCenterProvider = provider.helpCenterProvider();
        } else {
            helpCenterProvider = null;
        }
        this.helpCenterProvider = helpCenterProvider;
        ZendeskStatic zendeskStatic = ZendeskManager.INSTANCE.get(getApplication());
        this.zendeskStatic = zendeskStatic;
        if (zendeskStatic != null) {
            list = zendeskStatic.getLabels();
        } else {
            list = null;
        }
        this.labels = list == null ? i0.f76187a : list;
        k0<Long> k0Var = new k0<>();
        this._articleId = k0Var;
        f a11 = h.a(Dispatchers.getIO(), new HelpCenterViewModel$articles$1(l5, this, null), 2);
        this.articles = a11;
        j0 b10 = e1.b(a11, new HelpCenterViewModel$articlesByTags$1(this));
        this.articlesByTags = b10;
        this.labelsAndSections = e1.b(b10, HelpCenterViewModel$labelsAndSections$1.INSTANCE);
        this.popularArticles = h.a(Dispatchers.getIO(), new HelpCenterViewModel$popularArticles$1(l5, this, null), 2);
        j0 c11 = e1.c(k0Var, new HelpCenterViewModel$article$1(this));
        this.article = c11;
        this.articleSection = e1.b(a.d(new j(c11, a11)), HelpCenterViewModel$articleSection$1.INSTANCE);
        this.relatedArticles = e1.c(c11, new HelpCenterViewModel$relatedArticles$1(this));
        MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.searchQuery = MutableSharedFlow$default;
        this.searchResult = q.b(FlowKt.flowOn(FlowKt.m83catch(FlowKt.mapLatest(FlowKt.distinctUntilChanged(FlowKt.debounce(MutableSharedFlow$default, 300L)), new HelpCenterViewModel$searchResult$1(this, l5, null)), new HelpCenterViewModel$searchResult$2(null)), Dispatchers.getIO()), null, 3);
    }

    public final LiveData<Article> getArticle() {
        return this.article;
    }

    public final LiveData<Section> getArticleSection() {
        return this.articleSection;
    }

    public final LiveData<List<SearchArticle>> getArticles() {
        return this.articles;
    }

    public final LiveData<List<j<ZendeskLabel, List<SearchArticle>>>> getArticlesByTags() {
        return this.articlesByTags;
    }

    public final List<ZendeskLabel> getLabels$zendesk_release() {
        return this.labels;
    }

    public final LiveData<List<ZendeskLabelData>> getLabelsAndSections() {
        return this.labelsAndSections;
    }

    public final LiveData<List<SimpleArticle>> getPopularArticles() {
        return this.popularArticles;
    }

    public final LiveData<List<SearchArticle>> getRelatedArticles() {
        return this.relatedArticles;
    }

    public final MutableSharedFlow<String> getSearchQuery() {
        return this.searchQuery;
    }

    public final LiveData<j<String, List<Object>>> getSearchResult() {
        return this.searchResult;
    }

    public final Long getSectionId() {
        return this.sectionId;
    }

    public final void setArticleId(long j5) {
        this._articleId.postValue(Long.valueOf(j5));
    }
}
