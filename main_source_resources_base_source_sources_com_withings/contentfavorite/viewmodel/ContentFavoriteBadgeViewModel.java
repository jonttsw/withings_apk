package com.withings.contentfavorite.viewmodel;

import ah.e;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.withings.favorite.model.FavoriteCategoryAmount;
import com.withings.favorite.model.FavoriteCategoryKt;
import com.withings.favorite.model.FavoriteSegmentedCategory;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.l;
import nm0.y;
import or.f;
import qk.f6;
import qk.fa;
import qk.z5;
import qk.zd;
import qm0.d;
import tl.c;
import ym0.p;
import ym0.q;
/* compiled from: ContentFavoriteBadgeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/contentfavorite/viewmodel/ContentFavoriteBadgeViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ContentFavoriteBadgeViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final f f35254a;

    /* renamed from: b  reason: collision with root package name */
    private final e f35255b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<List<c>> f35256c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableStateFlow f35257d;

    /* compiled from: ContentFavoriteBadgeViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.contentfavorite.viewmodel.ContentFavoriteBadgeViewModel$1", f = "ContentFavoriteBadgeViewModel.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35258a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ContentFavoriteBadgeViewModel.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.contentfavorite.viewmodel.ContentFavoriteBadgeViewModel$1$1", f = "ContentFavoriteBadgeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.contentfavorite.viewmodel.ContentFavoriteBadgeViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0459a extends i implements q<List<? extends FavoriteCategoryAmount>, List<? extends FavoriteSegmentedCategory>, d<? super List<? extends c>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ List f35260a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ List f35261b;

            /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.contentfavorite.viewmodel.ContentFavoriteBadgeViewModel$a$a, kotlin.coroutines.jvm.internal.i] */
            @Override // ym0.q
            public final Object invoke(List<? extends FavoriteCategoryAmount> list, List<? extends FavoriteSegmentedCategory> list2, d<? super List<? extends c>> dVar) {
                ?? iVar = new i(3, dVar);
                iVar.f35260a = list;
                iVar.f35261b = list2;
                return iVar.invokeSuspend(y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                int i11;
                c cVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                l.b(obj);
                List categoryAmount = this.f35260a;
                List list = this.f35261b;
                u.j(list, "<this>");
                u.j(categoryAmount, "categoryAmount");
                List<FavoriteSegmentedCategory> list2 = list;
                ArrayList arrayList = new ArrayList(x.y(list2, 10));
                for (FavoriteSegmentedCategory favoriteSegmentedCategory : list2) {
                    String key = favoriteSegmentedCategory.getKey();
                    Iterator it = categoryAmount.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (u.e(((FavoriteCategoryAmount) obj2).getKey(), favoriteSegmentedCategory.getKey())) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    FavoriteCategoryAmount favoriteCategoryAmount = (FavoriteCategoryAmount) obj2;
                    if (favoriteCategoryAmount != null) {
                        i11 = favoriteCategoryAmount.getAmount();
                    } else {
                        i11 = 0;
                    }
                    switch (key.hashCode()) {
                        case -1984262325:
                            if (key.equals(ConstantsWs.WELLNESS_TASK_TYPE_VIDEO_WORKOUT)) {
                                cVar = new c(z5.f93226a, C1987R.string.bookmark_labelWorkouts, android.support.v4.media.a.a("x", i11), ConstantsWs.WELLNESS_TASK_TYPE_VIDEO_WORKOUT);
                                break;
                            } else {
                                throw new IllegalArgumentException("Illegal category received ".concat(key));
                            }
                        case -934914674:
                            if (key.equals(ConstantsWs.WELLNESS_TASK_TYPE_RECIPE)) {
                                cVar = new c(f6.f92922a, C1987R.string.bookmark_labelRecipes, android.support.v4.media.a.a("x", i11), ConstantsWs.WELLNESS_TASK_TYPE_RECIPE);
                                break;
                            } else {
                                throw new IllegalArgumentException("Illegal category received ".concat(key));
                            }
                        case -732377866:
                            if (key.equals(ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE)) {
                                cVar = new c(fa.f92926a, C1987R.string.bookmark_labelArticles, android.support.v4.media.a.a("x", i11), ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE);
                                break;
                            } else {
                                throw new IllegalArgumentException("Illegal category received ".concat(key));
                            }
                        case 65921:
                            if (key.equals(FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY)) {
                                cVar = new c(zd.f93234a, C1987R.string.bookmark_librarySection_All_filter, android.support.v4.media.a.a("x", i11), FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY);
                                break;
                            } else {
                                throw new IllegalArgumentException("Illegal category received ".concat(key));
                            }
                        default:
                            throw new IllegalArgumentException("Illegal category received ".concat(key));
                    }
                    arrayList.add(cVar);
                }
                return arrayList;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ContentFavoriteBadgeViewModel.kt */
        /* loaded from: classes3.dex */
        public static final class b<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ContentFavoriteBadgeViewModel f35262a;

            b(ContentFavoriteBadgeViewModel contentFavoriteBadgeViewModel) {
                this.f35262a = contentFavoriteBadgeViewModel;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, d dVar) {
                Object emit = this.f35262a.f35256c.emit((List) obj, dVar);
                if (emit != CoroutineSingletons.f76214a) {
                    return y.f85009a;
                }
                return emit;
            }
        }

        a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35258a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                ContentFavoriteBadgeViewModel contentFavoriteBadgeViewModel = ContentFavoriteBadgeViewModel.this;
                or.e a11 = contentFavoriteBadgeViewModel.f35254a.a();
                contentFavoriteBadgeViewModel.f35255b.getClass();
                Flow combine = FlowKt.combine(a11, FlowKt.flowOf(FavoriteSegmentedCategory.getEntries()), new i(3, null));
                b bVar = new b(contentFavoriteBadgeViewModel);
                this.f35258a = 1;
                if (combine.collect(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public ContentFavoriteBadgeViewModel(u0 savedStateHandle, f fVar, e eVar) {
        u.j(savedStateHandle, "savedStateHandle");
        this.f35254a = fVar;
        this.f35255b = eVar;
        if (((User) savedStateHandle.c(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT)) != null) {
            MutableStateFlow<List<c>> MutableStateFlow = StateFlowKt.MutableStateFlow(i0.f76187a);
            this.f35256c = MutableStateFlow;
            this.f35257d = MutableStateFlow;
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
            return;
        }
        throw new Exception("user shouldn't be null");
    }

    public final MutableStateFlow j0() {
        return this.f35257d;
    }
}
